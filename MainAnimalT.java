package OOP_4.Animal;

public class MainAnimalT {
    public static void main(String[] args) {
        AnimalT catt = new Catt("Tom","black", 5,7 );
        AnimalT dogg = new Dogg("Spyke","grey", 15,5);

        System.out.println(catt + " voice is: " + catt.getVoice() + " can jump to " + catt.jump() + " meters " + catt.repeat());
        System.out.println(dogg + " voice is: " + dogg.getVoice() + " can jump to " + dogg.jump() + " meters " + dogg.repeat());
    }
}
