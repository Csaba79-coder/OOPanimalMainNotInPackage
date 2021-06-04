package animals;

public class Dog2 extends Animal2 {

    private String type;

    public Dog2() {
    }

    public Dog2(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Dog2(String type, String name, String color, int age) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void sayWhat() {
        System.out.println("bark");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
