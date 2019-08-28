package com.noway.cook.service;

import com.noway.cook.model.secondary.Option;
import com.noway.cook.repository.secondary.CookOptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author noway
 */

@Service
public class CookOptionServiceImpl implements CookOptionService {

    @Autowired
    private CookOptionRepository repository;
    @Override
    public List<Option> findAllByClz(String clz) {
        return repository.findAllByClz(clz);
    }
}
