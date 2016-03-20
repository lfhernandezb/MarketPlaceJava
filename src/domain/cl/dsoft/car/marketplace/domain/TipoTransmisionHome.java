package cl.dsoft.car.marketplace.domain;

// Generated Feb 28, 2016 2:15:19 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TipoTransmision.
 * @see cl.dsoft.car.marketplace.domain.TipoTransmision
 * @author Hibernate Tools
 */
@Stateless
public class TipoTransmisionHome {

	private static final Log log = LogFactory.getLog(TipoTransmisionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TipoTransmision transientInstance) {
		log.debug("persisting TipoTransmision instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TipoTransmision persistentInstance) {
		log.debug("removing TipoTransmision instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TipoTransmision merge(TipoTransmision detachedInstance) {
		log.debug("merging TipoTransmision instance");
		try {
			TipoTransmision result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TipoTransmision findById(short id) {
		log.debug("getting TipoTransmision instance with id: " + id);
		try {
			TipoTransmision instance = entityManager.find(
					TipoTransmision.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
