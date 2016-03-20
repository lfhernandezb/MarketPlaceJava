package cl.dsoft.car.marketplace.domain;

// Generated Feb 28, 2016 2:15:19 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Combustible.
 * @see cl.dsoft.car.marketplace.domain.Combustible
 * @author Hibernate Tools
 */
@Stateless
public class CombustibleHome {

	private static final Log log = LogFactory.getLog(CombustibleHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Combustible transientInstance) {
		log.debug("persisting Combustible instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Combustible persistentInstance) {
		log.debug("removing Combustible instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Combustible merge(Combustible detachedInstance) {
		log.debug("merging Combustible instance");
		try {
			Combustible result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Combustible findById(short id) {
		log.debug("getting Combustible instance with id: " + id);
		try {
			Combustible instance = entityManager.find(Combustible.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
