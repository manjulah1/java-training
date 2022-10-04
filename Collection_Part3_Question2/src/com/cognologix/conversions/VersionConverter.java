package com.cognologix.conversions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VersionConverter {
    public static String getConvertedVersion(String version) {
        List<String> splittedVersion = List.of(version.split("\\."));
        List<String> newVersionList = new ArrayList<>();
        for(String versionNumber: splittedVersion) {
            if(versionNumber.length() == 1) {
                newVersionList.add("0" + versionNumber);
            } else {
                newVersionList.add(versionNumber);
            }
        }
        String newVersion = newVersionList.stream()
                        .map(Object::toString)
                                .collect(Collectors.joining("."));
        newVersionList.clear();
        return newVersion;
    }
}
