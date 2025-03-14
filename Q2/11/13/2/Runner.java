public class Runner{
    public static void main(String[] args) {
        ArrayTest at = new ArrayTest();
        public int[] nums;
        int[] nums = new int[10];
        for(int i = 0; i<nums.length; i++){
            nums[i] = (int) (Math.random() * 9 +1);
        }
        at.printArray(nums);
        public boolean s1 = at.searchNumber1(5, nums);
        public int s2 = at.searchNumber2(5, nums);
        public int l = at.findLargest(nums);
        public int s = at.findSmallest(nums);
        public int sum = at.sum(nums);
        public int p = at.product(nums);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(l);
        System.out.println(s);
        System.out.println(sum);
        System.out.println(p);
    }
}