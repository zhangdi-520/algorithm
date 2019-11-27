package com.zd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {

    public static void main(String[] args) {
        int[] arr = {1,5,7,3,7,4,9};
        TwoNumberSum sum = new TwoNumberSum();
//        System.out.println(Arrays.toString(sum.twoSum(arr,8)));
        System.out.println(Arrays.toString(sum.hashTwoSum(arr,8)));
    }
    /*
    给定一个整数数组 nums 和一个目标值 target，
    请你在该数组中找出和为目标值的那 两个 整数，
    并返回他们的数组下标。
*/
    public int[] twoSum(int[] nums,int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalStateException("no number");
    }

    public int[] hashTwoSum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int comp = target-nums[i];
            if(map.containsKey(comp)&&map.get(comp)!=i){
                return new int[]{i,map.get(comp)};
            }
        }
        throw new IllegalStateException("no number");

    }


}

