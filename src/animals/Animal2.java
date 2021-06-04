package animals;

public class Animal2 {

    protected String name;
    String color;
    public int age;
    public String mood = "neutral";

    public void sayWhat() {
        System.out.println("unknown sound");
    }

    public void pet() {
        System.out.println(name + " is currently " + mood);
        System.out.println("Give some love they deserve");
        mood = "happy";
        System.out.println(name + " is " + mood);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
