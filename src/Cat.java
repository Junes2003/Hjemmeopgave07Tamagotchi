public class Cat extends Tamagotchi{
    private String color;
    private String name;
    private String gender;
    private int age;

    public Cat(String name, int age, String mood, int energy) {
        super(name, age, mood, energy);
    }

    public void makeSound(){
        System.out.println("MIAW!!!");
    }



}
