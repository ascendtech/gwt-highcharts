package us.ascendtech.client.highcharts.js.chartoptions.legend;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.client.highcharts.js.chartoptions.shared.KeyboardNavigation;
import us.ascendtech.client.highcharts.js.chartoptions.shared.Style;
import us.ascendtech.client.highcharts.js.chartoptions.shared.functions.LabelFormatter;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/legend
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Legend {

	@JsProperty
	private String align;
	@JsProperty
	private Boolean alignColumns;
	@JsProperty
	private String backgroundColor;
	@JsProperty
	private String borderColor;
	@JsProperty
	private double borderRadius;
	@JsProperty
	private double borderWidth;
	@JsProperty
	private Boolean enabled;
	@JsProperty
	private double floating;
	@JsProperty
	private Style itemCheckboxStyle;
	@JsProperty
	private double itemDistance;
	@JsProperty
	private Style itemHiddenStyle;
	@JsProperty
	private Style itemHoverStyle;
	@JsProperty
	private double itemMarginBottom;
	@JsProperty
	private double itemMarginTop;
	@JsProperty
	private Style itemStyle;
	@JsProperty
	private double itemWidth;
	@JsProperty
	private KeyboardNavigation keyboardNavigation;
	@JsProperty
	private String labelFormat;
	@JsProperty
	private LabelFormatter labelFormatter;
	@JsProperty
	private String layout;
	@JsProperty
	private double lineHeight;
	@JsProperty
	private double margin;
	@JsProperty
	private double maxHeight;
	@JsProperty
	private LegendNavigation navigation;
	@JsProperty
	private double padding;
	@JsProperty
	private Boolean reversed;
	@JsProperty
	private Boolean rtl;
	@JsProperty
	private Boolean shadow;
	@JsProperty
	private String style; // CSSObject
	@JsProperty
	private double symbolHeight;
	@JsProperty
	private double symbolPadding;
	@JsProperty
	private double symbolRadius;
	@JsProperty
	private double symbolWidth;
	@JsProperty
	private LegendTitle title;
	@JsProperty
	private Boolean useHTML;
	@JsProperty
	private String verticalAlign;
	@JsProperty
	private double width;
	@JsProperty
	private double x;
	@JsProperty
	private double y;

	@JsOverlay
	public final String getAlign() {
		return align;
	}

	@JsOverlay
	public final Legend setAlign(String align) {
		this.align = align;
		return this;
	}

	@JsOverlay
	public final Boolean getAlignColumns() {
		return alignColumns;
	}

	@JsOverlay
	public final Legend setAlignColumns(Boolean alignColumns) {
		this.alignColumns = alignColumns;
		return this;
	}

	@JsOverlay
	public final String getBackgroundColor() {
		return backgroundColor;
	}

	@JsOverlay
	public final Legend setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	@JsOverlay
	public final String getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final Legend setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final double getBorderRadius() {
		return borderRadius;
	}

	@JsOverlay
	public final Legend setBorderRadius(double borderRadius) {
		this.borderRadius = borderRadius;
		return this;
	}

	@JsOverlay
	public final double getBorderWidth() {
		return borderWidth;
	}

	@JsOverlay
	public final Legend setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	@JsOverlay
	public final Boolean getEnabled() {
		return enabled;
	}

	@JsOverlay
	public final Legend setEnabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final double getFloating() {
		return floating;
	}

	@JsOverlay
	public final Legend setFloating(double floating) {
		this.floating = floating;
		return this;
	}

	@JsOverlay
	public final Style getItemCheckboxStyle() {
		return itemCheckboxStyle;
	}

	@JsOverlay
	public final Legend setItemCheckboxStyle(Style itemCheckboxStyle) {
		this.itemCheckboxStyle = itemCheckboxStyle;
		return this;
	}

	@JsOverlay
	public final double getItemDistance() {
		return itemDistance;
	}

	@JsOverlay
	public final Legend setItemDistance(double itemDistance) {
		this.itemDistance = itemDistance;
		return this;
	}

	@JsOverlay
	public final Style getItemHiddenStyle() {
		return itemHiddenStyle;
	}

	@JsOverlay
	public final Legend setItemHiddenStyle(Style itemHiddenStyle) {
		this.itemHiddenStyle = itemHiddenStyle;
		return this;
	}

	@JsOverlay
	public final Style getItemHoverStyle() {
		return itemHoverStyle;
	}

	@JsOverlay
	public final Legend setItemHoverStyle(Style itemHoverStyle) {
		this.itemHoverStyle = itemHoverStyle;
		return this;
	}

	@JsOverlay
	public final double getItemMarginBottom() {
		return itemMarginBottom;
	}

	@JsOverlay
	public final Legend setItemMarginBottom(double itemMarginBottom) {
		this.itemMarginBottom = itemMarginBottom;
		return this;
	}

	@JsOverlay
	public final double getItemMarginTop() {
		return itemMarginTop;
	}

	@JsOverlay
	public final Legend setItemMarginTop(double itemMarginTop) {
		this.itemMarginTop = itemMarginTop;
		return this;
	}

	@JsOverlay
	public final Style getItemStyle() {
		return itemStyle;
	}

	@JsOverlay
	public final Legend setItemStyle(Style itemStyle) {
		this.itemStyle = itemStyle;
		return this;
	}

	@JsOverlay
	public final double getItemWidth() {
		return itemWidth;
	}

	@JsOverlay
	public final Legend setItemWidth(double itemWidth) {
		this.itemWidth = itemWidth;
		return this;
	}

	@JsOverlay
	public final KeyboardNavigation getKeyboardNavigation() {
		return keyboardNavigation;
	}

	@JsOverlay
	public final Legend setKeyboardNavigation(KeyboardNavigation keyboardNavigation) {
		this.keyboardNavigation = keyboardNavigation;
		return this;
	}

	@JsOverlay
	public final String getLabelFormat() {
		return labelFormat;
	}

	@JsOverlay
	public final Legend setLabelFormat(String labelFormat) {
		this.labelFormat = labelFormat;
		return this;
	}

	@JsOverlay
	public final LabelFormatter getLabelFormatter() {
		return labelFormatter;
	}

	@JsOverlay
	public final Legend setLabelFormatter(LabelFormatter labelFormatter) {
		this.labelFormatter = labelFormatter;
		return this;
	}

	@JsOverlay
	public final String getLayout() {
		return layout;
	}

	@JsOverlay
	public final Legend setLayout(String layout) {
		this.layout = layout;
		return this;
	}

	@JsOverlay
	public final double getLineHeight() {
		return lineHeight;
	}

	@JsOverlay
	public final Legend setLineHeight(double lineHeight) {
		this.lineHeight = lineHeight;
		return this;
	}

	@JsOverlay
	public final double getMargin() {
		return margin;
	}

	@JsOverlay
	public final Legend setMargin(double margin) {
		this.margin = margin;
		return this;
	}

	@JsOverlay
	public final double getMaxHeight() {
		return maxHeight;
	}

	@JsOverlay
	public final Legend setMaxHeight(double maxHeight) {
		this.maxHeight = maxHeight;
		return this;
	}

	@JsOverlay
	public final LegendNavigation getNavigation() {
		return navigation;
	}

	@JsOverlay
	public final Legend setNavigation(LegendNavigation navigation) {
		this.navigation = navigation;
		return this;
	}

	@JsOverlay
	public final double getPadding() {
		return padding;
	}

	@JsOverlay
	public final Legend setPadding(double padding) {
		this.padding = padding;
		return this;
	}

	@JsOverlay
	public final Boolean getReversed() {
		return reversed;
	}

	@JsOverlay
	public final Legend setReversed(Boolean reversed) {
		this.reversed = reversed;
		return this;
	}

	@JsOverlay
	public final Boolean getRtl() {
		return rtl;
	}

	@JsOverlay
	public final Legend setRtl(Boolean rtl) {
		this.rtl = rtl;
		return this;
	}

	@JsOverlay
	public final Boolean getShadow() {
		return shadow;
	}

	@JsOverlay
	public final Legend setShadow(Boolean shadow) {
		this.shadow = shadow;
		return this;
	}

	@JsOverlay
	public final String getStyle() {
		return style;
	}

	@JsOverlay
	public final Legend setStyle(String style) {
		this.style = style;
		return this;
	}

	@JsOverlay
	public final double getSymbolHeight() {
		return symbolHeight;
	}

	@JsOverlay
	public final Legend setSymbolHeight(double symbolHeight) {
		this.symbolHeight = symbolHeight;
		return this;
	}

	@JsOverlay
	public final double getSymbolPadding() {
		return symbolPadding;
	}

	@JsOverlay
	public final Legend setSymbolPadding(double symbolPadding) {
		this.symbolPadding = symbolPadding;
		return this;
	}

	@JsOverlay
	public final double getSymbolRadius() {
		return symbolRadius;
	}

	@JsOverlay
	public final Legend setSymbolRadius(double symbolRadius) {
		this.symbolRadius = symbolRadius;
		return this;
	}

	@JsOverlay
	public final double getSymbolWidth() {
		return symbolWidth;
	}

	@JsOverlay
	public final Legend setSymbolWidth(double symbolWidth) {
		this.symbolWidth = symbolWidth;
		return this;
	}

	@JsOverlay
	public final LegendTitle getTitle() {
		return title;
	}

	@JsOverlay
	public final Legend setTitle(LegendTitle title) {
		this.title = title;
		return this;
	}

	@JsOverlay
	public final Boolean getUseHTML() {
		return useHTML;
	}

	@JsOverlay
	public final Legend setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		return this;
	}

	@JsOverlay
	public final String getVerticalAlign() {
		return verticalAlign;
	}

	@JsOverlay
	public final Legend setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		return this;
	}

	@JsOverlay
	public final double getWidth() {
		return width;
	}

	@JsOverlay
	public final Legend setWidth(double width) {
		this.width = width;
		return this;
	}

	@JsOverlay
	public final double getX() {
		return x;
	}

	@JsOverlay
	public final Legend setX(double x) {
		this.x = x;
		return this;
	}

	@JsOverlay
	public final double getY() {
		return y;
	}

	@JsOverlay
	public final Legend setY(double y) {
		this.y = y;
		return this;
	}
}
