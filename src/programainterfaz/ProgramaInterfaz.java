
package programainterfaz;

public class ProgramaInterfaz{
	public static void main(String arg[]) { 
        Persona pavaroti = new Persona(); 
        pavaroti.cantar(); 
       
        Canario piolin = new Canario(); 
        piolin.cantar(); 
        
        Burro ASNO = new Burro();
        ASNO.cantar();
    } 
    public static void hacerCantar(PuedeCantar cantor) { 
        cantor.cantar(); 
    } 
}
/*
5.Explique brevemente como se hace el llamado de la interfaz 
e implementadoras en la clase aplicación:
•Primero que todo para llamar una clase implementadora toca crear un objeto y 
dentro de ese objeto se llama el método que viene dentro de la clase interfaz, 
ya que este método puede llamarse en las diferentes clases por tener distintas instrucciones.

*/
