package 二;

import java.util.Scanner;

/**
 * @auther: 必燃
 * @version： 1.0
 */
public class T3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sex,h,w;
        for (int i = 0; i < n; i++) {
            sex=sc.nextInt();
            h=sc.nextInt();
            w=sc.nextInt();
            //男生
            if(sex==1)
            {
                if(h<130)
                {
                    System.out.print("duo chi yu!");
                }
                else if(h>130)
                {
                    System.out.print("ni li hai!");
                }
                else
                {
                    System.out.print("wan mei!");
                }
                System.out.print(" ");
                if(w<27)
                {
                    System.out.print("duo chi rou!");
                }
                else if(w>27)
                {
                    System.out.print("shao chi rou!");
                }
                else
                {
                    System.out.print("wan mei!");
                }

            }
            else
            {
                if(h<129)
                {
                    System.out.print("duo chi yu!");
                }
                else if(h>129)
                {
                    System.out.print("ni li hai!");
                }
                else
                {
                    System.out.print("wan mei!");
                }
                System.out.print(" ");
                if(w<25)
                {
                    System.out.print("duo chi rou!");
                }
                else if(w>25)
                {
                    System.out.print("shao chi rou!");
                }
                else
                {
                    System.out.printf("wan mei!");
                }
            }
            System.out.println();
        }
    }
}
