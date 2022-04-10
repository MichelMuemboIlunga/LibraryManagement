package ac.za.mycput.Respository;


import ac.za.mycput.Entity.BookAuthor;

import java.util.HashSet;
import java.util.Set;

public class BookAuthorRepository implements IBookAuthor {
    private static BookAuthorRepository repository =null;
    private Set<BookAuthor> Database;
    private BookAuthorRepository(){
        Database= new HashSet<BookAuthor>();

    }

    public static BookAuthorRepository getRepository(){
        if (repository==null) {
            repository = new BookAuthorRepository();
        }
        return repository;

    }


    @Override
    public BookAuthor create(BookAuthor object) {
        boolean success=Database.add(object);
        if(!success)
            return null;
        return object;
    }

    @Override
    public BookAuthor read(Long  ID) {
        BookAuthor bookAuthor=Database.stream().
                filter(e ->e.getAuthorId().equals(ID))

                .findAny().orElse(null);
        return bookAuthor;
    }


    @Override
    public BookAuthor update(BookAuthor object) {
        BookAuthor current=read(object.getAuthorId());
        if (current !=null)
        {


            Database.remove(current);

            Database.add(object);
            return object;
        }
        return null;
    }

    @Override
    public boolean delete(Long ID) {
        BookAuthor delete= read(ID);
        if (delete ==null)
        {
            return false;
        }
        Database.remove(delete);
        System.out.println("deleted successfully");

        return true;
    }
    @Override
    public Set<BookAuthor> getAll() {
        return Database;
    }
}
