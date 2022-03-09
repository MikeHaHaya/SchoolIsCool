package Entities;

import java.util.ArrayList;

public class School {

    private final ArrayList<ClassRoom> classRooms = new ArrayList<>(5);

    private School() {
        schoolGenerator();
    }

    private static final School instance = new School();

    public static School getInstance() {
        return instance;
    }

    public ArrayList<ClassRoom> getClassRooms() {
        return classRooms;
    }

    public void addClassRoom(ClassRoom classRoom) {
        classRooms.add(classRoom);
    }

    @Override
    public String toString() {
        return "School{" +
                "classRooms=" + classRooms +
                '}';
    }

    private void schoolGenerator() {
        for (int i = 0; i < 5; i++)
            this.classRooms.add(new ClassRoom(i));
    }
}