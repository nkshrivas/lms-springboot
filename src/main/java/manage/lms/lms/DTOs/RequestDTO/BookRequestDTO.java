package manage.lms.lms.DTOs.RequestDTO;

import lombok.Data;
import manage.lms.lms.enums.Genre;

@Data
public class BookRequestDTO {
    private String title;

    private Genre genre;

    private int noOfPage;

    private int price;

    private int authId;
}
