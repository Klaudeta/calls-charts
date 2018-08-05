package org.roisandia.so.callservice;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

@Component
@Scope("singleton")
public class MockCall {

  public static class Pair {
    public Integer id;
    public String name;

    public Pair(Integer id, String name) {
      this.id = id;
      this.name = name;
    }
  }

  public enum CallTypeEnum {

    R, // Regular
    S, // Silent
    O; // Offensive

  }

  public enum VerificationType {

    FALSE, NOT_FOUND, REGULAR;

  }

  private static Pair[] callReason = new Pair[] { new Pair(1, "Vjedhje"), new Pair(2, "Goditje"),
      new Pair(3, "Aksident"), new Pair(4, "Largim"), new Pair(5, "Prishje e qetesise publike"), new Pair(6, "Zjarr"),
      new Pair(7, "Kultivim lendesh narkotike"), new Pair(8, "Konflikt"),
      new Pair(9, "Kundershtim i forcave te rendit"), new Pair(10, "Shkaterrim prone") };

  private static Pair[] dispatchers = new Pair[] { new Pair(1, "Komisariati 1"), new Pair(2, "Komisariati 2"),
      new Pair(3, "Komisariati 3"), new Pair(4, "Komisariati 4"), new Pair(5, "Qarkullimi") };

  private static Pair[] orgStructures = new Pair[] { new Pair(1, "Drejtoria e Tiranes"),
      new Pair(2, "Drejtoria e Shkoders"), new Pair(3, "Drejtoria e Durresit"), new Pair(4, "Drejtoria e Elbasanit"),
      new Pair(5, "Drejtoria e Korces") };

  private int callTotal = 50000;

  public List<Call> calls = new ArrayList<>();

  @PostConstruct
  public void init() {
    int[] callReasonIndex = new Random().ints(callTotal, 0, 10).toArray();
    int[] dispatchersIndex = new Random().ints(callTotal, 0, 5).toArray();
    int[] orgsIndex = new Random().ints(callTotal, 0, 5).toArray();
    int[] callTypeIndex = new Random().ints(callTotal, 0, 3).toArray();

    int[] adviceDenounceIndex = new Random().ints(callTotal, 0, 2).toArray();
    int[] smsIndex = new Random().ints(callTotal, 0, 2).toArray();

    int[] monthIndex = new Random().ints(callTotal, 1, 13).toArray();
    int[] dayIndex = new Random().ints(callTotal, 1, 29).toArray();

    int[] hourIndex = new Random().ints(callTotal, 0, 24).toArray();
    int[] minIndex = new Random().ints(callTotal, 0, 60).toArray();

    for (int i = 0; i < callTotal; i++) {
      Call call = new Call();
      call.callReasonId = callReason[callReasonIndex[i]].id;
      call.callReason = callReason[callReasonIndex[i]].name;

      call.dispatcherId = dispatchers[dispatchersIndex[i]].id;
      call.dispatcher = dispatchers[dispatchersIndex[i]].name;

      call.orgStructureId = orgStructures[orgsIndex[i]].id;
      call.orgStructure = orgStructures[orgsIndex[i]].name;

      call.callType = CallTypeEnum.values()[callTypeIndex[i]].name();
      call.advicedForDenounce = adviceDenounceIndex[i] == 0 ? false : true;
      call.sms = smsIndex[i] == 0 ? false : true;
      long epochMilli = LocalDateTime.of(2017, monthIndex[i], dayIndex[i], hourIndex[i], minIndex[i])
          .toInstant(ZoneOffset.UTC).toEpochMilli();
      call.callDate = new Date(epochMilli);
      calls.add(call);
    }
  }

}
