import org.joda.time.format.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String []args){


    Student Oisin = new Student("Oisin", 21, LocalDate.of(2000,12,21),19333846);
    Student Liam = new Student("Liam", 22, LocalDate.of(1999,8,05),19333855);
    Student Naarayana = new Student("Naarayana", 20, LocalDate.of(2001,11,24),19333899);
    Student Fred = new Student("Fred", 21, LocalDate.of(2000,9,11),19337779);

    Lecturer MS = new Lecturer("Michael Schukat",45,LocalDate.of(1977,10,11),19345679);
    Lecturer AB = new Lecturer("Attracta Brennan",40,LocalDate.of(1982,11,1),19545670);
    Lecturer JD = new Lecturer("Jim Duggan",43,LocalDate.of(1994,12,9),19344219);
    Lecturer FG = new Lecturer("Frank Glavin",35,LocalDate.of(1987,3,25),19888679);
    Lecturer COR = new Lecturer("Colm O Riordan",41,LocalDate.of(1981,5,15),19883229);


    Module SoftwareEngineering = new Module("Software Engineering 3", "CT417",MS);
    Module ProfessionalSkills = new Module("Advanced Professional Skills", "CT436",AB);
    Module Modelling = new Module("Simulation and Modelling", "CT561",JD);
    Module MachineLearning = new Module("Machine Learning", "CT4104",FG);
    Module InfoRetrieval = new Module("Information Retrieval", "CT4100",COR);

    CourseProgramme BCT = new CourseProgramme("Computer Science and IT",DateTimeFormat.forPattern("yyyy-MM-dd").parseDateTime("2022-09-04"),DateTimeFormat.forPattern("yyyy-MM-dd").parseDateTime("2023-05-04"));
    CourseProgramme GY125 = new CourseProgramme("Digital Arts and Technology",DateTimeFormat.forPattern("yyyy-MM-dd").parseDateTime("2022-09-11"),DateTimeFormat.forPattern("yyyy-MM-dd").parseDateTime("2023-05-02"));
    CourseProgramme GY414 = new CourseProgramme("Electrical and Electronic Engineering",DateTimeFormat.forPattern("yyyy-MM-dd").parseDateTime("2022-09-02"),DateTimeFormat.forPattern("yyyy-MM-dd").parseDateTime("2023-05-10"));


        //adding modules to each student

        Oisin.addStudentModule(SoftwareEngineering);
        Oisin.addStudentModule(MachineLearning);
        Oisin.addStudentModule(InfoRetrieval);

        Liam.addStudentModule(SoftwareEngineering);
        Liam.addStudentModule(Modelling);
        Liam.addStudentModule(MachineLearning);

        Naarayana.addStudentModule(SoftwareEngineering);
        Naarayana.addStudentModule(ProfessionalSkills);
        Naarayana.addStudentModule(InfoRetrieval);

        Fred.addStudentModule(InfoRetrieval);
        Fred.addStudentModule(Modelling);
        Fred.addStudentModule(ProfessionalSkills);

        //adding modules to each course

        BCT.addCourseModule(SoftwareEngineering);
        BCT.addCourseModule(MachineLearning);
        BCT.addCourseModule(Modelling);
        BCT.addCourseModule(InfoRetrieval);

        GY125.addCourseModule(SoftwareEngineering);
        GY125.addCourseModule(InfoRetrieval);
        GY125.addCourseModule(ProfessionalSkills);

        GY414.addCourseModule(MachineLearning);
        GY414.addCourseModule(Modelling);
        GY414.addCourseModule(ProfessionalSkills);
        GY414.addCourseModule(SoftwareEngineering);

        //adding a student to each course

        BCT.addStudent(Oisin);
        BCT.addStudent(Liam);
        GY125.addStudent(Naarayana);
        GY414.addStudent(Fred);

        //creating list of all students

        ArrayList<Student> allStudents = new ArrayList<>();

        allStudents.add(Oisin);
        allStudents.add(Liam);
        allStudents.add(Naarayana);
        allStudents.add(Fred);

        //creating list of all lecturers

        ArrayList<Lecturer> allLecturers = new ArrayList<>();


        allLecturers.add(MS);
        allLecturers.add(AB);
        allLecturers.add(JD);
        allLecturers.add(FG);
        allLecturers.add(COR);

        //creating list of all modules

        ArrayList<Module> allModules = new ArrayList<>();

        allModules.add(SoftwareEngineering);
        allModules.add(InfoRetrieval);
        allModules.add(ProfessionalSkills);
        allModules.add(Modelling);
        allModules.add(MachineLearning);

        //creating list of all courses

        ArrayList<CourseProgramme> allCourses = new ArrayList<>();

        allCourses.add(BCT);
        allCourses.add(GY125);
        allCourses.add(GY414);


        for (int x=0; x<allStudents.size(); x++)
            System.out.println(allStudents.get(x));













    }
}