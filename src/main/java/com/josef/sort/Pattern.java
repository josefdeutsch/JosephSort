package com.josef.sort;
;
import com.josef.sort.model.Url;
import fr.maif.json.Json;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.josef.sort.Config.*;

public class Pattern {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {

        final List<Integer> basis =
                Stream.of(TEMPLATE_TRIANGLE)
                        .flatMap(Stream::of)
                        .collect(Collectors.toList());

        /**
         final List<Integer> basis2 =  TEMPLATE_TRIANGLE_LIST.stream()
         .flatMap(List::stream)
         .collect(Collectors.toList())
         */

        final Integer[][] exponent =
                IntStream.range(FIRST, TOTAL)
                        .mapToObj(x ->
                                basis.stream()
                                        .map(y -> y + (BLOCK * x))
                                        .toArray(Integer[]::new))
                        .toArray(Integer[][]::new);

        /**
         * final List<List<Integer>> integers =
         IntStream.range(FIRST, TOTAL)
         .mapToObj(x ->
         basis2.stream()
         .map(y -> y + (BLOCK * x))
         .toList())
         .toList(Collectors.toList());
         **/

        final List<String> result =
                Stream.of(exponent)
                        .flatMap(Stream::of)
                        .map(Object::toString)
                        .toList();

        final List<String> nodes =
                result.stream()
                        .map(src -> String.format(REGEX, Integer.valueOf(src)))
                        .map(src -> src)
                        .map(src -> Json.toJson(Url.builder()
                                .url(src)
                               // .ext(EXT)
                               // .id(UUID.randomUUID().toString())
                                .build(), Url.format()))
                        .map(Json::stringify)
                        .collect(Collectors.toList());


        String str = nodes.toString();
        System.out.println(str);



       // final Type listType = new TypeToken<List<String>>() {}.getType();
       // final Gson gson = new GsonBuilder().setPrettyPrinting().create();
       // final Writer writer = Files.newBufferedWriter(Paths.get(PATH));

       // gson.toJson(nodes, listType, writer);
       // writer.close();


    }


}
