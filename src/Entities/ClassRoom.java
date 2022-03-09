package Entities;

import java.util.ArrayList;

public class ClassRoom {

    private String name;
    private Teacher teacher;
    private final ArrayList<Student> students = new ArrayList<>(15);

    public ClassRoom(int count) {
        classRoomGenerator(count);
    }

    public ClassRoom(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }

    private void classRoomGenerator(int count) {

        //name
        switch (count) {
            case 0:
                setName("Brainy Badgers");
                break;
            case 1:
                setName("Intelligent Iguanas");
                break;
            case 2:
                setName("Clever Cats");
                break;
            case 3:
                setName("Canny Cougars");
                break;
            case 4:
                setName("Talented Turtles");
                break;
            default:
                setName("fart");
        }

        //teacher
        this.setTeacher(new Teacher());

        //students
        for (int i = 0; i < 15; i++)
            this.students.add(new Student());
    }
}
