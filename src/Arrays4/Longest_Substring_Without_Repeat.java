package Arrays4;

import java.util.HashMap;
import java.util.HashSet;

public class Longest_Substring_Without_Repeat {
    public static void main(String[] args) {
        String test = "abcabcbb";
        int length = longest_substring(test);
        System.out.println(length);
    }

    private static int longest_substringOP(String test){
        int left=0,right=0;
        int n = test.length();
        int len = 0;
        HashMap<Character,Integer> mpp = new HashMap<>();
        while(right<n){
            if(mpp.containsKey(test.charAt(left))){
                left=Math.max(mpp.get(test.charAt(right)),left);
            }
            mpp.put(test.charAt(right),right);
            len = Math.max(len,right-left+1);
            right++;
        }

    }

    private static int longest_substring(String test) {
        int maxLength=0;
        for(int i=0;i<test.length();i++){
            HashSet<Character> hset = new HashSet<>();
            for(int j=i;j<test.length();j++){
                if(!hset.contains(test.charAt(j))){
                    hset.add(test.charAt(j));
                    maxLength=Math.max(maxLength,j-i+1);
                }
                else{
                    break;
                }
            }
        }return maxLength;
    }
}
