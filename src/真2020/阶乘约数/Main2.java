package 真2020.阶乘约数;

/**
 * @author 必燃
 * @version： 1.0
 * @create 2022-04-03 14:46
 */
public class Main2 {
    public static void main(String[] args) {

        int p[]=new int[101];
        for (int i = 2; i <= 100; i++) {
            int x=i;
            for (int j = 2; j<=x/j; j++) {
                    while(x%j==0)
                    {
                        p[j]++;
                        x/=j;
                    }
            }if(x>1)
            {
                p[x]++;
            }
        }
        long ans=1;
        for (int i = 2; i <=100; i++) {
            if(p[i]>0)
            {
                ans*=(p[i]+1);
            }
        }
        System.out.println(ans);
    }
}
