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
 * TO optimize the time complexcity
 * given nums arr and target
 * Taking two pointers i and j 
 * i will be at 0th index and j will be at last index
 * i will itrate till i <=j (i should be less than j if it is equal or greater then we will break the loop)
 * we will check if nums[i] + nums[j] == target return the index of i and j
 * if nums[i] + nums[j] less than target then i will be incremented to i++ i will go right side of the array
 * else j will be go towards left side of the array
 * 
 * 
 */

import java.util.Arrays;

public class TwoSum {

public static void main(String[] args) {
    int nums[]={3,2,4};
    Arrays.sort(nums);
    int target=6;
    int [] result=TwoSum(nums,target);
    System.out.println("indices "+result[0]+","+result[1]);

}
public static int[] TwoSum(int nums [],int target){
    int i=0,j=nums.length-1;
while (i<=j) {
 if(nums[i]+nums[j]==target){
            return new int[]{i,j};
        }
        else if((nums[i]+nums[j])<target){
            i++;
        }else{
            j--;
        }
    
    }   
return new int[]{-1,-1};
}
}