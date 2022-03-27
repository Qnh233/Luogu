package 二;

import java.util.Scanner;

/**
 * @auther: 必燃
 * @version： 2.0
 * "6"翻了
 * 直接使用单个字符分析 逐个打印。
 */
public class Six_D2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String []ss=s.split(" ");
        for(int i=0;i<ss.length;i++)
        {
            char[] cs=ss[i].toCharArray();int n=0;
            for (int j = 0; j < cs.length; j++)
            {
                if(cs[j]=='6')
                {
                    for (int k = j; k < cs.length; k++)
                    {
                        if(cs[k]=='6')
                        {
                            n++;
                        }
                        else
                        {
                            break;
                        }
                    }
                }
                if(n>3&&n<=9)
                {
                    ss[i]="9";
                }
                else if(n>9)
                {
                    ss[i]="27";
                }
                j=j+n;
                n=0;
            }


        }
        for (int i = 0; i < ss.length; i++) {
            if(i==0)
            {
                System.out.printf(ss[i]);
            }
            else
            {
                System.out.printf(" "+ss[i]);
            }
        }

    }
}
