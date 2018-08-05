package org.roisandia.so.callservice;

import java.io.Serializable;
import java.util.Date;

public class Call implements Serializable {

  public String caller;

  public String telNo;

  public boolean anonymousCaller;

  public Integer callReasonId;

  public String callReason;

  public String description;

  public String address;

  public String recordUser;

  public Date callDate;

  public Integer dispatcherId;

  public String dispatcher;

  public Integer orgStructureId;

  public String orgStructure;

  public boolean sms;

  public String actualStatus;

  public Date recordDate;

  public String uniqueNumber;

  public boolean baseCall;

  public Date startedVerificationDate;

  public String startedVerificationUser;

  public boolean falseCall = false;

  public String verificationNotes;

  public Integer verifiedCallReasonId;

  public String verifiedCallReason;

  public boolean advicedForDenounce;

  public Date verificationDate;

  public String verificationUser;

  public boolean forSupervisor = false;

  public boolean officerCall;

  public String callType;

  public String verificationType;

  public String userByStatus;

  @Override
  public String toString() {
    return "Call [callReasonId=" + callReasonId + ", callReason=" + callReason + ", callDate=" + callDate
        + ", dispatcherId=" + dispatcherId + ", dispatcher=" + dispatcher + ", orgStructureId=" + orgStructureId
        + ", orgStructure=" + orgStructure + ", sms=" + sms + ", advicedForDenounce=" + advicedForDenounce
        + ", callType=" + callType + "]";
  }

}
