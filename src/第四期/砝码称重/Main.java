package 第四期.砝码称重;

import java.util.Scanner;

/**
 * @author 必燃
 * @version： 1.0
 * @create 2022-03-28 19:11
 * 描述:
 * 你有一架天平和 N 个砝码，这 N 个砝码重量依次是 W_1, W_2, · · · , W_NW
 * 请你计算一共可以称出多少种不同的重量？ 注意砝码可以放在天平两边。
 */
public class Main {
    /**
     * 最大砝码总重量为10^5
     * flag为标记表，若值为1表示此处已经出现。
     * a存储各个砝码重量
     */
    static int maxn= (int) 1e5+10;
    static int []flag=new int[maxn];
    static int [] a=new int[maxn];
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int sum=0;
        //遍历加
        for (int i = 0; i < n; i++) {
            sum+=a[i];
            flag[sum]=1;
            if(i==n)
            {
                break;
            }
        }
        //此处原来的想法是每到一个阶段就要进行三个操作，而三个操作之中
        //还要进行三个操作，这就是套娃的操作，如果用简单的循环嵌套是无法实现的，
        //除非我循环套循环再套循环。。。。
        //所以改用递归-》Main2
        for (int i = 0; i < n; i++) {
            sum+=a[i];
            flag[sum]=1;
            sum+=a[i];
            flag[sum]=1;
            sum+=a[i];
            flag[sum]=1;
            if(i==n)
            {
                break;
            }
        }for (int i = 0; i < n; i++) {
            sum+=a[i];
            flag[sum]=1;
            if(i==n)
            {
                break;
            }
        }
    }

}
