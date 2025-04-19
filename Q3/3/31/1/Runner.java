public class Runner {
    public static void main(String[] args){
        Monster witch = new Monster();
        Monster vampire  = new Monster();
        Monster mummy = new Monster();


        System.out.println("Monster Count: " + Monster.getCount());
        witch.addCoins(5);
        vampire.addCoins(3);
        System.out.println("Total Coins: " + Monster.getCoins());
    }
}
