// 1. Two Sum
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
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
 

// Constraints:

// 2 <= nums.length <= 104
// -109 <= nums[i] <= 109
// -109 <= target <= 109
// Only one valid answer exists.


/*
 * MY Approach
 * bruteForce
 * given nums arr and target
 * Taking two loops i and j 
 * i will be at 0th index and j will be at i+1
 * i will itrate till arr.length in both
 * we will check if nums[i] + nums[j] == target return the index of i and j
 * 
 * 
 */

public class TwoSum {

public static void main(String[] args) {
    int nums[]={3,2,4};
    int target=6;
    int [] result=TwoSum(nums,target);
    System.out.println("indices "+result[0]+","+result[1]);

}
public static int[] TwoSum(int nums [],int target){
for(int i=0;i<nums.length;i++){
    for(int j=i+1;j<nums.length;j++){
        if(nums[i]+nums[j]==target){
            return new int[]{i,j};
        }
    
    }
}
    
return new int[]{-1,-1};
}
}