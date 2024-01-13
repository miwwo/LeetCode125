import static java.lang.Character.isLetterOrDigit;

class Solution {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        char character, character1;
        while (i <= j){
            character = s.charAt(i);
            character1 = s.charAt(j);
            if(!isLetterOrDigit(character)) i++;
            else if(!isLetterOrDigit(character1)) j--;
            else {
                if (Character.toLowerCase(character)!=Character.toLowerCase(character1)) return false;
                i++;
                j--;
            }
        }
        return true;
    }
}


public class Main {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        System.out.println(Solution.isPalindrome(s));
    }
}