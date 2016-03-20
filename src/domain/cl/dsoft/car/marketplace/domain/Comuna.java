package cl.dsoft.car.marketplace.domain;

// Generated Feb 28, 2016 2:15:19 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Comuna generated by hbm2java
 */
@Entity
@Table(name = "comuna", catalog = "marketplace")
public class Comuna implements java.io.Serializable {

	private int idComuna;
	private Region region;
	private String descripcion;
	private Set proveedorSucursals = new HashSet(0);
	private Set cotizacions = new HashSet(0);
	private Set usuarios = new HashSet(0);

	public Comuna() {
	}

	public Comuna(int idComuna, Region region, String descripcion) {
		this.idComuna = idComuna;
		this.region = region;
		this.descripcion = descripcion;
	}

	public Comuna(int idComuna, Region region, String descripcion,
			Set proveedorSucursals, Set cotizacions, Set usuarios) {
		this.idComuna = idComuna;
		this.region = region;
		this.descripcion = descripcion;
		this.proveedorSucursals = proveedorSucursals;
		this.cotizacions = cotizacions;
		this.usuarios = usuarios;
	}

	@Id
	@Column(name = "id_comuna", unique = true, nullable = false)
	public int getIdComuna() {
		return this.idComuna;
	}

	public void setIdComuna(int idComuna) {
		this.idComuna = idComuna;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_region", nullable = false)
	public Region getRegion() {
		return this.region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Column(name = "descripcion", nullable = false, length = 128)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "comuna")
	public Set getProveedorSucursals() {
		return this.proveedorSucursals;
	}

	public void setProveedorSucursals(Set proveedorSucursals) {
		this.proveedorSucursals = proveedorSucursals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "comuna")
	public Set getCotizacions() {
		return this.cotizacions;
	}

	public void setCotizacions(Set cotizacions) {
		this.cotizacions = cotizacions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "comuna")
	public Set getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set usuarios) {
		this.usuarios = usuarios;
	}

}
