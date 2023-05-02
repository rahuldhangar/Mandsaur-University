package interfaces;

public class Book implements Product{
    private String name;
    private String author;
    private int pages;
    private String isbn;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
