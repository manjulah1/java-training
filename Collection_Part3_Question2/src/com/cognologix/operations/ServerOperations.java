package com.cognologix.operations;

import com.cognologix.conversions.VersionConverter;
import com.cognologix.entity.Server;
import com.cognologix.mapper.ServerMapper;

import java.util.*;
import java.util.stream.Collectors;

public class ServerOperations {
    private final String[] serverData;
    private final List<Server> serverList = new ArrayList<>();

    public ServerOperations(String[] serverData) {
        this.serverData = serverData;
    }

    public void createServerList() {
        for (String server : serverData) {
            Server server1 = ServerMapper.getServerDataMapped(server);
            this.serverList.add(server1);
        }
    }

    public List<Server> sortListByServerName() {
        this.serverList.sort(Comparator.comparing(Server::getServer));
        return this.serverList;
    }

    public List<Server> sortListByServerNameAndVersionNumber() {
        this.serverList.sort((server, other) -> {
            int result = server.getServer().compareTo(other.getServer());
            if (result == 0) {
                result = server.getSoftware().compareTo(other.getSoftware());
                if (result == 0) {
                    result = server.getVersion().compareTo(other.getVersion());
                }
            }
            return result;
        });
        return this.serverList;
    }

    public Set<String> getDistantServerNames() {
        return this.serverList.stream().map(Server::getServer).collect(Collectors.toSet());
    }

    public List<Server> filterRecordsByServerName(String server1) {
        return this.serverList.stream()
                .filter(server -> server.getServer().equalsIgnoreCase(server1))
                .collect(Collectors.toList());
    }

    public Map<String, List<String>> createSortedSoftwareMap() {
        Map<String, List<String>> map = new HashMap<>();
        Map<Map<String, String>, String> versionMap = new HashMap<>();
        for (Server server : this.serverList) {
            String convertedVersion = VersionConverter.getConvertedVersion(server.getVersion());
            versionMap.put(Map.of(server.getSoftware(), server.getVersion()), convertedVersion);
        }
        List<Map<String, String>> list = versionMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue()).map(Map.Entry::getKey).collect(Collectors.toList());

        for (Map<String, String> listItem : list) {
            for (Map.Entry<String, String> entry : listItem.entrySet()) {
                if (!map.containsKey(entry.getKey())) {
                    map.put(entry.getKey(), new ArrayList<>());
                }
                map.get(entry.getKey()).add(entry.getValue());
            }
        }
        return map;
    }
    public Map<String, Set<String>> createSortedSoftwareMapByStreams() {

        return null;
    }
}
