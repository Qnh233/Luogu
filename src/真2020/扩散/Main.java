package 真2020.扩散;

/**
 * @author 必燃
 * @version： 1.0
 * @create 2022-04-01 15:35
 * 问题描述
 * 小蓝在一张无限大的特殊画布上作画。
 * 这张画布可以看成一个方格图，每个格子可以用一个二维的整数坐标表示。
 * 小蓝在画布上首先点了一下几个点：(0 , 0), (2020 , 11), (11 , 14), (2000 , 2000)。
 * 只有这几个格子上有黑色，其它位置都是白色的。
 * 每过一分钟，黑色就会扩散一点。具体的，如果一个格子里面是黑色，它
 * 就会扩散到上、下、左、右四个相邻的格子中，使得这四个格子也变成黑色
 * （如果原来就是黑色，则还是黑色）。
 * 请问，经过 2020 分钟后，画布上有多少个格子是黑色的。
 */
public class Main {
    static int n=1;
    static int maxn=10000;
    static boolean[][] flag=new boolean[maxn][maxn];
    public static void main(String[] args) {

        int count=0;
        f(2100,2100);
//        f(2021,12);
//        f(12,15);
//        f(2001,2001);
        for (int i = 0; i < maxn; i++) {
            for (int j = 0; j < maxn; j++) {
                if(flag[i][j])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    //dfs算法
    static void f(int x,int y)
    {
        if(x>=2100+2020||y>=2100+2020)
        {
            return;
        }
        if(x==0||y==0) {
            return;
        }
        flag[x][y]=true;
        f(x+1,y);
        f(x-1,y);
        f(x,y+1);
        f(x,y-1);
    }
}
