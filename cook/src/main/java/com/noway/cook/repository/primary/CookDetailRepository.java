package com.noway.cook.repository.primary;

import com.noway.cook.model.primary.Cook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author noway
 */

@Repository
public interface CookDetailRepository extends JpaRepository<Cook,Long> {


//    Cook findById(String id);

    /**
     * 更新阅读数
     * @param read
     * @param id
     * @return
     */
    @Modifying
    @Transactional(rollbackFor = Exception.class)
    @Query(value = "update f_cook set `read` =?1 where id = ?2",nativeQuery = true)
    int updateRead(Integer read,Long id);


    /**
     * 更新点赞数
     * @param like
     * @param id
     * @return
     */
    @Modifying
    @Transactional(rollbackFor = Exception.class)
//    @Query(value = "update Cook c set c.like = ?1 where c.id = ?2")
    @Query(value = "update f_cook set `like` =?1 where id = ?2",nativeQuery = true)
    int updateLike(Integer like,Long id);

    /**
     * 更新收藏数
     * @param mark
     * @param id
     * @return
     */
    @Modifying
    @Transactional(rollbackFor = Exception.class)
    @Query(value = "update Cook c set c.mark = ?1 where c.id = ?2")
//    @Query(value = "update f_cook set mark =?1 where id = ?2",nativeQuery = true)
    int updateCollect(Integer mark,Long id);
}
