
public  class Animal {
    private String color;
    private int age;
    private String gender;

    public Animal(String color, int age, String gender) {
        this.color = color;
        this.age = age;
        this.gender = gender;
    }

    public Animal() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public  void getWhiteAnimal(Animal[] animals){
        for ( Animal animal:animals) {
            if (animal.color.equalsIgnoreCase("white")){
                System.out.println(animal);
            }
        }
    }

    public static void getAnimalByGender(String gender,Animal[] animals){
        for (Animal animal:animals) {
            if (animal.gender.equalsIgnoreCase(gender)){
                System.out.println(animal);
            }
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
