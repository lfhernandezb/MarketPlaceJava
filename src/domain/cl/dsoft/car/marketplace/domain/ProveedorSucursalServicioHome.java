package cl.dsoft.car.marketplace.domain;

// Generated Feb 28, 2016 2:15:19 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProveedorSucursalServicio.
 * @see cl.dsoft.car.marketplace.domain.ProveedorSucursalServicio
 * @author Hibernate Tools
 */
@Stateless
public class ProveedorSucursalServicioHome {

	private static final Log log = LogFactory
			.getLog(ProveedorSucursalServicioHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProveedorSucursalServicio transientInstance) {
		log.debug("persisting ProveedorSucursalServicio instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProveedorSucursalServicio persistentInstance) {
		log.debug("removing ProveedorSucursalServicio instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProveedorSucursalServicio merge(
			ProveedorSucursalServicio detachedInstance) {
		log.debug("merging ProveedorSucursalServicio instance");
		try {
			ProveedorSucursalServicio result = entityManager
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProveedorSucursalServicio findById(Long id) {
		log.debug("getting ProveedorSucursalServicio instance with id: " + id);
		try {
			ProveedorSucursalServicio instance = entityManager.find(
					ProveedorSucursalServicio.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
