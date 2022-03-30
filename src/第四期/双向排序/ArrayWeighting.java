package 第四期.双向排序;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @auther: 必燃
 * @version： 3.0 加权数组，带有标记，时间复杂度m*n
 */
public class ArrayWeighting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] fin =new int[n+1];
        //标记序列
        int[] number=new int[n+1];
        Arrays.fill(fin,0);
        for (int i = 1; i <= n; i++) {
            number[i]=i;
        }
        for (int i = 0; i < m; i++) {
            int order=sc.nextInt();
            int gr=sc.nextInt();
            if(order==0)
                //降序
            {
                int o=1;
                for(int j=1;j<=gr;j++)
                {
//                    fin[j]=1;
                 fin[number[j]]=1;
                }
                for(int k=n;k>0;k--)
                {
                    if(fin[k]==1)
                    {
                        number[o++]=k;
                    }
                }
            }
            //降序 标记gr-n 从1开始遍历
            else
            {
                int o=gr;
                for (int j = gr; j <=n; j++) {
//                    fin[j]=1;
                    fin[number[j]]=1;
                }
                for(int k=1;k<=n;k++)
                {
                    if(fin[k]==1)
                    {
                        number[o++]=k;
                    }
                }

            }
            Arrays.fill(fin,0);
            for (int l = 1; l <= n; l++) {
                System.out.print(number[l] + " ");
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(number[i] + " ");
        }


    }


}
