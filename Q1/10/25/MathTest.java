
public class MathTest {

    private int loop = 0;
    private int total = 0;

    public void countUp(int intIn) {
        while (loop < intIn) {
            loop++;
            System.out.println(loop);
        }
    }

    public void countDown(int intIn) {
        loop = intIn;
        while (loop >= 1) {
            System.out.println(loop);
            loop--;
        }
    }

    public int getSum(int intIn) {
        loop = 1;
        while (loop <= intIn) {
            total = total + loop;
            loop++;
        }
        return total;
    }
}
