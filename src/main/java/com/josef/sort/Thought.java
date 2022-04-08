package com.josef.sort;

import com.josef.sort.model.Url;
import fr.maif.json.Json;
import scala.Int;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.josef.sort.Config.EXT;
import static com.josef.sort.Config.REGEX;

public final class Thought {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        final ArrayList<Integer> result = new ArrayList<Integer>(135);

        for (int i = 0; i <= 135-1 ; i++) {
            result.add(i);
        }

        final List<String> nodes =
                result.stream()
                        .map(src -> String.format(REGEX, Integer.valueOf(src)))
                        .map(src -> Json.toJson(Url.builder()
                                .url(src)
                                .ext(EXT)
                                .id(UUID.randomUUID().toString())
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
