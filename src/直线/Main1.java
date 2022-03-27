package 直线;

import java.util.HashMap;
import java.util.Objects;

/**
 * @auther: 必燃
 * @version： 1.0
 * 此版本根据C++ ACCODE版本改编 存在误差。
 */
public class Main1 {
    public static void main(String[] args) {
        Point[] p;
        int cnt = 0;

        p = new Point[20 * 21];
        //填入坐标
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 21; j++) {
                p[cnt++]=new Point(i,j);
            }
        }
        HashMap<Line,Integer> map=new HashMap();
        int ans = 20+21;
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                //两点的直线与坐标轴平行或共点
                if (p[i].x == p[j].x || p[i].y == p[j].y) {
                    continue;
                }
                //斜率和截距
                double k = (p[j].y - p[i].y) / (p[j].x - p[i].x);
                double b = (p[j].x * p[i].y - p[j].y * p[i].x) / (p[j].x - p[i].x);
                //double b=k*p[i].x-p[i].y;
                Line L=new Line(k,b);

                if(map.putIfAbsent(L,1)==null)
                {
                    ans++;
                }
                else if(map.get(L)==0)
                {
                    map.put(L,1);
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

/**
 * 点类 包含x,y
 */
class Point
{
    double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

/**
 * 直线类
 */
class Line
{
    //斜率与截距
    double k,b;


    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Line{" +
                "k=" + k +
                ", b=" + b +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Line line = (Line) o;
        return Double.compare(line.k, k) == 0 && Double.compare(line.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(k, b);
    }
}

