
package ejecutarfabrica;


public class FabricaSilla extends Fabrica {

	@Override
	public Ensamblaje crearMueble() {
		// TODO Auto-generated method stub
		return new Silla();
	}
}


