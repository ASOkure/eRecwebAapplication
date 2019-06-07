package net.eurreca.orc.dao;

import net.eurreca.orc.model.UniqueId;

public interface UniqueIdDao {
	
	
	UniqueId findById( int id);
	UniqueId findUid( UniqueId uniqueId);
	
	
	

}
