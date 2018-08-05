package org.roisandia.so.charts;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.charts.Chart;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("dashboard-view")
@HtmlImport("src/dashboard-view.html")
@Route(value = "", layout = MainView.class)
public class DashboardView extends PolymerTemplate<TemplateModel> {

  @Id
  private TopMenu topMenu;

  @Id("deliveriesThisMonth")
  private Chart callsThisMonthChart;

  @Id("deliveriesThisYear")
  private Chart callsThisYearChart;

  public DashboardView() {

    // TODO 1. call chart service/presenter to create Chart Cards
  }
}
