package com.github.minthic.boredapp.repository;

import com.github.minthic.boredapp.entity.ActivityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ActivityRepository extends JpaRepository<ActivityEntity, Long>
{
    Optional<ActivityEntity> findById(Integer id);
}
