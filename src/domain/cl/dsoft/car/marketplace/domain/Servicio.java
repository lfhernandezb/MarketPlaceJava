package cl.dsoft.car.marketplace.domain;

// Generated Feb 28, 2016 2:15:19 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Servicio generated by hbm2java
 */
@Entity
@Table(name = "servicio", catalog = "marketplace")
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

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_servicio", unique = true, nullable = false)
	public Integer getIdServicio() {
		return this.idServicio;
	}

	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}

	@Column(name = "descripcion", nullable = false, length = 128)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "servicio")
	public Set getCotizacions() {
		return this.cotizacions;
	}

	public void setCotizacions(Set cotizacions) {
		this.cotizacions = cotizacions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "servicio")
	public Set getProveedorSucursalServicios() {
		return this.proveedorSucursalServicios;
	}

	public void setProveedorSucursalServicios(Set proveedorSucursalServicios) {
		this.proveedorSucursalServicios = proveedorSucursalServicios;
	}

}
