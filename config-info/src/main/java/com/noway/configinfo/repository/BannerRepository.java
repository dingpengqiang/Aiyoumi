package com.noway.configinfo.repository;

import com.noway.configinfo.entry.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author noway
 */

@Repository
public interface BannerRepository extends JpaRepository<Banner,Long> {

    List<Banner> findAllByEndpointAndPosition(String endpoint,String position);

}
