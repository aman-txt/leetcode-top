
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ThreSom {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int curr=0;
        List<List<Integer>> listOfLists = new ArrayList<List<Integer>>();
        for(int i=0 ; i<nums.length;i++){
            curr= nums[i];
            for(int j=0; j<nums.length;j++){
                if(j!=i){
                if(hm.containsKey(nums[j] )){
                      listOfLists.add(0,List.of(curr,nums[hm.get(nums[j])], nums[j]));    
                }
                    hm.put(-1*(nums[j] + curr), j);
                }
            }
            hm.clear();
        }   
        return listOfLists;
    }
    public static void main(String[] args) {
        ThreSom s = new ThreSom();
        int[] no = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        System.out.println(s.threeSum(no));

    }
}
