package kononikhin.Entities;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "address")
public class RegisteredAddress {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int regId;

    @Column(name = "contry")
    private String regContry;

    @Column(name = "region")
    private String regRegion;

    @Column(name = "city")
    private String regCity;

    @Column(name = "street")
    private String regStreet;

    @Column(name = "house")
    private String regHouse;

    @Column(name = "flat")
    private String regFlat;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created")
    private java.util.Date regCreated;

    public Date getRegCreated() {
        return regCreated;
    }

    public void setRegCreated(Date regCreated) {
        this.regCreated = regCreated;
    }

    public Date getRegModified() {
        return regModified;
    }

    public void setRegModified(Date regModified) {
        this.regModified = regModified;
    }

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified")
    private java.util.Date regModified;

    public RegisteredAddress() {
    }

    public RegisteredAddress(String regContry, String regRegion, String regCity, String regStreet, String regHouse, String regFlat, Timestamp regCreated, Timestamp regModified) {
        this.regContry = regContry;
        this.regRegion = regRegion;
        this.regCity = regCity;
        this.regStreet = regStreet;
        this.regHouse = regHouse;
        this.regFlat = regFlat;
        this.regCreated = regCreated;
        this.regModified = regModified;
    }

    public int getRegId() {
        return regId;
    }

    public void setRegId(int id) {
        this.regId = id;
    }

    public String getRegContry() {
        return regContry;
    }

    public void setRegContry(String contry) {
        this.regContry = contry;
    }

    public String getRegRegion() {
        return regRegion;
    }

    public void setRegRegion(String region) {
        this.regRegion = region;
    }

    public String getRegCity() {
        return regCity;
    }

    public void setRegCity(String city) {
        this.regCity = city;
    }

    public String getRegStreet() {
        return regStreet;
    }

    public void setRegStreet(String street) {
        this.regStreet = street;
    }

    public String getRegHouse() {
        return regHouse;
    }

    public void setRegHouse(String house) {
        this.regHouse = house;
    }

    public String getRegFlat() {
        return regFlat;
    }

    public void setRegFlat(String flat) {
        this.regFlat = flat;
    }


    @Override
    public String toString() {
        return "Address{" +
                "id=" + regId +
                ", contry='" + regContry + '\'' +
                ", region='" + regRegion + '\'' +
                ", city='" + regCity + '\'' +
                ", street='" + regStreet + '\'' +
                ", house='" + regHouse + '\'' +
                ", flat='" + regFlat + '\'' +
                ", created=" + regCreated +
                ", modified=" + regModified +
                '}';
    }
}
