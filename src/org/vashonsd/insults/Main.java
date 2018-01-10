package org.vashonsd.insults;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            Scanner userInput = new Scanner(System.in);
            String magicWord = "quit";
            String userIn = "";
            while(userIn != magicWord) {
                System.out.println("Hi! I'm Fact Bot, and I can tell you facts! What type of fact do you want? (options include: 'Adri', 'planet', 'plant', 'animal', and 'alternative' facts): ");
                userIn = userInput.nextLine();
                FactBot bot = FactBotFactory.getBot(userIn);
                System.out.println(bot.sayRandomFact());
            }
    }
}
