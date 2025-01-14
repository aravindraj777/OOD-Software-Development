package advanced_OOD.generics.genericClass;

public class Books {
    private String title;
    private String author;

    public Books(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", t='" + title + '\'' +
                '}';
    }
}
