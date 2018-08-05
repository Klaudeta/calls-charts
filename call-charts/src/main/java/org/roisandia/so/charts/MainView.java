package org.roisandia.so.charts;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * The main view contains a simple label element and a template element.
 */
@Tag("main-view")
@HtmlImport("src/main-view.html")
public class MainView extends PolymerTemplate<TemplateModel> implements RouterLayout {

  @Id
  private Div mainArea;

  @Override
  public void showRouterLayoutContent(HasElement content) {
    mainArea.getElement().appendChild(content.getElement());
  }
}
