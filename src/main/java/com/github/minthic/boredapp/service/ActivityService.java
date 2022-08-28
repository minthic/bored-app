package com.github.minthic.boredapp.service;

import com.github.minthic.boredapp.dto.ActivityDTO;
import com.github.minthic.boredapp.entity.ActivityEntity;
import com.github.minthic.boredapp.repository.ActivityRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ActivityService
{
    private final ActivityRepository activityRepository;
    private final ModelMapper mapper = new ModelMapper();

    public ActivityService(ActivityRepository activityRepository)
    {
        this.activityRepository = activityRepository;
    }

    public ActivityDTO createActivity(ActivityDTO activityDTO)
    {
        ActivityEntity activity = mapper.map(activityDTO, ActivityEntity.class);

        ActivityEntity savedActivity = activityRepository.save(activity);
        return mapper.map(savedActivity, ActivityDTO.class);
    }
}
