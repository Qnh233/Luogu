package 第四期.路径;

/**
 * @author 必燃
 * @version： 1.0
 * @create 2022-03-27 18:42
 */
public class Main {
    public static void main(String[] args) {
        int a=24;int b=6;
        System.out.println(lcw(98,3));

    }

    static int lcw(int a,int b)
    {
        int i=1;
        while(true)
        {
            if(i%b==0&&i%a==0)
            {
                return i;
            }
            i++;
        }
    }
}
