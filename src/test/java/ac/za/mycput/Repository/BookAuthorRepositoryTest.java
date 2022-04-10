package ac.za.mycput.Repository;

import ac.za.mycput.Entity.BookAuthor;
import ac.za.mycput.Factory.BookAuthorFactory;
import ac.za.mycput.Respository.BookAuthorRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class BookAuthorRepositoryTest {
    private static BookAuthorRepository repository= BookAuthorRepository.getRepository();
    private static BookAuthor bookAuthor= BookAuthorFactory.createBookAuthor(233443080,"Emma","Kasongo");
    @Test
    void a_create() {
        BookAuthor create =repository.create(bookAuthor);
        assertEquals(bookAuthor.getAuthorId(),create.getAuthorId());
        System.out.println(create);
    }

    @Test
    void b_read() {
        BookAuthor GenderObject =repository.read(bookAuthor.getAuthorId());
        assertNotNull(GenderObject);
        System.out.println(GenderObject);
    }

    @Test
    void c_update() {
        BookAuthor updated= new BookAuthor.Builder().copy(bookAuthor).setFirstName("Neymar").setLastName("Jr").build();
        assertNotNull(repository.update(updated));
    }

    @Test
    void e_delete() {

        boolean delete=repository.delete(bookAuthor.getAuthorId());
        assertTrue(delete);
        System.out.println(delete);
    }

    @Test
    void d_getAll() {
        System.out.println("all"+repository.getAll());
    }
}