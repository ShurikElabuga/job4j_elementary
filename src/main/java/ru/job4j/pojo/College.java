package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vladimir Gavrilov");
        student.setEntryDate("01.09.2020");
        student.setGroupNumber("SD-5");
        System.out.println("Student - " + student.getName());
        System.out.println("Group number: " + student.getGroupNumber());
        System.out.println("Date of admission: " + student.getEntryDate());

    }
}
