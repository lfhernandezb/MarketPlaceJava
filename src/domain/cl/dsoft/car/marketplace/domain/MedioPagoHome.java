package cl.dsoft.car.marketplace.domain;

// Generated Feb 28, 2016 2:15:19 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class MedioPago.
 * @see cl.dsoft.car.marketplace.domain.MedioPago
 * @author Hibernate Tools
 */
@Stateless
public class MedioPagoHome {

	private static final Log log = LogFactory.getLog(MedioPagoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(MedioPago transientInstance) {
		log.debug("persisting MedioPago instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(MedioPago persistentInstance) {
		log.debug("removing MedioPago instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public MedioPago merge(MedioPago detachedInstance) {
		log.debug("merging MedioPago instance");
		try {
			MedioPago result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MedioPago findById(short id) {
		log.debug("getting MedioPago instance with id: " + id);
		try {
			MedioPago instance = entityManager.find(MedioPago.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
