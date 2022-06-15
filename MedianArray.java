import java.lang.reflect.Array;
import java.util.Arrays;

public class MedianArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1= nums1.length,len2=nums2.length;
        int[] arr = new int[len1+len2];
        
        System.arraycopy(nums1, 0, arr, 0, len1);
        System.arraycopy(nums2, 0, arr, len1, len2);

        Arrays.sort(arr);
        double median;
        int flen= arr.length;
        System.out.println(flen);
        if(flen %2==0){
            median = (double)(arr[(flen-2)/2]+arr[(flen)/2])/2;
        }
        else{
            median = (double)arr[(flen-1)/2];
        }
        return median;   
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        MedianArray ma = new MedianArray();
        System.out.println(ma.findMedianSortedArrays(nums1,nums2));
    }
}
