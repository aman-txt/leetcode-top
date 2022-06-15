class containerWater{

    public int maxArea(int[] height) {
        int l=0, r=height.length-1,ans=0;
        int temp=0;
        while(l<r) {            temp= Math.min(height[l], height[r]) * (r-l);
            if(ans<temp){
                ans=temp;
            }
            if(height[l] >height[r]){
                r-=1;
            }
            else{
                l+=1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
       
        containerWater cw = new containerWater();
        int[] a = {1,2,3,4,5,25,24,3,4};
        System.out.println(cw.maxArea(a)); 
    }

}