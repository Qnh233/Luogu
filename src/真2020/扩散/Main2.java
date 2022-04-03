package 真2020.扩散;

import static java.lang.Math.abs;

/**
 * @author 必燃
 * @version： 1.0
 * @create 2022-04-01 17:59
 * 此版本使用简单的 距离遍历判断
 */
public class Main2 {
    public static void main(String[] args) {
        int ans=0;
        //因为上下左右都要扩展，所以用此种方法需要把坐标设置上下左右都扩展2020个位置。
        for (int i = -2020; i <=2020+2020; i++) {
            for (int j = -2020; j <=2100+2020; j++) {
                if(judge(i,j))
                {
                    ans++;
                }
            }
        }
        System.out.println(ans);

    }
    static boolean judge(int x,int y)
    {
        if (abs(x - 0) + abs(y - 0) <= 2020 || abs(x - 2020) + abs(y - 11) <= 2020
                ||abs(x - 11) + abs(y - 14) <= 2020 || abs(x - 2000) + abs(y - 2000) <= 2020)//共四个判断点
        {
            return true;
        }
        return false;
    }
}
