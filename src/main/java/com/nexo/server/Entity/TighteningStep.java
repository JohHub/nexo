package com.nexo.server.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * TighteningStep
 */
public final class TighteningStep {

    private String result;
    private String name;
    @JsonProperty(value = "step type")
    private String stepType;
    private String row;
    private String column;
    private double category;
    @JsonProperty(value = "last cmd")
    private String lastCmd;
    private double torque;
    private double angle;
    private double duration;
    @JsonProperty(value = "quality code")
    private String qualityCode;
    private double speed;
    @JsonProperty(value = "angle threshold nom")
    private double angleThresholdNom;
    @JsonProperty(value = "angle threshold act")
    private double angleThresholdAct;

    @JsonProperty(value = "tightening functions")
    private List<TighteningFunction> tighteningFunctions = new ArrayList<>();
    private Graph graph;

    /**
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the stepType
     */
    public String getStepType() {
        return stepType;
    }

    /**
     * @param stepType the stepType to set
     */
    public void setStepType(String stepType) {
        this.stepType = stepType;
    }

    /**
     * @return the row
     */
    public String getRow() {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(String row) {
        this.row = row;
    }

    /**
     * @return the column
     */
    public String getColumn() {
        return column;
    }

    /**
     * @param column the column to set
     */
    public void setColumn(String column) {
        this.column = column;
    }

    /**
     * @return the category
     */
    public double getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(double category) {
        this.category = category;
    }

    /**
     * @return the lastCmd
     */
    public String getLastCmd() {
        return lastCmd;
    }

    /**
     * @param lastCmd the lastCmd to set
     */
    public void setLastCmd(String lastCmd) {
        this.lastCmd = lastCmd;
    }

    /**
     * @return the torque
     */
    public double getTorque() {
        return torque;
    }

    /**
     * @param torque the torque to set
     */
    public void setTorque(double torque) {
        this.torque = torque;
    }

    /**
     * @return the angle
     */
    public double getAngle() {
        return angle;
    }

    /**
     * @param angle the angle to set
     */
    public void setAngle(double angle) {
        this.angle = angle;
    }

    /**
     * @return the duration
     */
    public double getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }

    /**
     * @return the qualityCode
     */
    public String getQualityCode() {
        return qualityCode;
    }

    /**
     * @param qualityCode the qualityCode to set
     */
    public void setQualityCode(String qualityCode) {
        this.qualityCode = qualityCode;
    }

    /**
     * @return the speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * @return the angleThresholdNom
     */
    public double getAngleThresholdNom() {
        return angleThresholdNom;
    }

    /**
     * @param angleThresholdNom the angleThresholdNom to set
     */
    public void setAngleThresholdNom(double angleThresholdNom) {
        this.angleThresholdNom = angleThresholdNom;
    }

    /**
     * @return the angleThresholdAct
     */
    public double getAngleThresholdAct() {
        return angleThresholdAct;
    }

    /**
     * @param angleThresholdAct the angleThresholdAct to set
     */
    public void setAngleThresholdAct(double angleThresholdAct) {
        this.angleThresholdAct = angleThresholdAct;
    }

    /**
     * @return the tighteningFunctions
     */
    public List<TighteningFunction> getTighteningFunctions() {
        return tighteningFunctions;
    }

    /**
     * @param tighteningFunctions the tighteningFunctions to set
     */
    public void setTighteningFunctions(List<TighteningFunction> tighteningFunctions) {
        this.tighteningFunctions = tighteningFunctions;
    }

    /**
     * @return the graph
     */
    public Graph getGraph() {
        return graph;
    }

    /**
     * @param graph the graph to set
     */
    public void setGraph(Graph graph) {
        this.graph = graph;
    }

}