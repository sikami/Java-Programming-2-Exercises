
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class Abbreviations {
    private HashMap<String, String> words;

    public Abbreviations() {
        this.words = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.words.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.words.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        if (hasAbbreviation(abbreviation)) {
            return this.words.get(abbreviation);
        }
        return null;
    }
}
