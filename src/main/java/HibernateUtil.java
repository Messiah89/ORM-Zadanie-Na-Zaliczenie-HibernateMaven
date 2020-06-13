package pl.mateusziasia;

import javax.persistence.*;
import pl.mateusziasia.Library;
import pl.mateusziasia.Author;
import pl.mateusziasia.Book;
import pl.mateusziasia.Address;

public class HibernateUtil {

    public static void main (String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit-h2");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Library library = new Library();
        library.setName("Biblioteka Publiczna we Wrocławiu");


        Address address = new Address();
        address.setAddressStreet("Piłsudskiego");
        address.setAddressCity("Wrocław");
        address.setAddressNumber("3");;

        Author author = new Author();
        author.setFirstName("Henryk");
        author.setLastName("Sienkiewicz");
        author.setcountry("Polska");

        Book book = new Book();
        book.setTitle("Ogniem i Mieczem");
        book.setIsbn("57644");
        book.setAuthorId (5453L);
        book.setDescription("Historyczna książka o dzielnych polakach wojakach i zdradzie kozaków.");
        book.setIssueDate(LocalDateTime.now());

        entityManager.getTransaction().begin();
        entityManager.persist(library);
        entityManager.persist(address);
        entityManager.persist(author);
        entityManager.persist(book);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}