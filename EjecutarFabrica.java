
package ejecutarfabrica;


public class EjecutarFabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Fabrica fabrica;
            fabrica = new FabricaSilla();
            Ensamblaje silla = fabrica.crearMueble();
            silla.ensamblar();
            fabrica = new FabricaSilla();
            Ensamblaje mesa = fabrica.crearMueble();
            mesa.ensamblar();

        }
        }
        

