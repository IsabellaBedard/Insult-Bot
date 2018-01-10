package org.vashonsd.insults;

public class FactBotFactory {


    public FactBotFactory() {

    }

    public static FactBot getBot(String type) {


        FactBot f = new FactBot();

        if(type.equals("Adri")) {
            f.addToFacts("Did you know Adri plays the bagpipes");
            f.addToFacts("Adri has been to 9 countries!");
            f.addToFacts("Adri has eaten frog, snail, crocodile, and rat, all in one meal!");
            f.addToFacts("Adri really hates raisins (really, they ruin cookies!)");
            f.addToFacts("Adri has three wallabies. one is named arthur. arthur seems like a very dignified name for a wallaby to me");
            f.addToFacts("Did you know Adri plays the bagpipes");
        } else if(type.equals("planet")) {
            f.addToFacts("A notch in a tree will remain the same distance from the ground as the tree grows.");
            f.addToFacts("Triton is Neptune’s largest moon and is the only large moon in the solar system to orbit in the opposite direction to its planet’s rotation");
            f.addToFacts("Saturn is the flattest  planet because it has a really high mass and spins on its axis much faster than Earth.");
        } else if (type.equals("plant")) {
            f.addToFacts("A notch in a tree will remain the same distance from the ground as the tree grows");
            f.addToFacts("Bamboo is the fastest-growing woody plant in the world; it can grow 35 inches in a single day");
            f.addToFacts("85% of plant life on Earth is found in the ocean");
            f.addToFacts("The Amazon rain forest produces half the world’s oxygen supply");
        } else if (type.equals("animal")) {
            f.addToFacts("The blue whale can produce the loudest sound of any animal");
            f.addToFacts("Horses and cows sleep while standing up");
            f.addToFacts("Giant Arctic jellyfish have tentacles that can reach over 36 metres in length.");
        } else if (type.equals("alternative")) {
            f.addToFacts("Saxophones can only legally be played within the state lines of Minnesota");
            f.addToFacts("If you take a segway to the northern most point on Marthas Vineyard and read the script of the movie Home Alone 3 exactly 482.37 times, Steve Jobs will return, immortal, and will give you an iphone 11");
            f.addToFacts("No one has ever been named Harold, EVER");
            f.addToFacts("Adriana Yarkin is made of exactly twelve molecules, the rest of her matter is a hologram created for her by JFK in the late 1600s");
            f.addToFacts("Tigers originated in Canada during the third green revolution");
        } else {
            f.addToFacts("I dont know those kinds of facts, try typing in 'planet', 'Adri', 'plant', or 'alternative' to get facts of that type");
        }

        return f;
    }
}
