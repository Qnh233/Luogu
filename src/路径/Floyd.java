package 路径;

import java.util.Arrays;

/**
 * @author 必燃
 * @version： 1.0
 * @create 2022-03-28 16:50
 */
public class Floyd {

    /**
     * 两点最短距离(矩阵)
     */
    public static int[][] distance;
    /**
     * 记录最短路径
     */
    public static int[][] path;

    /**
     * 算法本身
     *
     * @param graph 传入矩阵
     */
    public static void floyd(int[][] graph) {
        //初始化距离矩阵
        distance = graph;
        //初始化路径
        path = new int[graph.length][graph.length];
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                path[i][j] = j;
            }
        }
        //开始算法,以i为中转点,三层循环
        for (int i = 0; i < graph.length; i++) {
            //j为入度
            for (int j = 0; j < graph.length; j++) {
                //k为出度
                for (int k = 0; k < graph[j].length; k++) {
                    if (graph[j][i] != -1 && graph[i][k] != -1) {
                        int newdis = graph[j][i] + graph[i][k];
                        if (newdis < graph[j][k] || graph[j][k] == -1) {
                            //刷新并记录更小的距离
                            graph[j][k] = newdis;
                            //再刷新记录最小的路径
                            path[j][k] = i;
                        }
                    }

                }
            }
        }
    }

    /**
     * 最小公倍数
     *
     * @param a
     * @param b
     * @return 两数的最小公倍数
     */
    static int lcw(int a, int b) {
        int i = 1;
        while (true) {
            if (i % b == 0 && i % a == 0) {
                return i;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[][] graph =new int[2021][2021];
        //Arrays.fill(graph[0],-1);
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if(Math.abs(i-j)<=21)
                {
                    graph[i][j]=lcw(i+1,j+1);
                }
                else
                {
                    graph[i][j]=-1;
                }
            }
        }
        floyd(graph);System.out.println(distance[0][2020]);
//
//        int[][] graph = new int[][]{
//                {0, 2, -1, 6}
//                , {2, 0, 3, 2}
//                , {-1, 3, 0, 2}
//                , {6, 2, 2, 0}};
//        floyd(graph);
//        System.out.println("====distance====");
//        for (int[] ints : distance) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("====path====");
//        for (int[] ints : path) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();

        }
    }

