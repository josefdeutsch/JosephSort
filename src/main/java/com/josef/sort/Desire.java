package com.josef.sort;

import com.josef.sort.model.Url;
import fr.maif.json.Json;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.josef.sort.Config.EXT;
import static com.josef.sort.Config.REGEX;

public final class Desire {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        final ArrayList<Integer> result = new ArrayList<Integer>(791);

        for (int i = 0; i <= 791-1 ; i++) {
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



    }

}
