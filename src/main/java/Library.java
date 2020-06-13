package pl.mateusziasia;

import javax.persistence.*;
import java.util.List;

@Entity
public class Library {

    @Embedded
    private Address address;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "NAME")
    private String Name;

    @OneToMany(mappedBy = "library")
    private List<Book> books;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}

