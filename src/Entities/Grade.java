package Entities;

public class Grade {

    private Profession profession;
    private int score;

    public enum Profession {
        math, chemistry, geography, literature, physics, sports
    }

    public Grade(Profession profession, int score) {
        this.profession = profession;
        this.score = score;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "profession=" + profession +
                ", score=" + score +
                '}';
    }
}
