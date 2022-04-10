package ac.za.mycput.Repository;

import ac.za.mycput.Entity.Book;
import ac.za.mycput.Factory.BookFactory;
import ac.za.mycput.Respository.BookRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class BookRepositoryTest {
    private static BookRepository repository= BookRepository.getRepository();
    private static Book book= BookFactory.createBook("Romance","French");


    @Test
    void a_create() {
        Book create =repository.create(book);
        assertEquals(book.getBookId(),create.getBookId());
        System.out.println(create);
    }

    @Test
    void b_read() {

        Book GenderObject =repository.read(book.getBookId());
        assertNotNull(GenderObject);
        System.out.println(GenderObject);
    }

    @Test
    void c_update() {

         Book updated= new Book.Builder().copy(book).setBookName("Gang Gang").setLanguage("English").build();
        assertNotNull(repository.update(updated));
        System.out.println(updated);

    }
    @Test
    void d_getAll() {
        System.out.println("all"+repository.getAll());
    }

    @Test
    void e_delete() {

        boolean delete=repository.delete(book.getBookId());
        assertTrue(delete);
        System.out.println(delete);

    }



}