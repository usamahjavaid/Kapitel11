






public class Animals implements Sounds {
    public void animalSound() {
        System.out.println("Cat says: meow meow");
    }
    public static void main(String[] args) {
        Animals cat = new Animals();
        cat.animalSound();
    }
}
