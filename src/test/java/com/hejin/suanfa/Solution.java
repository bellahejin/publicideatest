package com.hejin.suanfa;

import lombok.NoArgsConstructor;

import java.lang.reflect.Array;
import java.util.*;

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
        return new int[0]; //没找到就不返回值
    }

    //求字符串数组中最长公共前缀并返回
    public String longestCommonPrefix(String[] strs){
        if(strs.length == 0 || strs == null){
            return "";
        }
        int len = strs.length;
        int count = strs[0].length();
        for(int i = 0; i < count; i++){ //i 遍历第一个字符串的每一个字符
            char c = strs[0].charAt(i); //c 用来存储第一个字符串的第 i 位置的字符
            for(int j = 1; j < len ; j++){ //j 遍历每个字符串
                //判断第一个字符串 i 位置的字符是否等于 j 字符串 i 位置的字符，相等就继续循环，不相等就返回 i 之前的结果
                //判断第一个字符串 i 位置的长度是否等于 j 字符串长度，等于则返回 i 之前的字符串结果
                if(i == strs[j].length() || c != strs[j].charAt(i)){
                    return strs[0].substring(0,i); //左闭右开 0 ~ i-1 下标的字符子串
                }
            }
        }
        return strs[0] ;// 如果第一个字符串是子串公共前缀，直接返回第一个字符串（不满足 if 条件）
    }

    //判断是不是回文数字
    public boolean isPalindrome(int num){
        String  str = String.valueOf(num); // 把数字转成字符串类型，方便遍历每个字符
        boolean boo = false; //初始化返回结果
        int len = str.length();
        int i = 0;
        if(num < 0){ //负数一定不是回文数
            return false;
        }
        while(i <= len/2){ //判断 0 和非负数是否对称
            if(str.charAt(i) == str.charAt(len - i - 1)){
                boo = true;
                i++;
            } else {
                boo = false;
                break;
            }
        }
        return boo;
    }

    //判断是不是回文字符串
    public boolean isPalindromeString(String str){
        boolean boo = false; //初始化返回结果
        int len = str.length();
        int i = 0;
        while(i <= len/2){ //判断是否对称
            if(str.charAt(i) == str.charAt(len - i - 1)){
                boo = true;
                i++;
            } else {
                boo = false;
                break;
            }
        }
        return boo;
    }

    //输出带空格字符串中对称的单词
    public ArrayList<String> symmetricalWords(String str){
        String[] strlist = str.split(" ");
        ArrayList<String> subStr = new ArrayList<>();
        if(str == ""){
            subStr.add("no result!");
            return subStr;
        }
        //遍历每个单词，判断是不是回文字符串
        for(String strlisti : strlist){
            int len = strlisti.length();
            boolean boo = false;
            int j = 0;
            while(j <= len/2){
                if(strlisti.charAt(j) == strlisti.charAt(len - j -1)){
                    boo = true;
                    j++;
                } else {
                    boo = false;
                    break;
                }
            }
            if(boo){
                subStr.add(strlisti);
            }
        }
        return subStr;
    }

    //字符串中最长不重复子串的字符数，滑动窗口
    public int maxSub(String string){
        HashSet<Character> set= new HashSet<Character>(); //用 set 存放不重复的子串字符
        int len = string.length();
        int r = -1; //右侧加字符指针，初始化 -1，判断第一个字符 -1+1 能走到 while 里
        int max = 0;
        for(int l = 0; l < len; l++){ //l 是左侧删字符指针
            //0 位置不需要删除左侧字符
            if(l != 0){
                set.remove(string.charAt(l - 1));
            }
            //判断 set 中第一个字符是否和 r+1 个相同，相同则结束 while，继续 for 循环，if 中删除 set 中第一个字符
            while(r + 1 < len && (!set.contains(string.charAt(r + 1)))){
                set.add(string.charAt(r + 1));
                r++;
            }
            //比较上次最长子字符串个数和当前最长子字符串哪个大
            max = Math.max(max, r - l + 1);
        }
        return max;
    }

    //罗马数字转为整数
    public int romanToInt(String s){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int len = s.length();
        int sum = 0;
        //如果左边的字符对应的数值小于右侧的字符数值，则 sum 减去左边的数值
        for (int i = 0; i < len; i++){
            if((i + 1 < len) && map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                sum -= map.get(s.charAt(i));
            }else {
                sum += map.get(s.charAt(i));
            }
        }
        return  sum;
    }

    //冒泡排序
    public int[] bubbleSort(int[] list){
        int len = list.length;
        for (int i = 0; i < len - 1; i++){ //控制轮数
            for (int j = 0; j < len - i - 1; j++){ //控制每轮遍历长度
                if(list[j] > list[j+1]){
                    int temp = list[j+1];
                    list[j+1] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }

    //二分查找
    public int twoSearch(int[] lis, int target){
        int left = 0;
        int right = lis.length -1;
        while(left <= right){
            int mid = left + (right-left) / 2; //以防止 left 和 right 都很大时的整数溢出
            if(lis[mid] == target){
                return mid;
            }else if(lis[mid] > target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return -1; //数组中不存在该数返回 -1
    }

    //原地将数组中的 0 移动到末尾 (领岳科技面试题)
    //快慢指针简题
    //原地移除 arr 数组中数值等于 x 的数，并返回最新的 arr 长度，也是此解法
    public int[] lastZero(int[] arr){
        int noZero = 0; //noZero 是慢指针，用来记录非 0 数字应该存放的位置

        //将非零数字放在前面，i 为快指针，用来扫描不是 0 的数字
        for(int i=0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[noZero] = arr[i];
                noZero++;
            }
        }

        //其他位置置为 0
        for(int j=noZero; j < arr.length; j++){
            arr[j] = 0;
        }
        return arr;
    }

    //反转字符串 （京东面试题）
    public String toReverse(String input) {
        if(input == null){
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    //反转字符串（京东面试题）
    public String toReverseFun(String input){
        if(input == null){
            return null;
        }
        char[] ch = input.toCharArray();
        int left = 0;
        int right = input.length() - 1;

        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }

        return new String(ch);
    }

    //查找数组中的重复数字（京东面试题）比如[1,9,3,5,2,2,4,4],输出是[2,4]
    //查找数组中的不重复数字，比如[1,9,3,5,2,2,4,4],输出是[1,9,3,5,2,4]，也是这个思路，return use 即可
    public HashSet<Integer> repetitionNum(int[] arr){
        HashSet<Integer> use = new HashSet<>();
        HashSet<Integer> repetition = new HashSet<>();

        for(int num : arr){
            //use 中放不重复数字，repetition 中放重复数字
            if(! use.add(num)){
                repetition.add(num);
            }
        }
        return repetition;
    }

    //如何前序、中序、后序遍历二查树（京东面试题）
    //定义一棵树
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }
    //遍历方法类
    class TreeTraversal{
        //前序遍历
        public void preTreeTraversal(TreeNode tree){
            System.out.println(tree.val + "  ");
            preTreeTraversal(tree.left);
            preTreeTraversal(tree.right);
        }
        //中序遍历
        public void inTreeTraversal(TreeNode tree){
            preTreeTraversal(tree.left);
            System.out.println(tree.val + "  ");
            preTreeTraversal(tree.right);
        }
        //后序遍历
        public void lastTreeTraversal(TreeNode tree){
            preTreeTraversal(tree.left);
            preTreeTraversal(tree.right);
            System.out.println(tree.val + "  ");
        }
    }

    //原地查找有序数组中的不重复数字长度，比如[0,0,2,2,3]，输出[0,2,3]长度是 3
    public int noRepite(int[] arr){
        int n = arr.length;
        if(n == 0){
            return 0;
        }
        int fast = 1; //快指针，用来扫描不重复的数字
        int slow = 1; //慢指针，用来记住不重复数字需要复制到的下标
        while(fast < n){
            //fast 开始扫描，只要遇到不重复的数字，就复制到 slow 的位置，slow 往后移动 1
            if(arr[fast] != arr[fast-1]){
                arr[slow] = arr[fast];
                slow++;
            }
            fast++; //fast ++ 用来遍历每个数字
        }
        return slow;
    }

    //求数组中只出现一次的数字列表[9,4,3,2,2,2,10,5,10],输出是[9,4,3,5]
    public List<Integer> uniqueNum(int[] arr){
        if(arr == null){
            return null;
        }

        //遍历数组，把数字，数字出现的次数放到 map 中
        HashMap<Integer, Integer> ma = new HashMap<>();
        for(int i : arr){
            int va = ma.getOrDefault(i, 0) + 1;
            ma.put(i, va);
        }

        //遍历 map 把 value=1 的 key 放到 List 中
        ArrayList<Integer> ls = new ArrayList<>();
        for(Map.Entry<Integer, Integer> en : ma.entrySet()){
            if(en.getValue() == 1){
                ls.add(en.getKey());
            }
        }

        return ls;
    }

    //找出字符串 sad 出现在 sarsad 的第一次的第一个字符的下标 3，没有返回 -1
    public int findFirstString(String base, String findStr){
        int len = findStr.length();
        //判断子串是否等于 findStr
        for(int i=0; i + len <= base.length(); i++){
            if ( base.substring(i, i+len).equals(findStr) ){
                return i;
            }
        }
        return -1;
    }

    //在有序数组中，找到 9 的插入位置并返回
    public int findInsert(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int ins = arr.length;// 假设插入位置在最后一个位置

        while(left <= right){
            int mid = (right - left)/2 + left;
            if(target <= arr[mid]){
                ins = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }

        }
        return ins;
    }

    //两个升序数组，合并成一个升序数组
    public int[] merge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] mergedArray = new int[m + n];
        int i = 0, j = 0, k = 0;
        // 遍历两个数组，按顺序将较小的元素加入到合并后的数组中
        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        // 如果 arr1 中还有剩余元素，全部加入到合并后的数组中
        while (i < m) {
            mergedArray[k++] = arr1[i++];
        }
        // 如果 arr2 中还有剩余元素，全部加入到合并后的数组中
        while (j < n) {
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }

    //百度网盘真题：给定两个升序的链表，合并为一个升序的链表




    //天眼查面试题
    //V2.3.4A 、 V3.2.1B，按以上格式输入两个版本号，编写函数实现返回最新的版本号？
    public String getVersion(String version1, String version2){
        String[] parts1 = version1.split("\\.");
        String[] parts2 = version2.split("\\.");

        //去掉前后的字母，判断每个部分的数字，数字大的版本号大，比如 V4.2.1B 和V3.2.1B
        for(int i = 0; i< Math.min(parts1.length,parts2.length); i++){
            String numPart1 = parts1[i].replaceAll("[^0-9]","");
            String numPart2 = parts2[i].replaceAll("[^0-9]","");
            int num1 = Integer.parseInt(numPart1);
            int num2 = Integer.parseInt(numPart2);
            if(num1 > num2){
                return version1;
            } else if(num1 < num2){
                return version2;
            }
        }

        //如果前面的数字都相同，比较长度，比如 V3.2.1B 和 V3.2.1.1B
        if(parts1.length > parts2.length){
            return version1;
        }else if(parts1.length < parts2.length){
            return version2;
        }

        //如果前面数字和长度都相同，比较后缀，比如 V3.2.2B 和 V3.2.2A
        for(int i=0;i< Math.min(parts1.length,parts2.length);i++){
            String letterPart1 = parts1[i].replaceAll("[0-9]","");
            String letterPart2 = parts2[i].replaceAll("[0-9]","");
            int comp = letterPart1.compareTo(letterPart2);
            //comp 相等为0，小于为-1，大于为1
            if(comp > 0){
                return version1;
            } else if(comp < 0){
                return version2;
            }
        }
        //两个完全一样
        return version1;
    }

    //鸡兔在一个笼子里，一共20只动物，笼子里52只腿；求鸡有多少只、兔有多少只
    public void munAnimails(){
        int allAnimails = 20;
        int allFoots = 52;
        for(int chi = 0; chi <= allAnimails; chi++){
            int rabits = allAnimails - chi;
            if (2 * chi + 4 * rabits == allFoots){
                System.out.println("鸡有："+ chi + "只，兔子有："+ rabits +"只。");
                return;
            }
        }
    }


}
