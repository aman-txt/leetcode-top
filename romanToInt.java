import java.util.HashMap;
import java.util.Map;

public class romanToInt {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        {
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);
        }
        int result = 0;
        int previous = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = map.get(s.charAt(i));
            if (curr < previous) {
                result -= curr;
            } else {
                result += curr;
            }
            previous = curr;
        }
        return result;
    }
    
    public static void main(String[] args) {
        
    }

}
