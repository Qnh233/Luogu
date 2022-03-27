package 双向排序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @auther: 必燃
 * @version： 1.0  超时通过版本 500-600ms 不使用匿名内部类更久
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList list=new ArrayList<Integer>();
        for (int i=1;i<=n;i++) {
            list.add(i);
        }
        Object[] array=new Object[n+1];
        array=list.toArray();
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
                Arrays.sort(array, w - 1, array.length, new Comparator<Object>() {

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
