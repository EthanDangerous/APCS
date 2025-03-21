public class Review {
    private int[] nums;

    public Review(int size){
        nums = new int[size];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int) (Math.random() * 102 + 1);
        }
    }

    public void printArray(){
        for(int each : nums){
            System.out.println(each);
        }
    }

    public int getLargest(){
        int largest = nums[0];
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }
}
