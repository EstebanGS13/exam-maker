
package co.edu.utp.isc.pro4.exammaker.model;


public abstract class Answer {
    
    private double value;

    public Answer(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
}
