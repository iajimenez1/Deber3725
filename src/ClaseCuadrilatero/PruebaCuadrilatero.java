
package ClaseCuadrilatero;

public class PruebaCuadrilatero {

  
    public static void main(String[] args) {
        System.out.println("Calculo Del Perimetro Y Area De Un Cuadrado");
        Cuadrilatero C1= new Cuadrilatero ();
        C1.alt = 8;
        C1.bas = 23;
        C1.Datos();
        System.out.println("El Area es: "+C1.Area());
        System.out.println("El Perimetro es: "+C1.Perimetro());
    }
}
