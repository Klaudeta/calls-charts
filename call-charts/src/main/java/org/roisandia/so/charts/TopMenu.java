package org.roisandia.so.charts;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import com.vaadin.flow.templatemodel.TemplateModel;
import org.roisandia.so.charts.model.TopMenuModel;
import org.roisandia.so.charts.service.ChartService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.format.TextStyle;
import java.util.Locale;

@Tag("top-menu")
@HtmlImport("src/top-menu.html")
@SpringComponent
@UIScope
public class TopMenu extends PolymerTemplate<TopMenu.Model> {

  @Autowired
  public TopMenu(ChartService service) {
    TopMenuModel actualTopMenu = service.getActualTopMenu();
    getModel().setMonth(actualTopMenu.getDate().getMonth().getDisplayName(TextStyle.FULL, new Locale("sq")));
    getModel().setYear(actualTopMenu.getDate().getYear());
    getModel().setCommandCenter(actualTopMenu.getCommandCenter().getName());
  }

  public interface Model extends TemplateModel {
    void setMonth(String month);

    void setYear(int year);

    void setCommandCenter(String commandCenter);
  }
}
