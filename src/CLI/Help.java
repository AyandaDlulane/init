package CLI;

import java.io.Console;

public class Help {

    public static void Usage(){
        System.out.println(ConsoleColor.Blue+"Hello and welcome to"+ConsoleColor.RESET);
        System.out.println(" ______            __    __     \n" +
                "/      |          /  |  /  |    \n" +
                "$$$$$$/  _______  $$/  _$$ |_   \n" +
                "  $$ |  /       \\ /  |/ $$   |  \n" +
                "  $$ |  $$$$$$$  |$$ |$$$$$$/   \n" +
                "  $$ |  $$ |  $$ |$$ |  $$ | __ \n" +
                " _$$ |_ $$ |  $$ |$$ |  $$ |/  |\n" +
                "/ $$   |$$ |  $$ |$$ |  $$  $$/ \n" +
                "$$$$$$/ $$/   $$/ $$/    $$$$/  \n" +
                "$Git for beginners                 " +
                "                                \n" +
                "                                ");
        System.out.println("Usage:");
        System.out.println("Init <command> options\n" +
                "OR\n"+
        "Init massage");
    }
}
