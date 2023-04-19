package manage.lms.lms.controller;

import manage.lms.lms.DTOs.RequestDTO.StudentRequestDTO;
import manage.lms.lms.DTOs.RequestDTO.studentMobileUpdateDTO;
import manage.lms.lms.model.Author;
import manage.lms.lms.model.Student;
import manage.lms.lms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addAuthor(@RequestBody StudentRequestDTO student){
        try {
            return studentService.addStudent(student);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
    @GetMapping("/find")
    public Student findStudent(@RequestParam int id){
        return studentService.findStudent(id);
    }
    @GetMapping("/findAll")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @PutMapping("/update_mobile")
    public Student updatemobile(@RequestBody studentMobileUpdateDTO stmdto){
        return studentService.updateMobile(stmdto);
    }


}
