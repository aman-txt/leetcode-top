import java.util.Arrays;

public class remDup {
    public int removeDuplicates(int[] nums ) {
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                nums[result++] = nums[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
    }
}
