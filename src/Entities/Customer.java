package Entities;

import java.util.GregorianCalendar;

public class Customer {
    int id;
    public String firstName;
    public String lastName;
    public String nationalityId;
    public GregorianCalendar dateOfBirth;

    public Customer(int id, String firstName, String lastName, String nationalityId, GregorianCalendar dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityId = nationalityId;
        this.dateOfBirth = dateOfBirth;
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

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public GregorianCalendar getDateOfBirthday() {
        return dateOfBirth;
    }

    public void setDateOfBirthday(GregorianCalendar dateOfBirthday) {
        this.dateOfBirth = dateOfBirthday;
    }
}
