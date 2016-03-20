// default package
// Generated Feb 21, 2016 1:29:39 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cotizacion generated by hbm2java
 */
public class Cotizacion implements java.io.Serializable {

	private Long idCotizacion;
	private Comuna comuna;
	private Servicio servicio;
	private Vehiculo vehiculo;
	private String descripcion;
	private Date fechaCreacion;
	private Date fechaModificacion;
	private Set ofertaCotizacions = new HashSet(0);
	private Set adjudicacions = new HashSet(0);

	public Cotizacion() {
	}

	public Cotizacion(Comuna comuna, Servicio servicio, Vehiculo vehiculo,
			Date fechaCreacion, Date fechaModificacion) {
		this.comuna = comuna;
		this.servicio = servicio;
		this.vehiculo = vehiculo;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
	}

	public Cotizacion(Comuna comuna, Servicio servicio, Vehiculo vehiculo,
			String descripcion, Date fechaCreacion, Date fechaModificacion,
			Set ofertaCotizacions, Set adjudicacions) {
		this.comuna = comuna;
		this.servicio = servicio;
		this.vehiculo = vehiculo;
		this.descripcion = descripcion;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.ofertaCotizacions = ofertaCotizacions;
		this.adjudicacions = adjudicacions;
	}

	public Long getIdCotizacion() {
		return this.idCotizacion;
	}

	public void setIdCotizacion(Long idCotizacion) {
		this.idCotizacion = idCotizacion;
	}

	public Comuna getComuna() {
		return this.comuna;
	}

	public void setComuna(Comuna comuna) {
		this.comuna = comuna;
	}

	public Servicio getServicio() {
		return this.servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Vehiculo getVehiculo() {
		return this.vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Set getOfertaCotizacions() {
		return this.ofertaCotizacions;
	}

	public void setOfertaCotizacions(Set ofertaCotizacions) {
		this.ofertaCotizacions = ofertaCotizacions;
	}

	public Set getAdjudicacions() {
		return this.adjudicacions;
	}

	public void setAdjudicacions(Set adjudicacions) {
		this.adjudicacions = adjudicacions;
	}

}
