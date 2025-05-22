import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 2, 3, 5};
        int target = 3;
        int count = 0;

        for (int num : arr) 
        {
            if (num == target) {
                count++;
            }
        }

        System.out.println(target + " appears " + count + " times");
        System.out.println("Odd digits: " + oddCount);
    }
}
