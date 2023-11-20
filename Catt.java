package hw4Animal;

public class Catt extends AnimalT {
    public Catt() {
    }
    public Catt(String name, String color, int weight, int age) {
        super(name, color, weight, age);
    }

    @Override
    public String getVoice() {
        return "meow-meow";
    }

    @Override
    public int jump() {
        return 2;
    }

    @Override
    public void repeat(int value) {
        for (int i = 1; i <= value; i++) {
            System.out.println(getVoice());
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + "This animal is Cat ";
    }
}
