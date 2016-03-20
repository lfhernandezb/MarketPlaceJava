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
 * Home object for domain model class ProveedorSucursalUsuario.
 * @see .ProveedorSucursalUsuario
 * @author Hibernate Tools
 */
public class ProveedorSucursalUsuarioHome {

	private static final Log log = LogFactory
			.getLog(ProveedorSucursalUsuarioHome.class);

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

	public void persist(ProveedorSucursalUsuario transientInstance) {
		log.debug("persisting ProveedorSucursalUsuario instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ProveedorSucursalUsuario instance) {
		log.debug("attaching dirty ProveedorSucursalUsuario instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ProveedorSucursalUsuario instance) {
		log.debug("attaching clean ProveedorSucursalUsuario instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ProveedorSucursalUsuario persistentInstance) {
		log.debug("deleting ProveedorSucursalUsuario instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ProveedorSucursalUsuario merge(
			ProveedorSucursalUsuario detachedInstance) {
		log.debug("merging ProveedorSucursalUsuario instance");
		try {
			ProveedorSucursalUsuario result = (ProveedorSucursalUsuario) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProveedorSucursalUsuario findById(java.lang.Integer id) {
		log.debug("getting ProveedorSucursalUsuario instance with id: " + id);
		try {
			ProveedorSucursalUsuario instance = (ProveedorSucursalUsuario) sessionFactory
					.getCurrentSession().get("ProveedorSucursalUsuario", id);
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

	public List findByExample(ProveedorSucursalUsuario instance) {
		log.debug("finding ProveedorSucursalUsuario instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("ProveedorSucursalUsuario")
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
