import java.lang.reflect.Array;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forsum {
    
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int len = nums.length;
        int st=0, en=len-1;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i=0; i< len-3 ;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for(int j=i+1; j<len-1 ; j++){
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                st=j+1;
                while(st<en){
                    if(nums[i] + nums[j] +nums[st]+nums[en] == target){
                        ans.add(0,List.of(nums[i],nums[j],nums[st],nums[en]));                
                        st+=1;
                        en-=1;
                    
                        while( nums[st]==nums[st-1]){
                            st+=1;
                        }
                        while( nums[en]==nums[en+1]){
                            en-=1;
                        }
                       }else if(nums[i] + nums[j] > target){
                            en-=1;
                        }else{
                            st+=1;
                        }
                    }    
                }
            }
            return ans;
        }
          
    

    public static void main(String[] args) {
        forsum f = new forsum();
        int[] a = {1,0,-1,0,-2,2};
        System.out.println(f.fourSum(a , 0));
    }
}


// public List<List<Integer>> fourSum(int[] nums, int target) {
//     Arrays.sort(nums);
// List<List<Integer>> list = new ArrayList();
// long target1 = target;

// for(int j=0;j<=nums.length-4;j++)
// {
//  if(j> 0 && nums[j]==nums[j-1]) continue; //skip duplicates
//  for(int i=j+1;i<=nums.length-3;i++)
//  {
//       if(i> j+1 && nums[i]==nums[i-1]) continue;  //skip duplicates
//    int first = i+1;
//    int last = nums.length-1;
//    while(first<last)
//    {
//        long firstTarget =   nums[first] + nums[last];  //Important to take as long to avoid overflow
//        long secondTarget =  nums[i] + nums[j];
//       if( firstTarget + secondTarget< (long)target1)  first++;
//       else if(firstTarget + secondTarget> (long)target1)  last--;
//        else
//        {
//             List<Integer> newList = new ArrayList();
//            newList.add(nums[j]);
//            newList.add(nums[i]);
//            newList.add(nums[first]);
//            newList.add(nums[last]);
//            list.add(new ArrayList<>(newList));
//            while (first <last && nums[first] == nums[first+1]) first++; //very important
//              while (first < last && nums[last] == nums[last-1]) last--; //lines of code to skip duplicates
//            first++;
//            last--;
//      }
//    }
//  }
// }
//  return list;
// }