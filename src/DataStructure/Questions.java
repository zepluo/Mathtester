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
    
    
    public Questions(int difficulty, String stem, String[] choices)
    {
       this.difficulty = difficulty;
    }
    
    public int getDifficulty()
    {
        return difficulty;
    }
            
}
