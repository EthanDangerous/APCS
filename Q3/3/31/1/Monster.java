public class Monster{

    private static int count = 0;

    private static int coins = 0;

    public Monster() {
        count++;
    }

    public static int getCount( ){
        return count;
    }

    public static void addCoins(int  c){
        coins += c;
    }

    public static int getCoins( ){
        return coins;
    }
}