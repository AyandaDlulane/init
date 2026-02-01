package main;

import CLI.Help;
import languageModels.Gemini;
import languageModels.LanguageModel;

public class Main {

    public static void main(String[] args){

         if(args.length < 1){
             System.out.println("<1");
             Help.Usage();
             return;
         }
         String commond = args[0];

         switch (commond){
             case "help":

                 break;
             default:
                 LanguageModel bot = new Gemini();
                 if (args.length == 1){

                     String repsonse = bot.message(args[0]);
                     System.out.println(repsonse);
                 }
         }
    }
}
