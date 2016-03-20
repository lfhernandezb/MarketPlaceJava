// default package
// Generated Feb 21, 2016 1:29:39 PM by Hibernate Tools 3.4.0.CR1

/**
 * ProveedorSucursalServicio generated by hbm2java
 */
public class ProveedorSucursalServicio implements java.io.Serializable {

	private Long idProveedorSucursalServicio;
	private ProveedorSucursal proveedorSucursal;
	private Servicio servicio;
	private TipoVehiculo tipoVehiculo;

	public ProveedorSucursalServicio() {
	}

	public ProveedorSucursalServicio(ProveedorSucursal proveedorSucursal,
			Servicio servicio, TipoVehiculo tipoVehiculo) {
		this.proveedorSucursal = proveedorSucursal;
		this.servicio = servicio;
		this.tipoVehiculo = tipoVehiculo;
	}

	public Long getIdProveedorSucursalServicio() {
		return this.idProveedorSucursalServicio;
	}

	public void setIdProveedorSucursalServicio(Long idProveedorSucursalServicio) {
		this.idProveedorSucursalServicio = idProveedorSucursalServicio;
	}

	public ProveedorSucursal getProveedorSucursal() {
		return this.proveedorSucursal;
	}

	public void setProveedorSucursal(ProveedorSucursal proveedorSucursal) {
		this.proveedorSucursal = proveedorSucursal;
	}

	public Servicio getServicio() {
		return this.servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public TipoVehiculo getTipoVehiculo() {
		return this.tipoVehiculo;
	}

	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

}