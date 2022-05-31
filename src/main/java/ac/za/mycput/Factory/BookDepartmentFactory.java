package ac.za.mycput.Factory;

import ac.za.mycput.Entity.BookDepartment;

public class BookDepartmentFactory {
    public static BookDepartment createBookPublisher(int bookId, String bookName, String description) {
        return new BookDepartment.Builder().setBookId(bookId).setBookName(bookName).setDescription(description).build();
    }
}
