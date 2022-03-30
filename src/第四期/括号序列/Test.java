package 第四期.括号序列;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Xhao
 *  必燃
 * @version： 1.0
 * 仿写
 * 答案还是错误。。。
 * 错误已经修复，原因倒置字符串后数组没有清零，情况数量偏大。
 */
public class Test {
    /**
     * 定义静态变量
     */
    static int MOD=1000000007;
    static int n=5010;
    static long[][] dp= new long[n][n];
    static char[] str=new char[n];
    static int len;

    static long func()
    {


        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i],0);
        }
        dp[0][0]=1L;
        //逐个判断
        for (int i = 1; i <=len; i++) {
            if(str[i]=='(')
            {
                for (int j = 1; j <=len; j++) {
                    //
                    dp[i][j]=dp[i-1][j-1];
                }
            }
            else
            {
                dp[i][0]=(dp[i-1][0]+dp[i-1][1])%MOD;
                for(int j=1;j<=len;j++)
                {
                    dp[i][j]=(dp[i-1][j+1]+dp[i][j-1])%MOD;
                }
            }
        }
        for (int i = 0; i <=len; i++) {
            if(dp[len][i]>0)
            {
                return dp[len][i];
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        //输入
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.next();
        len=s.length();
        str=(' '+s).toCharArray();
        long l=func();
        StringBuffer sb= new StringBuffer(s);
        sb.reverse();
        str=(' '+sb.toString()).toCharArray();
        for(int i=1;i<=len;i++)
        {
            if(str[i]=='(') {
                str[i]=')';
            } else {
                str[i]='(';
            }
        }
        long r=func();
        System.out.println(l%MOD);

    }
}
