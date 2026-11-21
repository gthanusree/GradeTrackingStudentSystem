/**
 * Abstract base class for anyone stored in the system.
 * Abstraction: subclasses must say what their role is.
 * Encapsulation: fields are private and accessed through getters.
 */
public abstract class Person {
    private final String id;       // USN for students
    private final String name;
    private final String dob;      // format dd-MM-yyyy
    private final String phone;
    private final String address;
    private final String email;

    public Person(String id, String name, String dob, String phone, String address, String email) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public String getId()      { return id; }
    public String getName()    { return name; }
    public String getDob()     { return dob; }
    public String getPhone()   { return phone; }
    public String getAddress() { return address; }
    public String getEmail()   { return email; }

    //Each subclass describes its own role (polymorphism).
    public abstract String getRole();
}
