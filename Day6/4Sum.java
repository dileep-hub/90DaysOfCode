class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        if(nums == null || nums.length == 0) return res;
        
        int n = nums.length;
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                
                int target2 = target - nums[i] - nums[j];
                int left = j+1;
                int right = n-1;
                
                while(left < right) {
                    
                    int twoSum = nums[left] + nums[right];
                    if(twoSum < target2) left++;
                    else if (twoSum > target2) right--;
                    else {
                        List<Integer> cort = new ArrayList<>();
                        cort.add(nums[i]);
                        cort.add(nums[j]);
                        cort.add(nums[left]);
                        cort.add(nums[right]);
                        res.add(cort);
                        
                        while(left < right && nums[left] == cort.get(2)) left++;
                        
                        while(left < right && nums[right] == cort.get(3)) right--;
                    }
                    
                }
                
                while(j + 1 < n && nums[j+1] == nums[j]) j++; 
                
            }
            while(i + 1 < n && nums[i+1] == nums[i]) i++;
        }
        
        return res;
        
    }
}


// Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

// 0 <= a, b, c, d < n
// a, b, c, and d are distinct.
// nums[a] + nums[b] + nums[c] + nums[d] == target
// You may return the answer in any order.

 

// Example 1:

// Input: nums = [1,0,-1,0,-2,2], target = 0
// Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
// Example 2:

// Input: nums = [2,2,2,2,2], target = 8
// Output: [[2,2,2,2]]


result

have 4 pointers i , j , left, right
where i will start form 0 and j form i+1 also left=j+1 and right=lenght(array)
get two sum from left and right and finally add to res array




