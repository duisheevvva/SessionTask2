public class Shark extends Animal{

    public Shark(String color, int age, String gender) {
        super(color, age, gender);
    }

    public static void getShark(Animal[]animals){
        for (Animal animal:animals) {
            if (animal instanceof Shark shark){
                System.out.println(shark.toString());
            }
        }
    }
}
