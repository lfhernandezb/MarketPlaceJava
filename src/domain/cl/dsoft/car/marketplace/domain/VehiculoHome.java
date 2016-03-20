package cl.dsoft.car.marketplace.domain;

// Generated Feb 28, 2016 2:15:19 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Vehiculo.
 * @see cl.dsoft.car.marketplace.domain.Vehiculo
 * @author Hibernate Tools
 */
@Stateless
public class VehiculoHome {

	private static final Log log = LogFactory.getLog(VehiculoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Vehiculo transientInstance) {
		log.debug("persisting Vehiculo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Vehiculo persistentInstance) {
		log.debug("removing Vehiculo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Vehiculo merge(Vehiculo detachedInstance) {
		log.debug("merging Vehiculo instance");
		try {
			Vehiculo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Vehiculo findById(Long id) {
		log.debug("getting Vehiculo instance with id: " + id);
		try {
			Vehiculo instance = entityManager.find(Vehiculo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
