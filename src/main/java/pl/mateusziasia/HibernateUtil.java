package pl.mateusziasia;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HibernateUtil {

    public static void main (String[] args) {
        /*EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit-h2");
        EntityManager entityManager = entityManagerFactory.createEntityManager();*/


        Address address = new Address();
        address.setAddressStreet("Piłsudskiego");
        address.setAddressCity("Wrocław");
        address.setAddressNumber("3");

        Library library = new Library();
        library.setName("Biblioteka Publiczna we Wrocławiu");
        library.setAddress(address);

        Author author = new Author();
        author.setFirstName("Henryk");
        author.setLastName("Sienkiewicz");
        author.setCountry("Polska");

        Author author2 = new Author();
        author2.setFirstName("Stanislaw");
        author2.setLastName("Rej");
        author2.setCountry("Polska");

        Book book = new Book();
        book.setTitle("Ogniem i Mieczem");
        book.setIsbn("57644");
        book.setAuthorId (5453L);
        book.setDescription("Historyczna książka o dzielnych polakach wojakach i zdradzie kozaków.");
        book.setIssueDate(LocalDateTime.now());

        Book book2 = new Book();
        book2.setTitle("Ojciec Goriot");
        book2.setIsbn("232");
        book2.setAuthorId (12L);
        book2.setDescription("Książka o niefajnych córkach i biednym ojcu.");
        book2.setIssueDate(LocalDateTime.now());

        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(book);
        listOfBooks.add(book2);
        author.setBooks(listOfBooks);

        List<Author> authorList = new ArrayList<>();
        authorList.add(author);
        book.setAuthors(authorList);
        authorList.add(author2);
        book2.setAuthors(authorList);

        library.setBooks(listOfBooks);



System.out.println("koniec udało się");

       /* entityManager.getTransaction().begin();
        entityManager.persist(library);
        entityManager.persist(address);
        entityManager.persist(author);
        entityManager.persist(book);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();*/
    }
}