package com.cognologix.entity;

public class Server {
    private String server;
    private String platform;
    private String software;
    private String version;

    public Server(String server, String platform, String software, String version) {
        this.server = server;
        this.platform = platform;
        this.software = software;
        this.version = version;
    }

    public String getServer() {
        return server;
    }

    public String getPlatform() {
        return platform;
    }

    public String getSoftware() {
        return software;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return java.text.MessageFormat.format("Server Name: {0} | Platform: {1} | Software: {2} | Version: {3} {4}",
                server, platform, software, version, System.lineSeparator());
    }
}
