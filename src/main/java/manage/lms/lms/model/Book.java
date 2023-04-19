package manage.lms.lms.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import manage.lms.lms.enums.Genre;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    private String title;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    private int noOfPage;

    private int price;

    @JsonIgnore
    @ManyToOne
    @JoinColumn
    Author author;

}
