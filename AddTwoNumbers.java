public class AddTwoNumbers {

    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String val1="",val2="";

        while(l1.next != null){
            val1+= l1.val;
            l1=l1.next;
        }
        val1+=l1.val;
        while(l2.next != null){
            val2+= l2.val;
            l2=l2.next;
        }
        val2+=l2.val;
        int max = val1.length();
        if(val2.length() >val1.length()){
            max=val2.length();
        }
        String fans="";
        int rem=0;
        for(int i=0;i<max;i++){
            int a=0,b=0,x=0;
            if(val1.length()>i){
                a=Character.getNumericValue(val1.charAt(i));
            }
            if(val2.length()>i){
                b=Character.getNumericValue(val2.charAt(i));

            }
            x= a+b+rem;

            fans= x%10 +fans;
            if(Integer.toString(x).length()>1){
                rem= Integer.parseInt(Integer.toString(x).substring(0, 1));
           
            } else{
                rem=0;
            } 
        }
        if(rem !=0){
            fans = rem+fans;
        }
        ListNode temp=null;
       

        for(int i=0;i<fans.length();i++){
            
            if(i==0){
                temp = new ListNode(Character.getNumericValue(fans.charAt(i)));
            }
            else{
                temp = new ListNode(Character.getNumericValue(fans.charAt(i)),temp);
            }
        }
    
        return temp;
        



        // char ch,ch1;
        // String v1="",v2="";
        // for (int i=0; i<val1.length(); i++)
        // {
        //   ch= val1.charAt(i); //extracts each character
        //   v1= ch+v1; //adds each character in front of the existing string
        // }
        // for (int i=0; i<val2.length(); i++)
        // {
        //   ch1= val2.charAt(i); //extracts each character
        //   v2= ch1+v2; //adds each character in front of the existing string
        // }

        // long ans = Long.parseLong(v1) + Long.parseLong(v2);
        // String fans = String.valueOf(ans);
        // ListNode temp=null;
        // for(int i=0;i<fans.length();i++){
            
        //     if(i==0){
        //         temp = new ListNode(Character.getNumericValue(fans.charAt(i)));
        //     }
        //     else{
        //         temp = new ListNode(Character.getNumericValue(fans.charAt(i)),temp);
        //     }
        // }
    
        // return temp;
    }
    public static void main(String[] args){
        AddTwoNumbers at = new AddTwoNumbers();
        ListNode ln = at.new ListNode(4);
        ListNode ln1 = at.new ListNode(6,ln);
        ListNode ln2 = at.new ListNode(5,ln1);

        ListNode ln3 = at.new ListNode(3);
        ListNode ln4 = at.new ListNode(4,ln3);
        ListNode ln5 = at.new ListNode(2,ln4);
        
        at.addTwoNumbers(ln2, ln5);

        
        
    
    }
}
