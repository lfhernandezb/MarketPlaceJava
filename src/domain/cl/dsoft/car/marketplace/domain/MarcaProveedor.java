package cl.dsoft.car.marketplace.domain;

// Generated Feb 28, 2016 2:15:19 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * MarcaProveedor generated by hbm2java
 */
@Entity
@Table(name = "marca_proveedor", catalog = "marketplace")
public class MarcaProveedor implements java.io.Serializable {

	private int idMarcaProveedor;
	private Marca marca;
	private Proveedor proveedor;
	private boolean certificado;

	public MarcaProveedor() {
	}

	public MarcaProveedor(int idMarcaProveedor, Marca marca,
			Proveedor proveedor, boolean certificado) {
		this.idMarcaProveedor = idMarcaProveedor;
		this.marca = marca;
		this.proveedor = proveedor;
		this.certificado = certificado;
	}

	@Id
	@Column(name = "id_marca_proveedor", unique = true, nullable = false)
	public int getIdMarcaProveedor() {
		return this.idMarcaProveedor;
	}

	public void setIdMarcaProveedor(int idMarcaProveedor) {
		this.idMarcaProveedor = idMarcaProveedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_marca", nullable = false)
	public Marca getMarca() {
		return this.marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_proveedor", nullable = false)
	public Proveedor getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@Column(name = "certificado", nullable = false)
	public boolean isCertificado() {
		return this.certificado;
	}

	public void setCertificado(boolean certificado) {
		this.certificado = certificado;
	}

}
