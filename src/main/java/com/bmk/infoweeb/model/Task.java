package com.bmk.infoweeb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Task implements Serializable {

    private static final long serialVersionUID = 7897802902471766961L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String taskName;
    private String taskDetails;
    private String taskCategory;

    private Timestamp startTimeStamp;
    private Timestamp endTimeStamp;
    private String minuteSpent;

}
