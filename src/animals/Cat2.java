package animals;

public class Cat2 extends Animal2{

    public int livesLeft;

    public Cat2(String name, String color, int age, int livesLeft) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.livesLeft = livesLeft;
    }

    public void sayWhat() {
        System.out.println("purr");
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public void setLivesLeft(int livesLeft) {
        this.livesLeft = livesLeft;
    }

}
