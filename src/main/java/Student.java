import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Student {

    String Name;
    int age;
    LocalDate dateOfBirth;
    int id;
    String userName;
    ArrayList<Module> studentModules = new ArrayList<>();

    public Student(String name, int age, LocalDate dateOfBirth, int id) {
        Name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.userName = Name + age;

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




    public ArrayList<Module> getModules() {
        return studentModules;
    }

    public void setModules(ArrayList<Module> studentModules) {
        this.studentModules = studentModules;
    }

    public void addStudentModule(Module module){

        studentModules.add(module);

    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", id=" + id +
                ", userName='" + userName + '\'' +
                ", studentModules=" + studentModules +
                '}';
    }
}

