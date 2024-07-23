package Chapper6;

public class Sinhviencokhi extends Sinhvien{

    private double ScoreCNC;
    private double ScorePLC;

    public double getScoreCNC() {
        return ScoreCNC;
    }

    public void setScoreCNC(double scoreCNC) {
        ScoreCNC = scoreCNC;
    }

    public double getScorePLC() {
        return ScorePLC;
    }

    public void setScorePLC(double scorePLC) {
        ScorePLC = scorePLC;
    }

    @Override
    double getScore() {
        return (this.ScoreCNC + this.ScorePLC) / 2;
    }

    public Sinhviencokhi(double scoreCNC, double scorePLC) {
        ScoreCNC = scoreCNC;
        ScorePLC = scorePLC;
    }
}
