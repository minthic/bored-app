package com.github.minthic.boredapp.dto;

import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@ToString
public class ActivityDTO
{
    private Integer id;

    @NotBlank
    private String description;

    @NotNull
    @Min(value = 1) @Max(value = 5)
    private Integer price;

    private Integer participants;

    @NotNull
    @Min(value = 1) @Max(value = 5)
    private Integer effort;

    @NotNull
    @Min(value = 1) @Max(value = 5)
    private Integer duration;

    // region Getters and setters

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Integer getPrice()
    {
        return price;
    }

    public void setPrice(Integer price)
    {
        this.price = price;
    }

    public Integer getParticipants()
    {
        return participants;
    }

    public void setParticipants(Integer participants)
    {
        this.participants = participants;
    }

    public Integer getEffort()
    {
        return effort;
    }

    public void setEffort(Integer effort)
    {
        this.effort = effort;
    }

    public Integer getDuration()
    {
        return duration;
    }

    public void setDuration(Integer duration)
    {
        this.duration = duration;
    }

    // endregion
}
