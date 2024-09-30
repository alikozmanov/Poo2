package poo;

public class Person {
    private String lastName;
    private String firstName;
    private int age;
    private String address;

    // Attributes
    public Person(String lastName, String firstName, int age, String address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.address = address;
    }

    // Constructor
    public Person(String lastName, String firstName, int age) {
        this(lastName, firstName, age, "Unknown");
    }

    public Person(String lastName, String firstName) {
        this(lastName, firstName, 0, "Unknown");
    }

    @Override
    public String toString() {
        return "LastName= " + lastName + ", FirstName= " + firstName + ", Age= " + age + ", Address= " + address;
    }
}
