package Entities;

public class Teacher extends Person {

    private Grade.Profession profession;

    public Teacher(int count) {
        super();
        teacherGenerator(count);
    }

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
                "} " + super.toString();
    }

    private void teacherGenerator(int count) {

        switch (count) {
            case 0:
                setProfession(Grade.Profession.MATH);
                break;
            case 1:
                setProfession(Grade.Profession.CHEMISTRY);
                break;
            case 2:
                setProfession(Grade.Profession.GEOGRAPHY);
                break;
            case 3:
                setProfession(Grade.Profession.LITERATURE);
                break;
            case 4:
                setProfession(Grade.Profession.PHYSICS);
                break;
            default:
                setProfession(Grade.Profession.SPORTS);
                break;
        }
    }

}
