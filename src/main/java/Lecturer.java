import java.time.LocalDate;


public class Lecturer {

    String Name;
    int age;
    LocalDate dateOfBirth;
    int ID;
    String userName;
    String[] courses ;
    String[] modulesTeaching;

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
        return Name+age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String[] getModulesTeaching() {
        return modulesTeaching;
    }

    public void setModulesTeaching(String[] modulesTeaching) {
        this.modulesTeaching = modulesTeaching;
    }
}

