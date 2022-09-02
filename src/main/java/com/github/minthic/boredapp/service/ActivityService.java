package com.github.minthic.boredapp.service;

import com.github.minthic.boredapp.dto.ActivityDTO;
import com.github.minthic.boredapp.entity.ActivityEntity;
import com.github.minthic.boredapp.repository.ActivityRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ActivityService
{
    private final ActivityRepository activityRepository;
    private final ModelMapper mapper = new ModelMapper();

    public ActivityService(ActivityRepository activityRepository)
    {
        this.activityRepository = activityRepository;
    }

    public ActivityDTO create(ActivityDTO activityDTO)
    {
        ActivityEntity activity = mapper.map(activityDTO, ActivityEntity.class);

        ActivityEntity savedActivity = activityRepository.save(activity);
        return mapper.map(savedActivity, ActivityDTO.class);
    }

    public List<ActivityDTO> readAll()
    {
        List<ActivityEntity> allActivities = activityRepository.findAll();
        return mapper.map(allActivities, new TypeToken<List<ActivityDTO>>() {}.getType());
    }

    public ActivityDTO read(int id)
    {
        ActivityEntity activity = activityRepository.findById(id).orElse(null);
        if (activity == null)
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return mapper.map(activity, ActivityDTO.class);
    }
}
