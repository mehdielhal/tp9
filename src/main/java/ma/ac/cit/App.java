package ma.ac.cit;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person person = new Person("Joey", "Doe", LocalDate.parse("2013-01-12"));
        System.out.println(person.getDisplayName() + ": " + person.getAge() + " years");
        System.out.println("done");
    }
}
