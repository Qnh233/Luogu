package 真2020.本质上升序列;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 必燃
 * @version： 1.0
 * @create 2022-04-08 19:49
 * 这个用dp来计算，就是挨个查询并判断统计，下一个的方案数量与上一个方案相关
 */
public class Main2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int[] dp = new int[str.length()];
        Arrays.fill(dp,1);
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if(str.charAt(i)>str.charAt(j))
                {
                    //i位置字符比j位置大就代表可以紧随其后，就可以在其方案数量上加上j位置的方案数量
                    dp[i]+=dp[j];
                }
                else if(str.charAt(i)==str.charAt(j))
                {
                    //i位置字符与j位置字符相同，则j位置之前方案会在dp[i]中有重复。
                    dp[i]-=dp[j];
                }
            }
        }
        int cns=0;
        for (int i = 0; i < dp.length; i++) {
            cns+=dp[i];
        }
        System.out.println(cns);
    }
}
