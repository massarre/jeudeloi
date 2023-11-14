package com.jeudeloievolution;

import java.util.Random;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
          Scanner clavier= new Scanner (System.in);
    Random generateur = new Random();
    System.out.println("Veuillez lancer, s'il vous plait ");
   
    int pointMax=20;
    int reste=0;
    int cumulnbAalea=0;
    int nbrTeste=0;
    int tentation=0;
    
    do {
        cumulnbAalea=0;
        for ( int i=1; i<=5; i++){
            // definir l'intervale dans lequel le nombre aléatoire doit y etre
            int nbreAleatoire= generateur.nextInt(6) + 1;
            cumulnbAalea+=nbreAleatoire;
            reste = pointMax-cumulnbAalea;
            System.out.println("Lancer "+i+" : vous avez fait "+ nbreAleatoire+ ". vous etes sur la case "+cumulnbAalea+ " (encore "+reste +" cases) ");
        
        }
   
   
        if (reste == 0) {
        tentation=1;
        System.out.println("Vous avez gagné");
    
        }
        else {
        tentation=0;
        System.out.println("Vous avez perdu");
        } 
        nbrTeste++;
    } while (tentation==0);

    System.out.println("nombre de tentatives: "+ nbrTeste);
    }
    
    
}
