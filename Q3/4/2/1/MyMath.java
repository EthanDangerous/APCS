public class MyMath {
    public void countDown(int num){
        if(num > 0){
            System.out.print(num);
            countDown(num-1);
        }
    }
    public void countUp(int num){
        if(num > 0){
            countUp(num-1);
            System.out.print(num);
        }
    }
    public int factorial(int num){
        if(num > 1){
            return num*factorial(num-1);
        }else{
            return 1;
        }
    }
    public int summation(int num){
        if(num > 1){
            return num+summation(num-1);
        }else{
            return 1;
        }
    }
    public int binarySearch(int[] array, int val, int start, int end){
        return binarySearch(array, val, start, end);
    }
}
