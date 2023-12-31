package com.example.application.views.products;

import com.example.application.views.MainLayout;
import com.example.application.views.detailsale.DetailSaleView;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
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
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;

@PageTitle("Products")
@Route(value = "my-view2", layout = MainLayout.class)
@Uses(Icon.class)
public class ProductsView extends Composite<VerticalLayout> {

    public ProductsView() {
        H1 h1 = new H1();
        HorizontalLayout layoutRow = new HorizontalLayout();
        H3 h3 = new H3();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        NumberField numberField = new NumberField();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        H3 h32 = new H3();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        H3 h33 = new H3();
        HorizontalLayout layoutRow5 = new HorizontalLayout();
        NumberField numberField2 = new NumberField();
        HorizontalLayout layoutRow6 = new HorizontalLayout();
        H3 h34 = new H3();
        HorizontalLayout layoutRow7 = new HorizontalLayout();
        H3 h35 = new H3();
        HorizontalLayout layoutRow8 = new HorizontalLayout();
        NumberField numberField3 = new NumberField();
        HorizontalLayout layoutRow9 = new HorizontalLayout();
        H3 h36 = new H3();
        HorizontalLayout layoutRow10 = new HorizontalLayout();
        H3 h37 = new H3();
        HorizontalLayout layoutRow11 = new HorizontalLayout();
        NumberField numberField4 = new NumberField();
        HorizontalLayout layoutRow12 = new HorizontalLayout();
        H3 h38 = new H3();
        HorizontalLayout layoutRow13 = new HorizontalLayout();
        Button buttonPrimary = new Button();
        HorizontalLayout layoutRow14 = new HorizontalLayout();
        Button buttonPrimary2 = new Button();
        getContent().addClassName(Gap.XSMALL);
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        h1.setText("Productos");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, h1);
        h1.setWidth("max-content");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        h3.setText("Aceite de Oliva");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, h3);
        h3.setWidth("max-content");
        layoutRow2.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("765px");
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutRow2.setAlignItems(Alignment.CENTER);
        layoutRow2.setJustifyContentMode(JustifyContentMode.CENTER);
        numberField.setLabel("Cantidad");
        layoutRow2.setAlignSelf(FlexComponent.Alignment.CENTER, numberField);
        numberField.setWidth("min-content");
        layoutRow3.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.getStyle().set("flex-grow", "1");
        layoutRow3.setAlignItems(Alignment.CENTER);
        layoutRow3.setJustifyContentMode(JustifyContentMode.CENTER);
        h32.setText("$15");
        layoutRow3.setAlignSelf(FlexComponent.Alignment.CENTER, h32);
        h32.setWidth("max-content");
        layoutRow4.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow4);
        layoutRow4.addClassName(Gap.MEDIUM);
        layoutRow4.setWidth("100%");
        layoutRow4.getStyle().set("flex-grow", "1");
        layoutRow4.setAlignItems(Alignment.CENTER);
        layoutRow4.setJustifyContentMode(JustifyContentMode.START);
        h33.setText("Leche de vaca");
        layoutRow4.setAlignSelf(FlexComponent.Alignment.CENTER, h33);
        h33.setWidth("max-content");
        layoutRow5.setHeightFull();
        layoutRow4.setFlexGrow(1.0, layoutRow5);
        layoutRow5.addClassName(Gap.MEDIUM);
        layoutRow5.setWidth("785px");
        layoutRow5.getStyle().set("flex-grow", "1");
        layoutRow5.setAlignItems(Alignment.CENTER);
        layoutRow5.setJustifyContentMode(JustifyContentMode.CENTER);
        numberField2.setLabel("Cantidad");
        layoutRow5.setAlignSelf(FlexComponent.Alignment.CENTER, numberField2);
        numberField2.setWidth("min-content");
        layoutRow6.setHeightFull();
        layoutRow4.setFlexGrow(1.0, layoutRow6);
        layoutRow6.addClassName(Gap.MEDIUM);
        layoutRow6.setWidth("100%");
        layoutRow6.getStyle().set("flex-grow", "1");
        layoutRow6.setAlignItems(Alignment.CENTER);
        layoutRow6.setJustifyContentMode(JustifyContentMode.CENTER);
        h34.setText("$ 2,50");
        layoutRow6.setAlignSelf(FlexComponent.Alignment.CENTER, h34);
        h34.setWidth("max-content");
        layoutRow7.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow7);
        layoutRow7.addClassName(Gap.MEDIUM);
        layoutRow7.setWidth("100%");
        layoutRow7.getStyle().set("flex-grow", "1");
        h35.setText("Huevos");
        layoutRow7.setAlignSelf(FlexComponent.Alignment.CENTER, h35);
        h35.setWidth("max-content");
        layoutRow8.setHeightFull();
        layoutRow7.setFlexGrow(1.0, layoutRow8);
        layoutRow8.setWidth("995px");
        layoutRow8.getStyle().set("flex-grow", "1");
        layoutRow8.setAlignItems(Alignment.CENTER);
        layoutRow8.setJustifyContentMode(JustifyContentMode.CENTER);
        numberField3.setLabel("Cantidad");
        layoutRow8.setAlignSelf(FlexComponent.Alignment.CENTER, numberField3);
        numberField3.setWidth("min-content");
        layoutRow9.setHeightFull();
        layoutRow7.setFlexGrow(1.0, layoutRow9);
        layoutRow9.addClassName(Gap.MEDIUM);
        layoutRow9.addClassName(Padding.MEDIUM);
        layoutRow9.setWidth("131px");
        layoutRow9.getStyle().set("flex-grow", "1");
        layoutRow9.setAlignItems(Alignment.CENTER);
        layoutRow9.setJustifyContentMode(JustifyContentMode.CENTER);
        h36.setText("$ 3,50");
        layoutRow9.setAlignSelf(FlexComponent.Alignment.CENTER, h36);
        h36.setWidth("max-content");
        layoutRow10.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow10);
        layoutRow10.addClassName(Gap.MEDIUM);
        layoutRow10.setWidth("100%");
        layoutRow10.getStyle().set("flex-grow", "1");
        h37.setText("Atun en lata");
        layoutRow10.setAlignSelf(FlexComponent.Alignment.CENTER, h37);
        h37.setWidth("max-content");
        layoutRow11.setHeightFull();
        layoutRow10.setFlexGrow(1.0, layoutRow11);
        layoutRow11.addClassName(Gap.MEDIUM);
        layoutRow11.setWidth("820px");
        layoutRow11.getStyle().set("flex-grow", "1");
        layoutRow11.setAlignItems(Alignment.CENTER);
        layoutRow11.setJustifyContentMode(JustifyContentMode.CENTER);
        numberField4.setLabel("Cantidad");
        layoutRow11.setAlignSelf(FlexComponent.Alignment.CENTER, numberField4);
        numberField4.setWidth("min-content");
        layoutRow12.setHeightFull();
        layoutRow10.setFlexGrow(1.0, layoutRow12);
        layoutRow12.addClassName(Gap.MEDIUM);
        layoutRow12.setWidth("100px");
        layoutRow12.getStyle().set("flex-grow", "1");
        layoutRow12.setAlignItems(Alignment.CENTER);
        layoutRow12.setJustifyContentMode(JustifyContentMode.CENTER);
        h38.setText("$2");
        layoutRow12.setAlignSelf(FlexComponent.Alignment.CENTER, h38);
        h38.setWidth("max-content");
        layoutRow13.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow13);
        layoutRow13.addClassName(Gap.XLARGE);
        layoutRow13.addClassName(Padding.XSMALL);
        layoutRow13.setWidth("100%");
        layoutRow13.getStyle().set("flex-grow", "1");
        layoutRow13.setAlignItems(Alignment.CENTER);
        layoutRow13.setJustifyContentMode(JustifyContentMode.START);
        buttonPrimary.setText("Cancelar la compra");
        layoutRow13.setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary);
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        layoutRow14.setHeightFull();
        layoutRow13.setFlexGrow(1.0, layoutRow14);
        layoutRow14.addClassName(Gap.MEDIUM);
        layoutRow14.addClassName(Padding.XSMALL);
        layoutRow14.getStyle().set("flex-grow", "1");
        layoutRow14.getStyle().set("flex-grow", "1");
        layoutRow14.setAlignItems(Alignment.CENTER);
        layoutRow14.setJustifyContentMode(JustifyContentMode.END);
        buttonPrimary2.setText("Proceder al pago");
        layoutRow14.setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary2);
        buttonPrimary2.setWidth("min-content");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(h1);
        getContent().add(layoutRow);
        layoutRow.add(h3);
        layoutRow.add(layoutRow2);
        layoutRow2.add(numberField);
        layoutRow.add(layoutRow3);
        layoutRow3.add(h32);
        getContent().add(layoutRow4);
        layoutRow4.add(h33);
        layoutRow4.add(layoutRow5);
        layoutRow5.add(numberField2);
        layoutRow4.add(layoutRow6);
        layoutRow6.add(h34);
        getContent().add(layoutRow7);
        layoutRow7.add(h35);
        layoutRow7.add(layoutRow8);
        layoutRow8.add(numberField3);
        layoutRow7.add(layoutRow9);
        layoutRow9.add(h36);
        getContent().add(layoutRow10);
        layoutRow10.add(h37);
        layoutRow10.add(layoutRow11);
        layoutRow11.add(numberField4);
        layoutRow10.add(layoutRow12);
        layoutRow12.add(h38);
        getContent().add(layoutRow13);
        layoutRow13.add(buttonPrimary);
        layoutRow13.add(layoutRow14);
        layoutRow14.add(buttonPrimary2);


        buttonPrimary.addClickListener(buttonClickEvent -> {numberField.clear();
            numberField2.clear();
            numberField3.clear();
            numberField4.clear();});
        buttonPrimary2.addClickListener(buttonClickEvent -> {
            if (!isNumeroEnteroPositivo(numberField.getValue())
                    || !isNumeroEnteroPositivo(numberField2.getValue())
                    || !isNumeroEnteroPositivo(numberField3.getValue())
                    || !isNumeroEnteroPositivo(numberField4.getValue())) {
                Notification.show("Por favor, ingrese cantidades válidas en todos los campos", 3000, Notification.Position.MIDDLE);
            } else {
                Double cantidad1 = numberField.getValue();
                Double cantidad2 = numberField2.getValue();
                Double cantidad3 = numberField3.getValue();
                Double cantidad4 = numberField4.getValue();

                // Aquí puedes agregar lógica adicional antes de redirigir a la otra vista
                // Por ejemplo, puedes guardar los valores ingresados o realizar otras operaciones.

                // Redirigir a la otra vista
                getUI().ifPresent(ui -> {ui.getSession().setAttribute("cantidad1", cantidad1);
                    ui.getSession().setAttribute("cantidad2", cantidad2);
                    ui.getSession().setAttribute("cantidad3", cantidad3);
                    ui.getSession().setAttribute("cantidad4", cantidad4);
                    ui.navigate(DetailSaleView.class);
                });
            }
        });
        // ... (resto del código)
    }






    private boolean isNumeroEnteroPositivo(Double value) {
        return value != null && value >= 0 && value.intValue() == value.doubleValue();
    }

}
