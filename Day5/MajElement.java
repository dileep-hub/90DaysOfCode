package com.dileep.Day5;

public class MajElement {
    class Solution {
        public List<Integer> majorityElement(int[] nums) {

            Map<Integer, Integer> hm = new HashMap<>();
            List<Integer> res = new ArrayList<>();
            int n = nums.length;

            for(int ele : nums) {
                if(!hm.containsKey(ele)) {
                    hm.put(ele, 1);
                } else {
                    hm.put(ele, hm.get(ele)+1);
                }
            }
            for(Integer key : hm.keySet()) {
                if(hm.get(key) > n/3) {
                    res.add(key);
                }
            }
            return res;
        }
    }
}

//Example 1:
//
//        Input: nums = [3,2,3]
//        Output: 3
//        Example 2:
//
//        Input: nums = [2,2,1,1,1,2,2]
//        Output: 2

//1 - use hashmap and make count of them
//2 - and then use keyset and add ele who has value more then n/3