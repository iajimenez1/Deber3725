
package ClaseCuadrilatero;


public class Cuadrilatero {
    int alt;
    int bas;
    public void Datos(){
        System.out.println("La Altura es: "+this.alt);
        System.out.println("El Ancho es: "+this.bas);
    }
    public int Area(){
        int resularea;
        resularea = alt*bas;
        return resularea;
    }
    public int Perimetro(){
        int resulperi;
        resulperi = alt+alt+bas+bas;
        return resulperi;
    }
}
