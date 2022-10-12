import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ModuleTest {

    String moduleName = "Software Engineering 3";

    String moduleID = "CT417";

    List<String> students = Arrays.asList("Oisin", "Liam", "Naarayana");

    List<String> coursesAssociated = Arrays.asList("Oisin", "Liam", "Naarayana");

    Lecturer lecturerResponsible = new Lecturer("Michael Schukat",45, LocalDate.of(1977,10,11),19345679);

    Module m1 = new Module("Software Engineering 3","CT417",lecturerResponsible);

    @Test
    void getModuleName() {

        Assertions.assertEquals(moduleName, m1.getModuleName());

    }

    @Test
    void getModuleID() {

        Assertions.assertEquals(moduleID, m1.getModuleID());

    }


    @Test
    void getLecturerResponsible() {

        Assertions.assertEquals(lecturerResponsible, m1.getLecturerResponsible());

    }
}