import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        OpenLibraryService service = new OpenLibraryService();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do livro: ");
        String bookInput = input.next();

        List<Book> books = service.searchBook(bookInput);

        System.out.println("\nLivros encontrados: " + books.size() + "\n");

        books.stream()
                .filter(book -> book.getTitle() != null)
                .sorted((a, b) -> a.getTitle().compareToIgnoreCase(b.getTitle()))
                .forEach(book -> {
                    System.out.println("Título: " + book.getTitle());
                    System.out.println("Autores: " + book.getAuthors());
                    System.out.println("Ano: " + book.getPublishedDate());
                    System.out.println("----------------------------------------------------------------");
                });
    }
}
