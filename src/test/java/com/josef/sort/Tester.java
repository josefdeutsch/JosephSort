package com.josef.sort;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class Tester {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Integer head = list.remove(0);
        list.add(head);

        list.forEach(System.out::println);

    }

    @Test
    public void whenGetRequest_thenCorrect() throws IOException {

        final OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://www.google.com/")
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();

        assertThat(response.code(), equalTo(200));

    }




}
