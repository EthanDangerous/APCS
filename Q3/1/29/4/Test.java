import java.util.ArrayList;

public class Test {
    private ArrayList<Integer> numList = new ArrayList<Integer>();

    public Test(){
        for(int i = 0; i<10; i++){
            numList.add((int) (Math.random() * 10 + 1));
        }
    }

    public void printList(){
        for(int each : numList){
            System.out.println(each);
        }
        System.out.println();
    }

    public int searchLargest(){
        int largest = -1;
        for(int each : numList){
            if(each > largest){
                largest = each;
            }
        }
        return largest;
    }

    public void searchAndReplace(int num){
        for(int each : numList){
            if(each == num){
                numList.set(each, 1000);
            }
        }
    }

    public void searchAndRemove(int num){
        for(int i = 0; i<numList.size(); i++){
            if(numList.get(i) == num){
                numList.remove(i);
                i--;
            }
        }
    }

    public void sort(){
        for(int each : numList){
            for(int i = 0; i<numList.size() - 1; i++){
                if(numList.get(i) > numList.get(i+1)){
                    int save = numList.get(i);
                    numList.set(i, numList.get(i+1));
                    numList.set(i+1, save);
                }
            }
        }
    }
}
