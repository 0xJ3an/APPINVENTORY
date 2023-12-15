package com.example.application.views.login;

import com.example.application.views.MainLayout;
import com.example.application.views.products.ProductsView;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Login")
@Route(value = "my-view", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class LoginView extends Composite<VerticalLayout> {

    public LoginView() {
        H1 h1 = new H1();
        TextField textField = new TextField();
        PasswordField passwordField = new PasswordField();
        H5 h5 = new H5();
        Button buttonPrimary = new Button();
        getContent().setWidth("100%");
        getContent().setHeight("500px");
        getContent().setJustifyContentMode(JustifyContentMode.CENTER);
        getContent().setAlignItems(Alignment.CENTER);
        h1.setText("Siuper24");
        h1.setWidth("max-content");
        textField.setLabel("User");
        textField.setWidth("min-content");
        passwordField.setLabel("Password");
        passwordField.setWidth("min-content");
        h5.setText(".");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, h5);
        h5.setWidth("max-content");
        buttonPrimary.setText("Login");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(h1);
        getContent().add(textField);
        getContent().add(passwordField);
        getContent().add(h5);
        getContent().add(buttonPrimary);
        buttonPrimary.addClickListener(event -> {
            // Validar el usuario y la contraseña
            String username = textField.getValue();
            String password = passwordField.getValue();

            if ("admin".equals(username) && "admin".equals(password)) {
                // Usuario y contraseña válidos, redirigir a la página principal
                UI.getCurrent().navigate(ProductsView.class);
            } else {
                // Usuario o contraseña incorrectos, mostrar un mensaje de error
                Notification.show("Usuario o contraseña incorrectos", 3000, Notification.Position.MIDDLE);
            }
        });
    }
}
