public class Fraction {

    public int numerateur;
    public int denominateur;

    public Fraction(int n, int d){
        assert d != 0;
        this.denominateur = d;
        this.numerateur = n;
    }

    public String toString() {
        return Integer.toString(this.numerateur)+"/"+Integer.toString(this.denominateur);
    }
}