// Link
// https://www.codewars.com/kata/5467e4d82edf8bbf40000155/solutions/java
import java.util.Arrays;
public class DescendingOrder {
  public static int sortDesc(final int num) {
    //Your code
        String given = num+"";
        int[] result = new int[given.length()];
        for (int i = 0; i < given.length(); i++) {
            int number = Integer.parseInt(given.charAt(i)+"");
            result[i] = number;
        }
        Arrays.sort(result);
        String output = "";
        for(int i =result.length-1;i>=0;i--) {
            output +=result[i];
        }
        return Integer.parseInt(output);
  }
}
// Alternative
import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
}
// Alternative
import java.util.*;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    String[] numbers = (Integer.toString(Integer.valueOf(num))).split("");
    Arrays.sort(numbers);
    
    String result = "";
    
    for(String s : numbers)
    {
      result = s + result;
    }
    
    return Integer.parseInt(result);
  }
}