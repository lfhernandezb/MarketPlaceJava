package cl.dsoft.car.marketplace.domain;

// Generated Feb 28, 2016 2:15:19 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProveedorSucursal.
 * @see cl.dsoft.car.marketplace.domain.ProveedorSucursal
 * @author Hibernate Tools
 */
@Stateless
public class ProveedorSucursalHome {

	private static final Log log = LogFactory
			.getLog(ProveedorSucursalHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProveedorSucursal transientInstance) {
		log.debug("persisting ProveedorSucursal instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProveedorSucursal persistentInstance) {
		log.debug("removing ProveedorSucursal instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProveedorSucursal merge(ProveedorSucursal detachedInstance) {
		log.debug("merging ProveedorSucursal instance");
		try {
			ProveedorSucursal result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProveedorSucursal findById(Integer id) {
		log.debug("getting ProveedorSucursal instance with id: " + id);
		try {
			ProveedorSucursal instance = entityManager.find(
					ProveedorSucursal.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
