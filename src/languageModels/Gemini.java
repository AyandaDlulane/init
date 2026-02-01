package languageModels;


import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class Gemini extends LanguageModel{

    @Override
    public String chat(String input){
        Client client = new Client();

        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.5-flash",
                        input,
                        null);
        return response.text();
    }
    @Override
    public String message(String userImput){
     return chat("System:"+Prompts.messagePrompt()+" User:"+userImput);
    }
}
