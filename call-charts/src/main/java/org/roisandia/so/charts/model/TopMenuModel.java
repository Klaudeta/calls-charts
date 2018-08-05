package org.roisandia.so.charts.model;

import java.time.LocalDate;

public class TopMenuModel {

  private LocalDate date;

  private CommandCenter commandCenter;

  public TopMenuModel(LocalDate date, CommandCenter commandCenter) {
    this.date = date;
    this.commandCenter = commandCenter;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public CommandCenter getCommandCenter() {
    return commandCenter;
  }

  public void setCommandCenter(CommandCenter commandCenter) {
    this.commandCenter = commandCenter;
  }

}
