 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_dannacasco;

/**
 *
 * @author Danna Casco
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Lab1P2_DannaCasco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException  {
    Scanner entrada = new Scanner(System.in);
    
    int opcion ;
    int discos = 0;
    String cad = "";
    int limite;
    
    
    do{
        System.out.println("");
        System.out.println("---Menu---");
        System.out.println("1.Torres de Hanoi");
        System.out.println("2.Buscar fecha");
        System.out.println("3.Valor de pi");
        System.out.println("4.SALIR");
        System.out.print("Ingrese una opcion : ");
        opcion = entrada.nextInt();
        
        
        switch(opcion){
            case 1:
                 System.out.print("Ingrese numero de discos: ");
                 discos = entrada.nextInt();
                 System.out.println("");
                 hanoi(discos,1,2,3);
                break;
            case 2:
                System.out.println("Ingrese cadena : ");
                entrada = new Scanner(System.in);
                cad = entrada.nextLine();
                fechas(cad);
                break;
            case 3:
                entrada = new Scanner(System.in);
                System.out.print("Ingrese limite: ");
                limite = entrada.nextInt();
                valorDePi(limite);
                break;
                
            case 4:
                System.out.println("que tenga buen dia :)");
                break;
            default:
                System.out.println("¡¡OPCION INVALIDA!!");
                break;
        }
    }while(opcion<4||opcion>4);   
    }
    
    
    public static void hanoi(int discos,int origen,int auxiliar,int destino){
        if(discos==1){
            System.out.println("mover disco "+discos+" de "+origen+" a "+destino); 
        }else{
            hanoi(discos-1,origen,destino,auxiliar);
            System.out.println("mover disco "+discos+" de "+origen+" a "+destino);
            hanoi(discos-1,auxiliar,origen,destino);
        }
       }
    
    public static void fechas(String cad) throws ParseException {
       String[] dats = cad.split(",");
       Date Fecha = null;
       
       DateFormat df=new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 0; i < dats.length; i++) {
            if(dats[i].contains("/")&&(dats[i].length()==10))
            Fecha = df.parse(dats[i]);
        }
     
        System.out.println("");
        System.out.println(Fecha);
    }
    
    public static double valorDePi(int limite){
       int sumatoria = 0; 
       if(limite == 0){
           return 4*sumatoria;
       }else{      
           sumatoria = (-1^limite)/(2*limite+1);
           limite--;
           return sumatoria+valorDePi( limite);
       }
    }
}
      
    
       

