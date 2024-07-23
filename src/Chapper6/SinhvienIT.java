package Chapper6;

public class SinhvienIT extends Sinhvien {

    private double ScoreJava;
    private double ScoreHTML;


    public double getScoreJava() {
        return ScoreJava;
    }

    public void setScoreJava(double scoreJava) {
        ScoreJava = scoreJava;
    }

    public double getScoreHTML() {
        return ScoreHTML;
    }

    public void setScoreHTML(double scoreHTML) {
        ScoreHTML = scoreHTML;
    }

    @Override
    double getScore() {
        return (this.ScoreJava * 2 + this.ScoreHTML)/3;
    }

    public SinhvienIT(double scoreJava, double scoreHTML) {
        super();
        ScoreJava = scoreJava;
        ScoreHTML = scoreHTML;
    }
}
