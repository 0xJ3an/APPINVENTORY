package com.example.application.views.detailsale;

import com.example.application.views.MainLayout;
import com.example.application.views.cambio.CambioView;
import com.example.application.views.products.ProductsView;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

import java.text.NumberFormat;
import java.util.Locale;


@PageTitle("DetailSale")
@Route(value = "my-view3", layout = MainLayout.class)
@Uses(Icon.class)
public class DetailSaleView extends Composite<VerticalLayout> {
    private Double cantidad1;
    private Double cantidad2;
    private Double cantidad3;
    private Double cantidad4;
    public DetailSaleView() {
        H1 h1 = new H1();
        HorizontalLayout layoutRow = new HorizontalLayout();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        H3 h3 = new H3();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        H3 h32 = new H3();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        H3 h33 = new H3();
        HorizontalLayout layoutRow5 = new HorizontalLayout();
        H3 h34 = new H3();
        HorizontalLayout layoutRow6 = new HorizontalLayout();
        H3 h35 = new H3();
        HorizontalLayout layoutRow7 = new HorizontalLayout();
        H3 h36 = new H3();
        HorizontalLayout layoutRow31 = new HorizontalLayout();
        HorizontalLayout layoutRow8 = new HorizontalLayout();
        H3 h37 = new H3();
        HorizontalLayout layoutRow32 = new HorizontalLayout();
        HorizontalLayout layoutRow9 = new HorizontalLayout();
        H3 h38 = new H3();
        HorizontalLayout layoutRow33 = new HorizontalLayout();
        HorizontalLayout layoutRow10 = new HorizontalLayout();
        H3 h39 = new H3();
        HorizontalLayout layoutRow34 = new HorizontalLayout();
        HorizontalLayout layoutRow11 = new HorizontalLayout();
        H3 h310 = new H3();
        HorizontalLayout layoutRow12 = new HorizontalLayout();
        H3 h311 = new H3();
        HorizontalLayout layoutRow35 = new HorizontalLayout();
        HorizontalLayout layoutRow13 = new HorizontalLayout();
        H3 h312 = new H3();
        HorizontalLayout layoutRow36 = new HorizontalLayout();
        HorizontalLayout layoutRow14 = new HorizontalLayout();
        H3 h313 = new H3();
        HorizontalLayout layoutRow37 = new HorizontalLayout();
        HorizontalLayout layoutRow15 = new HorizontalLayout();
        H3 h314 = new H3();
        HorizontalLayout layoutRow38 = new HorizontalLayout();
        HorizontalLayout layoutRow16 = new HorizontalLayout();
        H3 h315 = new H3();
        HorizontalLayout layoutRow17 = new HorizontalLayout();
        H3 h316 = new H3();
        HorizontalLayout layoutRow39 = new HorizontalLayout();
        HorizontalLayout layoutRow18 = new HorizontalLayout();
        H3 h317 = new H3();
        HorizontalLayout layoutRow40 = new HorizontalLayout();
        HorizontalLayout layoutRow19 = new HorizontalLayout();
        H3 h318 = new H3();
        HorizontalLayout layoutRow41 = new HorizontalLayout();
        HorizontalLayout layoutRow20 = new HorizontalLayout();
        H3 h319 = new H3();
        HorizontalLayout layoutRow42 = new HorizontalLayout();
        HorizontalLayout layoutRow21 = new HorizontalLayout();
        H3 h320 = new H3();
        HorizontalLayout layoutRow22 = new HorizontalLayout();
        H3 h321 = new H3();
        HorizontalLayout layoutRow43 = new HorizontalLayout();
        HorizontalLayout layoutRow23 = new HorizontalLayout();
        H3 h322 = new H3();
        HorizontalLayout layoutRow44 = new HorizontalLayout();
        HorizontalLayout layoutRow24 = new HorizontalLayout();
        H3 h323 = new H3();
        HorizontalLayout layoutRow45 = new HorizontalLayout();
        HorizontalLayout layoutRow25 = new HorizontalLayout();
        H3 h324 = new H3();
        HorizontalLayout layoutRow46 = new HorizontalLayout();
        HorizontalLayout layoutRow26 = new HorizontalLayout();
        H3 h325 = new H3();
        HorizontalLayout layoutRow27 = new HorizontalLayout();
        H3 h326 = new H3();
        HorizontalLayout layoutRow28 = new HorizontalLayout();
        H3 h327 = new H3();
        HorizontalLayout layoutRow29 = new HorizontalLayout();
        HorizontalLayout layoutRow30 = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonPrimary2 = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        h1.setText("Detalles de la venta");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, h1);
        h1.setWidth("max-content");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        layoutRow2.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        h3.setText("Artículo");
        h3.setWidth("max-content");
        layoutRow3.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.getStyle().set("flex-grow", "1");
        h32.setText("Cantidad");
        h32.setWidth("max-content");
        layoutRow4.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutRow4);
        layoutRow4.addClassName(Gap.MEDIUM);
        layoutRow4.setWidth("100%");
        layoutRow4.getStyle().set("flex-grow", "1");
        h33.setText("Precio");
        h33.setWidth("max-content");
        layoutRow5.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutRow5);
        layoutRow5.addClassName(Gap.MEDIUM);
        layoutRow5.setWidth("100%");
        layoutRow5.getStyle().set("flex-grow", "1");
        h34.setText("Precio + Iva");
        h34.setWidth("max-content");
        layoutRow6.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutRow6);
        layoutRow6.addClassName(Gap.MEDIUM);
        layoutRow6.setWidth("100%");
        layoutRow6.getStyle().set("flex-grow", "1");
        h35.setText("Total a pagar");
        h35.setWidth("max-content");
        layoutRow7.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow7);
        layoutRow7.addClassName(Gap.MEDIUM);
        layoutRow7.setWidth("100%");
        layoutRow7.getStyle().set("flex-grow", "1");
        h36.setText("Aceite Oliva");
        h36.setWidth("max-content");
        layoutRow31.setHeightFull();
        layoutRow7.setFlexGrow(1.0, layoutRow31);
        layoutRow31.addClassName(Gap.MEDIUM);
        layoutRow31.setWidth("95px");
        layoutRow31.getStyle().set("flex-grow", "1");
        layoutRow8.setHeightFull();
        layoutRow7.setFlexGrow(1.0, layoutRow8);
        layoutRow8.addClassName(Gap.MEDIUM);
        layoutRow8.setWidth("100%");
        layoutRow8.getStyle().set("flex-grow", "1");
        h37.setText("0");
        h37.setWidth("max-content");
        layoutRow32.setHeightFull();
        layoutRow8.setFlexGrow(1.0, layoutRow32);
        layoutRow32.addClassName(Gap.MEDIUM);
        layoutRow32.setWidth("150px");
        layoutRow32.getStyle().set("flex-grow", "1");
        layoutRow9.setHeightFull();
        layoutRow8.setFlexGrow(1.0, layoutRow9);
        layoutRow9.addClassName(Gap.MEDIUM);
        layoutRow9.setWidth("100%");
        layoutRow9.getStyle().set("flex-grow", "1");
        h38.setText("0");
        h38.setWidth("max-content");
        layoutRow33.setHeightFull();
        layoutRow9.setFlexGrow(1.0, layoutRow33);
        layoutRow33.addClassName(Gap.MEDIUM);
        layoutRow33.setWidth("185px");
        layoutRow33.getStyle().set("flex-grow", "1");
        layoutRow10.setHeightFull();
        layoutRow9.setFlexGrow(1.0, layoutRow10);
        layoutRow10.addClassName(Gap.MEDIUM);
        layoutRow10.setWidth("100%");
        layoutRow10.getStyle().set("flex-grow", "1");
        h39.setText("0");
        h39.setWidth("max-content");
        layoutRow34.setHeightFull();
        layoutRow10.setFlexGrow(1.0, layoutRow34);
        layoutRow34.addClassName(Gap.MEDIUM);
        layoutRow34.setWidth("100%");
        layoutRow34.getStyle().set("flex-grow", "1");
        layoutRow11.setHeightFull();
        layoutRow10.setFlexGrow(1.0, layoutRow11);
        layoutRow11.addClassName(Gap.MEDIUM);
        layoutRow11.setWidth("100%");
        layoutRow11.getStyle().set("flex-grow", "1");
        h310.setText("0");
        h310.setWidth("max-content");
        layoutRow12.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow12);
        layoutRow12.addClassName(Gap.MEDIUM);
        layoutRow12.setWidth("100%");
        layoutRow12.getStyle().set("flex-grow", "1");
        h311.setText("Leche de vaca");
        h311.setWidth("max-content");
        layoutRow35.setHeightFull();
        layoutRow12.setFlexGrow(1.0, layoutRow35);
        layoutRow35.addClassName(Gap.MEDIUM);
        layoutRow35.setWidth("75px");
        layoutRow35.getStyle().set("flex-grow", "1");
        layoutRow13.setHeightFull();
        layoutRow12.setFlexGrow(1.0, layoutRow13);
        layoutRow13.addClassName(Gap.MEDIUM);
        layoutRow13.setWidth("100%");
        layoutRow13.getStyle().set("flex-grow", "1");
        h312.setText("0");
        h312.setWidth("max-content");
        layoutRow36.setHeightFull();
        layoutRow13.setFlexGrow(1.0, layoutRow36);
        layoutRow36.addClassName(Gap.MEDIUM);
        layoutRow36.setWidth("150px");
        layoutRow36.getStyle().set("flex-grow", "1");
        layoutRow14.setHeightFull();
        layoutRow13.setFlexGrow(1.0, layoutRow14);
        layoutRow14.addClassName(Gap.MEDIUM);
        layoutRow14.setWidth("100%");
        layoutRow14.getStyle().set("flex-grow", "1");
        h313.setText("0");
        h313.setWidth("max-content");
        layoutRow37.setHeightFull();
        layoutRow14.setFlexGrow(1.0, layoutRow37);
        layoutRow37.addClassName(Gap.MEDIUM);
        layoutRow37.setWidth("185px");
        layoutRow37.getStyle().set("flex-grow", "1");
        layoutRow15.setHeightFull();
        layoutRow14.setFlexGrow(1.0, layoutRow15);
        layoutRow15.addClassName(Gap.MEDIUM);
        layoutRow15.setWidth("100%");
        layoutRow15.getStyle().set("flex-grow", "1");
        h314.setText("0");
        h314.setWidth("max-content");
        layoutRow38.setHeightFull();
        layoutRow15.setFlexGrow(1.0, layoutRow38);
        layoutRow38.addClassName(Gap.MEDIUM);
        layoutRow38.setWidth("100%");
        layoutRow38.getStyle().set("flex-grow", "1");
        layoutRow16.setHeightFull();
        layoutRow15.setFlexGrow(1.0, layoutRow16);
        layoutRow16.addClassName(Gap.MEDIUM);
        layoutRow16.setWidth("100%");
        layoutRow16.getStyle().set("flex-grow", "1");
        h315.setText("0");
        h315.setWidth("max-content");
        layoutRow17.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow17);
        layoutRow17.addClassName(Gap.MEDIUM);
        layoutRow17.setWidth("100%");
        layoutRow17.getStyle().set("flex-grow", "1");
        h316.setText("Atun en lata");
        h316.setWidth("max-content");
        layoutRow39.setHeightFull();
        layoutRow17.setFlexGrow(1.0, layoutRow39);
        layoutRow39.addClassName(Gap.MEDIUM);
        layoutRow39.setWidth("95px");
        layoutRow39.getStyle().set("flex-grow", "1");
        layoutRow18.setHeightFull();
        layoutRow17.setFlexGrow(1.0, layoutRow18);
        layoutRow18.addClassName(Gap.MEDIUM);
        layoutRow18.setWidth("100%");
        layoutRow18.getStyle().set("flex-grow", "1");
        h317.setText("0");
        h317.setWidth("max-content");
        layoutRow40.setHeightFull();
        layoutRow18.setFlexGrow(1.0, layoutRow40);
        layoutRow40.addClassName(Gap.MEDIUM);
        layoutRow40.setWidth("150px");
        layoutRow40.getStyle().set("flex-grow", "1");
        layoutRow19.setHeightFull();
        layoutRow18.setFlexGrow(1.0, layoutRow19);
        layoutRow19.addClassName(Gap.MEDIUM);
        layoutRow19.setWidth("100%");
        layoutRow19.getStyle().set("flex-grow", "1");
        h318.setText("0");
        h318.setWidth("max-content");
        layoutRow41.setHeightFull();
        layoutRow19.setFlexGrow(1.0, layoutRow41);
        layoutRow41.addClassName(Gap.MEDIUM);
        layoutRow41.setWidth("185px");
        layoutRow41.getStyle().set("flex-grow", "1");
        layoutRow20.setHeightFull();
        layoutRow19.setFlexGrow(1.0, layoutRow20);
        layoutRow20.addClassName(Gap.MEDIUM);
        layoutRow20.setWidth("100%");
        layoutRow20.getStyle().set("flex-grow", "1");
        h319.setText("0");
        h319.setWidth("max-content");
        layoutRow42.setHeightFull();
        layoutRow20.setFlexGrow(1.0, layoutRow42);
        layoutRow42.addClassName(Gap.MEDIUM);
        layoutRow42.setWidth("100%");
        layoutRow42.getStyle().set("flex-grow", "1");
        layoutRow21.setHeightFull();
        layoutRow20.setFlexGrow(1.0, layoutRow21);
        layoutRow21.addClassName(Gap.MEDIUM);
        layoutRow21.setWidth("100%");
        layoutRow21.getStyle().set("flex-grow", "1");
        h320.setText("0");
        h320.setWidth("max-content");
        layoutRow22.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow22);
        layoutRow22.addClassName(Gap.MEDIUM);
        layoutRow22.setWidth("100%");
        layoutRow22.getStyle().set("flex-grow", "1");
        h321.setText("Huevos");
        h321.setWidth("max-content");
        layoutRow43.setHeightFull();
        layoutRow22.setFlexGrow(1.0, layoutRow43);
        layoutRow43.addClassName(Gap.MEDIUM);
        layoutRow43.setWidth("140px");
        layoutRow43.getStyle().set("flex-grow", "1");
        layoutRow23.setHeightFull();
        layoutRow22.setFlexGrow(1.0, layoutRow23);
        layoutRow23.addClassName(Gap.MEDIUM);
        layoutRow23.setWidth("100%");
        layoutRow23.getStyle().set("flex-grow", "1");
        h322.setText("0");
        layoutRow23.setAlignSelf(FlexComponent.Alignment.START, h322);
        h322.setWidth("max-content");
        layoutRow44.setHeightFull();
        layoutRow23.setFlexGrow(1.0, layoutRow44);
        layoutRow44.addClassName(Gap.MEDIUM);
        layoutRow44.setWidth("150px");
        layoutRow44.getStyle().set("flex-grow", "1");
        layoutRow24.setHeightFull();
        layoutRow23.setFlexGrow(1.0, layoutRow24);
        layoutRow24.addClassName(Gap.MEDIUM);
        layoutRow24.setWidth("100%");
        layoutRow24.getStyle().set("flex-grow", "1");
        h323.setText("0");
        h323.setWidth("max-content");
        layoutRow45.setHeightFull();
        layoutRow24.setFlexGrow(1.0, layoutRow45);
        layoutRow45.addClassName(Gap.MEDIUM);
        layoutRow45.setWidth("185px");
        layoutRow45.getStyle().set("flex-grow", "1");
        layoutRow25.setHeightFull();
        layoutRow24.setFlexGrow(1.0, layoutRow25);
        layoutRow25.addClassName(Gap.MEDIUM);
        layoutRow25.setWidth("100%");
        layoutRow25.getStyle().set("flex-grow", "1");
        h324.setText("0");
        h324.setWidth("max-content");
        layoutRow46.setHeightFull();
        layoutRow25.setFlexGrow(1.0, layoutRow46);
        layoutRow46.addClassName(Gap.MEDIUM);
        layoutRow46.setWidth("100%");
        layoutRow46.getStyle().set("flex-grow", "1");
        layoutRow26.setHeightFull();
        layoutRow25.setFlexGrow(1.0, layoutRow26);
        layoutRow26.addClassName(Gap.MEDIUM);
        layoutRow26.setWidth("100%");
        layoutRow26.getStyle().set("flex-grow", "1");
        h325.setText("0");
        h325.setWidth("max-content");
        layoutRow27.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow27);
        layoutRow27.addClassName(Gap.MEDIUM);
        layoutRow27.setWidth("100%");
        layoutRow27.getStyle().set("flex-grow", "1");
        h326.setText("Total:");
        h326.setWidth("max-content");
        layoutRow28.setHeightFull();
        layoutRow27.setFlexGrow(1.0, layoutRow28);
        layoutRow28.addClassName(Gap.MEDIUM);
        layoutRow28.setWidth("100%");
        layoutRow28.getStyle().set("flex-grow", "1");
        h327.setText("0");
        h327.setWidth("max-content");
        layoutRow29.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow29);
        layoutRow29.addClassName(Gap.MEDIUM);
        layoutRow29.setWidth("100%");
        layoutRow29.getStyle().set("flex-grow", "1");
        layoutRow29.setAlignItems(Alignment.CENTER);
        layoutRow29.setJustifyContentMode(JustifyContentMode.END);
        layoutRow30.setHeightFull();
        layoutRow29.setFlexGrow(1.0, layoutRow30);
        layoutRow30.setWidth("1087px");
        layoutRow30.setHeight("50px");
        layoutRow30.setAlignItems(Alignment.CENTER);
        layoutRow30.setJustifyContentMode(JustifyContentMode.START);
        buttonPrimary.setText("Regresar");
        layoutRow30.setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary);
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary2.setText("Pagar");
        buttonPrimary2.setWidth("min-content");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(h1);
        getContent().add(layoutRow);
        layoutRow.add(layoutRow2);
        layoutRow2.add(h3);
        layoutRow.add(layoutRow3);
        layoutRow3.add(h32);
        layoutRow.add(layoutRow4);
        layoutRow4.add(h33);
        layoutRow.add(layoutRow5);
        layoutRow5.add(h34);
        layoutRow.add(layoutRow6);
        layoutRow6.add(h35);
        getContent().add(layoutRow7);
        layoutRow7.add(h36);
        layoutRow7.add(layoutRow31);
        layoutRow7.add(layoutRow8);
        layoutRow8.add(h37);
        layoutRow8.add(layoutRow32);
        layoutRow8.add(layoutRow9);
        layoutRow9.add(h38);
        layoutRow9.add(layoutRow33);
        layoutRow9.add(layoutRow10);
        layoutRow10.add(h39);
        layoutRow10.add(layoutRow34);
        layoutRow10.add(layoutRow11);
        layoutRow11.add(h310);
        getContent().add(layoutRow12);
        layoutRow12.add(h311);
        layoutRow12.add(layoutRow35);
        layoutRow12.add(layoutRow13);
        layoutRow13.add(h312);
        layoutRow13.add(layoutRow36);
        layoutRow13.add(layoutRow14);
        layoutRow14.add(h313);
        layoutRow14.add(layoutRow37);
        layoutRow14.add(layoutRow15);
        layoutRow15.add(h314);
        layoutRow15.add(layoutRow38);
        layoutRow15.add(layoutRow16);
        layoutRow16.add(h315);
        getContent().add(layoutRow17);
        layoutRow17.add(h316);
        layoutRow17.add(layoutRow39);
        layoutRow17.add(layoutRow18);
        layoutRow18.add(h317);
        layoutRow18.add(layoutRow40);
        layoutRow18.add(layoutRow19);
        layoutRow19.add(h318);
        layoutRow19.add(layoutRow41);
        layoutRow19.add(layoutRow20);
        layoutRow20.add(h319);
        layoutRow20.add(layoutRow42);
        layoutRow20.add(layoutRow21);
        layoutRow21.add(h320);
        getContent().add(layoutRow22);
        layoutRow22.add(h321);
        layoutRow22.add(layoutRow43);
        layoutRow22.add(layoutRow23);
        layoutRow23.add(h322);
        layoutRow23.add(layoutRow44);
        layoutRow23.add(layoutRow24);
        layoutRow24.add(h323);
        layoutRow24.add(layoutRow45);
        layoutRow24.add(layoutRow25);
        layoutRow25.add(h324);
        layoutRow25.add(layoutRow46);
        layoutRow25.add(layoutRow26);
        layoutRow26.add(h325);
        getContent().add(layoutRow27);
        layoutRow27.add(h326);
        layoutRow27.add(layoutRow28);
        layoutRow28.add(h327);
        getContent().add(layoutRow29);
        layoutRow29.add(layoutRow30);
        layoutRow30.add(buttonPrimary);
        layoutRow29.add(buttonPrimary2);

        UI ui = UI.getCurrent();
        cantidad1 = (Double) ui.getSession().getAttribute("cantidad1");
        cantidad2 = (Double) ui.getSession().getAttribute("cantidad2");
        cantidad3 = (Double) ui.getSession().getAttribute("cantidad3");
        cantidad4 = (Double) ui.getSession().getAttribute("cantidad4");

        // Calcular los totales y configurar los valores en tus componentes (h37, h38, h39, h310)
        double precioUnitarioAceiteOliva = 15.0;  // Reemplaza con el precio real
        double precioUnitarioLecheVaca = 2.5;     // Reemplaza con el precio real
        double precioUnitarioAtunLata = 2;      // Reemplaza con el precio real
        double precioUnitarioHuevos = 3.5;        // Reemplaza con el precio real
        double iva = 0.12;                        // Porcentaje de IVA
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setMinimumFractionDigits(2);

        h37.setText(cantidad1.toString());
        h38.setText("$15");
        h39.setText(numberFormat.format(15 * (1 + iva)));
        // Calcular totales para Aceite Oliva
        double totalAceiteOliva = cantidad1 * precioUnitarioAceiteOliva;
        double totalAceiteOlivaIva = totalAceiteOliva * (1 + iva);
        h310.setText(numberFormat.format(totalAceiteOlivaIva));

        h312.setText(cantidad2.toString());
        h313.setText("$2.50");
        h314.setText(numberFormat.format(2.50*(1+iva)));
        // Calcular totales para Leche de Vaca
        double totalLecheVaca = cantidad2 * precioUnitarioLecheVaca;
        double totalLecheVacaIva = totalLecheVaca * (1 + iva);
        h315.setText(numberFormat.format(totalLecheVacaIva));
        h317.setText(cantidad3.toString());
        h318.setText("$2");
        h319.setText(numberFormat.format(2*(1+iva)));
        // Calcular totales para Atún en lata
        double totalAtunLata = cantidad3 * precioUnitarioAtunLata;
        double totalAtunLataIva = totalAtunLata * (1 + iva);
        h320.setText(numberFormat.format(totalAtunLataIva));
        h322.setText(cantidad4.toString());
        h323.setText("$3.50");
        h324.setText(numberFormat.format(3.50*(1+iva)));
        // Calcular totales para Huevos
        double totalHuevos = cantidad4 * precioUnitarioHuevos;
        double totalHuevosIva = totalHuevos * (1 + iva);
        h325.setText(numberFormat.format(totalHuevosIva));

        // Calcular totales generales
        double totalGeneral = totalAceiteOlivaIva + totalLecheVacaIva + totalAtunLataIva + totalHuevosIva;
        h327.setText(numberFormat.format(totalGeneral));

        buttonPrimary.addClickListener(event -> {
            // Regresar a la vista anterior
            UI.getCurrent().navigate(ProductsView.class);
        });

        buttonPrimary2.addClickListener(event -> {
            // Guardar el valor total en la sesión

            UI.getCurrent().getSession().setAttribute("totalGeneral", totalGeneral);

            // Ir a la siguiente vista
            UI.getCurrent().navigate(CambioView.class);
        });
    }




}
