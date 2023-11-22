package ar.edu.unlam.practicaRecu2;

public class Pelicula {
	
	private Integer codigo;
	private String descripcion;
	private Integer duracion;
	private tipoDeSalasDeCine tipoSala;

	public Pelicula(Integer codigo, String descripcion, Integer duracion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.duracion = duracion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public tipoDeSalasDeCine getTipoSala() {
		return tipoSala;
	}

	public void setTipoSala(tipoDeSalasDeCine tipoSala) {
		this.tipoSala = tipoSala;
	}


}
