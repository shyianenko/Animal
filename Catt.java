package OOP_4.Animal;

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
    public int repeat() {
        return 2;
    }

}
