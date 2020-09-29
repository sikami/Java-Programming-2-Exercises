/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author listya
 */
public class SaveableDictionary {
    private Map<String,String> dicts;
    private String file;
    
    public SaveableDictionary(String file) {
        this.file = file;    
        this.dicts = new HashMap<>();
    }

    public SaveableDictionary() {
        this.dicts = new HashMap<>();
    }
    
    public boolean load() {
        try (Scanner scan = new Scanner(Paths.get(this.file))) {
            String word;
            String translate;
            String[] arrays;
            String read;
            
            while (scan.hasNextLine()) {
                read = scan.nextLine();
                arrays = read.split(":");
                word = arrays[0];
                translate = arrays[1];
                this.dicts.put(word,translate);
            }
            
            return true;
        } catch (NullPointerException | IOException e) {
            System.out.println("File doesn't exist");
            return false;
        } 
       
    }
    
    public void add(String words, String translation) {
        if (!this.dicts.containsKey(words)) {
            this.dicts.put(words, translation);
        }
    }
    
    public String translate(String word) {
        Set<String> keys = this.dicts.keySet();
        if(this.dicts.containsKey(word)) {
            return this.dicts.get(word);
        } else if (this.dicts.containsValue(word)) {
           for (String letters : keys) {
               if(this.dicts.get(letters).equals(word)) {
                   return letters;
               }
           }
        } 
      
        return null;
    }
    
    public void delete(String word) {
        String translation = translate(word);
        this.dicts.remove(word);
        this.dicts.remove(translation);
    }
    
    public boolean save() {
        try {
            try (PrintWriter writer = new PrintWriter(this.file)) {
                for (Map.Entry<String,String> dict : this.dicts.entrySet()) {
                    writer.println(dict.getKey() + ":" + dict.getValue());
                }
                return true;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            return false;
        }
    
    }
    
    
}
