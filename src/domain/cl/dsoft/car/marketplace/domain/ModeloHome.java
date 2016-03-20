package cl.dsoft.car.marketplace.domain;

// Generated Feb 28, 2016 2:15:19 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Modelo.
 * @see cl.dsoft.car.marketplace.domain.Modelo
 * @author Hibernate Tools
 */
@Stateless
public class ModeloHome {

	private static final Log log = LogFactory.getLog(ModeloHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Modelo transientInstance) {
		log.debug("persisting Modelo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Modelo persistentInstance) {
		log.debug("removing Modelo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Modelo merge(Modelo detachedInstance) {
		log.debug("merging Modelo instance");
		try {
			Modelo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Modelo findById(int id) {
		log.debug("getting Modelo instance with id: " + id);
		try {
			Modelo instance = entityManager.find(Modelo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
