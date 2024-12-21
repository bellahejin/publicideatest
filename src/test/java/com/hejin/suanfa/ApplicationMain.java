package com.hejin.suanfa;
import java.util.Arrays;


/**
 * @author hejin
 * @create 2024-12-21-21:55
 */
public class ApplicationMain {
    public static void main(String[] args) {

        Solution solution = new Solution();

        //输出数组 num 中两数之和等于 target 的数组下标
        int[] result = solution.twoSum(new int[]{1,5,4,3}, 4);
        System.out.println(Arrays.toString(result));

//        for(Object obj : result){
//            System.out.println(obj);
//        }

    }

}
