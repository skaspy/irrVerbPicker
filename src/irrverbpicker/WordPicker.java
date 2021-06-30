/*
 * MIT License
 * 
 * Copyright (c) 2021 Sabine Kasparek
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 */


package irrverbpicker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * WordPicker contains the logic of this project. It scans one of the two
 * provided txt files (depending on the users choice), saves the strings as
 * entries of a list. The user can choose the number of words to pick before
 * they are randomly chosen. The display of the output (combinations of verb
 * forms) can be changed without any problems.
 * 
 * @author Sabine Kasparek
 * @version 1.0
 */

public class WordPicker {
    
    private int[] picks;
    private String fileName;
    private Scanner scan = null;
    private ArrayList<Entry> liste;
    private int yearOfLearning = 1;

    public WordPicker(){
        liste = new ArrayList<Entry>();
    }
    
    /**
     * Sets the year of learning English
     * @param year requires int value as year of learning English
     */
    public void setYearOfLearning(int year){
        yearOfLearning = year;
    }
    
    /**
     * Returns the year of learning English (the verb lists are different
     * for every yearf of learning).
     * @return the year of learning as int value
     */
    public int getYearOfLearning(){
        return yearOfLearning;
    }
    
    /**
     * This method scans the txt file providing the list of irregular verbs,
     * splits the different forms and saves each verb with its three forms
     * as an Entry object.
     */
    public void loadFile(){
        if(getYearOfLearning() == 1){
            fileName = "irrVerbs1.txt";
        } else if (yearOfLearning == 2){
            fileName = "irrVerbs2.txt";
        } else if (yearOfLearning == 3){
            fileName = "irrVerbs3.txt";
        } else {
            System.err.println("ERROR: The txt files with the verbs are "
                    + "missing!");}
        liste.clear();
        try{
        scan = new Scanner(new File(fileName));
        while(scan.hasNext()){
            String splits[] = new String[3];
            splits = scan.nextLine().split(":");  //divides words at :
            if (splits.length < 2) {
                liste.add(new Entry(splits[0], "", ""));
            } 
            else if(splits.length == 2){ // if there are exactly 2 string parts
                liste.add(new Entry(splits[0], splits[1], ""));
            } else if(splits.length == 3){ // if there are exactly 3 string parts
                liste.add(new Entry(splits[0], splits[1], splits[2]));
            }                
            
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        scan.close();
    }
    
    /**
     * This method picks a certain number of random list entries.
     * @param amount of verbs/entries to pick
     * @return an array with all picked Entry objects
     */
    public int[] pickVerbs(int amount){
        int r; //random
        picks = new int[amount];  // chosen indices
        for (int j = 0; j < amount; j++) {
            picks[j] = -1;
        }
        
        boolean[] wasPicked = new boolean[liste.size()]; // avoids doubling
        for (int j = 0; j < liste.size(); j++) {
            wasPicked[j] = false;
        }
        
        int i = 0;
        while (i < amount){
            r = (int) (Math.random()*liste.size())-1;  //random number between 0 and size-1
            if (wasPicked[r] == false){   // if not yet chosen
                picks[i] = r;   // saves the line numbers
                wasPicked[r] = true;  // marked as chosen
                i++;
            }
        }
        return picks;
    }
    
    /**
     * Returns all picked Entry objects.
     * @return an array with all picked Entry objects
     */
    public int[] getPicks(){
        return picks;
    }
    
    /**
     * Creates a string output that shows the infinitive form of all picked
     * verbs.
     * @return a string output for the text field
     */
    public String showInfinitive(){
        String output ="";
        for (int i = 0; i < picks.length; i++) {
            output = output + liste.get(picks[i]).getInfinitive() + "\n";
        }
        return output;
    }
 
    /**
     * Creates a string output that shows the simple past form of all picked
     * verbs.
     * @return a string output for the text field
     */
    public String showSimplePast(){
        String output ="";
        for (int i = 0; i < picks.length; i++) {
            output = output + liste.get(picks[i]).getSimplePast() + "\n";
        }
        return output;
    }
    
    /**
     * Creates a string output that shows the infinitive and the simple past
     * form of all picked verbs.
     * @return a string output for the text field
     */
    public String showInfinitiveSimplePast(){
        String output ="";
        for (int i = 0; i < picks.length; i++) {
            output = output + liste.get(picks[i]).getInfinitive() + " : "
                    + liste.get(picks[i]).getSimplePast() + "\n";
        }
        return output;
    }    
    
    /**
     * Creates a string output that shows the past participle form of all picked
     * verbs.
     * @return a string output for the text field
     */
    public String showPastParticiple(){
        String output ="";
        if (getYearOfLearning() == 1) { // ERROR: No PP in year 1!
            output = "FEHLER:\n"
                    + "Im 1. Lernjahr lernt man noch kein\n"
                    + "Past Participle!\n \n";
        }
        for (int i = 0; i < picks.length; i++) {
            output = output + liste.get(picks[i]).getPastParticiple() + "\n";
        }
        return output;
    }
    
    /**
     * Creates a string output that shows the infinitive, the simple past and
     * the past participle form of all picked verbs.
     * @return a string output for the text field
     */
    public String showInfinitiveSPPP(){
        String output ="";
        if (getYearOfLearning() == 1) { // ERROR: No PP in year 1!
            output = "FEHLER:\n"
                    + "Im 1. Lernjahr lernt man noch kein\n"
                    + "Past Participle!\n \n";
        }
        for (int i = 0; i < picks.length; i++) {
            output = output + liste.get(picks[i]).getInfinitive() + " : " 
                    + liste.get(picks[i]).getSimplePast() + " : " 
                    + liste.get(picks[i]).getPastParticiple() + "\n";
        }
        return output;
    } 
}
