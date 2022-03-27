package 二;

import java.util.Scanner;

/**
 * @auther: 必燃
 * @version： 1.0
 * 模拟简单运算器的工作。假设计算器只能进行加减乘除运算，运算数和结果都是整数，四种运算符的优先级相同，按从左到右的顺序计算。
 *
 * 输入格式:
 * 输入在一行中给出一个四则运算算式，没有空格，且至少有一个操作数。遇等号”=”说明输入结束。
 *
 * 输出格式:
 * 在一行中输出算式的运算结果，或者如果除法分母为0或有非法运算符，则输出错误信息“ERROR”。
 *
 * 输入样例:
 * 1+2*10-10/2=
 */

public class T8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a = 0;
            char[]cs=s.toCharArray();
            boolean b=true;
            for (int j = 0; j < cs.length; j++) {
                if(cs[j]-'0'>=0&&cs[j]-'0'<=9)
                {
                    a=cs[j]-'0';
                }
                else if(cs[j]=='+')
                {
                    a=a+(cs[++j]-'0');
                }
                else if(cs[j]=='-')
                {
                    a=a-(cs[++j]-'0');
                }
                else if(cs[j]=='*')
                {
                    a=a*(cs[++j]-'0');
                }
                else if(cs[j]=='/')
                {
                    if((cs[j+1]-'0')==0)
                    {
                        b=false;
                        System.out.println("ERROR");
                        break;
                    }
                    a=a/(cs[++j]-'0');
                }
                else if(cs[j]=='=')
                {
                    System.out.println(a);
                }
                else
                {
                    System.out.println("ERROR");
                }

            }
        }
    }

