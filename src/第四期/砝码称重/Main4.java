package 第四期.砝码称重;

import java.util.Scanner;

/**
 * @author 必燃
 * @version： 1.0
 * @create 2022-03-31 20:02
 * 使用DP
 */
public class Main4 {
    public static void main(String[] args) {
        boolean[][] dp=new boolean[2][100000+1];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while (n!=0)
        {
            n--;
            int x=sc.nextInt();
            //记录最大称重量，作为每次遍历的峰值。
            sum+=x;
            //以dp【1】作为中间变量记录每个从dp【0】中找到的可以放上天平的重量的加减操作结果
            for (int i = 1; i <= sum; i++) {
                if(dp[0][i])
                {
                    int a=Math.abs(x-i);
                    dp[1][x+i]=true;
                    dp[1][a]=true;
                }
            }
            //处理后的结果添加至dp[0]中
            for (int i = 1; i <= sum; i++) {
                if(dp[1][i])
                {
                    dp[0][i]=true;
                }
            }
            //每个砝码本身可以代表一个重量
            dp[0][x]=true;
        }
        //统计个数 true的个数  用boolean数组已经可以确保统计个数时候不会重复统计。boolean数组初始值false，
        //记录重量后此下标处值为true，再次遇到也是赋值为true，不会对最终统计个数有影响。
        int count=0;
        for (int i = 0; i <= sum; i++) {
            if(dp[0][i])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
