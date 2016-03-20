package cl.dsoft.car.marketplace.domain;

// Generated Feb 28, 2016 2:15:19 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class EstadoProveedor.
 * @see cl.dsoft.car.marketplace.domain.EstadoProveedor
 * @author Hibernate Tools
 */
@Stateless
public class EstadoProveedorHome {

	private static final Log log = LogFactory.getLog(EstadoProveedorHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(EstadoProveedor transientInstance) {
		log.debug("persisting EstadoProveedor instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(EstadoProveedor persistentInstance) {
		log.debug("removing EstadoProveedor instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public EstadoProveedor merge(EstadoProveedor detachedInstance) {
		log.debug("merging EstadoProveedor instance");
		try {
			EstadoProveedor result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EstadoProveedor findById(short id) {
		log.debug("getting EstadoProveedor instance with id: " + id);
		try {
			EstadoProveedor instance = entityManager.find(
					EstadoProveedor.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
