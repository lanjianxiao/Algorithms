package sort;

import java.util.Arrays;

/**
 * 归并排序
 * 递归进行分组排序，再合并
 */
public class MergeSort {
    public static void sort(int[] map,int left,int right,int[] tmp) {
        if(left<right) {
            int mid=(left+right)/2;
            sort(map, left, mid, tmp);
            sort(map, mid+1, right, tmp);
            merge(map, left, mid, right, tmp);
        }
    }
    public static void merge(int[] map,int left,int mid,int right,int[] tmp) {
        int i=left;
        int j=mid+1;
        int t=0;
        while(i<=mid&&j<=right) {
            if(map[i]<map[j]) {
                tmp[t]=map[i];
                i++;
                t++;
            }else {
                tmp[t]=map[j];
                j++;
                t++;
            }
        }
        while(i<=mid) {
            tmp[t]=map[i];
            i++;
            t++;
        }
        while(j<=right) {
            tmp[t]=map[j];
            j++;
            t++;
        }
        t=0;
        for(int h=left;h<=right;h++)
            map[h]=tmp[t++];
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] map= {3,5,1,9,6,3,2};
        int[] tmp=new int[map.length];
        sort(map, 0, map.length-1, tmp);
        System.out.println(Arrays.toString(map));
    }
}
