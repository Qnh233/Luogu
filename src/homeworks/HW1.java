package homeworks;

import java.util.ArrayList;

/**
 * @auther: 必燃
 * @version： 1.0
 */
public class HW1 {
    public static void main(String[] args) {
        News news1 = new News("新闻一：新冠确诊病例超千万，数百万印度教信徒”圣浴“");
        News news2 = new News("新闻二：男子突然想起两个月前钓的鱼还在网兜里，捞起赶快放生");
        ArrayList<Object> list = new ArrayList<>();
        list.add(news1);
        list.add(news2);
        for (int i = list.size()-1; i >= 0; i--) {
            if ((list.get(i).toString()).length()>=15) {
                System.out.println(list.get(i).toString().substring(0,15)+"...");
            }
        }

    }
}
class   News
{
    private String title;
    private String body;

    @Override
    public String toString() {
        return
                "title='" + title + '\'' ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public News(String title) {
        this.title = title;
    }
}
