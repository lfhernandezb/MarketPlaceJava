package cl.dsoft.car.marketplace.domain;

// Generated Feb 28, 2016 2:15:19 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class MarcaProveedor.
 * @see cl.dsoft.car.marketplace.domain.MarcaProveedor
 * @author Hibernate Tools
 */
@Stateless
public class MarcaProveedorHome {

	private static final Log log = LogFactory.getLog(MarcaProveedorHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(MarcaProveedor transientInstance) {
		log.debug("persisting MarcaProveedor instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(MarcaProveedor persistentInstance) {
		log.debug("removing MarcaProveedor instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public MarcaProveedor merge(MarcaProveedor detachedInstance) {
		log.debug("merging MarcaProveedor instance");
		try {
			MarcaProveedor result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MarcaProveedor findById(int id) {
		log.debug("getting MarcaProveedor instance with id: " + id);
		try {
			MarcaProveedor instance = entityManager.find(MarcaProveedor.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
