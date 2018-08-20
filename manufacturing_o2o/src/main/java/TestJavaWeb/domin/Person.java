package TestJavaWeb.domin;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Person implements HttpSessionBindingListener {


    public String name;
    public String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("bang  ding ~~~~~");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("jie bang ~~~~release");
    }
}
