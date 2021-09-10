package com.webshop.webshop;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {
    public MainView(){

        add(new H1("Hello"));

        Button button = new Button("Click me", click -> {
            add(new Span("Clicked"));
        });

        add(button);
    }
}
