
package carpintero;




public class Escritorio {
    
   private int lon;
   private int madera;
   private int ancho;
   private int cantca;
   private int caj=300;
   private int precio=2000;
   private int pcajon;
 

   
//Constructor 
 public Escritorio(int lon,int ancho,int cantca,int madera)
 {
 this.lon = lon;
 this.ancho = ancho;
 this.cantca=cantca;
 this.madera=madera;
 
 }

    public void setLon(int lon) {
        this.lon = lon;
    }

    public void setMadera(int madera) {
        this.madera = madera;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setCantca(int cantca) {
        this.cantca = cantca;
    }
 
 
 public double CalcularPrecio()
 {
 double total=precio;
 int tsup=lon*ancho;
 if(tsup>4000)
 {
 total=total+50;
 }
 total=total+cantca*caj;
 if(madera==1)
 {
 total=total+1500;
 }
 else if(madera==2)
 {
 total=total+1250;
 
 }
 


return total;

 }
}
