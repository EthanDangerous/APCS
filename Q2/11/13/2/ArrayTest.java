public class ArrayTest{
    public printArray(int[] print){
        for (int each : print){
            System.out.println(each);
        }
    }
    public boolean searchNumber1(int num, int[] search){
        if(int i = 0; i<search.length; i++){
            if(search[i] == num){
                return true;
            }
        }
        return false;
    }
    public int searchNumber2(int num, int[] search){
        if(int i = 0; i<search.length; i++){
            if(search[i] == num){
                return i;
            }
        }
        return -1;
    }
    public int findLargest(int[] findL){
        private int largest = 0;
        for(int i = 0; i<findL.length; i++){
            if(findL[i] > largest){
                largest = findL[i];
            }
        }
        return largest;
    }
    public int findSmallest(int[] findS){
        private int smallest = 0;
        for(int i = 0; i<findS.length; i++){
            if(findS[i] < smallest){
                smallest = findS[i];
            }
        }
        return smallest;
    }
    public int sum(int[] sum){
        private int total = 0;
        for(int i = 0; i < sum.length; i++){
            total = total + sum[i];
        }
        return total;
    }
    public int product(int[] product){
        private int total = 1;
        for(int i = 0; i < sum.length; i++){
            total = total * sum[i];
        }
        return total;
    }
}