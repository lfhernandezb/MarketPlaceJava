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
 * Home object for domain model class EstadoProveedor.
 * @see .EstadoProveedor
 * @author Hibernate Tools
 */
public class EstadoProveedorHome {

	private static final Log log = LogFactory.getLog(EstadoProveedorHome.class);

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

	public void persist(EstadoProveedor transientInstance) {
		log.debug("persisting EstadoProveedor instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(EstadoProveedor instance) {
		log.debug("attaching dirty EstadoProveedor instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EstadoProveedor instance) {
		log.debug("attaching clean EstadoProveedor instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(EstadoProveedor persistentInstance) {
		log.debug("deleting EstadoProveedor instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EstadoProveedor merge(EstadoProveedor detachedInstance) {
		log.debug("merging EstadoProveedor instance");
		try {
			EstadoProveedor result = (EstadoProveedor) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EstadoProveedor findById(short id) {
		log.debug("getting EstadoProveedor instance with id: " + id);
		try {
			EstadoProveedor instance = (EstadoProveedor) sessionFactory
					.getCurrentSession().get("EstadoProveedor", id);
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

	public List findByExample(EstadoProveedor instance) {
		log.debug("finding EstadoProveedor instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("EstadoProveedor")
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
