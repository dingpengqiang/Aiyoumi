package com.noway.cook.repository.secondary;

import com.noway.cook.model.secondary.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author noway
 */
@Repository
public interface CookOptionRepository extends JpaRepository<Option,Long> {


    List<Option> findAllByClz(String clz);
}
