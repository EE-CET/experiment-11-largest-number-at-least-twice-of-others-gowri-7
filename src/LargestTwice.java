
import java.util.Scanner;

public class LargestTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int max = nums[0];
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        boolean valid = true;

        for (int i = 0; i < n; i++) {
            if (i != index && max < 2 * nums[i]) {
                valid = false;
                break;
            }
        }

        if (valid) {
            System.out.println(index);
        } else {
            System.out.println(-1);
        }
    }
}
