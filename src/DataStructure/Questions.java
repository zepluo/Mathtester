/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

/**
 *
 * @author zepingluo
 */
public class Questions {
    
    
    private int difficulty;
    private String stem;
    private String[] choices;
    private String correctAnswer;
    private String userAnswer;
    private int type;
    public static final int MULTIPLECHOICE=0;
    public static final int FREERESPONSE = 1;
    
   
    public Questions(int type, int difficulty, String stem, String[] choices, String correctAnswer)
    {
       this.difficulty = difficulty;
       this.stem = stem;
       this.choices = choices;
       this.correctAnswer = correctAnswer;
       this.type = type;
       userAnswer = null;
    }
    
    public int getDifficulty()
    {
        return difficulty;
    }
    
    public int getType()
    {
        return type;
    }
    public String getStem()
    {
        return stem;
    }
    
    public String[] getchoices()
    {
        return choices;
    }
            
    public void setUserANswer( String Answer)
    {
        userAnswer = Answer;
    }
    
    public String getUserAnswer()
    {
        return userAnswer;
    }
    
}
