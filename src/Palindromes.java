/**
 * Just tell us if the String R palindrome or not
 */
public class Palindromes {

    /*
     * Returns reverse value from String
     */
    public static String getReverseString( String s) {
        String strng = s;
        StringBuilder rvrsStrng = new StringBuilder("");

        char[] strngArray = strng.toCharArray();
        for (int i = strngArray.length - 1; i >= 0; i--) {
            rvrsStrng.append(strngArray[i]);
        }
        return String.valueOf(rvrsStrng);
    }

    /*
     * Returns true if String is palindrome and returns false if not
     */
    public static boolean isPalindrome( String s) {
        if(s.equals(getReverseString(s))){return true;} else {return false;}
    }

}
