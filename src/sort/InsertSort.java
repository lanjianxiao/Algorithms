package sort;

import java.util.Arrays;

/**
 * 插入排序
 * 从数组的第二个元素开始，不断与前一个元素比较，若满足条件，则交换，并继续
 * 向前比较，直到不满足条件，退出，继续下一个元素对前面元素的比较
 */
public class InsertSort {
    public static void insertSort(int[] map) {
        if(map.length<2)
            return;
        for(int i=1;i<map.length;i++) {
            int tmp=map[i];
            int j;
            for(j=i;j>0;j--) {
                if(tmp<map[j-1])
                    map[j]=map[j-1];
                else
                    break;
            }
            map[j]=tmp;
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] map= {2,6,3,8,1,4,9,3};
        insertSort(map);
        System.out.println(Arrays.toString(map));
    }
}
