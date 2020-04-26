package com.flamephoenix.school.repository;

import com.flamephoenix.school.model.EventEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

//@Repository
// @Transactional
public interface EventEntityRepository extends JpaRepository<EventEntity,Long> {

    @Override
    List<EventEntity> findAll(Sort sort);
}
