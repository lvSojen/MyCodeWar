//Time: 2141ms Passed: 4Failed: 0
public class JadenCase {

	public String toJadenCase(String phrase) {
		// TODO put your code below this comment
		if (phrase == null || phrase.length() == 0) return null;
    char[] charArray = phrase.toCharArray();
		return String.valueOf(jadenMachine(charArray));
	}
  public static char[] jadenMachine(char[] charArray) {
        int jaden = 1, index = 0;
        for(char elem : charArray) {
        if(elem == ' ') {
            jaden++;
            index++;
            continue;
        }
        if(jaden >0 && elem >=97) {
            jaden--;
            charArray[index] = (char)(elem - 32);
        } else if(jaden >0 && elem <97) {
            jaden--;
        }
        index++;
        }
        return charArray;
  }

}