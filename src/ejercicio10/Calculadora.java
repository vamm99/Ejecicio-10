/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author ASUS
 */
public class Calculadora {

    private int numero1;
    private int numero2;
    private int operacion;
    private int resultado;

    public Calculadora() {
        this.operacion = 0;
        this.resultado = 0;
        this.numero1 = 0;
        this.numero2 = 0;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getOperacion() {
        return operacion;
    }

    public void setOperacion(int operacion) {
        this.operacion = operacion;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void calcular() {
        switch (this.getOperacion()) {
            case 1:
                this.setResultado(this.getNumero1() + this.getNumero2());
                System.out.println("La suma es: " + this.getResultado());
                break;
            case 2:
                this.setResultado(this.getNumero1() - this.getNumero2());
                System.out.println("La resta es: " + this.getResultado());
                break;
            case 3:
                this.setResultado(this.getNumero1() * this.getNumero2());
                System.out.println("La multiplicación es: " + this.getResultado());
                break;
            case 4:
                if (this.getNumero2() != 0) {
                    this.setResultado(this.getNumero1() / this.getNumero2());
                    System.out.println("La división es: " + this.getResultado());
                }else{
                    System.out.println("Error: No se puede dividir entre cero");
                }
                break;
                
            default:
                break;
        }
    }
}
