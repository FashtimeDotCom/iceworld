package com.ktproject.cjhy.service;

import java.util.List;
import com.ktproject.cjhy.model.CjhyResourceModel;

public interface CjhyResourceService {
	
	/**
	 * 查询所有的财经慧眼作家的信息.
	 * @return
	 */
	List<CjhyResourceModel>  queryCjhyResourceAll();
	
	/**
	 * 根据财经学家类别查找相应的财经学家信息.
	 * @param cjxjType
	 * @return
	 */
	List<CjhyResourceModel>  queryCjhyResourceByCjxjType(final int bzfl);
}
