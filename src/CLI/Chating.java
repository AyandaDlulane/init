package CLI;

import languageModels.Gemini;
import languageModels.LanguageModel;

import java.util.Scanner;

public class Chating {

    void chating(){
    }

   public static void  cliChat(){

        boolean continueChat = true;
        Scanner userInputScanner = new Scanner(System.in);
        String userInput;
        String aiResponse;
        LanguageModel bot = new Gemini();

        while (continueChat){

            System.out.println("User: ");
            userInput = userInputScanner.nextLine();
            System.out.println("\n");
            aiResponse = bot.chat(userInput);
            System.out.println("Ai :"+aiResponse);

            if(userInput.equals("exit")){
                continueChat = false;
            }

        }
    }
}
