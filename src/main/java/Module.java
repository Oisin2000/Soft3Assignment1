
import java.util.ArrayList;
import java.util.List;

public class Module {

    String moduleName;
    String moduleID;
    List<String> students;
    List<String> coursesAssociated;

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

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    public List<String> getCoursesAssociated() {
        return coursesAssociated;
    }

    public void setCoursesAssociated(List<String> coursesAssociated) {
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
        return "Module : " +
                "\n Name : " + moduleName  +
                "\n ID : " + moduleID +
                "\n Lecturer : " + lecturerResponsible
                ;
    }

}