package homeworks;

import java.util.*;

/**
 * @auther: 必燃
 * @version： 1.0
 */
public class HomeWork1 {
    public static void main(String[] args) {
        DAO<Object> dao = new DAO<>();
        dao.save("01",new User(2,1,"lige"));
        System.out.println(dao);
        List ts=  dao.list();
        System.out.println(ts);
        System.out.println(dao.get("01"));
        dao.delete("01");
        System.out.println(dao);


    }
}

class DAO<T> {
    Map map = new HashMap<String, T>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }
    public T get(String id)
    {
        return (T) map.get(id);
    }
    public void update(String id,T entity)
    {
        map.put(id,entity);

    }
    public List<T> list()
    {
        List<T> list = new ArrayList<>();
        Collection values = map.values();
        list.addAll(values);
        return list;
    }
    public void delete(String id)
    {
        map.remove(id);
    }

    @Override
    public String toString() {
        return "DAO{" +
                "map=" + map +
                '}';
    }
}
class User
{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
