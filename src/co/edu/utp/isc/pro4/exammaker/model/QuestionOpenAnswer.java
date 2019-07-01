
package co.edu.utp.isc.pro4.exammaker.model;

import java.io.Serializable;


public class QuestionOpenAnswer extends Question implements Serializable {
    
    public QuestionOpenAnswer(QuestionType type, String statement, double value) {
        super(type, statement, value);
    }
    
}
