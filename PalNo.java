import java.net.Socket;
import java.util.Stack;

public class PalNo{
   
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        Stack<Integer> st = new Stack<>();     
        int y =x;
        while (x > 0) {
            st.push(x % 10);
            x = x / 10;
        }
        
        while(!st.isEmpty()){
            if(st.pop() != y%10){
                return false;
            }
            y=y/10;
        }
        return true;
    }
    public static void main(String [] args) {
        PalNo p = new PalNo();
        System.out.println( p.isPalindrome(12321));
        System.out.println(p.isPalindrome(00)); 
    }
}