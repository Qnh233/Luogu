package homeworks;

import java.util.Collection;
import java.util.HashMap;

/**
 * @auther: 必燃
 * @version： 1.0
 */
public class HW2 {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("jack",650);
        map.put("tom",1200);
        map.put("smith",2900);
        map.put("jack",2600);
        Collection<Object> keys = map.keySet();
        for (Object obj:keys
             ) {
            map.put(obj,(int)map.get(obj)+100);
        }
        for (Object obj:keys
             ) {
            System.out.println(obj +","+ map.get(obj));
        }

    }

}