package Entities;

import java.util.ArrayList;

public class Student extends Person{

    private final ArrayList<Grade> grades = new ArrayList<>(6);

    public Student(String name, int age) {
        super(name, age);
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + grades +
                '}';
    }
}