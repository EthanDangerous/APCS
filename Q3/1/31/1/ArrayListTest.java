public class ArrayListTest {
    public void print(ArrayList<Interger> num){
        for(int each : num){
            System.out.println(each);
        }
        System.out.println();
    }

    public void sort(ArrayList<Interger> nums){
        for(int i = 0; i< list.size()-1; i++){
            for(int j = 0; j<list.size()-i-1; j++){
                if(list.get(j) > list.get(j+1)){
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
    }
}
