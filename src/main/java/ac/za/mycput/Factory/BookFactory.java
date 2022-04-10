package ac.za.mycput.Factory;


import ac.za.mycput.Helper.Helper;
import ac.za.mycput.Helper.Helper;
import ac.za.mycput.Entity.Book;



public class BookFactory
{
    public  static Book createBook(String bookName, String language  ){

        Long id = Helper.generateID();
        Book book=new Book.Builder().setBookId(id ).setBookName(bookName).setLanguage(language ).build();
        return book;

    }
}
