/**
 * @author Thomas Siyu
 * @version 1.00
 * @time 2021 2021/1/22 12:05
 */
import java.util.Arrays;
import java.util.Scanner;
public class java_next_permutation {

    //USACO工具方法 全排列
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6};
        int num = 0;
        do {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
            System.out.println();
        } while (nextPermutation(array));
        System.out.println(num);
        sc.close();
    }

    public static boolean nextPermutation(int[] array) {
        //沒有下一個全排列
        if (array.length <= 1) {
            return false;
        }
        //从后往前找，找到第一个不满足降序的数（要考虑到重复的数字）
        int i = array.length - 2;
        for (; i >= 0 && array[i] > array[i + 1]; i--) {

        }
        //没有全排列
        if (i == -1) {
            return false;
        }
        //从i开始往后找到大于arr[i]的最小的数
        int k = i + 1;
        for (; k < array.length && array[k] > array[i]; k++) {

        }
        //交换arr[i]和arr[k-1]
        swap(array, i, k - 1);
        //重新对arr[i]后面的数排序，接下来继续进行全排列操作
        Arrays.sort(array, i + 1, array.length);
        return true;
    }

    public static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;

    }
    //USACO 全排列算法 （字符串）
   /* public class StringArrange {
        //方法2：字典序排列
        *//*
         * 参数arrayA：给定字符串的字符数组
         * 函数功能：输出字符串数组的所有字符的字典序全排列
         *//*
        public void dictionaryArrange(char[] arrayA){
            System.out.println(String.valueOf(arrayA));
            while(allArrange(arrayA))
                System.out.println(String.valueOf(arrayA));
        }
        //判断当前数组arrayA序列是否可以进行字典序排列，如可以则进行排列并返回true，否则返回false
        public boolean allArrange(char[] arrayA){
            int i;
            for(i = arrayA.length-2;(i >= 0) && arrayA[i] > arrayA[i+1];--i);
            if(i < 0)
                return false;
            int k;
            for(k = arrayA.length-1;(k > i) && arrayA[i] >= arrayA[k];--k);
            swap(arrayA,i,k);
            reverseArray(arrayA,i+1,arrayA.length-1);
            return true;
        }
        //将数组中a[m]到a[n]一段元素反序排列
        public void reverseArray(char[] arrayN,int m,int n){
            while(m < n){
                char temp = arrayN[m];
                arrayN[m++] = arrayN[n];
                arrayN[n--] = temp;
            }
        }
        //交换数组m位置和n位置上的值
        public void swap(char[] arrayA,int m,int n){
            char temp = arrayA[m];
            arrayA[m] = arrayA[n];
            arrayA[n] = temp;
        }

        public static void main(String[] args){
            StringArrange test = new StringArrange();
            String A = "abc";
            char[] arrayA = A.toCharArray();
            test.dictionaryArrange(arrayA);
        }
    }*/


}
