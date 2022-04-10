package ac.za.mycput.Respository;

import ac.za.mycput.Entity.Book;

import java.util.HashSet;
import java.util.Set;

public class BookRepository implements IBook {
    private static BookRepository repository =null;
    private Set<Book> Database;
    private BookRepository(){
        Database= new HashSet<Book>();

    }

    public static BookRepository getRepository(){
        if (repository==null) {
            repository = new BookRepository();
        }
        return repository;

    }


    @Override
    public Book create(Book object) {
        boolean success=Database.add(object);
        if(!success)
            return null;
        return object;
    }



    @Override
    public Book read(Long integer) {
        Book book=Database.stream().
                filter(e ->e.getBookId().equals(integer))

                .findAny().orElse(null);
        return book;
    }

    @Override
    public Book update(Book object) {
        Book currentBook=read(object.getBookId());
        if (currentBook !=null)
        {


            Database.remove(currentBook);

            Database.add(object);
            return object;
        }
        return null;
    }

    @Override
    public boolean delete(Long ID) {
        Book deleteBook= read(ID);
        if (deleteBook ==null)
        {
            return false;
        }
        Database.remove(deleteBook);


        return true;
    }

    @Override
    public Set<Book> getAll() {
        return Database;
    }
}
