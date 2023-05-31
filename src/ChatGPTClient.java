public class ChatGPTClient {
    
    public String traducaoGPT(String OPENAI_API_KEY, String texto) throws Exception {
        String prompt = String.format("Me dê duas traduções em português para o texto: %s", texto);
        var requisicao = new ChatGPTRequest("text-davinci-003", prompt, 100, 0.1);
        var completion = Requisicao.unga(OPENAI_API_KEY, requisicao);
        return completion;
    }

    public String emojiGPT(String OPENAI_API_KEY, String filme) throws Exception {
        String prompt = String.format("Como o filme %s ficaria em 4 emojis, sem explicação.", filme);
        var requisicao = new ChatGPTRequest("text-davinci-003", prompt, 100, 1);
        var completion = Requisicao.unga(OPENAI_API_KEY, requisicao);
        return completion;
    }

    public String kidsGPT(String OPENAI_API_KEY, String explica) throws Exception {
        String prompt = String.format("Me dê uma explicação super simplificada de %s para uma criança de 6 anos", explica);
        var requisicao = new ChatGPTRequest("text-davinci-003", prompt, 100, 0.1);
        var completion = Requisicao.unga(OPENAI_API_KEY, requisicao);
        return completion;
    }
}
