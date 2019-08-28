package com.noway.cook.service;

import com.noway.cook.model.secondary.Banner;

import java.util.List;

/**
 * @author noway
 */
public interface CookBannerService {

    List<Banner> findAllByEndpointAndPosition(String endpoint, String position);
}
