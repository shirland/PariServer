package io.aggression.pari.action;

import io.aggression.pari.interfaces.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserAction extends AbstractAction {

    @Override
    public void execute(){
        System.out.println("Hello World");
    }

    public UserAction (HttpServletRequest request, HttpServletResponse response) {
        super(request,response);
    }
}
