package sort;

import java.util.Arrays;

/**
 * 希尔排序，优化后的插入排序
 * 每次进行分组进行插入排序
 */
public class ShellSort {
    public static void shellSort(int[] map,int len) {
        int i,j,h,tmp;
        for(i=len/2;i>0;i/=2) {
            for(j=i;j<len;j++) {
                tmp=map[j];
                for(h=j;h>=i;h-=i) {
                    if(tmp<map[h-i])
                        map[h]=map[h-i];
                    else
                        break;
                }
                map[h]=tmp;
            }
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] map= {3,5,1,7,4,3};
        shellSort(map, map.length);
        System.out.println(Arrays.toString(map));
    }

}
