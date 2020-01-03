package builder;

import org.w3c.dom.ls.LSOutput;

public class Main
{
    public static void main(String[] args)
    {
        Book book = new Book.BookBuilder()
                .author("Jan Kowalski")
                .title("Przygody patusa")
                .description("bla bla bla")
                .build();

        System.out.println(book);
    }
}
