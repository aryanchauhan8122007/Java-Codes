class LibraryBook {

    private String bookName;
    private String author;
    private int pages;

    public void setBookName(String name) {
        this.bookName = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        if(pages > 0) {
            this.pages = pages;
        } else {
            System.out.println("Pages cannot be zero or negative! ❌");
        }
    }

    public String getBookName() { return bookName; }
    public String getAuthor() { return author; }
    public int getPages() { return pages; }
}

public class LibraryBook {
    public static void main(String[] args) {

        LibraryBook b = new LibraryBook();
        b.setBookName("Java Programming");
        b.setAuthor("James Gosling");
        b.setPages(500);
        b.setPages(-10);   // invalid

        System.out.println("Book: " + b.getBookName());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Pages: " + b.getPages());
    }
}
