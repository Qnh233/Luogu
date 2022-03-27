package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExercise {
    public static void main(String[] args) {
        ArrayList l=new ArrayList<>();

        l.add(new Dog("hei",33));
        l.add(new Dog("heii",334));
        l.add(new Dog("heiii",335));
        Iterator iterator = l.iterator();
    while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        for (Object o :l) {
            System.out.println(o);
        }


    }
}
class Dog
{
    private  String name;
    private  int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
