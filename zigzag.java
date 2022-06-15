public class zigzag {
        public String convert(String s, int n) {
            int i=1;
            if(n == 1 || n > s.length()) return s;
            int j=Math.max(1, n-1+n-1);
            int len = s.length();
            StringBuilder sb = new StringBuilder();
    
            int start = 0;
            
            while(start < len) {
                sb.append(s.charAt(start));
                start += j;
            }
            
            int top = j;
            int bottom = 0;
            while(i<n-1) {
                start = i;
                top = top - 2;
                bottom = bottom + 2;
                
                int x = 0;
                int y = i;
                sb.append(s.charAt(i));
                
                while(x<len || y<len) {
                    x = y + top;
                    y = x + bottom;
                    
                    if(x<len) {
                        sb.append(s.charAt(x));
                    }
                    
                    if(y<len) {
                        sb.append(s.charAt(y));
                    }
                }
                
                i++;
            }
            
            start = n-1;
            while(start < len) {
                sb.append(s.charAt(start));
                start += j;
            }
            
            return sb.toString();
        }

    public static void main(String[] args) {
        zigzag z = new zigzag();
        z.convert("PAYPALISHIRING", 4);
    }
}
