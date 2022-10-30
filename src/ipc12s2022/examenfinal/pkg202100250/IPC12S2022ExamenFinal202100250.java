
package ipc12s2022.examenfinal.pkg202100250;

import java.util.Scanner;


public class IPC12S2022ExamenFinal202100250 {

  
    public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion,opcionn = 0;
        int num1, num2;
       while(!salir){
            
           System.out.println("1. EJERCICIO 1");
           System.out.println("2. EJERCICIO 2");
           System.out.println("3. EJERCICIO 3");
           System.out.println("4. Salir");
            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
            
           switch(opcion){
               case 1:
                   System.out.println("EJERCICIO 1: EL MAYOR DE 2 NUMEROS \n");
                   System.out.println("INGRESE PRIMER DIGITO");
                   num1 = sn.nextInt();
                   System.out.println("INGRESE SEGUNDO DIGITO");
                   num2 = sn.nextInt();
                   
                   if (num1 == num2){
                    System.out.println("SON NUMEROS IGUALES");
                   }else if(num1 >num2){
                       System.out.println("EL NUMERO MAYOR ES : [" +num1 +"]");
                   }else{
                   System.out.println("EL NUMERO MAYOR ES : [" +num2 +"]");
                   }
     
                   break;
               case 2:
                    System.out.println("EJERCICIO 2: PIRAMIDE DE NUMEROS IMPARES \n");
                   int ancho;
                  Scanner sc = new Scanner(System.in);
                  System.out.print("DIGITE LA BASE DEL TRIANGULO:");
                  ancho = sc.nextInt();
                  if(ancho %2 == 0 ){
                  System.out.println("\nNO PUEDE INGRESAR NUMEROS IMPARES \n"); ;}else{
                  
                  Ejercicio2(ancho);
                  }
                   break;
                case 3:   
                
                       
                   System.out.println("EL NUMERO DE LITROS PARA LAS 8 MEJORES VACAS ES : ");         
                         
                    ochovacas();
                    System.out.println("EL NUMERO DE LITROS PARA LAS 10 MEJORES VACAS ES : ");        
                    diezvacas();
                 
                    
                   break;
                case 4:
                   salir=true;
                   break;
                default:
                   System.out.println("INGRESAR DIGITOS ENTRE 1 Y 4\n\n");
           } 
       }
    }
   
    
     public static void Ejercicio2(int anch) {
        int aste = 1;
        int espacios = anch - 1;
        for (int fila = 0; fila < anch; fila++) {
            for (int columnaEspacios = 0; columnaEspacios < espacios; columnaEspacios++)  {
                System.out.print(" ");
            }
            for (int columnaAsteriscos = 0; columnaAsteriscos < aste; columnaAsteriscos++) {
                System.out.print(" *");
            }
            System.out.println();
            aste ++;
            espacios --;
        }
    }

    public static void ochovacas(){
  
    int Pmax = 1000;
    int [] Pvacas = {223,243,100,200,200,155,300,150};
    int [] Producc = {30,34,28,45,21,50,29,1};
    
    for (int i= 0; i<Producc.length; i++){
        for (int j = 0; j < Producc.length -1; j++){
            if(Producc [i]>j+1){
                int temp = Producc[j];
                Producc[j] = Producc[j+1];
                Producc [j+1] = temp;
                int temporal = Pvacas[j];
                Pvacas[i] = Pvacas [j+1];
                Pvacas[j+1] = temporal;
            }
        }
    }
    int Speso = 0;
    int sumali = 0;
    for(int j =Producc.length -1; j >=0; j--){
    Speso = Speso + Pvacas[j];
    sumali = sumali + Producc[j];
    if(Speso > Pmax){
        Speso = Speso - Pvacas[j];
        sumali = sumali - Producc[j];
        break;
    }
    }
    System.out.println("\nLOS LITROS CON LA CARGA MAXIMA ES : ["+sumali+ "] \n");
    }
    
      public static void diezvacas(){
   
    int Pmax = 2000;
    int [] Pvacas = {340,355,223,243,130,240,260,155,302,130};
    int [] Producc = {45,50,34,39,29,40,30,52,31,1};
    
    for (int i= 0; i<Producc.length; i++){
        for (int j = 0; j < Producc.length -1; j++){
            if(Producc [i]>j+1){
                int temp = Producc[j];
                Producc[j] = Producc[j+1];
                Producc [j+1] = temp;
                int temporal = Pvacas[j];
                Pvacas[i] = Pvacas [j+1];
                Pvacas[j+1] = temporal;
            }
        }
    }
    int Speso = 0;
    int sumali = 0;
    for(int j =Producc.length -1; j >=0; j--){
    Speso = Speso + Pvacas[j];
    sumali = sumali + Producc[j];
    if(Speso > Pmax){
        Speso = Speso - Pvacas[j];
        sumali = sumali - Producc[j];
        break;
    }
    }
    System.out.println("\nLOS LITROS CON LA CARGA MAXIMA ES : ["+sumali+ "] \n");
    }  
    
    
    
}
