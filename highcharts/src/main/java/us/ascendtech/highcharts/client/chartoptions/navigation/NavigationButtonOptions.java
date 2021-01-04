package us.ascendtech.highcharts.client.chartoptions.navigation;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.Theme;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class NavigationButtonOptions {

	@JsProperty
	private String align;
	@JsProperty
	private String alignTo;
	@JsProperty
	private Double buttonSpacing;
	@JsProperty
	private Boolean enabled;
	@JsProperty
	private Double height;
	@JsProperty
	private Double padding;
	@JsProperty
	private String symbolFill;
	@JsProperty
	private Double symbolSize;
	@JsProperty
	private String symbolStroke;
	@JsProperty
	private Double symbolStrokeWidth;
	@JsProperty
	private Double symbolX;
	@JsProperty
	private Double symbolY;
	@JsProperty
	private String text;
	@JsProperty
	private Theme theme;
	@JsProperty
	private String verticalAlign;
	@JsProperty
	private Double width;
	@JsProperty
	private Double x;
	@JsProperty
	private Double y;
	@JsProperty
	private NavigationButtonOptions zoomIn;
	@JsProperty
	private NavigationButtonOptions zoomOut;

	@JsOverlay
	public final String getAlign() {
		return align;
	}

	@JsOverlay
	public final NavigationButtonOptions setAlign(String align) {
		this.align = align;
		return this;
	}

	@JsOverlay
	public final String getAlignTo() {
		return alignTo;
	}

	@JsOverlay
	public final NavigationButtonOptions setAlignTo(String alignTo) {
		this.alignTo = alignTo;
		return this;
	}

	@JsOverlay
	public final double getButtonSpacing() {
		return buttonSpacing;
	}

	@JsOverlay
	public final NavigationButtonOptions setButtonSpacing(double buttonSpacing) {
		this.buttonSpacing = buttonSpacing;
		return this;
	}

	@JsOverlay
	public final Boolean getEnabled() {
		return enabled;
	}

	@JsOverlay
	public final NavigationButtonOptions setEnabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final double getHeight() {
		return height;
	}

	@JsOverlay
	public final NavigationButtonOptions setHeight(double height) {
		this.height = height;
		return this;
	}

	@JsOverlay
	public final Double getPadding() {
		return padding;
	}

	@JsOverlay
	public final NavigationButtonOptions setPadding(Double padding) {
		this.padding = padding;
		return this;
	}

	@JsOverlay
	public final String getSymbolFill() {
		return symbolFill;
	}

	@JsOverlay
	public final NavigationButtonOptions setSymbolFill(String symbolFill) {
		this.symbolFill = symbolFill;
		return this;
	}

	@JsOverlay
	public final double getSymbolSize() {
		return symbolSize;
	}

	@JsOverlay
	public final NavigationButtonOptions setSymbolSize(double symbolSize) {
		this.symbolSize = symbolSize;
		return this;
	}

	@JsOverlay
	public final String getSymbolStroke() {
		return symbolStroke;
	}

	@JsOverlay
	public final NavigationButtonOptions setSymbolStroke(String symbolStroke) {
		this.symbolStroke = symbolStroke;
		return this;
	}

	@JsOverlay
	public final double getSymbolStrokeWidth() {
		return symbolStrokeWidth;
	}

	@JsOverlay
	public final NavigationButtonOptions setSymbolStrokeWidth(double symbolStrokeWidth) {
		this.symbolStrokeWidth = symbolStrokeWidth;
		return this;
	}

	@JsOverlay
	public final double getSymbolX() {
		return symbolX;
	}

	@JsOverlay
	public final NavigationButtonOptions setSymbolX(double symbolX) {
		this.symbolX = symbolX;
		return this;
	}

	@JsOverlay
	public final double getSymbolY() {
		return symbolY;
	}

	@JsOverlay
	public final NavigationButtonOptions setSymbolY(double symbolY) {
		this.symbolY = symbolY;
		return this;
	}

	@JsOverlay
	public final String getText() {
		return text;
	}

	@JsOverlay
	public final NavigationButtonOptions setText(String text) {
		this.text = text;
		return this;
	}

	@JsOverlay
	public final Theme getTheme() {
		return theme;
	}

	@JsOverlay
	public final NavigationButtonOptions setTheme(Theme theme) {
		this.theme = theme;
		return this;
	}

	@JsOverlay
	public final String getVerticalAlign() {
		return verticalAlign;
	}

	@JsOverlay
	public final NavigationButtonOptions setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		return this;
	}

	@JsOverlay
	public final double getWidth() {
		return width;
	}

	@JsOverlay
	public final NavigationButtonOptions setWidth(double width) {
		this.width = width;
		return this;
	}

	@JsOverlay
	public final Double getX() {
		return x;
	}

	@JsOverlay
	public final NavigationButtonOptions setX(Double x) {
		this.x = x;
		return this;
	}

	@JsOverlay
	public final double getY() {
		return y;
	}

	@JsOverlay
	public final NavigationButtonOptions setY(double y) {
		this.y = y;
		return this;
	}

	@JsOverlay
	public final NavigationButtonOptions getZoomIn() {
		return zoomIn;
	}

	@JsOverlay
	public final NavigationButtonOptions setZoomIn(NavigationButtonOptions zoomIn) {
		this.zoomIn = zoomIn;
		return this;
	}

	@JsOverlay
	public final NavigationButtonOptions getZoomOut() {
		return zoomOut;
	}

	@JsOverlay
	public final NavigationButtonOptions setZoomOut(NavigationButtonOptions zoomOut) {
		this.zoomOut = zoomOut;
		return this;
	}
}
