// default package
// Generated Feb 21, 2016 1:29:39 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Adjudicacion generated by hbm2java
 */
public class Adjudicacion implements java.io.Serializable {

	private Long idAdjudicacion;
	private OfertaCotizacion ofertaCotizacion;
	private Cotizacion cotizacion;
	private Date fechaCreacion;
	private Date fechaModificacion;
	private String comentarios;

	public Adjudicacion() {
	}

	public Adjudicacion(OfertaCotizacion ofertaCotizacion,
			Cotizacion cotizacion, Date fechaCreacion, Date fechaModificacion) {
		this.ofertaCotizacion = ofertaCotizacion;
		this.cotizacion = cotizacion;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
	}

	public Adjudicacion(OfertaCotizacion ofertaCotizacion,
			Cotizacion cotizacion, Date fechaCreacion, Date fechaModificacion,
			String comentarios) {
		this.ofertaCotizacion = ofertaCotizacion;
		this.cotizacion = cotizacion;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.comentarios = comentarios;
	}

	public Long getIdAdjudicacion() {
		return this.idAdjudicacion;
	}

	public void setIdAdjudicacion(Long idAdjudicacion) {
		this.idAdjudicacion = idAdjudicacion;
	}

	public OfertaCotizacion getOfertaCotizacion() {
		return this.ofertaCotizacion;
	}

	public void setOfertaCotizacion(OfertaCotizacion ofertaCotizacion) {
		this.ofertaCotizacion = ofertaCotizacion;
	}

	public Cotizacion getCotizacion() {
		return this.cotizacion;
	}

	public void setCotizacion(Cotizacion cotizacion) {
		this.cotizacion = cotizacion;
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

	public String getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

}