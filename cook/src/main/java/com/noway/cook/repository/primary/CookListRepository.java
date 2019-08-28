package com.noway.cook.repository.primary;

import com.noway.cook.model.primary.Cook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author noway
 */

@Repository
public interface CookListRepository extends JpaRepository<Cook,Long> {



    List<Cook> findAllByCookTypeContainsAndType(String key,String type);
    List<Cook> findAllByMonthTypeContainsAndType(String key,String type);
    List<Cook> findAllByFunctionTypeContainsAndType(String key,String type);



}
