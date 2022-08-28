package com.github.minthic.boredapp.dto;

public class ActivityDTO
{
    private Integer id;
    private String description;
    private Integer price;
    private Integer participants;
    private Integer effort;
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

    @Override
    public String toString()
    {
        return "ActivityDTO{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", participants=" + participants +
                ", effort=" + effort +
                ", duration=" + duration +
                '}';
    }
}
