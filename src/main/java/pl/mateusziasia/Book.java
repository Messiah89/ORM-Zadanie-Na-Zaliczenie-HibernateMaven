package pl.mateusziasia;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "BOOK")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "TITLE")
    private String Title;

    @Column(name = "ISBN")
    private String Isbn;

    @Column(name = "AUTHOR_ID")
    private Long AuthorId;

    @Column(name = "DESCRIPTION")
    private String Description;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime IssueDate;

    @ManyToOne
    @JoinColumn(name = "LIBRARY_ID")
    private Library library;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Author> authors;

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public Long getAuthorId() {
        return AuthorId;
    }

    public void setAuthorId(Long authorId) {
        AuthorId = authorId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public LocalDateTime getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(LocalDateTime issueDate) {
        IssueDate = issueDate;
    }
}
