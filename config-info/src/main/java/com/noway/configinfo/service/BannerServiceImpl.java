package com.noway.configinfo.service;


import com.noway.configinfo.entry.Banner;
import com.noway.configinfo.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author noway
 */
@Service
public class BannerServiceImpl implements BannerService{

    @Autowired
    private BannerRepository bannerRepository;

    @Override
    public List<Banner> findAllByEndpointAndPosition(String endpoint, String position) {
        return bannerRepository.findAllByEndpointAndPosition(endpoint,position);
    }
}
