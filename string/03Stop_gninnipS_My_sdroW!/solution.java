//Time: 2104ms Passed: 1Failed: 0
public class SpinWords {

  public String spinWords(String sentence) {
		String [] strArray = sentence.split(" ");
		int index = 0;
		for(String str : strArray) {
		    strArray[index++]=reverse(str);
		}
		String output = String.join(" ",strArray);
		return output;
  }
  public static String reverse(String s) {
    if(s.length()>=5) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    return s;
    }
}