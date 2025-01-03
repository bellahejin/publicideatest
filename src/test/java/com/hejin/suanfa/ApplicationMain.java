package com.hejin.suanfa;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * @author hejin
 * @create 2024-12-21-21:55
 */
public class ApplicationMain {
    public static void main(String[] args) {

        Solution solution = new Solution();

        //输出数组 num 中两数之和等于 target 的数组下标
        int[] twoSum = solution.twoSum(new int[]{1,5,4,3}, 4);
        System.out.println(Arrays.toString(twoSum));

//        for(Object obj : result){
//            System.out.println(obj);
//        }

        //求字符串数组中最长公共前缀并返回
        String substr = solution.longestCommonPrefix(new String[]{"oi","oju","ohg"});
        System.out.println(substr);

        //判断是不是回文数字
        boolean isPalindrome = solution.isPalindrome(8765678);
        System.out.println(isPalindrome);

        //判断是不是回文字符串
        boolean isPalindromeString = solution.isPalindromeString("helllleh");
        System.out.println(isPalindromeString);

        //输出带空格字符串中对称的单词
        ArrayList<String> symmetricalWords = solution.symmetricalWords("age aga goog");
        for(Object obj : symmetricalWords){
            System.out.println(obj);
        }

        //字符串中最长不重复子串的字符数
        int maxsub = solution.maxSub("abccdef");
        System.out.println(maxsub);

        //罗马数字转为整数
        int romanToInt = solution.romanToInt("MCMXCIVIII");
        System.out.println(romanToInt);

        //冒泡排序
        int[] bubbleSort = solution.bubbleSort(new int[]{3,9,5,7,4,5});
        System.out.println(Arrays.toString(bubbleSort));

        //二分查找
        int twoSearch = solution.twoSearch(new int[]{66, 78, 107, 123, 198}, 3);
        System.out.println(twoSearch);

        //将数组中的 0 移动到末尾
        int[] lastZero = solution.lastZero(new int[]{0, 3, 14, 0, 6, 1});
        System.out.println(Arrays.toString(lastZero));

        //找出字符串 sad 出现在 sarsad 的第一次的第一个字符的下标 3，没有返回 -1
        int w = solution.findFirstString("sarsad", "sad");
        System.out.println(w);

        //在有序数组中，找到 9 的插入位置并返回
        int ins = solution.findInsert(new int[]{1,2,10,13}, 9);
        System.out.println(ins);
    }

}
