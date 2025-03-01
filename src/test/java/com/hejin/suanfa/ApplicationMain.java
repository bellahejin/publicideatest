package com.hejin.suanfa;
import java.util.*;


/**
 * @author hejin
 * @create 2024-12-21-21:55
 */
public class ApplicationMain {
    public static void main(String[] args) {

        LikouSolution solution = new LikouSolution();

        //输出数组 num 中两数之和等于 target 的数组下标
        int[] twoSum = solution.twoSum(new int[]{1,5,4,3}, 4);
        System.out.println("这两个下标的数值相加等于目标数字：" + Arrays.toString(twoSum));

//        for(Object obj : result){
//            System.out.println(obj);
//        }

        //求字符串数组中最长公共前缀并返回
        String substr = solution.longestCommonPrefix(new String[]{"oi","oju","ohg"});
        System.out.println("公共前缀是："+ substr);

        //判断是不是回文数字
        boolean isPalindrome = solution.isPalindrome(8765678);
        if(isPalindrome) {
            System.out.println("是回文数字");
        }else{
            System.out.println("不是回文数字");
        }

        //判断是不是回文字符串
        boolean isPalindromeString = solution.isPalindromeString("helllleh");
        if(isPalindrome) {
            System.out.println("是回文字符串");
        }else{
            System.out.println("不是回文字符串");
        }

        //输出带空格字符串中对称的单词
        ArrayList<String> symmetricalWords = solution.symmetricalWords("age aga gooj");
        for(Object obj : symmetricalWords){
            System.out.println("对称单词："+ obj);
        }

        //字符串中最长不重复子串的字符数
        int maxsub = solution.maxSub("abccdef");
        System.out.println("字符串中最长不重复子串的字符数："+ maxsub);

        //罗马数字转为整数
        int romanToInt = solution.romanToInt("MCMXCIVIII");
        System.out.println("罗马数字转为整数:" + romanToInt);

        //冒泡排序
        int[] bubbleSort = solution.bubbleSort(new int[]{3,9,5,7,4,5});
        System.out.println("冒泡排序：" + Arrays.toString(bubbleSort));

        //二分查找
        int twoSearch = solution.twoSearch(new int[]{66, 78, 107, 123, 198}, 3);
        System.out.println("二分查找，找到的数字在该位置：" + twoSearch);

        //将数组中的 0 移动到末尾
        int[] lastZero = solution.lastZero(new int[]{0, 3, 14, 0, 6, 1});
        System.out.println("将数组中的 0 移动到末尾：" + Arrays.toString(lastZero));

        //找出字符串 sad 出现在 sarsad 的第一次的第一个字符的下标 3，没有返回 -1
        int w = solution.findFirstString("sarsad", "sad");
        System.out.println("sad 出现在 sarsad 的第一次的第一个字符的下标是:" + w);

        //在有序数组中，找到 9 的插入位置并返回
        int ins = solution.findInsert(new int[]{1,2,10,13}, 9);
        System.out.println("在有序数组中，找到 9 的插入位置:" + ins);

        //原地查找有序数组中的不重复数字长度，比如[0,0,2,2,3]，输出[0,2,3]长度是 3
        int noRepite = solution.noRepite(new int[]{0,0,2,2,3});
        System.out.println("原地查找有序数组中的不重复数字长度：" + noRepite);

        //查找数组中的重复数字（京东面试题）
        HashSet<Integer> repetitionNum=solution.repetitionNum(new int[]{1,7,2,2,4,4});
        System.out.println("重复数字是：" + repetitionNum.toString());

        //求数组中只出现一次的数字列表
        List<Integer> uniqueNum = solution.uniqueNum(new int[]{9,4,3,2,2,2,10,5,10});
        System.out.println("只出现 1 次的数字是：" + uniqueNum.toString());

        //两个升序数组，合并成一个升序数组
        int[] merge = solution.merge(new int[]{5, 9, 12}, new int[]{8, 9, 10});
        System.out.println("合并后的数组是："+ Arrays.toString(merge));

        //天眼查面试题
        //V2.3.4A 、 V3.2.1B，按以上格式输入两个版本号，编写函数实现返回最新的版本号？
        String getVersion = solution.getVersion("V4.2.3C", "V4.2.3D");
        System.out.println("最新的版本号是：" + getVersion);

        //天眼查面试题
        //鸡兔在一个笼子里，一共20只动物，笼子里52只腿；求鸡有多少只、兔有多少只
        solution.munAnimails();

        //爬楼梯
        int climbstairs = solution.climbstairs(10);
        System.out.println("有这么多种爬楼梯法："+ climbstairs);
    }

}
