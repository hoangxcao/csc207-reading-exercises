
public class Dog {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Husky", "white", "woof woof!");
        dog1.bark();
    }
    
    public String breed;
    public String color;
    public String bark;
    
    public Dog (String breed, String color, String bark) {
        this.breed = breed;
        this.color = color;
        this.bark = bark;
    }
    
    public void bark() {
        System.out.println(bark);
    }
}
