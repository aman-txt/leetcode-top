import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class phoneNo {
    List<String> ans = new ArrayList<String>();
    String main="";
    HashMap<Character, String> hp = new HashMap<>();
    public void findit(int indx, String str){
        if(str.length() == main.length() ){
            ans.add(str);
            return;
        }
        for(int i=0; i< hp.get(main.charAt(indx)).length() ; i++){
            findit(indx+1, str+  hp.get(main.charAt(indx)).charAt(i));
        }
        
    }
    public List<String> letterCombinations(String digits) {
       
        main = digits;
        hp.put('2', "abc");
        hp.put('3', "def");
        hp.put('4', "ghi");
        hp.put('5', "jkl");
        hp.put('6', "mno");
        hp.put('7', "pqrs");
        hp.put('8', "tuv");
        hp.put('9', "wxyz");
        if(digits.length()>0){
            findit(0,"");
        }
        return ans;
    }

    public static void main(String[] args) {
        phoneNo p = new phoneNo();
        System.out.println(p.letterCombinations("23"));
    }
}
