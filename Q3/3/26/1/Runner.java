public class Runner {
    public static void main(String[] args){
        Dog d1 = new Dog();
        Mammal m1 = (Mammal) d1;

        d1.jump();
    }
}
