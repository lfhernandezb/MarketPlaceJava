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
 * Factura generated by hbm2java
 */
@Entity
@Table(name = "factura", catalog = "marketplace")
public class Factura implements java.io.Serializable {

	private int folio;
	private MedioPago medioPago;
	private Proveedor proveedor;
	private String numeroTx;
	private String detallePago;
	private Boolean pagada;

	public Factura() {
	}

	public Factura(int folio, MedioPago medioPago, Proveedor proveedor) {
		this.folio = folio;
		this.medioPago = medioPago;
		this.proveedor = proveedor;
	}

	public Factura(int folio, MedioPago medioPago, Proveedor proveedor,
			String numeroTx, String detallePago, Boolean pagada) {
		this.folio = folio;
		this.medioPago = medioPago;
		this.proveedor = proveedor;
		this.numeroTx = numeroTx;
		this.detallePago = detallePago;
		this.pagada = pagada;
	}

	@Id
	@Column(name = "folio", unique = true, nullable = false)
	public int getFolio() {
		return this.folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_medio_pago", nullable = false)
	public MedioPago getMedioPago() {
		return this.medioPago;
	}

	public void setMedioPago(MedioPago medioPago) {
		this.medioPago = medioPago;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_proveedor", nullable = false)
	public Proveedor getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@Column(name = "numero_tx", length = 32)
	public String getNumeroTx() {
		return this.numeroTx;
	}

	public void setNumeroTx(String numeroTx) {
		this.numeroTx = numeroTx;
	}

	@Column(name = "detalle_pago", length = 256)
	public String getDetallePago() {
		return this.detallePago;
	}

	public void setDetallePago(String detallePago) {
		this.detallePago = detallePago;
	}

	@Column(name = "pagada")
	public Boolean getPagada() {
		return this.pagada;
	}

	public void setPagada(Boolean pagada) {
		this.pagada = pagada;
	}

}
