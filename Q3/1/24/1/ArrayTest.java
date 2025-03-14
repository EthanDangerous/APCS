public class ArrayTest {
    private int[] nums;

    public ArrayTest(){
        nums = new int[10];
        for(int i = 0; i<10; i++){
            nums[i] = (int) (Math.random() * 99 + 1);
        }
    }

    public String toString(){
        String send = "";
        for(int each : nums){
            send = send + " " + each;
        }
        return send;
    }

    public void sort(){
        for(int i = 0; i<nums.length-1; i++){
            for(int j = 0; j<nums.length-1; j++){
                if(nums[j] > nums[j+1]){
                    int swap = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = swap;
                }
            }
        }
    }
}
