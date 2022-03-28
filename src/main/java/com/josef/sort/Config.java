package com.josef.sort;

import java.util.Arrays;
import java.util.List;

public interface Config {

    final int[] TEMP = new int[]{0, 1, 2, 3, 20, 21, 22, 23, 40, 41, 42, 43};

    /**
     * final Integer[][] template =
     * IntStream.range(FIRST, END)
     * .mapToObj(x ->
     * Arrays.stream(TEMP)
     * .mapToObj(y -> y + (TERM * x))
     * .toArray(Integer[]::new))
     * .toArray(Integer[][]::new);
     **/

    List<List<Integer>> TEMPLATE_TRIANGLE_LIST = Arrays.asList(
            Arrays.asList(0, 1, 2, 3, 20, 21, 22, 23, 40, 41, 42, 43),
            Arrays.asList(5, 6, 7, 24, 25, 26, 27, 44, 45, 46, 47, 4),
            Arrays.asList(0, 11, 28, 29, 30, 31, 48, 49, 50, 51, 8, 9),
            Arrays.asList(13, 14, 15, 32, 33, 34, 35, 52, 53, 54, 55, 12),
            Arrays.asList(16, 17, 18, 19, 36, 37, 38, 39, 56, 57, 58, 59)
    );


    Integer[][] TEMPLATE_TRIANGLE = new Integer[][]{
            {0, 1, 2, 3, 20, 21, 22, 23, 40, 41, 42, 43},
            {5, 6, 7, 24, 25, 26, 27, 44, 45, 46, 47, 4},
            {10, 11, 28, 29, 30, 31, 48, 49, 50, 51, 8, 9},
            {13, 14, 15, 32, 33, 34, 35, 52, 53, 54, 55, 12},
            {16, 17, 18, 19, 36, 37, 38, 39, 56, 57, 58, 59}
    };

    Integer[][] TEMPLATE_VERTICAL = new Integer[][]{
            {0, 1, 2, 3, 20, 21, 22, 23, 40, 41, 42, 43},
            {4, 5, 6, 7, 24, 25, 26, 27, 44, 45, 46, 47},
            {8, 9, 10, 11, 28, 29, 30, 31, 48, 49, 50, 51},
            {12, 14, 14, 15, 32, 33, 34, 35, 52, 53, 54, 55},
            {16, 17, 18, 19, 36, 37, 38, 39, 56, 57, 58, 59}
    };

    final int FIRST = 0;
    final int BLOCK = 60;
    final int TOTAL = 65;

    final String BASE = "http://joseph3d.com/wp-content/uploads/2019/06/";
    final String EXT = ".png";
    final String REGEX = "%04d";
    final String PATH = "/Users/Joseph/IdeaProjects/JosephSort/src/main/java/com/josef/sort/file/output.json";
}
