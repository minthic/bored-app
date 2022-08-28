package com.github.minthic.boredapp.controller;

import com.github.minthic.boredapp.dto.ActivityDTO;
import com.github.minthic.boredapp.service.ActivityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/activity")
public class ActivityController
{
    private final ActivityService activityService;

    public ActivityController(ActivityService activityService)
    {
        this.activityService = activityService;
    }

    @PostMapping
    public ActivityDTO create(@RequestBody ActivityDTO activity)
    {
        return activityService.create(activity);
    }

    @GetMapping
    public List<ActivityDTO> readAll()
    {
        return activityService.readAll();
    }
}
