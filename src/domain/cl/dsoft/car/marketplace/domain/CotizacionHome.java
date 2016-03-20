package cl.dsoft.car.marketplace.domain;

// Generated Feb 28, 2016 2:15:19 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Cotizacion.
 * @see cl.dsoft.car.marketplace.domain.Cotizacion
 * @author Hibernate Tools
 */
@Stateless
public class CotizacionHome {

	private static final Log log = LogFactory.getLog(CotizacionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Cotizacion transientInstance) {
		log.debug("persisting Cotizacion instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Cotizacion persistentInstance) {
		log.debug("removing Cotizacion instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Cotizacion merge(Cotizacion detachedInstance) {
		log.debug("merging Cotizacion instance");
		try {
			Cotizacion result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Cotizacion findById(Long id) {
		log.debug("getting Cotizacion instance with id: " + id);
		try {
			Cotizacion instance = entityManager.find(Cotizacion.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
