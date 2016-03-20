// default package
// Generated Feb 21, 2016 1:29:39 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Servicio generated by hbm2java
 */
public class Servicio implements java.io.Serializable {

	private Integer idServicio;
	private String descripcion;
	private Set cotizacions = new HashSet(0);
	private Set proveedorSucursalServicios = new HashSet(0);

	public Servicio() {
	}

	public Servicio(String descripcion) {
		this.descripcion = descripcion;
	}

	public Servicio(String descripcion, Set cotizacions,
			Set proveedorSucursalServicios) {
		this.descripcion = descripcion;
		this.cotizacions = cotizacions;
		this.proveedorSucursalServicios = proveedorSucursalServicios;
	}

	public Integer getIdServicio() {
		return this.idServicio;
	}

	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set getCotizacions() {
		return this.cotizacions;
	}

	public void setCotizacions(Set cotizacions) {
		this.cotizacions = cotizacions;
	}

	public Set getProveedorSucursalServicios() {
		return this.proveedorSucursalServicios;
	}

	public void setProveedorSucursalServicios(Set proveedorSucursalServicios) {
		this.proveedorSucursalServicios = proveedorSucursalServicios;
	}

}