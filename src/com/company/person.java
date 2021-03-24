package com.company;

import java.time.LocalDate;
import java.util.Objects;

public class person {
    private String firstName;
    private String midName;
    private String lastName;
    private String city;
    private String street;
    private String houseNumber;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private String institution;
    private String specialty;
    private String specialization;
    private String documents;
    private String management;
    private String department;
    private String becomeA;
    private String citizenship;
    private String PlaceOfBirth;
    private String region;

    public person() {
    }

    public person(String firstName, String midName, String lastName, String city, String street, String houseNumber,
                  String phoneNumber, LocalDate dateOfBirth,
                  String institution, String specialty, String specialization, String documents,
                  String management, String department, String becomeA,
                  String citizenship, String placeOfBirth, String region) {
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.institution = institution;
        this.specialty = specialty;
        this.specialization = specialization;
        this.documents = documents;
        this.management = management;
        this.department = department;
        this.becomeA = becomeA;
        this.citizenship = citizenship;
        PlaceOfBirth = placeOfBirth;
        this.region = region;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDocuments() {
        return documents;
    }

    public void setDocuments(String documents) {
        this.documents = documents;
    }

    public String getManagement() {
        return management;
    }

    public void setManagement(String management) {
        this.management = management;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBecomeA() {
        return becomeA;
    }

    public void setBecomeA(String becomeA) {
        this.becomeA = becomeA;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getPlaceOfBirth() {
        return PlaceOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        PlaceOfBirth = placeOfBirth;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Person" + '\n' +
                "FirstName = " + firstName + '\n' +
                "MidName = " + midName + '\n' +
                "LastName = " + lastName + '\n' +
                "City = " + city + '\n' +
                "Street = " + street + '\n' +
                "HouseNumber = " + houseNumber + '\n' +
                "PhoneNumber = " + phoneNumber + '\n' +
                "DateOfBirth = " + dateOfBirth + '\n' +
                "Choose the higher education institution where you want to study = " + institution + '\n' +
                "Choose the specialty you want to get = " + specialty + '\n' +
                "Choose a specialization = " + specialization + '\n' +
                "Select the territorial police authority to which you plan to apply for admission = " + documents + '\n' +
                "Select the police department where you live = " + management + '\n' +
                "Select the police station (department) in which you live = " + department + '\n' +
                "BecomeA = " + becomeA + '\n' +
                "Citizenship = " + citizenship + '\n' +
                "PlaceOfBirth = " + PlaceOfBirth + '\n' +
                "What region do you live in now? = " + region + '\n'
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(midName, person.midName) && Objects.equals(lastName, person.lastName)
                && Objects.equals(city, person.city) && Objects.equals(street, person.street) && Objects.equals(houseNumber, person.houseNumber)
                && Objects.equals(phoneNumber, person.phoneNumber) && Objects.equals(dateOfBirth, person.dateOfBirth)
                && Objects.equals(institution, person.institution) && Objects.equals(specialty, person.specialty)
                && Objects.equals(specialization, person.specialization) && Objects.equals(documents, person.documents)
                && Objects.equals(management, person.management) && Objects.equals(department, person.department)
                && Objects.equals(becomeA, person.becomeA) && Objects.equals(citizenship, person.citizenship)
                && Objects.equals(PlaceOfBirth, person.PlaceOfBirth) && Objects.equals(region, person.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, midName, lastName, city, street, houseNumber, phoneNumber, dateOfBirth, institution,
                specialty, specialization, documents, management, department, becomeA, citizenship, PlaceOfBirth, region);
    }
}