package ar.edu.unlam.practicaRecu2;

import java.util.List;

public class SalaTienda extends Sala implements iTienda {

	
	List<Venta> ventas;
	public SalaTienda(String nombre) {
		super(nombre);

	}
	@Override
	public void registrarVenta(Venta venta) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Double obtenerTotalDeVenta() {
		// TODO Auto-generated method stub
		return null;
	}

}
