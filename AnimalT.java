// Створіть абстрактний клас Animal, який описує свійську тварину. У класу повинні бути поля:
// name (назва тварини), color (колір хутра), mass (маса тварини), age (вік тварини).
// У класу повинен бути конструктор, яким визначаються значення полів. Також там мають бути абстрактні методи:
// voice (повертає текст звуку, який створює тварина), repeat (повторює звук вказану кількість разів),
// jump (повертає результатом число, який визначає відстань, на яку може стрибнути тварина) , а також неабстрактний метод show (виводить повну інформацію про тварину).
// На основі абстрактного класу Animal шляхом спадкування створити класи Cat та Dog. Перевірити функціональність об’єктів класу.

package OOP_4.Animal;
public abstract class AnimalT {
    // private String ration;
    private String name;
    private int age;
    private String color;
    private int weight;

    public AnimalT(String name, String color, int weight, int age) {
        super();
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public abstract String getVoice();
    public abstract int jump();
    public abstract void repeat(int value);

    public AnimalT() {
        super();
    }

    @Override
    public String toString() {
        return "AnimalT{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
