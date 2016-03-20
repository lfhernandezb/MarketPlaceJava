// default package
// Generated Feb 21, 2016 1:29:39 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * MedioPago generated by hbm2java
 */
public class MedioPago implements java.io.Serializable {

	private short idMedioPago;
	private String descripcion;
	private Set facturas = new HashSet(0);

	public MedioPago() {
	}

	public MedioPago(short idMedioPago, String descripcion) {
		this.idMedioPago = idMedioPago;
		this.descripcion = descripcion;
	}

	public MedioPago(short idMedioPago, String descripcion, Set facturas) {
		this.idMedioPago = idMedioPago;
		this.descripcion = descripcion;
		this.facturas = facturas;
	}

	public short getIdMedioPago() {
		return this.idMedioPago;
	}

	public void setIdMedioPago(short idMedioPago) {
		this.idMedioPago = idMedioPago;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set getFacturas() {
		return this.facturas;
	}

	public void setFacturas(Set facturas) {
		this.facturas = facturas;
	}

}