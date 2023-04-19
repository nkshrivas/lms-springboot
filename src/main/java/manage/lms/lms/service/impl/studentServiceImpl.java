package manage.lms.lms.service.impl;

import manage.lms.lms.DTOs.RequestDTO.StudentRequestDTO;
import manage.lms.lms.DTOs.RequestDTO.studentMobileUpdateDTO;
import manage.lms.lms.enums.Status;
import manage.lms.lms.model.Author;
import manage.lms.lms.model.Card;
import manage.lms.lms.model.Student;
import manage.lms.lms.repository.StudentRepository;
import manage.lms.lms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class studentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public String addStudent(StudentRequestDTO studentRequestDTO) throws ParseException {

        Student student=new Student();
        student.setAge(studentRequestDTO.getAge());
        student.setName(studentRequestDTO.getName());
        student.setDepartment(studentRequestDTO.getDepartment());
        student.setMobNo(studentRequestDTO.getMobNo());

        Card card=new Card();
        card.setCardStatus(Status.ACTIVATED);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date  date = format.parse ( LocalDate.now().plusYears(4).toString());
        card.setExpiryDate(date);
        card.setStudent(student);

        student.setCard(card);
        studentRepository.save(student);








//         Card card=new Card();
//         card.setIssueDate(new Date());
//         card.setStudent(student);
//         card.setCardStatus(Status.ACTIVATED);
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//
//        Date  date = format.parse ( LocalDate.now().plusYears(4).toString());
//        card.setExpiryDate(date);
//        System.out.println(date);
//
//
//            student.setCard(card);
//
//        studentRepository.save(student);



        return "Student added successfully";
    }

    @Override
    public Student findStudent(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateMobile(studentMobileUpdateDTO stmdto) {
        Student student = studentRepository.findById(stmdto.getId()).get();
        student.setMobNo(stmdto.getMobile());
        studentRepository.save(student);

        return student;
    }
}
