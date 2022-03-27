package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

/**
 * @auther: 必燃
 * @version： 1.0
 */
public class Mapkuo {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
//        hashMap.put(20,new tea("普洱"));
//        hashMap.put(21,new tea("绿茶"));
//        hashMap.put(22,new tea("李哥"));
//        hashMap.put(23,new tea("普洱"));
//        hashMap.put(20,new tea("王道"));
        for (int i = 0; i < 65; i++) {
            hashMap.put(new tea(i),i);
        }

    }
}

class tea
{
    private int name;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        tea tea = (tea) o;
        return Objects.equals(name, tea.name);
    }

    @Override
    public int hashCode() {
        return 10;
    }

    public tea(int name) {
        this.name = name;
    }
}
