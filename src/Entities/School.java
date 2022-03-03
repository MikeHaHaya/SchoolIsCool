package Entities;

import java.util.ArrayList;

public class School {

    private final ArrayList<ClassRoom> classRooms = new ArrayList<>(5);

    private School() {
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
}