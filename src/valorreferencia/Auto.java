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
public class Auto {
    private String color;
    public void setColor(String vColor){
        this.color = vColor;
    }
    public String getColor(){
        return this.color;
    }
    public Auto(String vColor){
        this.color = vColor;
    }
}
