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
 * Home object for domain model class MarcaProveedor.
 * @see .MarcaProveedor
 * @author Hibernate Tools
 */
public class MarcaProveedorHome {

	private static final Log log = LogFactory.getLog(MarcaProveedorHome.class);

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

	public void persist(MarcaProveedor transientInstance) {
		log.debug("persisting MarcaProveedor instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(MarcaProveedor instance) {
		log.debug("attaching dirty MarcaProveedor instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MarcaProveedor instance) {
		log.debug("attaching clean MarcaProveedor instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(MarcaProveedor persistentInstance) {
		log.debug("deleting MarcaProveedor instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MarcaProveedor merge(MarcaProveedor detachedInstance) {
		log.debug("merging MarcaProveedor instance");
		try {
			MarcaProveedor result = (MarcaProveedor) sessionFactory
					.getCurrentSession().merge(detachedInstance);
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
			MarcaProveedor instance = (MarcaProveedor) sessionFactory
					.getCurrentSession().get("MarcaProveedor", id);
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

	public List findByExample(MarcaProveedor instance) {
		log.debug("finding MarcaProveedor instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("MarcaProveedor")
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
