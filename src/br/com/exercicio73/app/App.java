package br.com.exercicio73.app;
import java.util.*;
public class App {

   public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);

     int populacao, filhos, total_filhos=0, i, y=1; 
     double sal, total_sal=0, media_sal, media_filhos, maior_sal=0, perc_sal = 0;
     
     System.out.println("Qual a populacao da cidade: ");
     populacao = scan.nextInt();
     
     for(i=1;i<=populacao;i++){
     
     System.out.println ("Informe seu salário: ");
     sal = scan.nextDouble();

     System.out.println ("Informe quantos filhos você tem: ");
     filhos = scan.nextInt();

     total_sal = sal + total_sal;

     total_filhos = total_filhos + filhos;
           
     
               if(maior_sal < sal){

               maior_sal = sal;

               }

               if(sal <= 150){

               perc_sal = (y * 100) / populacao;

               y++;

               }

     }

     /* Media dos salarios */

     media_sal = total_sal / populacao;

     /* Media dos filhos */

     media_filhos = total_filhos / populacao;

   
     System.out.println ("A media salarial da populacao é R$ "+ media_sal);

     System.out.println ("A media de filhos por habitante é "+ media_filhos);

     System.out.println (maior_sal+" é o maior salário entre a população");

     System.out.println (perc_sal+"% das pessoas ganham até R$150.");

     

  }          

}  