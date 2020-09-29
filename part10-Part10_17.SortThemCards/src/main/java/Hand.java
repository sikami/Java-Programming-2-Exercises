
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class Hand implements Comparable<Hand> {
    private List<Card> hands;
    
    public Hand() {
        this.hands = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.hands.add(card);
    }
    
    public void print() {
        this.hands.stream().forEach(hand -> System.out.println(hand));
    }
    
    public int getValue() {
        int value = this.hands.stream().map(card -> card.getValue())
                .reduce(0, (prev, next) -> prev + next);
        return value;
    }
    
    public void sort() {
        Comparator<Card> comparator = Comparator.comparing(Card::getValue).thenComparing(Card::getSuit);
        Collections.sort(this.hands, comparator);
    }

    @Override
    public int compareTo(Hand o) {
        if (getValue() > o.getValue()) {
            return 1;
        } else if (getValue() == o.getValue()) {
            return 0;
        }
        return -1;                
    }
    
    public void sortBySuit() {
        Comparator<Card> comparator = Comparator.comparing(Card::getSuit).thenComparing(Card::getValue);
        Collections.sort(this.hands, comparator);
    }
    
    
    
    
}
