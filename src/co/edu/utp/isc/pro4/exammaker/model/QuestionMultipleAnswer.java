
package co.edu.utp.isc.pro4.exammaker.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class QuestionMultipleAnswer extends Question implements Serializable {
       
    private List<String> options;
    private List<Integer> correctOptionsIndexes;
    private List<Integer> chosenOptionsIndexes;

    public QuestionMultipleAnswer(QuestionType type, String statement, double value) {
        super(type, statement, value);
        this.options = new ArrayList();
        this.correctOptionsIndexes = new ArrayList();
    }

    public List<String> getOptions() {
        return options;
    }

    public List<Integer> getCorrectOptionsIndexes() {
        return correctOptionsIndexes;
    }

    public List<Integer> getChosenOptionsIndexes() {
        return chosenOptionsIndexes;
    }
    
    public void setOptions(List<String> options) {
        this.options = options;
    }

    public void setCorrectOptionsIndexes(List<Integer> correctOptionsIndexes) {
        this.correctOptionsIndexes = correctOptionsIndexes;
    }

    public void setChosenOptionsIndexes(List<Integer> chosenOptionsIndexes) {
        this.chosenOptionsIndexes = chosenOptionsIndexes;
    }
    
}
