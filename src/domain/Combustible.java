// default package
// Generated Feb 21, 2016 1:29:39 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Combustible generated by hbm2java
 */
public class Combustible implements java.io.Serializable {

	private short idCombustible;
	private String descripcion;
	private Set proveedorSucursals = new HashSet(0);
	private Set vehiculos = new HashSet(0);

	public Combustible() {
	}

	public Combustible(short idCombustible, String descripcion) {
		this.idCombustible = idCombustible;
		this.descripcion = descripcion;
	}

	public Combustible(short idCombustible, String descripcion,
			Set proveedorSucursals, Set vehiculos) {
		this.idCombustible = idCombustible;
		this.descripcion = descripcion;
		this.proveedorSucursals = proveedorSucursals;
		this.vehiculos = vehiculos;
	}

	public short getIdCombustible() {
		return this.idCombustible;
	}

	public void setIdCombustible(short idCombustible) {
		this.idCombustible = idCombustible;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set getProveedorSucursals() {
		return this.proveedorSucursals;
	}

	public void setProveedorSucursals(Set proveedorSucursals) {
		this.proveedorSucursals = proveedorSucursals;
	}

	public Set getVehiculos() {
		return this.vehiculos;
	}

	public void setVehiculos(Set vehiculos) {
		this.vehiculos = vehiculos;
	}

}
