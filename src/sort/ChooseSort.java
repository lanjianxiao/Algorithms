package sort;

import java.util.Arrays;

/**
 * 选择排序，从之后的元素选择最小（最大）的元素与其进行交换
 */
public class ChooseSort {
    public static void chooseSort(int[] map) {
        for(int i=0;i<map.length;i++) {
            int minIndex=i;
            for(int j=i+1;j<map.length;j++) {
                if(map[minIndex]>map[j]) {
                    minIndex=j;
                }
            }
            int tmp=map[i];
            map[i]=map[minIndex];
            map[minIndex]=tmp;
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] map= {3,2,5,7,1,9,6,4,3};
        chooseSort(map);
        System.out.println(Arrays.toString(map));
    }
}
