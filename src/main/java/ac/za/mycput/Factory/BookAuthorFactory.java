package ac.za.mycput.Factory;


import ac.za.mycput.Entity.BookAuthor;
import ac.za.mycput.Helper.Helper;
import ac.za.mycput.Helper.Helper;
import ac.za.mycput.Entity.BookAuthor;

public class BookAuthorFactory
{

    public  static BookAuthor createBookAuthor(int bookId, String firstName, String lastName  ){

        Long id = Helper.generateID();
        BookAuthor bookAuthor=new BookAuthor.Builder().setAuthorId(id ).setBookId(bookId).setFirstName(firstName)
                .setLastName(lastName).build();
        return bookAuthor;

    }
}
