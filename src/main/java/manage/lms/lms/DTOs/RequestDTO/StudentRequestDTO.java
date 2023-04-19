package manage.lms.lms.DTOs.RequestDTO;

import lombok.Data;
import manage.lms.lms.enums.Department;

@Data
public class StudentRequestDTO {
    private String name;
    private int age;
    private Department department;
    private String mobNo;


}
