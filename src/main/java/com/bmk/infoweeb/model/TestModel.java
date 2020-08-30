package com.bmk.infoweeb.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import javax.persistence.Entity;


@Service
@Entity
public class TestModel {
    @Column(name = "VAR1")
    private String variable1;

    @Column(name = "VAR2")
    private String variable2;

    public TestModel() {

        this.variable1 = "Boom";
        this.variable2 = "HOOM";
    }

    public String getVariable2() {
        return variable2;
    }

    public void setVariable2(String variable2) {
        this.variable2 = variable2;
    }

    public String getVariable1() {
        return variable1;
    }


    public void setVariable1(String variable1) {
        this.variable1 = variable1;
    }

}
