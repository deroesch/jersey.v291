package org.deroesch.jersey.v291.models;

import java.util.Objects;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

    public Person() {
    }

    public Person(String firstName, String lastName, String companyName, String address, String city, String county,
            String state, int zip, String phone1, String phone2, String email, String web) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.address = address;
        this.city = city;
        this.county = county;
        this.state = state;
        this.zip = zip;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.email = email;
        this.web = web;

        assert this.isValid();
    }

    public boolean isValid() {
        return this.firstName != null && this.lastName != null && this.companyName != null && this.address != null
                && this.city != null && this.county != null && this.state != null && this.zip != null
                && this.phone1 != null && this.phone2 != null && this.email != null && this.web != null;
    }

    public static Person prototype() {
        return new Person("James", "Butt", "Benton, John B Jr", "6649 N Blue Gum St", "New Orleans", "Orleans", "LA",
                70116, "504-621-8927", "504-845-1427", "jbutt@gmail.com", "http://www.bentonjohnbjr.com");
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", companyName=" + companyName
                + ", address=" + address + ", city=" + city + ", county=" + county + ", state=" + state + ", zip=" + zip
                + ", phone1=" + phone1 + ", phone2=" + phone2 + ", email=" + email + ", web=" + web + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, city, companyName, county, email, firstName, lastName, phone1, phone2, state, web,
                zip);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return Objects.equals(address, other.address) && Objects.equals(city, other.city)
                && Objects.equals(companyName, other.companyName) && Objects.equals(county, other.county)
                && Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
                && Objects.equals(lastName, other.lastName) && Objects.equals(phone1, other.phone1)
                && Objects.equals(phone2, other.phone2) && Objects.equals(state, other.state)
                && Objects.equals(web, other.web) && Objects.equals(zip, other.zip);
    }

    private String firstName = "";
    private String lastName = "";
    private String companyName = "";
    private String address = "";
    private String city = "";
    private String county = "";
    private String state = "";
    private Integer zip = 0;
    private String phone1 = "";
    private String phone2 = "";
    private String email = "";
    private String web = "";
}
