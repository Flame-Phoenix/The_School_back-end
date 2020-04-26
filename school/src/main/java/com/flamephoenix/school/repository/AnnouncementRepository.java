package com.flamephoenix.school.repository;

import com.flamephoenix.school.model.Announcement;
import com.flamephoenix.school.model.UserEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.List;

@Repository
@Transactional
public interface AnnouncementRepository extends JpaRepository<Announcement,Long> {

    @Override
    List<Announcement> findAll(Sort sort);

    List<Announcement>  findByEmailAddress();

}
