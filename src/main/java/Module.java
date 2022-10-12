
import java.util.ArrayList;
import java.util.List;

public class Module {

    String moduleName;
    String moduleID;
    ArrayList<Student> students;
    ArrayList<CourseProgramme> coursesAssociated;

    Lecturer lecturerResponsible;

    public Module(String moduleName, String moduleID, Lecturer lecturerResponsible)
    {
        this.moduleName = moduleName;
        this.moduleID = moduleID;
        this.students = students;
        this.coursesAssociated = coursesAssociated;
        this.lecturerResponsible = lecturerResponsible;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleID() {
        return moduleID;
    }

    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<CourseProgramme> getCoursesAssociated() {
        return coursesAssociated;
    }

    public void setCoursesAssociated(ArrayList<CourseProgramme>  coursesAssociated) {
        this.coursesAssociated = coursesAssociated;
    }

    public Lecturer getLecturerResponsible() {
        return lecturerResponsible;
    }

    public void setLecturerResponsible(Lecturer lecturerResponsible) {
        this.lecturerResponsible = lecturerResponsible;
    }

    @Override
    public String toString() {
        return "\n " + moduleName  +
                "\n ID : " + moduleID +
                "\n Lecturer : " + lecturerResponsible.getName() +
                "\n";
    }

}