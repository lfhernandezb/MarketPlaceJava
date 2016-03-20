package cl.dsoft.car.marketplace.domain;

// Generated Feb 28, 2016 2:15:19 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Proveedor.
 * @see cl.dsoft.car.marketplace.domain.Proveedor
 * @author Hibernate Tools
 */
@Stateless
public class ProveedorHome {

	private static final Log log = LogFactory.getLog(ProveedorHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Proveedor transientInstance) {
		log.debug("persisting Proveedor instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Proveedor persistentInstance) {
		log.debug("removing Proveedor instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Proveedor merge(Proveedor detachedInstance) {
		log.debug("merging Proveedor instance");
		try {
			Proveedor result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Proveedor findById(Integer id) {
		log.debug("getting Proveedor instance with id: " + id);
		try {
			Proveedor instance = entityManager.find(Proveedor.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
