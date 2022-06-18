import java.lang.reflect.Array;
import java.util.Arrays;


//both works but upper one is easy
class threesumclosest {
    public int threeSumClosest(int[] nums, int target) {
        // int ans = Integer.MAX_VALUE;
        // int st = 0, en = nums.length - 1, a = 0, b = 0, c = 0;
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length - 2; i++) {
        //     en = nums.length - 1;
        //     st = i + 1;
        //     int temp = target - nums[i];
        //     while (st < en) {
        //         if (Math.abs(target - (nums[i] + nums[st] + nums[en])) < ans) {
        //             ans = Math.abs(target - (nums[i] + nums[st] + nums[en]));
        //             if (ans == 0) {
        //                 return target;
        //             }
        //             a = i;
        //             b = st;
        //             c = en;
        //         }
        //         if ((nums[i]+nums[st]+nums[en])>target) {
        //             en -= 1;
        //         } else {
        //             st += 1;
        //         }
        //     }
        // }

        // return nums[a] + nums[b] + nums[c];

        int left,right,i,closest = nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(i=0; i<nums.length-2; i++){
            left = i + 1; right = nums.length-1; 
            while(left<right){
                closest = (Math.abs(closest - target) < Math.abs(nums[i]+nums[left]+nums[right]-target) ? closest:nums[i]+nums[left]+nums[right]);
                if((nums[i]+nums[left]+nums[right])>target) right--;
                else left++;
            }

            if (closest == target) return closest;
            if (i<nums.length-2 && nums[i] == nums[i+1]) i++;
        }

        return closest;
    }

    public static void main(String[] args) {
        threesumclosest tsc = new threesumclosest();
        int[] a = {1,2,4,8,16,32,64,128};
        System.out.println(tsc.threeSumClosest(a, 82));
    }
}