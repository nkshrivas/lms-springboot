package manage.lms.lms.service.impl;

import manage.lms.lms.DTOs.RequestDTO.BookRequestDTO;
import manage.lms.lms.model.Author;
import manage.lms.lms.model.Book;
import manage.lms.lms.repository.AuthorRepository;
import manage.lms.lms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    AuthorRepository authorRepository;


    @Override
    public String addBook(BookRequestDTO bookRequestDTO) throws Exception {

        Author author;
        try{
            author = authorRepository.findById(bookRequestDTO.getAuthId()).get();
        }catch(Exception e){
            throw new Exception("Author not present here "+e);
        }

        Book book=new Book();
        book.setTitle(bookRequestDTO.getTitle());
        book.setGenre(bookRequestDTO.getGenre());
        book.setPrice(bookRequestDTO.getPrice());
        book.setNoOfPage(bookRequestDTO.getNoOfPage());


        author.getBooks().add(book);
        book.setAuthor(author);

        authorRepository.save(author);
        return "Book Added";


    }
}
