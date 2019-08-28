package com.noway.cook.service;


import com.noway.cook.model.secondary.Banner;
import com.noway.cook.repository.secondary.CookBannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author noway
 */
@Service
public class CookBannerServiceImpl implements CookBannerService{

    @Autowired
    private CookBannerRepository repository;

    @Override
    public List<Banner> findAllByEndpointAndPosition(String endpoint, String position) {
        return repository.findAllByEndpointAndPosition(endpoint,position);
    }
}
