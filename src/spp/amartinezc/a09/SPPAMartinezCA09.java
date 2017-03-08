/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.amartinezc.a09;
import java.util.Scanner;
/**
 *
 * @author andres
 */
public class SPPAMartinezCA09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        System.out.println("Sumador de 2 matrices");
    int[][] A, B, R = null;
    int n, m;
    try{
        
        n=solicitardato("Introduce el ancho de las matrices");
        m=solicitardato("Introduce el largo de las matrices");
    
        A=matriz(n,m,"A");
        B=matriz(n,m,"B");
        
        suma(n,m,A,B);
    }catch (Exception ex) {
            
        }
    
    }
    public static int[][] matriz(int largo,int ancho,String nombre){
        int[][] matriz= new int[largo][ancho];
        Scanner kb= new Scanner(System.in);
            System.out.println("introducir valores de la matriz "+nombre);
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++){ 
                        matriz[i][j]= solicitarentero();
                        
                        
     }
                   
  }
        return matriz;
}

   public static int solicitarentero(){
        Scanner kb= new Scanner(System.in);
        boolean flag;
        int n=0;
        do{
        try{
            n=kb.nextInt();
            flag=false;
            
        }catch (Exception ex) {
            System.out.println("Vuelve a intentarlo");
            flag=true;
            kb.next();
        }
    }while(flag);
    return n;
 }
   public static void suma(int largo, int ancho, int[][]A, int[][]B){
       int[][] R= new int[largo][ancho];
       System.out.println("Suma de las matrices A y B: \t");
       for (int i = 0; i < R.length; i++){
            for (int j = 0; j < R[i].length; j++){ 
                R[i][j]= A[i][j]+B[i][j];
                
                System.out.print(R[i][j]+" ");
     }
           System.out.println("");
  }
      
   }   
   public static int solicitardato(String x){
       Scanner kb= new Scanner(System.in);
       int numero=0;
       boolean flag;
       do{
       System.out.println(x);
            try{
                numero=kb.nextInt();
                flag=true;
            } catch(Exception ex){
                flag=false;
                System.out.println("Dato no válido"+ex);
                kb.nextLine();
                  
            }
        }while(flag==false);
        return numero;
    } 
       
   }


