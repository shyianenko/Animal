package hw4Animal;

public class MainAnimalT {
    public static void main(String[] args) {
        AnimalT catt = new Catt("Tom","black", 5,7 );
        AnimalT dogg = new Dogg("Spyke","grey", 15,5);

        System.out.println(catt);
        catt.repeat(3);
        
        System.out.println(dogg);
        dogg.repeat(2);
    }
}
