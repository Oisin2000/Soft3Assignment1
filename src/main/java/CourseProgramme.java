import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;


public class CourseProgramme {

    String courseName;

    ArrayList<Module> courseModules = new ArrayList<>();
    ArrayList<Student> studentsEnrolled = new ArrayList<>();
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

    public ArrayList<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(ArrayList<Student> studentsEnrolled) {
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

    public void addStudent(Student student){

        studentsEnrolled.add(student);

    }

    @Override
    public String toString() {
        return "Course : " +
                "\n Name : " + courseName  +
                "\n Start Date : " + startDate +
                "\n End Date : " + endDate
                ;
    }
}

