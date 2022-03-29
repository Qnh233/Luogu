package 砝码称重;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author 必燃
 * @version： 3.0
 * @create 2022-03-29 15:41
 * 使用HashSet进行统计数量。Hash表查询效率高，而且自动规避重复。
 * 此处是Main中三中遍历的改进，不使用递归的一种方式，而且递归难理解。
 * 用额外的一个set进行一波操作下来的存储，再直接添加到主表中。
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //主表
        HashSet<Integer> hs=new HashSet<>();
        //辅表
        HashSet<Integer> extra=new HashSet<>();
        //整型变量
        int n,sum = 0,i=0;
        n=sc.nextInt();
        int[] w =new int[n];
        for (; i < n; i++) {
            w[i]=sc.nextInt();
        }

        //这里不能简单的用sum进行一个记录值，因为每一次两个操作后，我需要记录两个的值来进行操作，如果仅仅用sum下标来表示，是不能记录住两个值的。
        //并且此后的每次操作都要对着两个值分别进行操作，无法建立一个值去存储这两个值，如果一步一步记录并写出，将是乘方倍的工程量。
        //所以下图使用Iterator进行主表的遍历，每次记录的值都在主表，而我们又是从主表中一个一个进行操作。

        hs.add(w[0]);
        for (int j = 1; j < n; j++) {
            for (Iterator<Integer> iter = hs.iterator(); iter.hasNext();)
            {
                int tt=iter.next().intValue();
                int temp=tt+w[j];
                //限重
                if(temp!=0&&temp<100000)
                {
                    extra.add(temp);
                }
                temp=Math.abs(tt-w[j]);
                if(temp!=0&&temp<100000)
                {
                    extra.add(temp);
                }
            }
            hs.addAll(extra);
            extra.clear();
            if(!hs.contains(w[j]))
            {
                hs.add(w[j]);
            }
        }
        System.out.println(hs.size());
    }
}
