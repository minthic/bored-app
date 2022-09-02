package com.github.minthic.boredapp.controller;

import com.github.minthic.boredapp.dto.ActivityDTO;
import com.github.minthic.boredapp.service.ActivityService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public ActivityDTO create(@RequestBody @Valid ActivityDTO activity)
    {
        return activityService.create(activity);
    }

    @GetMapping
    public List<ActivityDTO> readAll()
    {
        return activityService.readAll();
    }

    @GetMapping
    @RequestMapping("/{id}")
    public ActivityDTO read(@PathVariable Integer id)
    {
        return activityService.read(id);
    }
}
