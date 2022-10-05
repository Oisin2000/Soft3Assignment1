import java.time.LocalDate;
import java.util.List;


public class Lecturer {

    String Name;
    int age;
    LocalDate dateOfBirth;
    int id;
    String userName;
    List<String> courses ;
    List<String> modulesTeaching;

    public Lecturer(String name, int age, LocalDate dateOfBirth, int id, List<String> courses, List<String> modulesTeaching) {
        Name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.userName = Name + age;
        this.courses = courses;
        this.modulesTeaching = modulesTeaching;
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

    public void setID(int id) {
        this.id = id;
    }

    public String getUserName() {
        return Name+age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public List<String> getModulesTeaching() {
        return modulesTeaching;
    }

    public void setModulesTeaching(List<String> modulesTeaching) {
        this.modulesTeaching = modulesTeaching;
    }
}

