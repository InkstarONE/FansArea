package TestJavaWeb.domin;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

public class Custom implements HttpSessionActivationListener,Serializable{


    public int id;
    public String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //dun hua
    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("custom   bei  will passivate 钝化" );
    }
    //huo hua
    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println("custom  Activate~~~~ 活化");
    }
}
