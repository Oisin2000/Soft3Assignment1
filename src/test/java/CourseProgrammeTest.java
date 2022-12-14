import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseProgrammeTest {

    String courseName = "4BCT";

    DateTime startDate =  DateTimeFormat.forPattern("yyyy-MM-dd").parseDateTime("2022-09-04");
    DateTime endDate = DateTimeFormat.forPattern("yyyy-MM-dd").parseDateTime("2023-05-24");

    CourseProgramme cp1 = new CourseProgramme("4BCT",startDate,endDate);

    @Test
    void getCourseName() {

        Assertions.assertEquals(courseName, cp1.getCourseName());

    }


    @Test
    void getStartDate() {

        Assertions.assertEquals(startDate, cp1.getStartDate());

    }

    @Test
    void getEndDate() {

        Assertions.assertEquals(endDate, cp1.getEndDate());

    }
}