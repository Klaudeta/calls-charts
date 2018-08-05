package org.roisandia.so.charts.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Call implements Serializable {

  private boolean anonymousCaller;

  private Integer callReasonId;

  private String callReason;

  private Date callDate;

  private Integer dispatcherId;

  private String dispatcher;

  private Integer orgStructureId;

  private String orgStructure;

  private boolean sms;

  private String uniqueNumber;

  private Integer verifiedCallReasonId;

  private String verifiedCallReason;

  private boolean advicedForDenounce;

  private String callType;

  private String verificationType;

  @Override
  public String toString() {
    return "Call [callReasonId=" + callReasonId + ", callReason=" + callReason + ", callDate=" + callDate
        + ", dispatcherId=" + dispatcherId + ", dispatcher=" + dispatcher + ", orgStructureId=" + orgStructureId
        + ", orgStructure=" + orgStructure + ", sms=" + sms + ", advicedForDenounce=" + advicedForDenounce
        + ", callType=" + callType + "]";
  }

  public boolean isAnonymousCaller() {
    return anonymousCaller;
  }

  public void setAnonymousCaller(boolean anonymousCaller) {
    this.anonymousCaller = anonymousCaller;
  }

  public Integer getCallReasonId() {
    return callReasonId;
  }

  public void setCallReasonId(Integer callReasonId) {
    this.callReasonId = callReasonId;
  }

  public String getCallReason() {
    return callReason;
  }

  public void setCallReason(String callReason) {
    this.callReason = callReason;
  }

  public Date getCallDate() {
    return callDate;
  }

  public void setCallDate(Date callDate) {
    this.callDate = callDate;
  }

  public Integer getDispatcherId() {
    return dispatcherId;
  }

  public void setDispatcherId(Integer dispatcherId) {
    this.dispatcherId = dispatcherId;
  }

  public String getDispatcher() {
    return dispatcher;
  }

  public void setDispatcher(String dispatcher) {
    this.dispatcher = dispatcher;
  }

  public Integer getOrgStructureId() {
    return orgStructureId;
  }

  public void setOrgStructureId(Integer orgStructureId) {
    this.orgStructureId = orgStructureId;
  }

  public String getOrgStructure() {
    return orgStructure;
  }

  public void setOrgStructure(String orgStructure) {
    this.orgStructure = orgStructure;
  }

  public boolean isSms() {
    return sms;
  }

  public void setSms(boolean sms) {
    this.sms = sms;
  }

  public String getUniqueNumber() {
    return uniqueNumber;
  }

  public void setUniqueNumber(String uniqueNumber) {
    this.uniqueNumber = uniqueNumber;
  }

  public Integer getVerifiedCallReasonId() {
    return verifiedCallReasonId;
  }

  public void setVerifiedCallReasonId(Integer verifiedCallReasonId) {
    this.verifiedCallReasonId = verifiedCallReasonId;
  }

  public String getVerifiedCallReason() {
    return verifiedCallReason;
  }

  public void setVerifiedCallReason(String verifiedCallReason) {
    this.verifiedCallReason = verifiedCallReason;
  }

  public boolean isAdvicedForDenounce() {
    return advicedForDenounce;
  }

  public void setAdvicedForDenounce(boolean advicedForDenounce) {
    this.advicedForDenounce = advicedForDenounce;
  }

  public String getCallType() {
    return callType;
  }

  public void setCallType(String callType) {
    this.callType = callType;
  }

  public String getVerificationType() {
    return verificationType;
  }

  public void setVerificationType(String verificationType) {
    this.verificationType = verificationType;
  }

}
