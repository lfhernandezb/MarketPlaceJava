package cl.dsoft.car.marketplace.domain;

// Generated Feb 28, 2016 2:15:19 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Traccion.
 * @see cl.dsoft.car.marketplace.domain.Traccion
 * @author Hibernate Tools
 */
@Stateless
public class TraccionHome {

	private static final Log log = LogFactory.getLog(TraccionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Traccion transientInstance) {
		log.debug("persisting Traccion instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Traccion persistentInstance) {
		log.debug("removing Traccion instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Traccion merge(Traccion detachedInstance) {
		log.debug("merging Traccion instance");
		try {
			Traccion result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Traccion findById(short id) {
		log.debug("getting Traccion instance with id: " + id);
		try {
			Traccion instance = entityManager.find(Traccion.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
