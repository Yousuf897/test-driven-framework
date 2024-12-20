package com.companyname.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.sl.draw.geom.Path;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

public class JsonUtils {

    public static final Logger logger = LogManager.getLogger(JsonUtils.class);

    public static String readJsonFile(String fileName) throws IOException, URISyntaxException {
        URI uriPath = Objects.requireNonNull(JsonUtils.class
                .getClassLoader()
                .getResource(fileName))
                .toURI();

        String filePath = Objects.requireNonNull(JsonUtils.class
                        .getClassLoader()
                        .getResource(fileName))
                .getPath();

        System.out.println("URI Path:" + uriPath );
        System.out.println("File Path:" + filePath );

        return new String(Files.readAllBytes(Paths.get(filePath)));

        /* TODO: Assignment
        * Write down the debugging steps
        * Find the issue using the debugging steps
        * Explain the issue using the logger
        * Capture the log using the logger
        * Fix the issue
        * Re-run the program and load the JSON file using the local file path system (PATH) --> getPath()
        * */
    }
}
