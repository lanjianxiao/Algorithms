package sort;

import java.util.Arrays;

/**
 * 堆排序
 * 升序采用大顶堆的方式
 * 降序采用小顶堆的方式
 */
public class HeapSort {
    public static void sort(int[] map) {
        for(int i=map.length-1;i>0;i--) {
            adjustSort(map, i);
            int tmp=map[0];
            map[0]=map[i];
            map[i]=tmp;
        }
    }
    public static void adjustSort(int[] map,int lastIndex) {
        int lastParentNode=(lastIndex+1)/2-1;
        for(int i=lastParentNode;i>=0;i--) {
            int tmp=map[i];
            int maxChild=2*i+1;
            if((2*i+2)<=lastIndex&&map[2*i+2]>map[maxChild]) {//要判断有无右儿子
                maxChild=2*i+2;
            }
            if(map[i]<map[maxChild]) {
                map[i]=map[maxChild];
                map[maxChild]=tmp;
            }
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] map= {2,7,4,1,5,8,2,0,3};
        sort(map);
        System.out.println(Arrays.toString(map));
    }
}
