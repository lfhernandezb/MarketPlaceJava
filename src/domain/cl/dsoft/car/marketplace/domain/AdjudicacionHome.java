package cl.dsoft.car.marketplace.domain;

// Generated Feb 28, 2016 2:15:19 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Adjudicacion.
 * @see cl.dsoft.car.marketplace.domain.Adjudicacion
 * @author Hibernate Tools
 */
@Stateless
public class AdjudicacionHome {

	private static final Log log = LogFactory.getLog(AdjudicacionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Adjudicacion transientInstance) {
		log.debug("persisting Adjudicacion instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Adjudicacion persistentInstance) {
		log.debug("removing Adjudicacion instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Adjudicacion merge(Adjudicacion detachedInstance) {
		log.debug("merging Adjudicacion instance");
		try {
			Adjudicacion result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Adjudicacion findById(Long id) {
		log.debug("getting Adjudicacion instance with id: " + id);
		try {
			Adjudicacion instance = entityManager.find(Adjudicacion.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
