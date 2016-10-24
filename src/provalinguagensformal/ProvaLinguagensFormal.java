package provalinguagensformal;

import java.util.Scanner;

/**
 *
 * ALBERTO TUTI SOKI 
 * AMINATHA MIGUEL 
 */
public class ProvaLinguagensFormal {

    int cont;
    char palavra[];

    public static void main(String[] args) {

        ProvaLinguagensFormal automato = new ProvaLinguagensFormal();
        String setenca;
        Scanner entrada = new Scanner(System.in);
        System.out.println("entra com a setença:");
        setenca = entrada.nextLine();
        automato.palavra = setenca.toCharArray();
        automato.Iniciar();
    }

    public void Iniciar() {
        cont = 0;
        A();
    }

    public void A() {
        if (cont < palavra.length) {
            if (palavra[cont] == 'a' ||palavra[cont] == 'b') {
                // System.out.println("alberto");
                cont++;
                qf1();
                B();
            }
       
        else {
                qerro();
            }
        
        }
         else {
            qerro();
    }
        

         }

    public void B() {

        if (cont < palavra.length) {
            if (palavra[cont] == 'a') {
                // System.out.println("soki");
                cont++;
                C();
            } else if (palavra[cont] == 'b') {
                qf2();
                D();
                // qf();
            }
       else {
                qerro();
            }
        
        }
        
        

    }

    public void C() {
        if (cont < palavra.length) {
            if (palavra[cont] == 'a') {
                cont++;
                C();
            } else if (palavra[cont] == 'b') {
                qf2();
                D();
            }

         else {
                qerro();
            }
        
        }
         else {
            qerro();
    }

    }

    public void D() {

        if (cont < palavra.length) {
            if (palavra[cont] == 'a') {
                // System.out.println("soki");
                cont++;
                qf3();
                E();
                
                // qf();
            } 
        }
       

    }

    public void E() {

        if (cont < palavra.length) {
            if (palavra[cont] == 'a') {
                // System.out.println("alberto");
                cont++;
                C();
            } else if (palavra[cont] == 'b') {
                //qf();
                C();
            }

         else {
                qerro();
            }
        
        }
         

    }

    public void qf1() {
        System.out.println("palavra aceite pelo automato");
    }public void qf2() {
        System.out.println("palavra aceite pelo automato");
    }
    public void qf3() {
        System.out.println("palavra aceite pelo automato");
    }
    

    public void qerro() {
        System.out.println("palavra regeitada pelo automato");
    }
}
