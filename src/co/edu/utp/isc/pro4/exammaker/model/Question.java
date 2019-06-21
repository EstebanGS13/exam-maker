
package co.edu.utp.isc.pro4.exammaker.model;


public abstract class Question {
    
    private QuestionType type;
    private String statement;
    private double value;

    public Question(QuestionType type) {
        this.type = type;
    }

    public QuestionType getType() {
        return type;
    }

    public String getStatement() {
        return statement;
    }
    
    public double getValue() {
        return value;
    }

    public void setType(QuestionType type) {
        this.type = type;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }
    
    public void setValue(double value) {
        this.value = value;
    }

}
