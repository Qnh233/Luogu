package Map;

import java.util.*;

public class MapExercise {
    public static void main(String[] args) {

        HashMap hashMap = new HashMap<>();
        hashMap.put(2001,new employee("lige",22222,2001));
        hashMap.put(2002,new employee("wang",20000,2002));
        hashMap.put(2003,new employee("ang",18000,2003));

        //1.利用Keyset 
        // (1)迭代器
        Set ks=hashMap.keySet();
        Iterator iterator = ks.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            if (((employee) (hashMap.get(next))).getSalary()>18000) {
                System.out.println("key="+next+"value="+hashMap.get(next));
            }
        }
        //for循环
        for (Object obj:ks
             ) {
            employee employee = (employee) (hashMap.get(obj));
            if (employee.getSalary()>18000) {
                System.out.println("key="+obj+"value="+hashMap.get(obj));
            }


        }
        

    }

}
class employee
{
    private String name;
    private int salary;
    private int id;


    public employee(String name, int salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
