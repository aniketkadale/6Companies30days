public class Que10 {

    double RAD, XC, YC;


    public static void main(String[] args) {
        
    }

  
    public static Solution(double radius, double x_center, double y_center) {
        RAD = radius;
        XC = x_center;
        YC = y_center;
    }

    public static double[] randPoint() {
        double ang = Math.random() * 2 * Math.PI,
            hyp = Math.sqrt(Math.random()) * RAD,
            adj = Math.cos(ang) * hyp,
            opp = Math.sin(ang) * hyp;
        return new double[]{XC + adj, YC + opp};
    }
    
}
