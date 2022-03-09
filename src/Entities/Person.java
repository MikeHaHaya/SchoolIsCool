package Entities;

public abstract class Person {

    private String name;
    private int age;

    public Person() {
        personGenerator();
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void personGenerator() {
        // name
        int ranName = (int)(Math.random() * 99);
        switch (ranName) {

            case 0:
                setName("Rhona Sadler");
            case 1:
                setName("Katelyn Steadman");
            case 2:
                setName("Elina Connolly");
            case 3:
                setName("Yannis Coles");
            case 4:
                setName("Jordyn Reeves");
            case 5:
                setName("Paolo Whitehouse");
            case 6:
                setName("Spike Gonzalez");
            case 7:
                setName("Jez Oakley");
            case 8:
                setName("Abdullah King");
            case 9:
                setName("Layton Quintana");
            case 10:
                setName("Mariah Meadows");
            case 11:
                setName("Inayah Contreras");
            case 12:
                setName("Kaeden Kline");
            case 13:
                setName("Manraj Martinez");
            case 14:
                setName("Savanna Atherton");
            case 15:
                setName("Sohail Whiteley");
            case 16:
                setName("Sorcha Millington");
            case 17:
                setName("Marius Metcalfe");
            case 18:
                setName("Iyla Patrick");
            case 19:
                setName("Brianna Cassidy");
            case 20:
                setName("Saniya Harrell");
            case 21:
                setName("Allen Henson");
            case 22:
                setName("Lucy Santiago");
            case 23:
                setName("June Rhodes");
            case 24:
                setName("Aiden Penn");
            case 25:
                setName("Lynden Daniels");
            case 26:
                setName("Joseff Croft");
            case 27:
                setName("Sam Lacey");
            case 28:
                setName("Viola Gilliam");
            case 29:
                setName("Ho Galvan");
            case 30:
                setName("Coco Kaufman");
            case 31:
                setName("Tadhg Connolly");
            case 32:
                setName("Rhiann Mcdougall");
            case 33:
                setName("Carmen Barker");
            case 34:
                setName("Walter Chavez");
            case 35:
                setName("Zeenat Warner");
            case 36:
                setName("Sophie Cotton");
            case 37:
                setName("Akeem Crawford");
            case 38:
                setName("Omar Christie");
            case 39:
                setName("Susan Jones");
            case 40:
                setName("Ava-Mae Mackay");
            case 41:
                setName("Antony Preston");
            case 42:
                setName("Akaash Hebert");
            case 43:
                setName("Karim Hirst");
            case 44:
                setName("Corinne Dominguez");
            case 45:
                setName("Kiyan Sanderson");
            case 46:
                setName("Bertha Legge");
            case 47:
                setName("Robbie Slater");
            case 48:
                setName("Monika Winter");
            case 49:
                setName("Atif Rodriguez");
            case 50:
                setName("Philippa Mccoy");
            case 51:
                setName("Naima Henderson");
            case 52:
                setName("Ellis Mercer");
            case 53:
                setName("Scarlett-Rose Hough");
            case 54:
                setName("Elora Rodrigues");
            case 55:
                setName("Brent Becker");
            case 56:
                setName("Keyaan Le");
            case 57:
                setName("Fergus Gonzales");
            case 58:
                setName("Cloe Metcalfe");
            case 59:
                setName("Briony Barrett");
            case 60:
                setName("Joely Glass");
            case 61:
                setName("Yousif Burns");
            case 62:
                setName("Rosemary Mcbride");
            case 63:
                setName("August Forrest");
            case 64:
                setName("Shabaz Proctor");
            case 65:
                setName("Jessica Delgado");
            case 66:
                setName("Gabriel Colon");
            case 67:
                setName("Bradleigh Bateman");
            case 68:
                setName("Ella-Mai Robin");
            case 69:
                setName("Ruben Lindsay");
            case 70:
                setName("Rania Watts");
            case 71:
                setName("Brittney Stevenson");
            case 72:
                setName("Sadia Stamp");
            case 73:
                setName("Ahsan Thorpe");
            case 74:
                setName("Malaki Levy");
            case 75:
                setName("Lorenzo Moses");
            case 76:
                setName("Shakeel Leon");
            case 77:
                setName("Ben Chaney");
            case 78:
                setName("Darius Murphy");
            case 79:
                setName("Azra Bruce");
            case 80:
                setName("Maude Howarth");
            case 81:
                setName("Jordanna Carpenter");
            case 82:
                setName("Rikki Wicks");
            case 83:
                setName("Aaran Brett");
            case 84:
                setName("Tyrone Kirkland");
            case 85:
                setName("Niko Long");
            case 86:
                setName("Aadam Chen");
            case 87:
                setName("Tayla Whitney");
            case 88:
                setName("Marian Mcgowan");
            case 89:
                setName("Zayden Hays");
            case 90:
                setName("Mary Bowler");
            case 91:
                setName("Hana Blankenship");
            case 92:
                setName("Eva-Rose Tyler");
            case 93:
                setName("Lloyd Lord");
            case 94:
                setName("Kara Healy");
            case 95:
                setName("Marlon Schmitt");
            case 96:
                setName("Lucca Peralta");
            case 97:
                setName("Ronaldo Naylor");
            case 98:
                setName("Ayaz Glover");
            default:
                setName("Burhan Heath");
        }

        // age
        int ranAge = (int) (Math.random() * (61 - 20) + 20);
        this.setAge(ranAge);
    }
}
