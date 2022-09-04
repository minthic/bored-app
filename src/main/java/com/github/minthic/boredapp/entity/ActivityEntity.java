package com.github.minthic.boredapp.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table

@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ActivityEntity implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
}
