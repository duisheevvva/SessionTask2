import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Animal[] animals ={
                new Shark("black",12,"MALE"),
                new Turtle("white",13,"MALE"),
                new Eagle("white",14,"FEMALE")
        };

        System.out.println("getWhiteAnimal");
        Animal animal = new Animal();
        animal.getWhiteAnimal(animals);
//        Animal.getWhiteAnimal(animals);
        System.out.println("getAnimalByGender");
        Animal.getAnimalByGender(new Scanner(System.in).nextLine(),animals);
        System.out.println("getShark");
        Shark.getShark(animals);


    }
}