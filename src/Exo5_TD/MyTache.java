package Exo5_TD;
class Solde {
    private int solde = 0;
    public Solde (int x) { this.solde = x; }
    public synchronized void incrementer () {
        int n = solde ;
        try { Thread.currentThread().sleep(200);}
        catch ( InterruptedException e) {}
        solde = n + 1;
    }
}
class MyTache implements Runnable {

    private Solde sld ;
    public MyTache ( Solde s) { sld = s; }
    public void run () { sld. incrementer (); }
    public static void main ( String [] args ) {
        Solde s = new Solde(10000);
        Thread t1 = new Thread (new MyTache (s ));
        Thread t2 = new Thread (new MyTache (s ));
        t1. setName ("t1");
        t2. setName ("t2");
        t1. start ();
        t2. start ();
    }
}
