public class Palindrome {

    public boolean isPalindrome(String ls) {
        String s = ls.toLowerCase();
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }

        //lets check first and last character fo the passed-in string;
        //if they match, lets create a substring from the 1st element to the last-1 element of the passed-in string;
        //lets passed that created substring to the isPalindrome function again till there is no more match
        //and condition is set to false, where we exit the function;
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }
}
