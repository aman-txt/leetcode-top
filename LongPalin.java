public class LongPalin {
    public String pal(String s,int i, int j){
        // While there are characters to compare
        while (i >=0 && j<s.length() && s.charAt(i)==s.charAt(j)) {
            i-=1;
            j+=1;        
        }
            return s.substring(i+=1, j);
        }

    static boolean isPalindrome(String str)
    {
    int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String longest="";
        if(s.length() == 1 || isPalindrome(s)){
            return s;
        }
        
        for(int i=1 ; i<s.length();i++){
            String temp= pal(s,i,i);
            if(temp.length() >longest.length()){
                longest = temp;
            }
            temp= pal(s, i, i+1);
            if(temp.length() >longest.length()){
                longest = temp;
            }
        }
          return longest;  
        
        }
    public static void main(String[] a) {

        LongPalin l = new LongPalin();
        System.out.println( l.longestPalindrome("ccd"));
    }
}
