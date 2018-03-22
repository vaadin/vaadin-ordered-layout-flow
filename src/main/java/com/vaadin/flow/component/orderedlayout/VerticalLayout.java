/*
 * Copyright 2000-2017 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.flow.component.orderedlayout;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

/**
 * VerticalLayout is a component container, which shows the subcomponents in the
 * order of their addition (vertically). A vertical layout is by default 100%
 * wide.
 */
@Tag("vaadin-vertical-layout")
@HtmlImport("frontend://bower_components/vaadin-ordered-layout/src/vaadin-vertical-layout.html")
public class VerticalLayout extends Component
        implements ThemableLayout, FlexComponent<VerticalLayout> {

    /**
     * Constructs an empty layout with spacing and padding on by default.
     */
    public VerticalLayout() {
        setSpacing(true);
        setPadding(true);
    }

    /**
     * Convenience constructor to create a layout with the children already
     * inside it.
     *
     * @param children
     *            the items to add to this layout
     * @see #add(Component...)
     */
    public VerticalLayout(Component... children) {
        this();
        add(children);
    }

    /**
     * {@inheritDoc}
     * <p>
     * Spacing is enabled by default for vertical layout.
     *
     * @param spacing adds {@code spacing} theme setting if {@code true} or removes it if {@code false}
     */
    @Override
    public void setSpacing(boolean spacing) {
        ThemableLayout.super.setSpacing(spacing);
    }

    /**
     * {@inheritDoc}
     * <p>
     * Padding is enabled by default for vertical layout.
     *
     * @param padding adds {@code padding} theme setting if {@code true} or removes it if {@code false}
     */
    @Override
    public void setPadding(boolean padding) {
        ThemableLayout.super.setPadding(padding);
    }

    /**
     * Sets a horizontal alignment for individual components inside the layout.
     * This individual alignment for the component overrides any alignment set
     * at the {@link #setDefaultHorizontalComponentAlignment(Alignment)}.
     * <p>
     * The default alignment for individual components is
     * {@link Alignment#AUTO}.
     * <p>
     * It's the same as the {@link #setAlignSelf(Alignment, HasElement...)}
     * method
     *
     * @see #setAlignSelf(Alignment, HasElement...)
     *
     * @param alignment
     *            the individual alignment for the children components. Setting
     *            <code>null</code> will reset the alignment to its default
     * @param componentsToAlign
     *            The components to which the individual alignment should be set
     */
    public void setHorizontalComponentAlignment(Alignment alignment,
            Component... componentsToAlign) {
        setAlignSelf(alignment, componentsToAlign);
    }

    /**
     * Gets the individual horizontal alignment of a given component.
     * <p>
     * The default alignment for individual components is
     * {@link Alignment#AUTO}.
     * <p>
     * It's the same as the {@link #getAlignSelf(HasElement)} method
     *
     * @see #getAlignSelf(HasElement)
     *
     * @param component
     *            The component which individual layout should be read
     * @return the alignment of the component, never <code>null</code>
     */
    public Alignment getHorizontalComponentAlignment(Component component) {
        return getAlignSelf(component);
    }

    /**
     * Sets the default horizontal alignment to be used by all components
     * without individual alignments inside the layout. Individual components
     * can be aligned by using the
     * {@link #setHorizontalComponentAlignment(Alignment, Component...)} method.
     * <p>
     * The default alignment is {@link Alignment#START}.
     * <p>
     * It's the same as the {@link #setAlignItems(Alignment)} method.
     *
     * @see #setAlignItems(Alignment)
     *
     * @param alignment
     *            the alignment to apply to the components. Setting
     *            <code>null</code> will reset the alignment to its default
     */
    public void setDefaultHorizontalComponentAlignment(Alignment alignment) {
        setAlignItems(alignment);
    }

    /**
     * Gets the default horizontal alignment used by all components without
     * individual alignments inside the layout.
     * <p>
     * The default alignment is {@link Alignment#START}.
     * <p>
     * It's the same as the {@link #getAlignItems()} method.
     *
     * @see VerticalLayout#getAlignItems()
     *
     * @return the general alignment used by the layout, never <code>null</code>
     */
    public Alignment getDefaultHorizontalComponentAlignment() {
        return getAlignItems();
    }
}
