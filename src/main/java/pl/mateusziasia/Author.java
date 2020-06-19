package pl.mateusziasia;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "AUTHOR")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "FIRST_NAME")
    private String FirstName;

    @Column(name = "LAST_NAME")
    private String LastName;

    @Enumerated(EnumType.STRING)
    private Country country;

    @ManyToMany(mappedBy = "authors" ,fetch = FetchType.LAZY)
    private List<Book> books;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
