package leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder myStr = new StringBuilder("");
        Integer myLength = null;
        for (String s : strs) {
            if (myLength==null){
                myLength = s.length();
            } else if (s.length()<myLength){
                myLength = s.length();
            }
        }

        for (int i = 0; i < myLength; i++) {
            Character mainChar = strs[0].charAt(i);
            boolean myChecker = true;
            for (String s : strs) {
                if (mainChar != s.charAt(i)) {
                    myChecker = false;
                    break;
                }

            }
            if (myChecker) {
                myStr.append(mainChar);
            } else {
                break;
            }
        }
        return myStr.toString();
    }
}
