import com.google.gson.Gson;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class OpenLibraryService {

    private final HttpClient client = HttpClient.newHttpClient();
    private final Gson gson = new Gson();

    public List<Book> searchBook(String search) {
        List<Book> books = new ArrayList<>();

        try {
            String termo = URLEncoder.encode(
                    search,
                    StandardCharsets.UTF_8
            );

            String url = "https://openlibrary.org/search.json?q="
                    + termo
                    + "&fields=title,author_name,first_publish_year"
                    + "&limit=10";

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("User-Agent", "BookSearchJava/1.0")
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

            if (response.statusCode() != 200) {
                throw new RuntimeException(
                        "Erro na API. Código HTTP: "
                                + response.statusCode()
                );
            }

            OpenLibraryResponse resposta = gson.fromJson(
                    response.body(),
                    OpenLibraryResponse.class
            );

            if (resposta == null || resposta.getDocs() == null) {
                return books;
            }

            for (OpenLibraryResponse.Item item : resposta.getDocs()) {
                if (item == null) {
                    continue;
                }

                Book book = new Book();
                book.setTitle(item.getTitle());
                book.setAuthors(item.getAuthor_name());
                book.setPublishedDate(item.getFirst_publish_year());

                books.add(book);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return books;
    }
}
