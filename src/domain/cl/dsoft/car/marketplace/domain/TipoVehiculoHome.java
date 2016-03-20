package cl.dsoft.car.marketplace.domain;

// Generated Feb 28, 2016 2:15:19 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TipoVehiculo.
 * @see cl.dsoft.car.marketplace.domain.TipoVehiculo
 * @author Hibernate Tools
 */
@Stateless
public class TipoVehiculoHome {

	private static final Log log = LogFactory.getLog(TipoVehiculoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TipoVehiculo transientInstance) {
		log.debug("persisting TipoVehiculo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TipoVehiculo persistentInstance) {
		log.debug("removing TipoVehiculo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TipoVehiculo merge(TipoVehiculo detachedInstance) {
		log.debug("merging TipoVehiculo instance");
		try {
			TipoVehiculo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TipoVehiculo findById(short id) {
		log.debug("getting TipoVehiculo instance with id: " + id);
		try {
			TipoVehiculo instance = entityManager.find(TipoVehiculo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
