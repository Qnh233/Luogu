package 二;

import java.util.Scanner;

/**
 * @auther: 必燃
 * @version： 1.0
 * "6"翻了
 * 存在问题:
 *  使用split分割字符串，若一个小字段里面又有一小部分多个6 就无法处理 这个方法的逻辑是直接替换按照空格分割的字符段
 */
public class Six_D {
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
