package util;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class MyIp {
    public String getLocalIp() throws UnknownHostException {
        InetAddress local = InetAddress.getLocalHost();
        return local.getHostAddress();
    }
}
