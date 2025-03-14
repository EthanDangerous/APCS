import java.util.ArrayList;

public class Runner {
    public static void main(String[] args){
        Test ts = new Test();
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(4);
        nums.add(3);
        System.out.println(nums);
        ts.change(nums);
        System.out.println(nums);
    }
}

/*
exit:
1)
5
5

2)
cat
cat

3)
123
9923

4)

 */
