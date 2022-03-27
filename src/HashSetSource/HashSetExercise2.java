package HashSetSource;

import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

public class HashSetExercise2 {
    public static void main(String[] args) {
        HashSet hs=new HashSet<>();
        hs.add(new Employee("li","男","2001","12","11"));
        hs.add(new Employee("li","nv","2002","12","11"));
        hs.add(new Employee("li","男","2001","12","11"));
        hs.add(new Employee("wang","男","2001","12","11"));
        System.out.println(hs);

    }
}

class Employee
{
    private  String name;
    private  String sal;
    Mydate birthday ;

    public Employee(String name, String sal, String year,String month,String day)
    {
        this.name = name;
        this.sal = sal;
        this.birthday = new Mydate(year,month,day);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && birthday.equals(employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal='" + sal + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}

class Mydate
{
    private String year;
    private String month;
    private String day;

    public Mydate(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Mydate mydate = (Mydate) o;
        return Objects.equals(year, mydate.year) && Objects.equals(month, mydate.month) && Objects.equals(day, mydate.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "Mydate{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}
