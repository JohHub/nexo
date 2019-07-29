package com.nexo.server.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Graph
 */
public final class Graph {

    @JsonProperty(value = "angle values")
    private List<Integer> angleValues = new ArrayList<>();
    @JsonProperty(value = "torque values")
    private List<Double> torqueValues = new ArrayList<>();
    @JsonProperty(value = "time values")
    private List<Double> timeValues = new ArrayList<>();

    /**
     * @return the angleValues
     */
    public List<Integer> getAngleValues() {
        return angleValues;
    }

    /**
     * @param angleValues the angleValues to set
     */
    public void setAngleValues(List<Integer> angleValues) {
        this.angleValues = angleValues;
    }

    /**
     * @return the torqueValues
     */
    public List<Double> getTorqueValues() {
        return torqueValues;
    }

    /**
     * @param torqueValues the torqueValues to set
     */
    public void setTorqueValues(List<Double> torqueValues) {
        this.torqueValues = torqueValues;
    }

    /**
     * @return the timeValues
     */
    public List<Double> getTimeValues() {
        return timeValues;
    }

    /**
     * @param timeValues the timeValues to set
     */
    public void setTimeValues(List<Double> timeValues) {
        this.timeValues = timeValues;
    }


}