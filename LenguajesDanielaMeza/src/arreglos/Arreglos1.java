/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

public class Arreglos1 {
    public static void main(String[] args) {
        int x=4;
        //Inicializacion Explicita
        int []y={7,-20,15};
        //Inicializacion Implicita
        int z[]=new int [4];
        String mensaje []= {"Hola","como","estas"};
        //System.out.println(z[2]);
        
        //Ciclo for para iterar los elementos del arreglo de String
        for (int i=0; i<mensaje.length; i++){
            System.out.println(mensaje[i]);
        } //Termina el ciclo for
    
    
    //Ciclon for mejorado
    
   for(String valor:mensaje){
            System.out.println(valor);
            if (valor.equals("como"))break;
            
}
    
    
}
}
