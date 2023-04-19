package manage.lms.lms.controller;

import manage.lms.lms.model.Author;
import manage.lms.lms.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/add")
    public String addAuthor(@RequestBody Author author){
        return authorService.addAuthor(author);

    }
    @GetMapping("/find")
    public Author findAuthor(@RequestParam int id){
        return authorService.findAuthor(id);
    }

}
