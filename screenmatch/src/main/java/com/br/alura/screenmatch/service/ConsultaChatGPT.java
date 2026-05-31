package com.br.alura.screenmatch.service;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.responses.Response;
import com.openai.models.responses.ResponseCreateParams;

public class ConsultaChatGPT {

    public static String obterTraducao(String texto) {
//        OpenAIClient client = OpenAIOkHttpClient.builder()
//.apiKey(System.getenv("OPENAI_API_KEY"))
//                .build();
//
//        ResponseCreateParams params = ResponseCreateParams.builder()
//                .model("gpt-4.1-mini")
//                .input("Traduza para o português do Brasil o seguinte texto:\n\n" + texto)
//                .build();
//
//        Response response = client.responses().create(params);
//
//        return response.output().get(0)
//                .asMessage()
//                .content().get(0)
//                .asOutputText()
//                .text()
//                .trim();

        return texto;
    }
}