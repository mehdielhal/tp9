package ma.ac.cit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Person {
    private final String givenName;
    private final String surname;
    private  LocalDate dateOfBirth ;
    Person(String givenName, String surname, LocalDate dateOfBirth) {
        this.givenName = givenName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }
    Person(String givenName, String surname) {
        this.givenName = givenName;
        this.surname = surname;}
    String getDisplayName() {
        return surname + ", " + givenName; }
    long getAge() {
        return ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now());
    }
}
