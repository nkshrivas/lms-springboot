package manage.lms.lms.service;

import manage.lms.lms.model.Author;
import org.springframework.stereotype.Service;

@Service
public interface AuthorService {
    public String addAuthor(Author author);
    public Author findAuthor(int id);
}
