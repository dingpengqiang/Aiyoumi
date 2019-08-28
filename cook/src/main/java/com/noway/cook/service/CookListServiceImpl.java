package com.noway.cook.service;

import com.noway.cook.model.primary.Cook;
import com.noway.cook.repository.primary.CookListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author noway
 */
@Service
public class CookListServiceImpl implements CookListService {


    @Autowired
    private CookListRepository repository;


    @Override
    public List<Cook> findAllByCookTypeContainsAndType(String key, String type) {
        return repository.findAllByCookTypeContainsAndType(key, type);
    }

    @Override
    public List<Cook> findAllByMonthTypeContainsAndType(String key, String type) {
        return repository.findAllByMonthTypeContainsAndType(key, type);
    }

    @Override
    public List<Cook> findAllByFunctionTypeContainsAndType(String key, String type) {
        return repository.findAllByFunctionTypeContainsAndType(key, type);
    }
}
