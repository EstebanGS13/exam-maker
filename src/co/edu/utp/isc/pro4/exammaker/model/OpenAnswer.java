
package co.edu.utp.isc.pro4.exammaker.model;


public class OpenAnswer extends Question {
    
    private String answer;

    public OpenAnswer(QuestionType type) {
        super(type);
        this.answer = "";
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
}
