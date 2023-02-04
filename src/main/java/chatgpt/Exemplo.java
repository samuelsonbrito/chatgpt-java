package chatgpt;

import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.completion.CompletionRequest;

public class Exemplo {
	
	private static final String API_KEY = "SUA CHAVE";

    public static void main(String[] args) {
    	
        OpenAiService service = new OpenAiService(API_KEY);

        CompletionRequest request = CompletionRequest.builder()
                .model("text-davinci-003")
                .prompt("Escreva um slogan para uma barraca de açaí.")
                .maxTokens(100)
                .build();

        System.out.println(service.createCompletion(request).getChoices());
         
    }

}
