package com.github.minthic.boredapp.controller;

import com.github.minthic.boredapp.dto.ActivityDTO;
import com.github.minthic.boredapp.service.ActivityService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ActivityDTO createActivity(@RequestBody ActivityDTO activity)
    {
        return activityService.createActivity(activity);
    }
}
