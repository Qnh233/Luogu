package 真2020.本质上升序列;

import java.util.*;

import static java.util.List.*;

/**
 * @author 必燃
 * @version： 1.0
 * @create 2022-04-07 18:34
 * 使用HashSet版本，长度短的可行，长度长的无法处理。
 */
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> hs=new LinkedHashSet();
        LinkedHashSet hs2=new LinkedHashSet();
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] cs=s.toCharArray();
        System.out.println(s);

//        for (int i = 0; i < cs.length; i++) {
//            hs.add(String.valueOf(cs[i]));
//        }
//        List<Character> ls = List.of(cs);
//         hs.addAll(ls);
//        for (char ss :
//                ls) {
//            System.out.println(ss);
//        }

        hs.add(String.valueOf(cs[0]));
        System.out.println(hs);
        for (int i = 1; i < cs.length; i++) {
            hs.add(String.valueOf(cs[i]));
        }
        for (int j = 0; j < cs.length; j++)
        {
            for (Iterator it = hs.iterator(); it.hasNext();)
            {
                int i=0;
                String newstr;
                String str= (String) it.next();
                for (int k = 0; k < cs.length; k++) {
                    if((str).charAt(str.length()-1)==cs[k])
                    {
                        i=k;break;
                    }
                }
                for (; i < cs.length; i++) {
                    if((str).charAt(str.length()-1)<cs[i])
                    {
                        newstr = str+cs[i];
                        hs2.add(newstr);

                    }
                }
            }
            hs.addAll(hs2);
            if(hs2.isEmpty())
            {
                break;
            }
            hs2.clear();
        }
        for (int i = 1; i < cs.length; i++) {
            hs.add(String.valueOf(cs[i]));
        }
//        for (Object ob :
//                hs) {
//            System.out.println(ob.toString());
//        }
        System.out.println(hs.size());

    }
}
