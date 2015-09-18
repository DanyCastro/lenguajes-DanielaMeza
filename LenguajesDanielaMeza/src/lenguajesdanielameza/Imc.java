/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajesdanielameza;
public class Imc {
    float peso;
    float altura;
    
    public Imc(){
        peso=65f;
        altura=1.65f;
    }
    
    public float calcular (){
float resultadoImc=peso/(altura*altura);
return resultadoImc;
    }    
}
