
import java.io.Serializable;



public class Platillos implements Serializable{
    String NOorden, alimento ,Mesa;
    String fecha;

    public Platillos() {
    }
    public Platillos(String or, String Orden, String Mesa, String fecha) {
        this.NOorden = or;
        this.alimento = Orden;
        this.Mesa = Mesa;
        this.fecha = fecha;
    }
    public Object[] toArray(){
      return new Object []{NOorden, alimento, Mesa, fecha};
    }
    @Override
    public String toString() {
        return  "<html>" + NOorden + "<br>" + alimento + "<br>" + Mesa + "<br>" + fecha + "</hmlt>";
    }
    
    
}
