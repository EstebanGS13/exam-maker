
package co.edu.utp.isc.pro4.exammaker.model;

import java.util.ArrayList;
import java.util.List;


public class UniqueAnswer extends Answer {
    
    private List<String> choices = new ArrayList();
    private String correctAnswer;

    public UniqueAnswer(String correctAnswer, double value) {
        super(value);
        this.correctAnswer = "";
    }

    public List<String> getChoices() {
        return choices;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
    
}
