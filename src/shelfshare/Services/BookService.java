package shelfshare.Services;

import java.util.List;
import java.util.UUID;
import shelfshare.Models.Entities.BookModel;
import shelfshare.Repositories.BookRepository;

public class BookService {
    private final BookRepository bookRepository;

    public BookService() {
        this.bookRepository = new BookRepository();
    }
    
    public BookModel getBookById(UUID bookId) {
        return bookRepository.getBookById(bookId);
    }
    
    public boolean addBook(BookModel bookModel) {
        return bookRepository.addBook(bookModel);
    }
    
    public List<BookModel> getAllBooks() {
        return bookRepository.getAllBooks();
    }
    
    public boolean updateBook(BookModel bookModel) {
        return bookRepository.updateBook(bookModel);
    }
    
    public boolean removeBook(UUID bookId) {
        return bookRepository.removeBook(bookId);
    }
}
