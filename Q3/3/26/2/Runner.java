import java.util.*;

public class Runner {
    public static void main(String[] args){
        Dog d1 = new Dog("Fido");
        System.out.println(d1.speak());
        BigDog bd1 = new BigDog("Biggy");
        System.out.println(bd1.speak());
        Dog bd2 = (Dog) bd1;
        System.out.println(bd2.speak());
        Husky h1 = new Husky("Snow");
        System.out.println(h1.speak());
        Dog h2 = (Dog) h1;
        System.out.println(h2.speak());
        Husky h3 = (Husky) h2;
        System.out.println(h3.speak());
        BigDog h4 = (BigDog) h1;
        SmallDog sm = new SmallDog("Tiny");
        System.out.println(sm.speak());
        Dog d3 = (Dog) sm;
        System.out.println(d3.speak());
        System.out.println();
//        BigDog bd3 = (BigDog) sm;

        ArrayList<Dog> list = new ArrayList<Dog>();
        list.add(d1);
        list.add(bd1);
        list.add(h1);
        list.add(sm);
        for(Dog each : list) {
            System.out.println(each.speak());
        }
    }
}
