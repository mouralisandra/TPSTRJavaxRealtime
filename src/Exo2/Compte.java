package Exo2;

public class Compte {
    private int solde = 100;
    public int getSolde () {
        return solde ;
    }
    public void retirer ( int montant ){
        solde = solde - montant ;
    }
}

