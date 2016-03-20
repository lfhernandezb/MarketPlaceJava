package cl.dsoft.car.marketplace.domain;

// Generated Feb 28, 2016 2:15:19 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class OfertaCotizacion.
 * @see cl.dsoft.car.marketplace.domain.OfertaCotizacion
 * @author Hibernate Tools
 */
@Stateless
public class OfertaCotizacionHome {

	private static final Log log = LogFactory
			.getLog(OfertaCotizacionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(OfertaCotizacion transientInstance) {
		log.debug("persisting OfertaCotizacion instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(OfertaCotizacion persistentInstance) {
		log.debug("removing OfertaCotizacion instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public OfertaCotizacion merge(OfertaCotizacion detachedInstance) {
		log.debug("merging OfertaCotizacion instance");
		try {
			OfertaCotizacion result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public OfertaCotizacion findById(Long id) {
		log.debug("getting OfertaCotizacion instance with id: " + id);
		try {
			OfertaCotizacion instance = entityManager.find(
					OfertaCotizacion.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
