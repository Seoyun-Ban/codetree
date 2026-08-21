public class Main {
    public static void main(String[] args) {
        double ft = 9.2, mi = 1.3;
        double fttocm = ft * 30.48;
        double mitocm = mi * 160934;
        System.out.printf(ft + "ft" + " = " + "%.1f" + "cm\n", fttocm);
        System.out.printf(mi + "mi" + " = " + "%.1f" + "cm\n", mitocm);
    }
}