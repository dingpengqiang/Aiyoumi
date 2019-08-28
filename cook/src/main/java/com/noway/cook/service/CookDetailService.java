package com.noway.cook.service;

import com.noway.cook.model.primary.Cook;

import java.util.Optional;

/**
 * @author noway
 */
public interface CookDetailService {


    Optional<Cook> findById(Long id);


    int updateRead(Integer read,Long id);

    int updateLike(Integer like,Long id);

    int updateCollect(Integer mark,Long id);
}
