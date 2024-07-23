package Chapper4;

public class SVTN extends Sinhvien{
    private double Toan;
    private double ly;
    private double hoa;

    public SVTN(double toan, double ly , double hoa){
        this.Toan = Toan;
        this.ly= ly;
        this.hoa = hoa;
    }

    public double getToan() {
        return Toan;
    }

    public void setToan(double toan) {
        Toan = toan;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }
}
