
package co.edu.utp.isc.pro4.exammaker.model;

import java.util.ArrayList;
import java.util.List;


public class UniqueAnswer extends Question {
    
    private List<String> choices;
    private int correctIndex;
    //TODO chosen answer? 

    public UniqueAnswer(List<String> choices, QuestionType type) {
        //TODO recibir lista puede estar erroneo
        super(type);
        this.choices = new ArrayList();
    }

    public List<String> getChoices() {
        return choices;
    }

    public int getCorrectIndex() {
        return correctIndex;
    }

    public void setCorrectIndex(int correctIndex) {
        this.correctIndex = correctIndex;
    }
    
}
