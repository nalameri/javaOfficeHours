package week01Oscar;
public class PalindromeTask {
    public static int countSameFirstAndLast(String[] arr){
        int count = 0;
        /*
        I need to loop through the array and check each word if it has first and last char is same
        use charAt(index)  ----- first index 0 , last index str.length()-1
         */
        for (String each : arr) {
            each = each.toLowerCase();  // we make it case insensitive
            if(each.charAt(0) == each.charAt(each.length()-1)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPalindrome(String str){
        boolean flag = false;
        // we reverse the original statement and compare reversed and original one if they are same or not
        String reversedStr = "";
        if(str.contains(" ")){   // this one takes out any space in the statement
            str = str.replace(" ","");
        }
        str = str.toLowerCase();   // Strings are immutable
        for (int i = str.length()-1 ; i >= 0 ; i--) { // go from last char until to the first one
            reversedStr += str.charAt(i);
        }
        if(reversedStr.equals(str)){ // reversed and original one if they are same or not
            flag = true;
        }
        return flag;
    }

    public static String findMaxLengthPalindrome(String[] arr){
        String result = "No Palindrome";
        String maxLengthPalindrome = "";
        for (int i = 0; i < arr.length; i++) {
            if(isPalindrome(arr[i])){
                if(maxLengthPalindrome.length()<arr[i].length()){
                    maxLengthPalindrome = arr[i];
                }
            }
        }
        if(!maxLengthPalindrome.isEmpty()){
            result = maxLengthPalindrome;
        }
        return result;
    }
}
