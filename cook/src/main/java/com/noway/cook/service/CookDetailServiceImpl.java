package com.noway.cook.service;

import com.noway.cook.model.primary.Cook;
import com.noway.cook.repository.primary.CookDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author noway
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class CookDetailServiceImpl implements CookDetailService{

    @Autowired
    private CookDetailRepository repository;

    @Override
    public Optional<Cook> findById(Long id) {
        return repository.findById(id);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int updateRead(Integer read, Long id) {
        return repository.updateRead(read, id);
    }

    @Override
    public int updateLike(Integer like, Long id) {
        return repository.updateLike(like, id);
    }

    @Override
    public int updateCollect(Integer mark, Long id) {
        return repository.updateCollect(mark, id);
    }
}
