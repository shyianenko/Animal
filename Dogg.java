package hw4Animal;

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
    public void repeat(int value) {
        for (int i = 1; i <= value; i++) {
            System.out.println(getVoice());
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + "This animal is Dog ";
    }
}
