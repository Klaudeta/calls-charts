package org.roisandia.so.charts;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * The main view contains a simple label element and a template element.
 */
@Tag("main-view")
@HtmlImport("src/main-view.html")
@Route
public class MainView extends PolymerTemplate<TemplateModel> {

  @Id
  private TopMenu topMenu;
}
