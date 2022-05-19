class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        
        int i=-1;
        for(int ele : nums) {
            i++;
                if(map.containsKey(target-ele)) {
                    res[0] = map.get(target - ele);
                    res[1] = i;
                }
                else {
                  map.put(ele, i);  
                } 
        }
        return res;
    }
}


// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]


// brute force we can create 2 pointers i and j and keep traversing => T->O(n2)

// Above method is to create a hashmap and store the value and its index inside the hashmap so that when we get the 2nd sum we subtract it with
// the target and search in hash and return the res arr  T->O(n)



