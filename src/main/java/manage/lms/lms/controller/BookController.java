package manage.lms.lms.controller;

import manage.lms.lms.DTOs.RequestDTO.BookRequestDTO;
import manage.lms.lms.model.Book;
import manage.lms.lms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/add")
    public String addBook(@RequestBody BookRequestDTO book) throws Exception {
            return bookService.addBook(book);
    }
}
