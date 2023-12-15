package com.example.application.views.cambio;

import com.example.application.views.MainLayout;
import com.example.application.views.detailsale.DetailSaleView;
import com.example.application.views.products.ProductsView;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

import java.text.NumberFormat;
import java.util.Locale;

@PageTitle("Cambio")
@Route(value = "my-view4", layout = MainLayout.class)
@Uses(Icon.class)
public class CambioView extends Composite<VerticalLayout> {

    public CambioView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        H3 h3 = new H3();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        H3 h32 = new H3();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        H3 h33 = new H3();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        NumberField numberField = new NumberField();
        HorizontalLayout layoutRow5 = new HorizontalLayout();
        H3 h34 = new H3();
        HorizontalLayout layoutRow6 = new HorizontalLayout();
        H3 h35 = new H3();
        HorizontalLayout layoutRow7 = new HorizontalLayout();
        HorizontalLayout layoutRow8 = new HorizontalLayout();
        Button buttonPrimary = new Button();
        HorizontalLayout layoutRow10 = new HorizontalLayout();
        HorizontalLayout layoutRow9 = new HorizontalLayout();
        Button buttonPrimary2 = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        layoutRow.setAlignItems(Alignment.CENTER);
        layoutRow.setJustifyContentMode(JustifyContentMode.CENTER);
        h3.setText("Total a pagar:");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, h3);
        h3.setWidth("max-content");
        layoutRow2.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutRow2.setAlignItems(Alignment.CENTER);
        layoutRow2.setJustifyContentMode(JustifyContentMode.CENTER);
        h32.setText("0");
        layoutRow2.setAlignSelf(FlexComponent.Alignment.CENTER, h32);
        h32.setWidth("max-content");
        layoutRow3.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.getStyle().set("flex-grow", "1");
        layoutRow3.setAlignItems(Alignment.CENTER);
        layoutRow3.setJustifyContentMode(JustifyContentMode.START);
        h33.setText("Recibí :");
        layoutRow3.setAlignSelf(FlexComponent.Alignment.CENTER, h33);
        h33.setWidth("max-content");
        layoutRow4.setHeightFull();
        layoutRow3.setFlexGrow(1.0, layoutRow4);
        layoutRow4.addClassName(Gap.MEDIUM);
        layoutRow4.setWidth("100%");
        layoutRow4.getStyle().set("flex-grow", "1");
        layoutRow4.setAlignItems(Alignment.CENTER);
        layoutRow4.setJustifyContentMode(JustifyContentMode.CENTER);
        numberField.setLabel("Ingrese Monto");
        numberField.setWidth("min-content");
        layoutRow5.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow5);
        layoutRow5.addClassName(Gap.MEDIUM);
        layoutRow5.setWidth("100%");
        layoutRow5.getStyle().set("flex-grow", "1");
        h34.setText("Cambio:");
        layoutRow5.setAlignSelf(FlexComponent.Alignment.CENTER, h34);
        h34.setWidth("max-content");
        layoutRow6.setHeightFull();
        layoutRow5.setFlexGrow(1.0, layoutRow6);
        layoutRow6.addClassName(Gap.MEDIUM);
        layoutRow6.setWidth("100%");
        layoutRow6.getStyle().set("flex-grow", "1");
        layoutRow6.setAlignItems(Alignment.CENTER);
        layoutRow6.setJustifyContentMode(JustifyContentMode.CENTER);
        h35.setText("0");
        layoutRow6.setAlignSelf(FlexComponent.Alignment.CENTER, h35);
        h35.setWidth("max-content");
        layoutRow7.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow7);
        layoutRow7.addClassName(Gap.MEDIUM);
        layoutRow7.setWidth("100%");
        layoutRow7.getStyle().set("flex-grow", "1");
        layoutRow7.setAlignItems(Alignment.END);
        layoutRow7.setJustifyContentMode(JustifyContentMode.END);
        layoutRow8.setHeightFull();
        layoutRow7.setFlexGrow(1.0, layoutRow8);
        layoutRow8.addClassName(Gap.MEDIUM);
        layoutRow8.setWidth("1087px");
        layoutRow8.setHeight("100%");
        layoutRow8.setAlignItems(Alignment.CENTER);
        layoutRow8.setJustifyContentMode(JustifyContentMode.START);
        buttonPrimary.setText("Regresar");
        layoutRow8.setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary);
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        layoutRow10.setHeightFull();
        layoutRow8.setFlexGrow(1.0, layoutRow10);
        layoutRow10.addClassName(Gap.MEDIUM);
        layoutRow10.setWidth("800px");
        layoutRow10.getStyle().set("flex-grow", "1");
        layoutRow9.setHeightFull();
        layoutRow8.setFlexGrow(1.0, layoutRow9);
        layoutRow9.addClassName(Gap.MEDIUM);
        layoutRow9.setWidth("100%");
        layoutRow9.getStyle().set("flex-grow", "1");
        buttonPrimary2.setText("Calcular");
        layoutRow9.setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary2);
        buttonPrimary2.setWidth("min-content");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(layoutRow);
        layoutRow.add(h3);
        layoutRow.add(layoutRow2);
        layoutRow2.add(h32);
        getContent().add(layoutRow3);
        layoutRow3.add(h33);
        layoutRow3.add(layoutRow4);
        layoutRow4.add(numberField);
        getContent().add(layoutRow5);
        layoutRow5.add(h34);
        layoutRow5.add(layoutRow6);
        layoutRow6.add(h35);
        getContent().add(layoutRow7);
        layoutRow7.add(layoutRow8);
        layoutRow8.add(buttonPrimary);
        layoutRow8.add(layoutRow10);
        layoutRow8.add(layoutRow9);
        layoutRow9.add(buttonPrimary2);

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setMinimumFractionDigits(2);

        Double totalAPagar = (Double) UI.getCurrent().getSession().getAttribute("totalGeneral");
        h32.setText(numberFormat.format(totalAPagar));
        buttonPrimary.addClickListener(buttonClickEvent -> {
            UI.getCurrent().navigate(DetailSaleView.class);
        });
        buttonPrimary2.addClickListener(event -> {
            try {


                // Obtener el monto ingresado
                double montoIngresado = numberField.getValue();

                // Validaciones
                if (montoIngresado <= 0) {
                    Notification.show("El monto ingresado debe ser mayor a cero", 3000, Notification.Position.TOP_CENTER);
                    return;
                }

                if (montoIngresado < totalAPagar) {
                    Notification.show("El monto ingresado no puede ser menor al total a pagar", 3000, Notification.Position.TOP_CENTER);
                    return;
                }

                // Calcular el cambio
                double cambio = montoIngresado - totalAPagar;

                // Mostrar resultados
                //h32.setText(String.valueOf(totalAPagar)); // Total a pagar
                h35.setText(numberFormat.format(cambio)); // Cambio

            } catch (Exception e) {
                Notification.show("Error al realizar el cálculo", 3000, Notification.Position.TOP_CENTER);
            }
        });
    }


}
