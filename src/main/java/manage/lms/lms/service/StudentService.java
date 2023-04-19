package manage.lms.lms.service;

import manage.lms.lms.DTOs.RequestDTO.StudentRequestDTO;
import manage.lms.lms.DTOs.RequestDTO.studentMobileUpdateDTO;
import manage.lms.lms.model.Author;
import manage.lms.lms.model.Student;

import java.text.ParseException;
import java.util.List;

public interface StudentService {

    public String addStudent(StudentRequestDTO student) throws ParseException;
    Student findStudent(int id);

    List<Student> findAll();

    Student updateMobile(studentMobileUpdateDTO stmdto);
}
