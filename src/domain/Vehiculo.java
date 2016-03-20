// default package
// Generated Feb 21, 2016 1:29:39 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Vehiculo generated by hbm2java
 */
public class Vehiculo implements java.io.Serializable {

	private Long idVehiculo;
	private Traccion traccion;
	private Combustible combustible;
	private Modelo modelo;
	private Usuario usuario;
	private TipoTransmision tipoTransmision;
	private String patente;
	private Short anio;
	private Boolean aireAcondicionado;
	private Boolean alzaVidrios;
	private Set cotizacions = new HashSet(0);

	public Vehiculo() {
	}

	public Vehiculo(Traccion traccion, Combustible combustible, Modelo modelo,
			Usuario usuario, TipoTransmision tipoTransmision) {
		this.traccion = traccion;
		this.combustible = combustible;
		this.modelo = modelo;
		this.usuario = usuario;
		this.tipoTransmision = tipoTransmision;
	}

	public Vehiculo(Traccion traccion, Combustible combustible, Modelo modelo,
			Usuario usuario, TipoTransmision tipoTransmision, String patente,
			Short anio, Boolean aireAcondicionado, Boolean alzaVidrios,
			Set cotizacions) {
		this.traccion = traccion;
		this.combustible = combustible;
		this.modelo = modelo;
		this.usuario = usuario;
		this.tipoTransmision = tipoTransmision;
		this.patente = patente;
		this.anio = anio;
		this.aireAcondicionado = aireAcondicionado;
		this.alzaVidrios = alzaVidrios;
		this.cotizacions = cotizacions;
	}

	public Long getIdVehiculo() {
		return this.idVehiculo;
	}

	public void setIdVehiculo(Long idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public Traccion getTraccion() {
		return this.traccion;
	}

	public void setTraccion(Traccion traccion) {
		this.traccion = traccion;
	}

	public Combustible getCombustible() {
		return this.combustible;
	}

	public void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}

	public Modelo getModelo() {
		return this.modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public TipoTransmision getTipoTransmision() {
		return this.tipoTransmision;
	}

	public void setTipoTransmision(TipoTransmision tipoTransmision) {
		this.tipoTransmision = tipoTransmision;
	}

	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Short getAnio() {
		return this.anio;
	}

	public void setAnio(Short anio) {
		this.anio = anio;
	}

	public Boolean getAireAcondicionado() {
		return this.aireAcondicionado;
	}

	public void setAireAcondicionado(Boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}

	public Boolean getAlzaVidrios() {
		return this.alzaVidrios;
	}

	public void setAlzaVidrios(Boolean alzaVidrios) {
		this.alzaVidrios = alzaVidrios;
	}

	public Set getCotizacions() {
		return this.cotizacions;
	}

	public void setCotizacions(Set cotizacions) {
		this.cotizacions = cotizacions;
	}

}