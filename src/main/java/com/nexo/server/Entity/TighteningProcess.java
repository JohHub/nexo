package com.nexo.server.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * TighteningProcess
 */
public class TighteningProcess {

    private int nr;
    private String result;
    private String channel;
    @JsonProperty(value = "prg nr")
    private int prgNr;
    @JsonProperty(value = "prg name")
    private String prgName;
    @JsonProperty(value = "prg date")
    private String prgDate;
    private int cycle;
    @JsonProperty(value = "nominal torque")
    private double nominalTorque;
    private String date;
    @JsonProperty(value = "id code")
    private String idCode;
    @JsonProperty(value = "torque unit")
    private String torqueUnit;
    @JsonProperty(value = "last cmd")
    private String lastCmd;
    @JsonProperty(value = "quality code")
    private String qualityCode;
    @JsonProperty(value = "total time")
    private String totalTime;
    @JsonProperty(value = "tool serial")
    private String toolSerial;
    @JsonProperty(value = "rework code")
    private int reworkCode;
    @JsonProperty(value = "rework text")
    private String reworkText;
    @JsonProperty(value = "cell id")
    private String cellId;
    @JsonProperty(value = "job nr")
    private int jobNr;
    @JsonProperty(value = "MCE factor")
    private double MCEFactor;
    @JsonProperty(value = "batch nr")
    private String batchNr;
    @JsonProperty(value = "batch canceled")
    private int batchCanceled;
    @JsonProperty(value = "batch direction OK")
    private int batchDirectionOK;
    @JsonProperty(value = "batch direction NOK")
    private int batchDirectionNOK;
    @JsonProperty(value = "batch max OK")
    private int batchMaxOK;
    @JsonProperty(value = "batch max NOK")
    private int batchMaxNOK;
    @JsonProperty(value = "batch OK")
    private int batchOK;
    @JsonProperty(value = "batch NOK")
    private int batchNOK;

    @JsonProperty(value = "tightening steps")
    private List<TighteningStep> tighteningSteps = new ArrayList<>();

    /**
     * @return the nr
     */
    public int getNr() {
        return nr;
    }

    /**
     * @param nr the nr to set
     */
    public void setNr(int nr) {
        this.nr = nr;
    }

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
     * @return the channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * @param channel the channel to set
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * @return the prgNr
     */
    public int getPrgNr() {
        return prgNr;
    }

    /**
     * @param prgNr the prgNr to set
     */
    public void setPrgNr(int prgNr) {
        this.prgNr = prgNr;
    }

    /**
     * @return the prgName
     */
    public String getPrgName() {
        return prgName;
    }

    /**
     * @param prgName the prgName to set
     */
    public void setPrgName(String prgName) {
        this.prgName = prgName;
    }

    /**
     * @return the prgDate
     */
    public String getPrgDate() {
        return prgDate;
    }

    /**
     * @param prgDate the prgDate to set
     */
    public void setPrgDate(String prgDate) {
        this.prgDate = prgDate;
    }

    /**
     * @return the cycle
     */
    public int getCycle() {
        return cycle;
    }

    /**
     * @param cycle the cycle to set
     */
    public void setCycle(int cycle) {
        this.cycle = cycle;
    }

    /**
     * @return the nominalTorque
     */
    public double getNominalTorque() {
        return nominalTorque;
    }

