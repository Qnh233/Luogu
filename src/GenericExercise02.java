import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

/**
 * @auther: 必燃
 * @version： 1.0
 */
public class GenericExercise02 {

    public static void main(String[] args) {
        ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee("lige",2000,new MyDate(10,15,2020)));
        list.add(new Employee(" lige",2900,new MyDate(5,5,2015)));
        list.add(new Employee("lige",2800,new MyDate(4,9,2005)));
        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2)
            {
                if (o1.getName().equals(o2.getName()))
                {
                    if (o1.getBirthday().equals(o2.getBirthday()))
                    {
                        return 0;
                    } else
                    {
                        if (o1.getBirthday().getYear() < o2.getBirthday().getYear())
                        {
                            return 1;
                        }
                        else
                        {
                            if (o1.getBirthday().getYear() == o2.getBirthday().getYear())
                            {
                                if (o1.getBirthday().getMonth() < o2.getBirthday().getMonth())
                                {
                                    return 1;
                                }
                                if (o1.getBirthday().getMonth() == o2.getBirthday().getMonth())
                                {
                                    if (o1.getBirthday().getDay() < o2.getBirthday().getDay())
                                    {
                                        return 1;
                                    } else {
                                        return -1;
                                    }
                                } else
                                {
                                    return -1;
                                }
                            } else {
                                return -1;
                            }
                        }
                    }


                }
                else {
                    return (o1.getName()).compareTo(o2.getName());
                }


            }
        });
        System.out.println(list);
    }
}

class Employee
{
    private String name;
    private int sal;
    private MyDate birthday;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, int sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }
}
class MyDate
{
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MyDate myDate = (MyDate) o;
        return month == myDate.month && day == myDate.day && year == myDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, day, year);
    }
}
