package TestJavaWeb.attribute;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttributeListener implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println(event.getName());//name
        System.out.println(event.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println(event.getName());//name
        System.out.println(event.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println(event.getName());//name
        System.out.println(event.getValue());
    }
}
