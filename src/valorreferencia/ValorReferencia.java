/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valorreferencia;

/**
 *
 * @author MaR
 */
public class ValorReferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tipos por valor
        int x = 5;
        sumar(x);
        System.out.println("El valor de x: "+x);
        //Tipos por referencia
        Auto a = new Auto("rojo");//el color del auto es rojo
        cambiarColor(a); //ejecutamos el método que lo cambia a verde
        System.out.println("El color del auto fuera del método es: "+a.getColor());
    }
    public static void sumar(int vNum){
        vNum += 2;
        System.out.println("Dentro del metodo sumar: "+vNum);
    }
    public static void cambiarColor(Auto rAuto){
        rAuto.setColor("verde");
    }
}
