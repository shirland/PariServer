package io.aggression.pari.server.servlet;

import io.aggression.pari.action.UserAction;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("HELLO WORLD");
        response.flushBuffer();

        UserAction action = new UserAction(request,response);
        action.execute();

    }
}
