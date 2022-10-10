import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;


public class CourseProgramme {

    String courseName;

    ArrayList<Module> courseModules = new ArrayList<>();
    ArrayList<CourseProgramme> studentsEnrolled = new ArrayList<>();
    DateTime startDate;
    DateTime endDate;

    public CourseProgramme(String courseName,  DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Module> getModules() {
        return courseModules;
    }

    public void setModules(ArrayList<Module> courseModules) {
        this.courseModules = courseModules;
    }

    public ArrayList<CourseProgramme> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(ArrayList<CourseProgramme> studentsEnrolled) {
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

    public void addCourseModule(Module module){

        courseModules.add(module);

    }
}

