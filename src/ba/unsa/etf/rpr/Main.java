package ba.unsa.etf.rpr;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sat s = new Sat(15,30,45);
        s.ispisi();
        s.sljedeci();
        s.ispisi();
        s.pomjeriZa(-48);
        s.ispisi();
        s.setSat(0,0,0);
        s.ispisi();
    }
}
