package sort;

import java.util.Arrays;

/**
 * 冒泡排序，每次相邻两个位置进行比较，若符合条件则交换位置
 * 一轮下来一个最大数（最小数）上浮到最终位置
 * 因此n个数就要做n-1轮比较，因为每一轮都有一个数上浮到最终位置
 * 所以每增加一轮比较，该轮比较就可少比较一次。
 */
public class BubbleSort {
    public static void bubbleSort(int[] map) {
        for(int i=0;i<map.length-1;i++) {
            for(int j=0;j<map.length-i-1;j++) {
                if(map[j]>map[j+1]) {
                    int tmp=map[j];
                    map[j]=map[j+1];
                    map[j+1]=tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] map= {4,2,5,7,1,9,6};
        bubbleSort(map);
        System.out.println(Arrays.toString(map));
    }
}
