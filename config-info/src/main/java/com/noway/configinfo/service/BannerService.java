package com.noway.configinfo.service;

import com.noway.configinfo.entry.Banner;

import java.util.List;

/**
 * @author noway
 */
public interface BannerService {


    List<Banner> findAllByEndpointAndPosition(String endpoint, String position);
}
