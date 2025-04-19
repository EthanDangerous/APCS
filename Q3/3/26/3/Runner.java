import java.util.*;

public class Runner{
    public static void main(String[] args){
        Bird bd = new Bird("bird");
        Dog dg = new Dog("dog");
        Cat ct = new Cat("cat");

        ArrayList<Animal> list = new ArrayList<Animal>();
        list.add(bd);
        list.add(dg);
        list.add(ct);
        for(Animal each : list){
            System.out.println(each.toString());
        }
    }
}
