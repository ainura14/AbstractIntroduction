package PracticeDay.Task1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        School school = new School("J. Sadykov", "Kyrgyzstan", LocalDate.of(2003, 12, 03));
        College college = new College("Politech", "Kazahstan", LocalDate.of(2001, 12,05));
        University university = new University("KTMU", "Turkiye", LocalDate.of(2003, 04, 9));
        Student[] students = {
                new Student("Akyl", "Jakypova", 'M', LocalDate.of(2000, 12, 23), college),
                new Student("Kadyr", "Karatov", 'M', LocalDate.of(2013, 12, 23), college),
                new Student("Saikal", "Sadykova", 'F', LocalDate.of(2002, 12, 23), college),
                new Student("Asyl", "Akmatova", 'F', LocalDate.of(2001, 12, 21), school),
                new Student("Alina", "Sulpukorova", 'F', LocalDate.of(2021, 12, 21), school),
                new Student("Asyl", "Akmatova", 'F', LocalDate.of(2001, 12, 21), school),
                new Student("Bermet", "Ratbekova", 'F', LocalDate.of(2003, 12, 14), university),
                new Student("Baiel", "Ratbekov", 'M', LocalDate.of(2003, 12, 14), university),
                new Student("Ainura", "Salamatova", 'F', LocalDate.of(20022, 12, 14), university),
                new Student("Tabyl", "Salamatov", 'M', LocalDate.of(2020, 12, 14), university)
        };
       studentInfo(students);
    }
    public static void studentInfo(Student[] students){
        for (Student student : students) {
            System.out.println(student.getName() + " study in : ");
            System.out.println("Start of yeaer " + student.getDate() + " year.");
            System.out.println("Education center " + student.getEducationCenter());
            System.out.println("-------------------------------------------------");
        }
    }
}
