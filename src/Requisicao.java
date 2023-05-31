import com.google.gson.Gson;
import okhttp3.*;

public class Requisicao {
    public static String unga(String OPENAI_API_KEY, ChatGPTRequest requisicao) throws Exception {
        OkHttpClient httpClient = new OkHttpClient();
        Gson gson = new Gson();
        String url = "https://api.openai.com/v1/completions";

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody requestBody = RequestBody.create(gson.toJson(requisicao), mediaType);

        Request request = new Request.Builder()
                .url(url)
                .addHeader("Authorization", "Bearer " + OPENAI_API_KEY)
                .post(requestBody)
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new RuntimeException("Erro na requisição: " + response);
            }

            ChatGPTResponse chatGPTResponse = gson.fromJson(response.body().string(), ChatGPTResponse.class);
            String completion = chatGPTResponse.getChoices().get(0).getText();

            return completion;
        }
    }
}
