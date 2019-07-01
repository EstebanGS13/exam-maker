
package co.edu.utp.isc.pro4.exammaker.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class QuestionMultipleAnswer extends Question implements Serializable {
       
    private List<String> options;
    private List<Integer> correctOptionsIndexes;

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
 
}
