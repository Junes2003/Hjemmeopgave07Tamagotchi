public class Tamagotchi {
    private String name;
    private int age;
    private String mood;
    private int energy;

    public Tamagotchi (String name, int age, String mood, int energy){
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.energy = energy;
    }

public void chooseMenu(){
    System.out.println("What would u like to do now?");
}

public void play(){

}
public void feed(){

}
public void sleep(){

}
public void makeSound(){
    System.out.println("Hey");
}


    public void showInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Mood: " + this.mood);
        System.out.println("Energy: " + this.energy);
    }

    public String getName() {
        return this.name;
    }
}
