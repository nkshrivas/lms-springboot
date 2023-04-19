package manage.lms.lms.service;

import manage.lms.lms.DTOs.RequestDTO.BookRequestDTO;
import manage.lms.lms.model.Book;
import org.springframework.stereotype.Service;

@Service
public interface BookService {
    public String addBook(BookRequestDTO book) throws Exception;
}
