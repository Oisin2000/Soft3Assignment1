
import java.util.ArrayList;
import java.util.List;

public class Module {

    String moduleName;
    String moduleID;
    List<String> students;
    List<String> coursesAssociated;
    String LecturerResponsible;

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

    public String getLecturerResponsible() {
        return LecturerResponsible;
    }

    public void setLecturerResponsible(String lecturerResponsible) {
        LecturerResponsible = lecturerResponsible;
    }
}