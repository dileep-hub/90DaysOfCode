class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        int left = 0;
        int right = 0;
        int n = s.length();
        int len = 0;
        
        while(right < n) {
            if(map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right))+1, left);
            }
            map.put(s.charAt(right), right);
            len = Math.max(len, right-left+1);
            right++;
        }
        return len;
    }
}

// Given a string s, find the length of the longest substring without repeating characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

// will be haveing 2 pointers right and left, and length L to find the lenght of the longest unique consecutive chars

// and rest same as the logic given

// right will be moving untill it find the repeated char by checking the hashmap 
// if char has been repeated left will be changed to the index next to the first repeated char
