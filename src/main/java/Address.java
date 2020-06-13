package pl.mateusziasia;

import javax.persistence.*;
import java.util.List;

@Embeddable
public class Address {

    @ElementCollection
    @CollectionTable(name="AUTHOR_ADRESS", joinColumns = @JoinColumn(name="AUTHOR_ID"))
    private List<Address> Address = new ArrayList<Address>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "ADDRESS_STREET")
    private String AddressStreet;

    @Column(name = "ADDRESS_CITY")
    private String AddressCity;

    @Column(name = "ADDRESS_NUMBER")
    private String AddressNumber;

    public List<Address> getAddress() {
        return Address;
    }

    public void setAddress(List<Address> address) {
        Address = address;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getAddressStreet() {
        return AddressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        AddressStreet = addressStreet;
    }

    public String getAddressCity() {
        return AddressCity;
    }

    public void setAddressCity(String addressCity) {
        AddressCity = addressCity;
    }

    public String getAddressNumber() {
        return AddressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        AddressNumber = addressNumber;
    }
}
