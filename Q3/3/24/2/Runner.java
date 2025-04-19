public class Runner {
    public static void main(String[] args){
        Animal blank = new Animal("blank");
        blank.speak();
        Dog dog = new Dog("Fido");
        dog.printInfo();
        Bird bird = new Bird("Tweety");
        bird.printInfo();
    }
}
