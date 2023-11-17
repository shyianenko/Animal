package OOP_4.Animal;

public class Dogg extends AnimalT {
    public Dogg(){}

    public Dogg(String name, String color, int weight, int age) {
        super(name, color, weight, age);
    }

    @Override
    public String getVoice() {
        return "Woof-woof";
    }

    @Override
    public int jump() {
        return 3;
    }

    @Override
    public int repeat() {
        return 1;
    }





}