
package co.edu.utp.isc.pro4.exammaker.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class QuestionUniqueAnswer extends Question implements Serializable {
    
    private List<String> options;
    private int correctOptionIndex;

    public QuestionUniqueAnswer(QuestionType type, String statement, double value) {
        super(type, statement, value);
        this.options = new ArrayList();
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }

    public void setCorrectOptionIndex(int correctOptionIndex) {
        this.correctOptionIndex = correctOptionIndex;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
    

}
