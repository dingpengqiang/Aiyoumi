package com.noway.cook.service;

import com.noway.cook.model.primary.Cook;

import java.util.List;

/**
 * @author noway
 */
public interface CookListService {


    List<Cook> findAllByCookTypeContainsAndType(String key,String type);
    List<Cook> findAllByMonthTypeContainsAndType(String key,String type);
    List<Cook> findAllByFunctionTypeContainsAndType(String key,String type);

}
