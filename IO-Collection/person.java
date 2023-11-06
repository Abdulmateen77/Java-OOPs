package person.java;

public class person {

    private String Firstname;
    private String LastName;
    private int age;

    public person(String Firstname, String LastName, int age){
        this.Firstname = Firstname;
        this.LastName = LastName;
        this.age = age;
    }
    public String toString(){
        return "name:" + Firstname + LastName + "Age:" + age;
    }
    public String getFirstname() {
        return Firstname;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
