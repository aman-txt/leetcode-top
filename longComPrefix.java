public class longComPrefix {
    public String longestCommonPrefix(String[] strs) {
        int i=0;
        char temp=' ';
        int smol = 1000;
        for (int ii = 0; ii < strs.length; ii++) {
            if (strs[ii].length() < smol) {
                smol = strs[ii].length();
            }
        }
        while(true){
            if(i>=smol){
                break;
            }
            temp = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i) != temp){
                    return strs[0].substring(0, i);
                }
            }
            i+=1;
        }   
        return strs[0].substring(0, i);
    }
    public static void main(String[] args) {
        longComPrefix lc = new longComPrefix();
        String[] str = {"flower","flow","flight"};
        System.out.println( lc.longestCommonPrefix(str));
    }
}
