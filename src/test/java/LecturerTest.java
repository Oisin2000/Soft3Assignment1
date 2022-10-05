import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LecturerTest {

    String name = "Michael";
    int age = 30;

    LocalDate dateOfBirth = LocalDate.of(1992,10,05);

    int id = 92333846;

    String username = name+age;

    List<String> courses = Arrays.asList("2BCT", "3BCT", "4BCT");

    List<String> modulesTeaching = Arrays.asList("SoftwareEngineering", "Programming", "ProfessionalSkills");

    Lecturer l1 = new Lecturer("Oisin",21, LocalDate.of(2000,12,21),19333846, courses, modulesTeaching );

    @Test
    void getName() {

        Assertions.assertEquals(name, l1.getName());
    }

    @Test
    void getAge() {

        Assertions.assertEquals(age, l1.getAge());

    }

    @Test
    void getDateOfBirth() {

        Assertions.assertEquals(dateOfBirth, l1.getDateOfBirth());

    }

    @Test
    void getID() {

        Assertions.assertEquals(id, l1.getAge());

    }

    @Test
    void getUserName() {
        Assertions.assertEquals(username, l1.getUserName());
    }

    @Test
    void getCourses() {

        Assertions.assertEquals(courses, l1.getCourses());

    }

    @Test
    void getModules() {

        Assertions.assertEquals(modulesTeaching, l1.getModulesTeaching());

    }
}