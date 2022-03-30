package 第四期.货物摆放;

import java.util.Scanner;

/**
 * @auther: 必燃
 * @version： 2.0
 */
public class Main2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        //寻找因子
        int len=0;
        long[]a=new long[(int)1e4];
        for(long i=1;i*i<=n;i++)
        {
            if((n % i) == 0)
            {
                a[len++]=i;
                if(i != (n / i))
                {
                    a[len++]=n/i;
                }
            }
        }
        long cnt =0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(a[i]*a[j]>n)
                {
                   continue;
                }
                for(int k=0;k<len;k++)
                {
                    if(a[i]*a[j]*a[k]==n)
                    {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);

        }

    }
}
