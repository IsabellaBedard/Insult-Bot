package org.vashonsd.insults;

import java.util.ArrayList;
import java.util.Random;

public class FactBot {
    private ArrayList<String> facts;

    public FactBot() {
        facts = new ArrayList<>();
    }

    public void addToFacts(String fact) {
        facts.add(fact);
    }

    public String sayAFact() {
        return facts.get(0);
    }

    public String sayRandomFact() {
        Random rand = new Random();
        int which = rand.nextInt(facts.size());
        return facts.get(which);
    }
}
