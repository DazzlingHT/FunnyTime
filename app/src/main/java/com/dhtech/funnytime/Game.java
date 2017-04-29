package com.dhtech.funnytime;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Fur on 26/04/2017.
 */

public class Game {

    protected ArrayList<String> arrayWords = new ArrayList<String>();
    protected ArrayList tempArrayWords = new ArrayList<String>();
    protected int currentChoice;

    public Game(ArrayList arrayWords) {
        this.setArrayWords(arrayWords);
    }

    //Getters AND Setters

    public ArrayList getArrayWords() {
        return arrayWords;
    }

    public void setArrayWords(ArrayList arrayWords) {
        this.arrayWords = arrayWords;
    }

    public void setCurrentChoice(int currentChoice) {
        this.currentChoice = currentChoice;
    }

    public int getCurrentChoice() {
        return currentChoice;
    }

    public ArrayList getTempArrayWords() {
        return tempArrayWords;
    }

    public void setTempArrayWords(ArrayList tempArrayWords) {
        this.tempArrayWords = tempArrayWords;
    }

    //Functions

    public void nextItem() {

    }

    public String nextWord( boolean good) {
        String word;
        word = this.getCurrentWords(this.getCurrentChoice());
        if(good){
            removeWord(word);
            return this.getWords(0);
        } else {
            removeWord(word);
            addWord(word);
            return this.getWords(1);
        }
    }

    public int getWordsNumber(){
        int wordsNumber;
        return wordsNumber = this.arrayWords.size();
    }

    public String getWords( int num){
        Random rn = new Random();
        int randomChoice;
        randomChoice = rn.nextInt(this.getWordsNumber() - num);
        this.setCurrentChoice(randomChoice);
        return this.arrayWords.get(randomChoice);
    }

    public String getCurrentWords( int currentChoice ){
        return this.arrayWords.get(currentChoice);
    }

    public void removeWord( String wordToRemove){
        this.arrayWords.remove(wordToRemove);
    }

    public void addWord( String wordToRemove){
        this.arrayWords.add(wordToRemove);
    }
}
