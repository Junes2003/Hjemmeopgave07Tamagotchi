public class Dog extends Tamagotchi{
    private String color;
    private String name;
    private String gender;
    private int age;

    public Dog(String name, int age, String mood, int energy) {
        super(name, age, mood, energy);
    }

    public void makeSound(){
        System.out.println("VUF!!!");
    }
}