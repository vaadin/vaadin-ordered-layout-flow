package com.vaadin.flow.component.orderedlayout.it;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.demo.AbstractLayout;
import com.vaadin.flow.router.Route;

@Route("ordered-layout-tests")
public class OrderedLayoutITView extends Div {

    public OrderedLayoutITView() {
        VerticalLayout verticalLayoutWithSpacing = new VerticalLayout();
        verticalLayoutWithSpacing.setId("vl-spacing");
        verticalLayoutWithSpacing.add(
                AbstractLayout.createToggleThemeButton(
                        verticalLayoutWithSpacing, "spacing-xs"),
                AbstractLayout.createToggleThemeButton(
                        verticalLayoutWithSpacing, "spacing-s"),
                AbstractLayout.createToggleThemeButton(
                        verticalLayoutWithSpacing, "spacing",
                        verticalLayoutWithSpacing::setSpacing),
                AbstractLayout.createToggleThemeButton(
                        verticalLayoutWithSpacing, "spacing-l"),
                AbstractLayout.createToggleThemeButton(
                        verticalLayoutWithSpacing, "spacing-xl"));

        HorizontalLayout horizontalLayoutWithSpacing = new HorizontalLayout();
        horizontalLayoutWithSpacing.setId("hl-spacing");
        horizontalLayoutWithSpacing.add(
                AbstractLayout.createToggleThemeButton(
                        horizontalLayoutWithSpacing, "spacing-xs"),
                AbstractLayout.createToggleThemeButton(
                        horizontalLayoutWithSpacing, "spacing-s"),
                AbstractLayout.createToggleThemeButton(
                        horizontalLayoutWithSpacing, "spacing",
                        horizontalLayoutWithSpacing::setSpacing),
                AbstractLayout.createToggleThemeButton(
                        horizontalLayoutWithSpacing, "spacing-l"),
                AbstractLayout.createToggleThemeButton(
                        horizontalLayoutWithSpacing, "spacing-xl"));


        FlexLayout flayout = new FlexLayout();
        flayout.setId("flex-layout");
        NativeButton noWrap = new NativeButton("no-wrap", e -> {
            flayout.setFlexWrap(FlexLayout.WrapMode.NOWRAP);
        });
        NativeButton wrap = new NativeButton("wrap", e -> {
            flayout.setFlexWrap(FlexLayout.WrapMode.WRAP);
        });
        NativeButton wrapReverse = new NativeButton("wrap-reverse", e -> {
            flayout.setFlexWrap(FlexLayout.WrapMode.WRAP_REVERSE);
        });
        NativeButton wrapModeText = new NativeButton("wrap-mode");
        wrapModeText.setId("text-wrap-mode");
        NativeButton getWrapMode = new NativeButton("Wrap mode", e -> {
            wrapModeText.setText(String.valueOf(flayout.getFlexWrap()));
        });
        noWrap.setId("no-wrap");
        wrap.setId("wrap");
        wrapReverse.setId("wrap-reverse");
        getWrapMode.setId("wrap-mode");
        flayout.add(
                noWrap,
                wrap,
                wrapReverse,
                getWrapMode,
                wrapModeText);

        add(verticalLayoutWithSpacing, horizontalLayoutWithSpacing, flayout);
    }
}
