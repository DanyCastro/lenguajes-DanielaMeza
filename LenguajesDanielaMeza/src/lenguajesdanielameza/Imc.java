/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajesdanielameza;
public class Imc {
    float peso;
    float altura;
    
    public Imc (float p, float a){
        peso=p;
        altura=a;
        
    }
     
    public Imc(){
        peso=65f;
        altura=1.65f;
    }
    
    public Imc (float f){
        //Este codigo no tiene nada que ver con los constructores
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        //reasignamos
        b=(byte)i;
        l=i;
        s=(short)l;
        s=b;
        l=s;
        s=(short)l;
        s=(short)i;
        l=b;
        
        
        
    
    }
    public float calcular (){
float resultadoImc=peso/(altura*altura);
return resultadoImc;



if (resultadoImc <=20);
else System.out.println ("Te encuentras en la etapa de Anorexia");

if (resultadoImc <=20 && resultadoImc >=25)
else System.out.println ("Felicidades eres una persona Sana");

if ( resultadoImc >=25 & resultadoImc <=30);
else System.out.println ("Lo sentimos usted esta pasado de Tamales");

if ( resultadoImc >=30);
else System.out.println ("Usted es un Tinaco con Patas");


    }    
}
