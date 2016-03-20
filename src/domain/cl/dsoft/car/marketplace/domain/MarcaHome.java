package cl.dsoft.car.marketplace.domain;

// Generated Feb 28, 2016 2:15:19 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Marca.
 * @see cl.dsoft.car.marketplace.domain.Marca
 * @author Hibernate Tools
 */
@Stateless
public class MarcaHome {

	private static final Log log = LogFactory.getLog(MarcaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Marca transientInstance) {
		log.debug("persisting Marca instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Marca persistentInstance) {
		log.debug("removing Marca instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Marca merge(Marca detachedInstance) {
		log.debug("merging Marca instance");
		try {
			Marca result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Marca findById(int id) {
		log.debug("getting Marca instance with id: " + id);
		try {
			Marca instance = entityManager.find(Marca.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
