package shelfshare.Controllers;

import java.util.List;
import java.util.UUID;
import shelfshare.Models.Entities.BookModel;
import shelfshare.Services.BookService;

public class BookController {
    private final BookService bookService;

    public BookController() {
        this.bookService = new BookService();
    }
    
    public BookModel getBookById(UUID bookId) {
        return bookService.getBookById(bookId);
    }
    
    public boolean addBook(BookModel bookModel) {
        System.out.println("Controller:" + bookModel);
        return bookService.addBook(bookModel);
    }
    
    public List<BookModel> getAllBooks() {
        return bookService.getAllBooks();
    }
    
    public boolean updateBook(BookModel bookModel) {
        return bookService.updateBook(bookModel);
    }
    
    public boolean removeBook(UUID bookId) {
        return bookService.removeBook(bookId);
    }
}
