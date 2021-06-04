package animals;

public class Cat extends Animal {
    public final String CAT_TYPE_NAME = "macska";        // konstans

    public int livesLeft;

    public Cat() {
    }

    public Cat(String name, String color, int age, int livesLeft) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.livesLeft = livesLeft;
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public void setLivesLeft(int livesLeft) {
        this.livesLeft = livesLeft;
    }

    public String getCAT_TYPE_NAME() {
        return CAT_TYPE_NAME;
    }
}