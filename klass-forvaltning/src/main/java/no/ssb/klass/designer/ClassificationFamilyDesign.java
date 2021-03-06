package no.ssb.klass.designer;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

import no.ssb.klass.designer.components.search.SearchBoxComponent;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class ClassificationFamilyDesign extends HorizontalLayout {
    protected SearchBoxComponent searchBox;
    protected GridLayout familyGrid;
    protected TextArea favoriteIntro;
    protected VerticalLayout favoriteLayout;
    protected GridLayout favoriteGrid;

    public ClassificationFamilyDesign() {
        Design.read(this);
    }
}
