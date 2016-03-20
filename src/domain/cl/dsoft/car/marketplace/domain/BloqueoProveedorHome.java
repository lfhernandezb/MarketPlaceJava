package cl.dsoft.car.marketplace.domain;

// Generated Feb 28, 2016 2:15:19 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class BloqueoProveedor.
 * @see cl.dsoft.car.marketplace.domain.BloqueoProveedor
 * @author Hibernate Tools
 */
@Stateless
public class BloqueoProveedorHome {

	private static final Log log = LogFactory
			.getLog(BloqueoProveedorHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(BloqueoProveedor transientInstance) {
		log.debug("persisting BloqueoProveedor instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(BloqueoProveedor persistentInstance) {
		log.debug("removing BloqueoProveedor instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public BloqueoProveedor merge(BloqueoProveedor detachedInstance) {
		log.debug("merging BloqueoProveedor instance");
		try {
			BloqueoProveedor result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BloqueoProveedor findById(short id) {
		log.debug("getting BloqueoProveedor instance with id: " + id);
		try {
			BloqueoProveedor instance = entityManager.find(
					BloqueoProveedor.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
