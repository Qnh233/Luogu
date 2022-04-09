package 真2020.阶乘约数;

import java.math.BigInteger;
import java.util.HashSet;

/**
 * @author 必燃
 * @version： 1.0
 * @create 2022-04-03 11:05
 * 大数超时法 - -
 *
 */
public class Main {
    public static void main(String[] args) {
        HashSet<BigInteger> hs=new HashSet();

        BigInteger a= BigInteger.valueOf(1);
        for (int i = 1; i <= 100; i++) {
            a=a.multiply(BigInteger.valueOf(i));
        }
        long s=123456789123456789L;
        System.out.println(s);
        for (BigInteger i = BigInteger.valueOf(1); a.compareTo(i)>=0; i.add(BigInteger.valueOf(1))) {
            for (BigInteger j = BigInteger.valueOf(1); j.compareTo(i)<=0; j.add(BigInteger.valueOf(1))) {
                if(i.remainder(j).compareTo(BigInteger.valueOf(0))==0)
                {
                    hs.add(j);
                    //hs.add(i/j);
                }
            }
        }System.out.println(hs);
        System.out.println(hs.size());
    }
}
