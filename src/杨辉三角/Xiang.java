package 杨辉三角;

/**
 * @auther: 必燃
 * @version： 1.0
 */
import  java.util.Scanner;

public class Xiang {
    static int n;
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        n=in.nextInt();
        for(int k=16;k>=0;k--)
        {
            int l=2*k;
            int r=Math.max(l,n);
            int res=1;

            while(l<=r)
            {
                int mid=(l+r)/2;
                if(c(mid,k)>=n)
                {
                    res=mid;
                    r=mid-1;
                }
                else
                {
                    l=mid+1;
                }
            }
            if(c(res,k)==n)
            {
                System.out.println(res*(res+1)/2+k+1);
                break;
            }
        }

    }
    static long c(int a,int b)
    {
        long res=1;
        for(int i=a,j=1;j<=b;i--,j++)
        {
            res=res*i/j;
            if(res>n)
            {
                return res;
            }
        }
        return  res;
    }

}
