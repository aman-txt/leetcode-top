public class atoi {
    
    public int myAtoi(String input) {
        int sign = 1; 
        int result = 0; 
        int index = 0;
        int n = input.length();
        int temp = input.charAt(index);
        while (index < n && temp == 32) { 
            index++; 
        }
        if (index < n && temp == 43) {
            sign = 1;
            index++;
        } else if (index < n && temp == 45) {
            sign = -1;
            index++;
        }
        while (index < n && Character.isDigit(input.charAt(index))) {
            int digit = input.charAt(index) - '0';
            if ((result > Integer.MAX_VALUE / 10) || 
                (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {     
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = 10 * result + digit;
            index++;
        }
        return sign * result;
    }


    public static void main(String[] args) {
        atoi a = new atoi();
        System.out.println( a.myAtoi("   +213c12"));
    }
}
