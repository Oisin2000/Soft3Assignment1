import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class StudentTest {

    String name = "Oisin";
    int age = 21;
    LocalDate dateOfBirth = LocalDate.of(2000,12,21);
    int id = 19333846;
    String username = name+age;
    List<String> courses = Arrays.asList("2BCT", "3BCT", "4BCT");
    List<String> modules = Arrays.asList("SoftwareEngineering", "Programming", "ProfessionalSkills");

    Student s1 = new Student("Oisin",21, LocalDate.of(2000,12,21),19333846);



    @Test
    void getName() {

        Assertions.assertEquals(name, s1.getName());
    }

    @Test
    void getAge() {

        Assertions.assertEquals(age, s1.getAge());

    }

    @Test
    void getDateOfBirth() {

        Assertions.assertEquals(dateOfBirth, s1.getDateOfBirth());

    }

    @Test
    void getID() {

        Assertions.assertEquals(id, s1.getId());

    }

    @Test
    void getUserName() {
        Assertions.assertEquals(username, s1.getUserName());
    }

    @Test
    void getCourses() {

        Assertions.assertEquals(courses, s1.getCourses());

    }

    @Test
    void getModules() {

        Assertions.assertEquals(modules, s1.getModules());

    }
}