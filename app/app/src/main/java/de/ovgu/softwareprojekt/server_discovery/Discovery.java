package de.ovgu.softwareprojekt.server_discovery;

import java.net.InetAddress;
import java.util.List;


/**
 * Created by arne on 11/9/16.
 */

public class Discovery {
    class Server {
        String name;
        InetAddress address;
    }

    interface OnDiscoveryListener {
        void onServerListUpdated(List<Server> serverNames);
    }

    public Discovery(int port){

    }

    public void startDiscovery(OnDiscoveryListener listener){

    }

    public void stopDiscovery() {

    }
}
