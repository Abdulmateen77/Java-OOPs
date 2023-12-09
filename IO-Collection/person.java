package person.java;

//This class represents a Person entity with attributes such as first name, last name, and age.
public class person {

    //Private attributes to store the first name, last name, and age of a person
    private String Firstname;
    private String LastName;
    private int age;

    //Constructor to initialize a Person object with specified first name, last name, and age
    public person(String Firstname, String LastName, int age){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;
    }

    //Overridden toString method to represent the Person object as a string
    public String toString(){
        return "name:" + FirstName + LastName + " Age:" + age;
    }

    //Getters and setters for the private attributes

    //Getter method for retrieving the first name of the person
    public String getFirstname() {
        return FirstName;
    }

    //Getter method for retrieving the last name of the person
    public String getLastName() {
        return LastName;
    }

    //Getter method for retrieving the age of the person
    public int getAge() {
        return age;
    }

    //Setter method for updating the age of the person
    public void setAge(int age) {
        this.age = age;
    }

    //Setter method for updating the first name of the person
    public void setFirstname(String firstname) {
        FirstName = firstname;
    }

    //Setter method for updating the last name of the person
    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
