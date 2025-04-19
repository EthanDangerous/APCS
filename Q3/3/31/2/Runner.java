public class Runner {
    public static void main(String[] args){
        Vampire v = new Vampire("vampire name");
        Mummy m = new Mummy("mummy name");
        Witch w = new Witch("witch name");

        v.getInfo();
        v.addCoins(2);
        m.getInfo();
        m.addCoins(4);
        w.getInfo();
        w.addCoins(6);

        System.out.println(Monster.getCount());
        System.out.println(Monster.getCoins());
    }
}
