package Entities;

public class Teacher extends Person {

    private Grade.Profession profession;

    public Teacher(String name, int age, Grade.Profession profession) {
        super(name, age);
        this.profession = profession;
    }

    public Grade.Profession getProfession() {
        return profession;
    }

    public void setProfession(Grade.Profession profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "profession=" + profession +
                '}';
    }
}
