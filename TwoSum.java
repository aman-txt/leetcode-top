import java.util.HashMap;

class TwoSum{


    public static int[] twoSum(int[] nums, int target) {
        
        int n1=876,n2=876;

        HashMap<Integer,Integer> no = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            n1=i;
            if(no.containsKey(target-nums[i])){
                n2= no.get(target-nums[i]);
                break;
            }
            else{
                no.put(nums[i], i);
            }

        }
        int temp;
        if(n1>n2){
            temp=n1;
            n1=n2;
            n2=temp;
        }

        int[] ans = {n1,n2};

        return ans;

        
      
    }


    public static void main(String[] args){
        int[] t1 = {2,7,11,15}; 
        int[] t2 = {3,2,95,4,-3}; 
        
       // System.out.println(twoSum(t1,9)[1]);
       int[] ans = twoSum(t1, 9);
       for(int i=0; i<2;i++){
            System.out.println(ans[i]);
       }
      }


   
}