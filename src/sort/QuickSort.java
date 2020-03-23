package sort;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {
    public static void quickSort(int[] map,int left,int right) {
        if(left>=right)
            return;
        int i=left;
        int j=right;
        int tmp=map[i];
        while(i<j) {
            while(i<j&&map[j]>=tmp)
                j--;
            map[i]=map[j];
            while(i<j&&map[i]<=tmp)
                i++;
            map[j]=map[i];
        }
        map[i]=tmp;
        quickSort(map,left,i-1);
        quickSort(map, i+1, right);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] map= {6,3,2,4};
        quickSort(map, 0, map.length-1);
        System.out.println(Arrays.toString(map));
    }
}
