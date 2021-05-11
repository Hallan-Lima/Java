/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroprograma;

import java.awt.Dimension;
import java.awt.Toolkit;
import static java.lang.System.gc;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

/**
 *
 * @author hlima
 */
public class PrimeiroPrograma {
    
    //psvm - comando para chamar o comando abaixo
    public static void main(String[] args) {
        
        /** Primeira aula
        *sout - comando para chamar o comando abaixo
        *System.out.println("ola mundo");
        */
        
        //--//
        
        /** Segunda aula
        *
        *Exibir a data atual do sistema operacional *
        Date relogio = new Date();
        System.out.print("A hora do sistema é: ");
        System.out.println(relogio);
        
        
        ** Exibir a resolução do sistema operacional *
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.print("Resolucao em = " + d.width);
        System.out.println(" X " + d.height);
        
        
        ** Exibir a linguagem do sistema operacional *
        Locale loc = Locale.getDefault();
        System.out.print ("Seu sistema operacional esta em = " + loc.getDisplayLanguage()); // imprime "Português"
        System.out.println ("-" + loc.getLanguage()); // imprime "pt"
        
        */
        
        //--//
        
        /** Terceira aula
        
        *float nota = 8.5f;
        * 
        * Exibir valor formatado 
        *System.out.printf("Valor e: %.2f", nota );
        
        
        **
        *Scanner teclado = new Scanner(System.in);   // ler oq esta sendo digitado
        *
        //inserir dados
        *System.out.println("Informe o seu nome? ");
        *String nome = teclado.nextLine();           //pegar os dados do teclado
        *
        //inserir os dados
        *System.out.println("Qual a nota? ");
        *float nota = teclado.nextFloat();           //pegar os dados do teclado
        *
        //saida das informações
        *System.out.format("O nome informado é %s e a nota é %.1f \n", nome, nota);
        
        
        // mudança de classes involucro
        *String valor = "30.5";
        *float idade = Float.parseFloat(valor);
        *System.out.printf("%.3f", idade);
        */
        
        //--//
        
        /* Quarta aula
        *Scanner teclado = new Scanner(System.in);
        *
        *System.out.println("informe um valor");
        *int n1 = teclado.nextInt();
        *
        *System.out.println("informe o segundo valor");
        *int n2 = teclado.nextInt();
        *
        *float m = (n1+n2)/2;
        *
        *System.out.format("A media é %.0f dos valores \n", m);
        */
        
        /*
        *Scanner teclado = new Scanner(System.in);
        *
        *System.out.println("Informe um valor");
        *int n1 = teclado.nextInt();
        *int valor = 4 + n1--;      // -- é para diminuir o valor apos fazer o calculo (o ++ agi da mesma forma)
        *
        *System.out.println("a soma ficou em " + valor);
        *System.out.printf("o valor do n1 ficou em " + n1);
        *
        *int n1 += 2;
        */
        
        /*
        *double ale = Math.random();
        *int n = (int) (0 + ale *(10-0)); //vai aparecer valores aleatorios de 0 a 10
        *System.out.println(n);
        */
        
        //--//
        
        /* Quinta aula
         *
         *      Operadores Logicos 
         *
         *int n1,n2,maior,menor;
         *String nome1,nome2, res;
         *Scanner teclado = new Scanner(System.in);
         *
         *System.out.println("informe um valor: ");
         *n1 = teclado.nextInt();
         *
         *System.out.println("Informe outro valor:");
         *n2 = teclado.nextInt();
         *
         *maior = (n1>n2)? n1:n2;
         *menor = (n1<n2)? n1:n2;
         *
         *   System.out.printf("O valor maior é " + maior);
         *   System.out.printf("\n O valor menor é " + menor);
         *   
         *System.out.println("\n Informe seu nome: ");
         *nome1 = teclado.next();
         *
         *   System.out.println("vc escreveu: " + nome1);
         *
         *System.out.println("escreva seu sobre nome " + nome1);
         *nome2 = teclado.next();
         *
         *res = (nome1.equals(nome2))?"é igual":"Diferente";
         *System.out.format("seu nome é %s %s \n",nome1,nome2);
         *System.out.format(" seu sobre nome é %s do seu primeiro nome",res);
         */
        
        /*
        *int x,y,z;
        *boolean r;
        *
        *Scanner teclado = new Scanner(System.in);        
        *
        *System.out.println("Informe um valor");
        *x = teclado.nextInt();
        *
        *System.out.println("Informe outro valor");
        *y = teclado.nextInt();
        * 
        *System.out.println("O ultimo valor");
        *z = teclado.nextInt();
        *
        //  || esse item siginica ou
        //  ^ ou exclusivo
        //  ! negativando
        *r = (x<y && y==z)? true:false; // Ambos devem ser iguais, sendo que o x<y da falso então ja deixa tudo falso
        *System.out.format("Os valores que foram informados são %s enrelação a comparação (x<y && y==z)", r);
        */
        
        /* comando para pegar o ano atual
        Calendar cal = GregorianCalendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        */
        
        //--//
        /* Oitava aula */
     
        /*testando case e while
        int cc = 1;
        int c = 0;
        
        
        do{
            cc++;
            c++;
            System.out.println("tes");
            
           switch(c){
                case 1:
                    System.out.println("quest1");
                    break;
            
            
            };
        }while (cc<5);
          
        System.out.println("morreu");
        */



}}

