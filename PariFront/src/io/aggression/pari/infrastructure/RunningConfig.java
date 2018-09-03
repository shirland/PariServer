package io.aggression.pari.infrastructure;


import io.aggression.pari.server.servlet.UserServlet;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class RunningConfig {

    public static HandlerCollection getHandlers(){
        HandlerCollection handlers = new HandlerCollection();

        //default servlet handler
        ServletContextHandler rootServletHandler = new ServletContextHandler();
        rootServletHandler.setContextPath("/pari");

        //static resource default servlet
        ServletHolder holder = new ServletHolder(DefaultServlet.class);
        holder.setName("default");
        holder.setInitParameter("dirAllowed","false");
        rootServletHandler.addServlet(holder, "/");

        //user endpoint
        rootServletHandler.addServlet(UserServlet.class,"/user/*");

        handlers.addHandler(rootServletHandler);
        return handlers;
    }
}
