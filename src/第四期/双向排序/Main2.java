package 第四期.双向排序;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @auther: 必燃
 * @version： 2.0  效率更低 600-700ms
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Object[] array=new Object[n];
        for (int i = 0; i < n; i++) {
            array[i]=i+1;
        }

        for (int i = 0; i < m; i++) {
            int q=sc.nextInt();
            int w=sc.nextInt();
            if(q==0)
            {
                Arrays.sort(array, 0, w, new Comparator<Object>() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        return  (int)o2 - (int)o1;
                    }
                });
            }
            else if(q==1) {
                Arrays.sort(array, w-1, array.length, new Comparator<Object>() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        return (int)o1 - (int)o2;
                    }
                });
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }
}
