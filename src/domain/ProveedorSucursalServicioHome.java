// default package
// Generated Feb 21, 2016 1:29:40 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class ProveedorSucursalServicio.
 * @see .ProveedorSucursalServicio
 * @author Hibernate Tools
 */
public class ProveedorSucursalServicioHome {

	private static final Log log = LogFactory
			.getLog(ProveedorSucursalServicioHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(ProveedorSucursalServicio transientInstance) {
		log.debug("persisting ProveedorSucursalServicio instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ProveedorSucursalServicio instance) {
		log.debug("attaching dirty ProveedorSucursalServicio instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ProveedorSucursalServicio instance) {
		log.debug("attaching clean ProveedorSucursalServicio instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ProveedorSucursalServicio persistentInstance) {
		log.debug("deleting ProveedorSucursalServicio instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ProveedorSucursalServicio merge(
			ProveedorSucursalServicio detachedInstance) {
		log.debug("merging ProveedorSucursalServicio instance");
		try {
			ProveedorSucursalServicio result = (ProveedorSucursalServicio) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProveedorSucursalServicio findById(java.lang.Long id) {
		log.debug("getting ProveedorSucursalServicio instance with id: " + id);
		try {
			ProveedorSucursalServicio instance = (ProveedorSucursalServicio) sessionFactory
					.getCurrentSession().get("ProveedorSucursalServicio", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ProveedorSucursalServicio instance) {
		log.debug("finding ProveedorSucursalServicio instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("ProveedorSucursalServicio")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
