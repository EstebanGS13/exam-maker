
package co.edu.utp.isc.pro4.exammaker.model;

import java.util.ArrayList;
import java.util.List;


public class MultipleAnswer extends Answer {
       
    private List<String> choices = new ArrayList();
    private List<String> correctAnswers = new ArrayList();

    public MultipleAnswer(double value) {
        super(value);
    }

    public List<String> getChoices() {
        return choices;
    }

    public List<String> getCorrectAnswers() {
        return correctAnswers;
    }
    
}
