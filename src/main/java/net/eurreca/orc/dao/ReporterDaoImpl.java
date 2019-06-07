package net.eurreca.orc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import net.eurreca.orc.model.Reporter;

@Repository("reporterDao")
public class ReporterDaoImpl extends AbstractDao<Integer, Reporter> implements ReporterDao {
	
	static final Logger logger = LoggerFactory.getLogger(ReporterDaoImpl.class);
	
	public Reporter findById(int id) {
		
		Reporter reporter = getByKey(id);
		if(reporter!=null) {
			
			Hibernate.initialize(reporter);
			
		}
		
		return reporter;
		
	}

	
	public Reporter findByEmail(String email) {
		logger.info("EMAIL: {} ", email);
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("emaiId", email));
		Reporter reporter = (Reporter) crit.uniqueResult();
		if( reporter !=null) {
			
			Hibernate.initialize(reporter);
		}
		
		return reporter;
	}

	
	public void save(Reporter reporter) {
		
		persist(reporter);
		
	}

	
	public void deleteByEmail(String email) {
		
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("emaiId", email));
		Reporter reporter = (Reporter)crit.uniqueResult();
		delete(reporter);
		
	}


	public List<Reporter> findAllRepporter() {
		
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("firstName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY); // To avoid duplicates.
		List<Reporter> reporters = (List<Reporter>) criteria.list();
		return reporters;
	}

	
	@Override
	public void sendUniqueId(int id) {
		// TODO Auto-generated method stub
		
	}

}
