package io.aggression.pari.action;

import io.aggression.pari.interfaces.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class AbstractAction implements Action {

    String entity;
    String action;
    HttpServletRequest request;
    HttpServletResponse response;

    AbstractAction(HttpServletRequest request,HttpServletResponse response){
        this.request = request;
        this.response = response;
        parse();
    }

    private void parse(){
        String requestURI = request.getRequestURI();
        action = requestURI.substring(requestURI.lastIndexOf("/")).substring(1);
        String tmp = requestURI.substring(0,requestURI.indexOf(action) - 1);
        entity = tmp.substring(tmp.lastIndexOf("/") + 1 );
    }

    @Override
    public void execute() {

    }
}
