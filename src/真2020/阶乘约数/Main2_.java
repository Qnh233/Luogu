package 真2020.阶乘约数;

/**
 * @author 必燃
 * @version： 1.0
 * @create 2022-04-03 16:21
 */
public class Main2_ {
    public static void main(String[] args) {
        int[] flag=new int[105];
            for ( int i = 2; i <= 100; i++)
            {
                int tmp = i;
                for (int j = 2; j*j <= tmp; j++)
                {
                    while (tmp % j == 0)
                    {
                        flag[j]++;
                        tmp /= j;
                    }
                }
                if(tmp>1) {
                    flag[tmp]++;
                }
            }
            long ans = 1;
            for (int i = 1; i <= 100; i++)
            {
                ans = ans*(flag[i] + 1);
            }
        System.out.println(ans);

    }



}
