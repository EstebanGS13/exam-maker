
package co.edu.utp.isc.pro4.exammaker.model;

import java.io.Serializable;


public class QuestionOpenAnswer extends Question implements Serializable {
    
    private String answer = "";
    
    public QuestionOpenAnswer(QuestionType type, String statement, double value) {
        super(type, statement, value);
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
}
