package Ex5;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal);
        System.out.println("Animal hashcode: " + animal.hashCode());
        Animal animalNew = new Animal();
        System.out.println(animal.equals(animalNew));
    }
}
