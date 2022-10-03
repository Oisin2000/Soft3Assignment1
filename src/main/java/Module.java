
import java.util.ArrayList;

public class Module {

    String moduleName;
    String moduleID;
    ArrayList<String> students = new ArrayList<String>();
    ArrayList<String> coursesAssociated = new ArrayList<String>();
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

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public ArrayList<String> getCoursesAssociated() {
        return coursesAssociated;
    }

    public void setCoursesAssociated(ArrayList<String> coursesAssociated) {
        this.coursesAssociated = coursesAssociated;
    }

    public String getLecturerResponsible() {
        return LecturerResponsible;
    }

    public void setLecturerResponsible(String lecturerResponsible) {
        LecturerResponsible = lecturerResponsible;
    }
}