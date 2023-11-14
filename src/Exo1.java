class Thread1 implements Runnable {
    public void run (){
        try { for(int i = 1; i <=26; i++) System.out.println (i +" ");}
        catch ( Exception e){ return ; }
    }
}
class Thread2 implements Runnable {
    public void run (){
        try { for(char i = 'a'; i <= 'z'; i++) System.out.println(i);}
        catch ( Exception e){ return ; }
    }
}
class Exo1 {
    public static void main ( String [] args ) {
        Runnable t1 = new Thread1 ();
        Runnable t2 = new Thread2 ();
        new Thread (t1).start();
        new Thread (t2).start();
    }
}