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


    Lecturer l1 = new Lecturer("Michael",30,LocalDate.of(1992,10,05),92333846 );

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


}