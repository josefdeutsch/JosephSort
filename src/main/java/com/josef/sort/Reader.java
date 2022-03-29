package com.josef.sort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public interface Reader {

    static String readFile_BufferedFileReader_ReadLine() throws IOException {

        String fileName = "/Users/Joseph/IdeaProjects/JosephSort/src/main/java/com/josef/sort/file/output.json";
        FileReader fileReader = new FileReader(fileName);
        String lines = "";
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            long startTime = System.currentTimeMillis();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                //comment out next line for performance tests
                lines += line;
            }
        }
        return lines;
    }
}
