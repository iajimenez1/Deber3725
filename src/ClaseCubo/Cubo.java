
package ClaseCubo;


public class Cubo {
    int ancho;
    int alto;
    int profundo;

    public Cubo() {
    }
    
    public Cubo(int anch, int alt, int prof) {
        this.ancho = anch;
        this.alto = alt;
        this.profundo = prof;
    }

  
    public int volumen(){
        int vol;
        vol=this.alto*this.ancho*this.profundo;
        return vol;
    }
    
}
