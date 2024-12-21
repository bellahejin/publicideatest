package com.hejin.suanfa;

import lombok.NoArgsConstructor;

/**
 * @author hejin
 * @create 2024-12-21-21:43
 */
@NoArgsConstructor
public class Solution {
    //输出数组 num 中两数之和等于 target 的数组下标
    public int[] twoSum(int[] num, int target){
        int len = num.length;
        for(int i = 0; i < len-1; i++){
            for(int j = i + 1; j < len; j++){
                if (num[i] + num[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];//没找到就不返回值
    }
}
