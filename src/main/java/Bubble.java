import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Bubble {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> nums = new ArrayList<>();

        for(int i=0; i<100; i++)
            nums.add(random.nextInt(100));
        System.out.println("Random nums: " + nums);

        Runnable bubble = () -> {
            int temp;
            int length = nums.size();
            for(int j=0; j<length; j++) {
                for (int i = 0; i < nums.size() - 1; i++) {
                    if (nums.get(i) > nums.get(i+1)) {
                        temp = nums.get(i);
                        nums.set(i, nums.get(i+1));
                        nums.set(i+1, temp);
                    }
                    System.out.println("inside loop: " + nums);
                }
                System.out.println("outside loop: " + j);
                System.out.println("length: " + length);
            }

            System.out.println(nums);
        };

//        bubble.run();
        Thread thread1 = new Thread(bubble);
        thread1.start();

    }
}
