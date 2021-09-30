public class Fraction {

    private int numerateur;
    private int denominateur;

    public Fraction(int n, int d){
        this.denominateur = d;
        this.numerateur = n;
    }

    public String toString() {
        return Integer.toHexString(this.numerateur)+"/"+Integer.toString(this.denominateur);
    }
}