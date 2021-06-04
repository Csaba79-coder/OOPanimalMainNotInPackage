package animals;

public class Dog extends Animal {
    public static String animalType = "Pet";
    private String type;

    public Dog() {
        this.name = animalType;
    }

    public Dog(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Dog(String type, String name, String color, int age) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}