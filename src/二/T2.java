package 二;

import java.util.Scanner;

/**
 * @auther: 必燃
 * @version： 1.0
 * 强迫症 (10 分)
 * 小强在统计一个小区里居民的出生年月，但是发现大家填写的生日格式不统一，例如有的人写 199808，有的人只写 9808。有强迫症的小强请你写个程序，把所有人的出生年月都整理成 年年年年-月月 格式。对于那些只写了年份后两位的信息，我们默认小于 22 都是 20 开头的，其他都是 19 开头的。
 *
 * 输入格式：
 * 输入在一行中给出一个出生年月，为一个 6 位或者 4 位数，题目保证是 1000 年 1 月到 2021 年 12 月之间的合法年月。
 *
 * 输出格式：
 * 在一行中按标准格式 年年年年-月月 将输入的信息整理输出。
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=s;int wei=0;
        while(t!=0)
        {
            t/=10;
            wei++;
        }
        if (wei==3)
        {
            wei++;
        }
        if(wei==6)
        {
            System.out.println(String.format("%04d-%02d",s/100,s%100));
        }
        else if(wei==4)
        {
            if(s/100<22)
            {
                System.out.println(String.format("20%02d-%02d",s/100,s%100));
            }
            else
            {
                System.out.println(String.format("19%02d-%02d",s/100,s%100));
            }

        }
    }
}
