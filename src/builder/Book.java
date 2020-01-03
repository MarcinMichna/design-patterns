package builder;

public class Book
{
    private String author;
    private String title;
    private String description;

    public static final class BookBuilder
    {
        private String author;
        private String title;
        private String description;

        public BookBuilder author(String author)
        {
            this.author = author;
            return this;
        }

        public BookBuilder title(String title)
        {
            this.title = title;
            return this;
        }

        public BookBuilder description(String description)
        {
            this.description = description;
            return this;
        }

        public Book build()
        {
            if(author == null || title == null) throw new IllegalStateException("Author and title can not be empty");

            Book book = new Book();
            book.author = author;
            book.title = title;
            book.description = description;

            return book;
        }
    }

    @Override
    public String toString()
    {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
