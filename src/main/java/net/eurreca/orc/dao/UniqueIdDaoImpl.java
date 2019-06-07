package net.eurreca.orc.dao;



import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import net.eurreca.orc.model.UniqueId;


@Repository("uniqueIdDao")
public class UniqueIdDaoImpl extends AbstractDao<Integer, UniqueId> implements UniqueIdDao {
	final Logger logger = LoggerFactory.getLogger(UniqueIdDaoImpl.class);

	public UniqueId findById(int id) {
		
		
		UniqueId uniqueId = getByKey(id);
			if(uniqueId!=null) {
				
				Hibernate.initialize(uniqueId);
			}
		
		return uniqueId;
	}

	@Override
	public UniqueId findUid(UniqueId uniqueId) {
		// TODO Auto-generated method stub
		return null;
	}


	
	        
	
}
