package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App
{
    public static void main( String[] args ) throws LifecycleException {
        /* Set Port */
        System.out.println( "Hello World!" );
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8000);

        /* path = /hello */
        Context context = tomcat.addContext("",null);
        Tomcat.addServlet(context,"HelloServlet", new HelloServlet());
        context.addServletMappingDecoded("/hello","HelloServlet");

        /* Start Server */
        tomcat.start();
        tomcat.getServer().await();
    }
}
