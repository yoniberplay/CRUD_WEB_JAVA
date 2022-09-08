package dao.modelo;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ManejoclientesDAO implements ClienteDAO {

	@Override
	@Transactional
	public List<cliente> getcClientes() {

		// get session
		Session ss = sessionFactory.getCurrentSession();
		// create query
		Query<cliente> query = ss.createQuery("from cliente", cliente.class);

		List<cliente> list = query.getResultList();
		return list;
	}

	@Override
	@Transactional
	public void insetarcliente(cliente cl) {
		Session ss;
		ss = sessionFactory.getCurrentSession();
		ss.save(cl);
		
	}

	@Override
	@Transactional
	public void updatecliente(cliente cl) {
		Session ss;
		ss = sessionFactory.getCurrentSession();
		ss.update(cl);
		
	}
	

	@Override
	@Transactional
	public cliente getcliente(int id) {
		Session ss;
		ss = sessionFactory.getCurrentSession();
		cliente up = ss.get(cliente.class, id);
		return up;
	}

	@Override
	@Transactional
	public void deletecliente(int id) {
		Session ss;
		ss = sessionFactory.getCurrentSession();
		cliente up = ss.get(cliente.class, id);
		ss.delete(up);
	}
	
	

	@Override
	@Transactional
	public boolean validateloggin(String usuario, String clave) {
		
		   Session ss = sessionFactory.getCurrentSession();

	        Query<loggin_entity> theQuery = ss.createQuery("from loggin_entity where usuario=:ii AND clave=:cc",loggin_entity.class);
	        theQuery.setParameter("ii", usuario);
	        theQuery.setParameter("cc", clave);

	        List<loggin_entity> results = theQuery.list();

	        if ((results!=null) && (results.size()>0)){
	            return true;
	        }
	        else {
	        return false;
	    }
	}
	
	@Autowired
	private SessionFactory sessionFactory;

}