    /**
     * @param nominalTorque the nominalTorque to set
     */
    public void setNominalTorque(double nominalTorque) {
        this.nominalTorque = nominalTorque;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the idCode
     */
    public String getIdCode() {
        return idCode;
    }

    /**
     * @param idCode the idCode to set
     */
    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    /**
     * @return the torqueUnit
     */
    public String getTorqueUnit() {
        return torqueUnit;
    }

    /**
     * @param torqueUnit the torqueUnit to set
     */
    public void setTorqueUnit(String torqueUnit) {
        this.torqueUnit = torqueUnit;
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
     * @return the totalTime
     */
    public String getTotalTime() {
        return totalTime;
    }

    /**
     * @param totalTime the totalTime to set
     */
    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    /**
     * @return the toolSerial
     */
    public String getToolSerial() {
        return toolSerial;
    }

    /**
     * @param toolSerial the toolSerial to set
     */
    public void setToolSerial(String toolSerial) {
        this.toolSerial = toolSerial;
    }

    /**
     * @return the reworkCode
     */
    public int getReworkCode() {
        return reworkCode;
    }

    /**
     * @param reworkCode the reworkCode to set
     */
    public void setReworkCode(int reworkCode) {
        this.reworkCode = reworkCode;
    }

    /**
     * @return the reworkText
     */
    public String getReworkText() {
        return reworkText;
    }

    /**
     * @param reworkText the reworkText to set
     */
    public void setReworkText(String reworkText) {
        this.reworkText = reworkText;
    }

    /**
     * @return the cellId
     */
    public String getCellId() {
        return cellId;
    }

    /**
     * @param cellId the cellId to set
     */
    public void setCellId(String cellId) {
        this.cellId = cellId;
    }

    /**
     * @return the jobNr
     */
    public int getJobNr() {
        return jobNr;
    }

    /**
     * @param jobNr the jobNr to set
     */
    public void setJobNr(int jobNr) {
        this.jobNr = jobNr;
    }

    /**
     * @return the mCEfactor
     */
    public double getMCEFactor() {
        return MCEFactor;
    }

    /**
     * @param mCEfactor the mCEfactor to set
     */
    public void setMCEFactor(double mCEfactor) {
        MCEFactor = mCEfactor;
    }

    /**
     * @return the batchNr
     */
    public String getBatchNr() {
        return batchNr;
    }

    /**
     * @param batchNr the batchNr to set
     */
    public void setBatchNr(String batchNr) {
        this.batchNr = batchNr;
    }

    /**
     * @return the batchCanceled
     */
    public int getBatchCanceled() {
        return batchCanceled;
    }

    /**
     * @param batchCanceled the batchCanceled to set
     */
    public void setBatchCanceled(int batchCanceled) {
        this.batchCanceled = batchCanceled;
    }

    /**
     * @return the batchDirectionOK
     */
    public int getBatchDirectionOK() {
        return batchDirectionOK;
    }

    /**
     * @param batchDirectionOK the batchDirectionOK to set
     */
    public void setBatchDirectionOK(int batchDirectionOK) {
        this.batchDirectionOK = batchDirectionOK;
    }

    /**
     * @return the batchDirectionNOK
     */
    public int getBatchDirectionNOK() {
        return batchDirectionNOK;
    }

    /**
     * @param batchDirectionNOK the batchDirectionNOK to set
     */
    public void setBatchDirectionNOK(int batchDirectionNOK) {
        this.batchDirectionNOK = batchDirectionNOK;
    }

    /**
     * @return the batchMaxOK
     */
    public int getBatchMaxOK() {
        return batchMaxOK;
    }

    /**
     * @param batchMaxOK the batchMaxOK to set
     */
    public void setBatchMaxOK(int batchMaxOK) {
        this.batchMaxOK = batchMaxOK;
    }

    /**
     * @return the batchMaxNOK
     */
    public int getBatchMaxNOK() {
        return batchMaxNOK;
    }

    /**
     * @param batchMaxNOK the batchMaxNOK to set
     */
    public void setBatchMaxNOK(int batchMaxNOK) {
        this.batchMaxNOK = batchMaxNOK;
    }

    /**
     * @return the batchOK
     */
    public int getBatchOK() {
        return batchOK;
    }

    /**
     * @param batchOK the batchOK to set
     */
    public void setBatchOK(int batchOK) {
        this.batchOK = batchOK;
    }

    /**
     * @return the batchNOK
     */
    public int getBatchNOK() {
        return batchNOK;
    }

    /**
     * @param batchNOK the batchNOK to set
     */
    public void setBatchNOK(int batchNOK) {
        this.batchNOK = batchNOK;
    }

    /**
     * @return the tighteningSteps
     */
    public List<TighteningStep> getTighteningSteps() {
        return tighteningSteps;
    }

    /**
     * @param tighteningSteps the tighteningSteps to set
     */
    public void setTighteningSteps(List<TighteningStep> tighteningSteps) {
        this.tighteningSteps = tighteningSteps;
    }
   
   
   }