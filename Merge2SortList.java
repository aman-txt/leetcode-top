import java.util.ArrayList;

class Merge2SortList{

    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> ans = new ArrayList<>();
        while( list1!= null || list2!=null){
            int p1=Integer.MAX_VALUE,p2=Integer.MAX_VALUE;
        
            if(list1 != null){
                p1= list1.val;
            
            }
            if(list2 != null){
                p2=list2.val;
            }
            if(p1<p2){
                ans.add(p1);
                list1= list1.next;
            }
            else{
                ans.add(p2);
                list2=list2.next;
            }
        }
        ListNode first = null;
        if(!ans.isEmpty()){
            first = new ListNode(ans.get(ans.size()-1));
        for(int i=ans.size()-1 ; i>0;i--){
            first =new ListNode(ans.get(i-1), first);
        }
        }
        return first;
    }

    public static void main(String[] args){


    }
}