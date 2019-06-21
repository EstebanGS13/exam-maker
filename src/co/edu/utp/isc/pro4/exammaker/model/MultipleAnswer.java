
package co.edu.utp.isc.pro4.exammaker.model;

import java.util.ArrayList;
import java.util.List;


public class MultipleAnswer extends Question {
       
    private List<String> choices;
    private List<Integer> correctIndexes;

    public MultipleAnswer(QuestionType type) {
        super(type);
        this.choices = new ArrayList();
        this.correctIndexes = new ArrayList();
    }

    public List<String> getChoices() {
        return choices;
    }

    public List<Integer> getCorrectIndexes() {
        return correctIndexes;
    }
 
}
