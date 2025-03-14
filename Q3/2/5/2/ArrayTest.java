import java.util.ArrayList;

public class ArrayTest {
    public void printList(ArrayList<Card> card){
        for(int i = 0; i<card.size(); i++){
            System.out.println(card.get(i));
        }
    }
    public int findTotal(ArrayList<Card> card){
        int total = 0;
        for(int i = 0; i<card.size(); i++){
            total += card.get(i).getValue();
        }
        return total;
    }
    public void searchAndDelete(ArrayList<Card> card, int num){
        for(int i = 0; i<card.size(); i++){
            if(card.get(i).getValue() == num){
                card.remove(i);
                i--;
            }
        }
    }
    public void scramble(ArrayList<Card> card){
        for(int i = 0; i<card.size(); i++){
            int rand = (int) (Math.random() * card.size());
            //random card chosen
            int saveVal = card.get(i).getValue();
            //saved current card value
            card.set(i, new Card(rand));
            card.set(rand, new Card(saveVal));
        }
    }
    public void searchAndReplace(ArrayList<Card> card, int num){
        for(int i = 0; i<card.size(); i++){
            if(card.get(i).getValue() == num){
                card.set(i, new Card(99));
            }
        }
    }
    public void sort(ArrayList<Card> card){
        for(int i = 0; i<card.size(); i++){
            for(int j = 0; j<card.size()-1; j++){
                if(card.get(j).getValue() > card.get(j+1).getValue()){
                    int saveVal = card.get(j).getValue();
                    //saved current card value
                    card.set(j, new Card(j+1));
                    card.set(j+1, new Card(saveVal));
                }
            }
        }
    }
}
