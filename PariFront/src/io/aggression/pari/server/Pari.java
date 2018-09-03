package io.aggression.pari.server;

import io.aggression.pari.infrastructure.RunningConfig;
import io.aggression.pari.infrastructure.ServerBuilder;
import org.eclipse.jetty.server.Server;

public class Pari {

    public static void main(String[] args){

        Server server = new ServerBuilder()
                .handlers(RunningConfig.getHandlers())
                .port(8080)
                .root("/")
                .build();

        try {
            server.start();
            server.join();
        } catch (Exception e){
            e.printStackTrace();;
            System.exit(1);
        }

    }
}
