package homeworks;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...

        int []arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=2020;
        }
        int i=1;
        boolean f = false;
        for (;; i++) {
            int a=i;
            while(a>0)
            {
                if(arr[a%10]==0) {
                    f=true;break;
                }
                else
                {
                    arr[a%10]--;
                }
                a/=10;
            }
            if(f)
            {
                System.out.println(i);break;
            }
        }

        scan.close();
    }

}
