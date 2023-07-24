
public class MathClass {
    public static void main(String[] args) {
        double a = -5;
        System.out.println("a = "+a +", absolute a = "+ Math.abs(a));
        double b = 8;
        System.out.println("Min of (a,b) = "+Math.min(a,b)+", max of (a,b) = "+Math.max(a,b));
        System.out.println("sqrt of b = "+Math.sqrt(b));
        double e = Math.E;
        double pi = Math.PI;
        System.out.println("LogE base E = "+ Math.log(e));
        System.out.println("Log10 base 10 = "+ Math.log10(10));
        System.out.println("a^b = " + Math.pow(a,b));
        System.out.println("sin(1) = " + Math.sin(1));
        System.out.println("sin^-1(sin(1)) = " + Math.asin(0.8414709848078965));
        double f = 5.34;
        System.out.println("Floor = "+Math.floor(f));
        System.out.println("Ceil = "+Math.ceil(f));
        System.out.println("Round = "+Math.round(f));

        System.out.println((int)(Math.random()*10));//b/w 0 to 10

    }
}
