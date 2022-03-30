package 第四期.砝码称重;

import java.util.Scanner;

/**
 * @author 必燃
 * @version： 2.0
 * @create 2022-03-28 19:41
 */
public class Main2 {
    /**
     * 最大砝码总重量为10^5
     * flag为标记表，若值为1表示此处已经出现。
     * a存储各个砝码重量
     * n砝码数量
     */
    static int maxn= (int) 1e5+10;
    static int []flag=new int[maxn];
    static int [] a=new int[maxn];
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum=0;
        dfs(0,0);
        for (int a :
                flag) {
            if (a == 1)
            {
                sum++;
            }
        }
        System.out.println(sum-1);

    }
    /**
     * 递归标记
     */
    static void dfs(int sum,int i)
    {
        if(i==n)
        {
            if(sum>=0)
            {
                flag[sum]=1;
            }
            return;
        }
        //加，减，不变 三个状态
        dfs(sum+a[i],i+1);
        dfs(sum-a[i],i+1);
        dfs(sum,i+1);

    }

}
