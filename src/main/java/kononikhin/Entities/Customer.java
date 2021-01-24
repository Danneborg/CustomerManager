package kononikhin.Entities;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(fetch = FetchType.LAZY,
            cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "registred_address_id")
    private RegisteredAddress registeredAddress;

    @OneToOne(fetch = FetchType.LAZY,
            cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "actual_address_id")
    private ActualAddress actualAddress;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", registeredRegisteredAddress=" + registeredAddress +
                ", actualRegisteredAddress=" + actualAddress +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public RegisteredAddress getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(RegisteredAddress registeredRegisteredAddress) {
        this.registeredAddress = registeredRegisteredAddress;
    }

    public ActualAddress getActualAddress() {
        return actualAddress;
    }

    public void setActualAddress(ActualAddress actualRegisteredAddress) {
        this.actualAddress = actualRegisteredAddress;
    }

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "sex")
    private String sex;

    public Customer() {

    }

    public Customer(String firstName, String lastName, String middleName, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.sex = sex;
    }



    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}