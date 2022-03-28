package com.josef.sort;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class Main {

    public static void main(String[] args) throws IOException {
        String str = readAllBytesJava7(
                "/Users/Joseph/IdeaProjects/JosephSort/src/main/java/com/josef/sort/file/output.json"
        ).replaceAll("\"", "\\\"");

        System.out.println(str);
    }

    private static String readAllBytesJava7(String filePath)
    {
        String content = "";
        try { content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    private static void readAllBytesJava72(String str) throws IOException {
        String src = str;
        BufferedWriter writer2 =
                new BufferedWriter(new FileWriter("/Users/Joseph/IdeaProjects/JosephSort/src/main/java/com/josef/sort/file/output.json"));
        writer2.write(src);
        writer2.close();
        System.out.println(src);
    }
}


