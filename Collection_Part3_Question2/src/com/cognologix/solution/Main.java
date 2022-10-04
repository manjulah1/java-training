package com.cognologix.solution;

import com.cognologix.entity.Server;
import com.cognologix.operations.ServerOperations;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] serversInformation = {
                "Server1, Database, MySQL, 5.5",
                "Server2, Database, MySQL, 5.1",
                "Server3, OS, Ubuntu, 12.04",
                "Server1, OS, Ubuntu, 12.04",
                "Server2, OS, Ubuntu, 18.04",
                "Server3, Language, Python, 2.6.3",
                "Server4, Language, Python, 3.9.14",
                "Server4, Language, Python, 3.10.4"
        };

        // 1. create a list of server from serverInformation
        ServerOperations serverOperations = new ServerOperations(serversInformation);
        serverOperations.createServerList();

        // 2. sort the list on server name
        List<Server> sortedListByServerName = serverOperations.sortListByServerName();
//        System.out.println(" " + sortedListByServerName);

        // 3. sort the list on server name and version number
        List<Server> sortedListByServerNameAndVersion = serverOperations.sortListByServerNameAndVersionNumber();
//        System.out.println(sortedListByServerNameAndVersion);

        // 4. get distant server names
        Set<String> distantServerNames = serverOperations.getDistantServerNames();
//        System.out.println(distantServerNames);

        // 5. filter records for a given server name
        List<Server> filteredServers = serverOperations.filterRecordsByServerName("Server1");
//        System.out.println(filteredServers);

        // 6. create a map with key: Software & value: sorted set of software versions
        Map<String, List<String>> sortedSoftwareMap = serverOperations.createSortedSoftwareMap();
//        System.out.println(sortedSoftwareMap);

        Map<String, Set<String>> response = serverOperations.createSortedSoftwareMapByStreams();
    }
}