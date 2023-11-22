package ar.edu.unlam.practicaRecu2;

public class PeliculaExistenteExeption extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PeliculaExistenteExeption(String mensaje) {
        super(mensaje);
    }
}
