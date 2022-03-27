package 杨辉三角;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @auther: 必燃
 * @version： 1.0
 */
public class Test1 {

    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for(int k=16;k>=0;k--)
            //从第16列开始,遍历查找n。
        {
//            int l=2*k,r=Math.max(n, l);
//            //l为左边界，r为右边界。r尽量大 满足此行的此列数值大于10^9
//            int res=-1;
//            //记录行号
//            while (l<=r)
//            {
//                int mid = (l+r)/2;
//                //mid为中间值 二分查找
//                if(C(mid,k)>=n)
//                {
//                    res=mid;r=mid-1;
//                }
//                else
//                {
//                    l=mid+1;
//                }
//
//            }
//            if(C(res,k)==n)
//        {
//            System.out.println((res+1)*res/2+k+1);break;
//        }
            System.out.println(C(4,2));

        }
    }
     static int C(int d,int s)
    {

        int result=1;
        for(int i=d, j=1;j<=s;i--,j++)
        {
            result=result*i/j;
            //i/j 不能用小括号括出来，i/j有可能是一个无理数，再乘就会出现问题。
            if(result>n) {
                return result;
            }
        }
        return result;

    }
}
