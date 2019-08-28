package com.noway.cook.repository.secondary;

import com.noway.cook.model.secondary.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author noway
 */
@Repository
public interface CookBannerRepository extends JpaRepository<Banner,Long> {


    List<Banner> findAllByEndpointAndPosition(String endpoint,String position);
}
