package leetcode.easy;

public class Q_409_LongestPalindrome {

    /*
     *
     * Given a string s which consists of lowercase or uppercase letters,
     * return the length of the longest palindrome that can be built with those letters.
     * Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
     * */

    public static void main(String[] args) {

    }

    public int longestPalindrome(String s) {

        if (s.length() <= 1) {
            return s.length();
        }

        int[] arr = new int[60];

        for (char ch : s.toCharArray()) {
            arr[ch - 'A']++;
        }

        int ans = 0;
        for (int val : arr) {
            ans += (val / 2) * 2;
            if (ans % 2 == 0 && val % 2 == 1) {
                ans++;
            }
        }

        return ans;


        /*
        if(s.length() <= 1){
            return s.length();
        }

        HashSet<Character> set= new HashSet<>();
        int count = 0;

        for(int i = 0; i < s.length(); i++){

            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                count++;
            }else{
                set.add(s.charAt(i));
            }

        }

        if(!set.isEmpty()){
            return ((count * 2) + 1);
        }else{
            return (count * 2);
        }
           */
    }
}
