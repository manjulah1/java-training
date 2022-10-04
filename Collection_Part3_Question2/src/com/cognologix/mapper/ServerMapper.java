package com.cognologix.mapper;

import com.cognologix.entity.Server;

public class ServerMapper {
    public static Server getServerDataMapped(String serverData) {
        String[] serverArray = serverData.split(", ");

        String server = serverArray[0];
        String platform = serverArray[1];
        String software = serverArray[2];
        String version = serverArray[3];

        Server server1 = new Server(server, platform, software, version);
        return server1;
    }
}
