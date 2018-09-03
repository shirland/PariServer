package io.aggression.pari.infrastructure;

import io.aggression.pari.interfaces.Builder;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerCollection;

public class ServerBuilder implements Builder {

    private String rootPath;
    private HandlerCollection handlers;
    private int serverPort = 8080;

    public ServerBuilder handlers(HandlerCollection handlers){
        this.handlers = handlers;
        return this;
    }

    public ServerBuilder port(int port){
        serverPort = port;
        return this;
    }

    public ServerBuilder root(String path){
        rootPath = path;
        return this;
    }

    @Override
    public Server build(){
        Server server = new Server(serverPort);
        server.setHandler(handlers);

        return server;
    }
}
