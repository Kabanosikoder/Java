public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    public static int SSN;


    public Person(String firstName, String middleName, String lastName, int age, int SSN) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.SSN = SSN;

    }

    public int getSSN() {
        return SSN;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return age;
    }
    public boolean isOlder(int olderThan){
        return age >= olderThan;
    }
}
