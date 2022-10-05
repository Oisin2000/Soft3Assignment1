import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;


public class CourseProgramme {

    String courseName;
    List<String> modules;
    List<String> studentsEnrolled ;
    DateTime startDate;
    DateTime endDate;

    public CourseProgramme(String courseName, List<String> modules, List<String> studentsEnrolled, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.modules = modules;
        this.studentsEnrolled = studentsEnrolled;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }

    public List<String> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(List<String> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}

