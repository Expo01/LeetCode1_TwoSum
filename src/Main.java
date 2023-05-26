/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order. */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] myIntArray = new int[]{1, 2, 4};
        int myTarget = 5;
        Solution runSolution = new Solution();
        int[] solutionArray = runSolution.twoSum(myIntArray, myTarget);
        System.out.println(Arrays.toString(solutionArray));
    }
}

// 84 ms and 43.9 MB. O(n^2) solution nested for loops. Will perform O(n) solution with hashmap This is th

class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++){
//            for(int j = i+1; j<nums.length; j++){
//                if ( (nums[i]+nums[j]) == target){
//                    int[] returnSolutionArray = new int[] {i,j};
//                    return returnSolutionArray;
//                }
//            }
//        }
//        return null;
//    }


    //create empty map, for loop with if statement if map contains value equivalent to map-current value. use put meethod
    // to add integer;integer key values into map each loop

//1,2,4. value 5 //should return indexes at 0 and 2
//        public int[] twoSum(int[] nums, int target) {
//            Map<Integer,Integer> myMap = new HashMap<>();{
//                for (int i = 0; i < nums.length; i++){
//                    if (myMap.containsKey(target-nums[i])){
//                        int[] solution = {myMap.get(target-nums[i]),i}; // get method accepts key
//                        // returns a value, which is this case is actually the index of the array
//                        // 'nums' not the value at the index in the array
//                        // on the last run through, myMap will get (5-4) which is 1. the Key 1 in the map is linked
//                        // to index 0 in the original array
//                        return solution;
//                    }
//                    myMap.put(nums[i],i); //key and value, where the key is set to the value of the index, and the value
//                    // is the index. they are flip flopped
//                    // map will contain key/values... (1,0), (2,1), (4,2) (
//                }
//            }
//            return new int[]{};
//        }

// this is the fastest version which does not create a local variable pointer for int [] and just returns it
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[]{numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[]{};
    }

}