package de.ovgu.softwareprojekt.server_discovery;

import java.util.List;


/**
 * Created by arne on 11/9/16.
 */

public class Discovery {
    public class Server {
        public String name;
        public String address;
        public String port;
    }

    public interface OnDiscoveryListener {
        void onServerListUpdated(List<Server> serverNames);
    }

    public Discovery(int port){

    }

    public void startDiscovery(OnDiscoveryListener listener){

    }

    public void stopDiscovery() {

    }
}
