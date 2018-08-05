package org.roisandia.so.charts.service;

import org.roisandia.so.charts.model.CommandCenter;
import org.roisandia.so.charts.model.TopMenuModel;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ChartService {

  public TopMenuModel getActualTopMenu() {
    CommandCenter cc = new CommandCenter(1, "Te gjitha");
    TopMenuModel model = new TopMenuModel(LocalDate.now(), cc);
    return model;
  }
}
