import java.util.List;

public class OpenLibraryResponse {

    private List<Item> docs;

    public List<Item> getDocs() {
        return docs;
    }

    public static class Item {
        private String title;
        private List<String> author_name;
        private Integer first_publish_year;

        public String getTitle() {
            return title;
        }

        public List<String> getAuthor_name() {
            return author_name;
        }

        public Integer getFirst_publish_year() {
            return first_publish_year;
        }
    }
}
