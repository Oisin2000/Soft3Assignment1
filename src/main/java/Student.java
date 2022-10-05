import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Student {

    String Name;
    int age;
    LocalDate dateOfBirth;
    int id;
    String userName;
    List<String> courses ;
    List<String> modules;

    public Student(String name, int age, LocalDate dateOfBirth, int id, List<String> courses, List<String> modules) {
        Name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }


    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }
}

