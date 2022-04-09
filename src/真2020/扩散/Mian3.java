package 真2020.扩散;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/**
 * @author 必燃
 * @version： 1.0
 * @create 2022-04-01 17:59
 * 此方法使用BFS算法 队列实现
 */
public class Mian3 {

    static int n=10000;
    static boolean[][] maz=new boolean[n][n];
    //很巧妙的在循环中进行不同的加减
    static int[] r=new int[]{0,1,-1,0};static int[]l=new int[]{1,0,0,-1};
    public static void main(String[] args) {
        Queue<Object> queue = new LinkedList<>();
        //三个坐标同时加2100，防止数组越界。每个坐标上下左右扩展2020也不会越界。
        point p =new point(2100, 2100, 0);
        queue.offer(p);
        queue.offer(new point(2100+2020,2100+11,0));
        queue.offer(new point(2100+11,2100+14,0));
        queue.offer(new point(2000+2100,2100+2000,0));
        for(Object q : queue){
            System.out.println(q);
        }
        int ans=0;
        while(true)
        {
            if(!queue.isEmpty())
            {
                point pi= (point) queue.poll();
                point p2 = null;
                for (int i = 0; i < 4; i++) {
                    p2=new point(pi.x+r[i],pi.y+l[i],pi.t+1);
                    if(!maz[p2.x][p2.y]&&p2.t<=2020)
                    {
                        maz[p2.x][p2.y]=true;
                        ans++;
                        queue.offer(p2);
                    }
//                    for(Object q : queue){
//                        System.out.println(q);
//                    }

                }

            }
            else
            {
                break;
            }
        }
        System.out.println(ans);


    }
}
class point
{
    int x;
    int y;
    int t;

    public point(int x, int y, int t) {
        this.x = x;
        this.y = y;
        this.t = t;
    }

    @Override
    public String toString() {
        return "point{" +
                "x=" + x +
                ", y=" + y +
                ", t=" + t +
                '}';
    }
}