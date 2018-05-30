package com.project.avans.mdodandroid.object_classes;

import java.io.Serializable;

public class Goal implements Serializable {
    private String goalID;
    private String goal;


    public Goal(String RiskID, String Risk) {
        this.goalID = RiskID;
        this.goal = Risk;

    }

    public String getRiskID() {
        return goalID;
    }

    public String Goal() {
        return goal;
    }


    @Override
    public String toString() {
        return "Risk{" +
                "RiskID='" + goalID + '\'' +
                ", Risk='" + goal + '\'' +
                '}';
    }
}
