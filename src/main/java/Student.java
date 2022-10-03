import java.time.LocalDate;
import java.util.ArrayList;


public class Student {

    String Name;
    int age;
    LocalDate dateOfBirth;
    int ID;
    String userName;
    ArrayList<String> courses ;
    ArrayList<String> modules;

    public Student(String name, int age, LocalDate dateOfBirth, int ID, ArrayList<String> courses, ArrayList<String> modules) {
        Name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.ID = ID;
        this.userName = Name + age;
        this.courses = courses;
        this.modules = modules;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }


    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public ArrayList<String> getModules() {
        return modules;
    }

    public void setModules(ArrayList<String> modules) {
        this.modules = modules;
    }
}

