package manage.lms.lms.service.impl;

import manage.lms.lms.model.Author;
import manage.lms.lms.repository.AuthorRepository;
import manage.lms.lms.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;


    @Override
    public String addAuthor(Author author) {
        authorRepository.save(author);
        return "Author added successfully";
    }

    @Override
    public Author findAuthor(int id) {
       return authorRepository.findById(id).get();
    }
}
