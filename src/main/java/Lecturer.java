import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Lecturer {

    String Name;
    int age;
    LocalDate dateOfBirth;
    int id;
    String userName;

    ArrayList<CourseProgramme> lecturerCourses = new ArrayList<>();

    ArrayList<Module> lecturerModules = new ArrayList<>();

    public Lecturer(String name, int age, LocalDate dateOfBirth, int id) {
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

    public void setID(int id) {
        this.id = id;
    }

    public String getUserName() {
        return Name+age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<CourseProgramme> getCourses() {
        return lecturerCourses;
    }

    public void setCourses(ArrayList<CourseProgramme> lecturerCourses) {
        this.lecturerCourses = lecturerCourses;
    }

    public ArrayList<Module> getModulesTeaching() {
        return lecturerModules;
    }

    public void setModulesTeaching(ArrayList<Module> lecturerModules) {
        this.lecturerModules = lecturerModules;
    }

    public void addLecturerModule(Module module){

        lecturerModules.add(module);

    }

    @Override
    public String toString() {
        return "Lecturer = " +
                "Name = " + Name  ;
    }
}

