package homeworks;

import java.util.Scanner;

/**
 * @author 必燃
 * @version 1.0
 */
public class Homework02 {
    /**
     * 输入用户名 密码 邮箱 录入正确 注册成功
     * 1 用户名 2 3 4
     * 2 密码长度 6 全数字
     * 3 邮箱包含@和. 并且@在.之前
     */
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String password=sc.nextLine();
        String address=sc.nextLine();
        try {
            Scan(name,password,address);
            System.out.println("注册成功！");
        } catch (Exception e) {
            System.out.println("注册失败！");
            System.out.println(e.getMessage());
        }



    }
    public static void Scan(String name, String password, String address) {
        if(name.length()<=4&&name.length()>=2)
        {
            if(password.length()==6)
            {
                {
                    try {
                        Integer.parseInt(password);

                    }
                    catch (Exception e) {
                        throw new RuntimeException("密码应全为数字！");
                    }
                    if (!((address.contains("@")&&address.contains("."))&&address.indexOf('@')<address.indexOf('.')))
                    {
                        throw new RuntimeException("邮箱格式错误！");
                    }
                }

            }
            else {
                throw new RuntimeException("密码长度应为6");
            }
        }
        else
        {
            throw new RuntimeException("用户名长度为2，3或4");
        }
    }
}

