
package co.edu.utp.isc.pro4.exammaker.model;


public class OpenAnswer extends Answer {
    
    private String answer;

    public OpenAnswer(double value) {
        super(value);
        this.answer = "";
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
}
