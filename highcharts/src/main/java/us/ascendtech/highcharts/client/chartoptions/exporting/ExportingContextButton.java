package us.ascendtech.highcharts.client.chartoptions.exporting;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.Theme;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.OnClick;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ExportingContextButton {

	@JsProperty
	private String _titleKey;
	@JsProperty
	private String align;
	@JsProperty
	private double buttonSpacing;
	@JsProperty
	private String className;
	@JsProperty
	private Boolean enabled;
	@JsProperty
	private double height;
	@JsProperty
	private String menuClassName;
	@JsProperty
	private JsArray<String> menuItems;
	@JsProperty
	private OnClick onclick;
	@JsProperty
	private String symbol;
	@JsProperty
	private String symbolFill;
	@JsProperty
	private String symbolSize;
	@JsProperty
	private String symbolStroke;
	@JsProperty
	private double symbolStrokeWidth;
	@JsProperty
	private double symbolX;
	@JsProperty
	private double symbolY;
	@JsProperty
	private String text;
	@JsProperty
	private Theme theme;
	@JsProperty
	private String verticalAlign;
	@JsProperty
	private double width;
	@JsProperty
	private double x;
	@JsProperty
	private double y;

	@JsOverlay
	public final String get_titleKey() {
		return _titleKey;
	}

	@JsOverlay
	public final ExportingContextButton set_titleKey(String _titleKey) {
		this._titleKey = _titleKey;
		return this;
	}

	@JsOverlay
	public final String getAlign() {
		return align;
	}

	@JsOverlay
	public final ExportingContextButton setAlign(String align) {
		this.align = align;
		return this;
	}

	@JsOverlay
	public final double getButtonSpacing() {
		return buttonSpacing;
	}

	@JsOverlay
	public final ExportingContextButton setButtonSpacing(double buttonSpacing) {
		this.buttonSpacing = buttonSpacing;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final ExportingContextButton setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final Boolean getEnabled() {
		return enabled;
	}

	@JsOverlay
	public final ExportingContextButton setEnabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final double getHeight() {
		return height;
	}

	@JsOverlay
	public final ExportingContextButton setHeight(double height) {
		this.height = height;
		return this;
	}

	@JsOverlay
	public final String getMenuClassName() {
		return menuClassName;
	}

	@JsOverlay
	public final ExportingContextButton setMenuClassName(String menuClassName) {
		this.menuClassName = menuClassName;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getMenuItems() {
		return menuItems;
	}

	@JsOverlay
	public final ExportingContextButton setMenuItems(JsArray<String> menuItems) {
		this.menuItems = menuItems;
		return this;
	}

	@JsOverlay
	public final OnClick getOnclick() {
		return onclick;
	}

	@JsOverlay
	public final ExportingContextButton setOnclick(OnClick onclick) {
		this.onclick = onclick;
		return this;
	}

	@JsOverlay
	public final String getSymbol() {
		return symbol;
	}

	@JsOverlay
	public final ExportingContextButton setSymbol(String symbol) {
		this.symbol = symbol;
		return this;
	}

	@JsOverlay
	public final String getSymbolFill() {
		return symbolFill;
	}

	@JsOverlay
	public final ExportingContextButton setSymbolFill(String symbolFill) {
		this.symbolFill = symbolFill;
		return this;
	}

	@JsOverlay
	public final String getSymbolSize() {
		return symbolSize;
	}

	@JsOverlay
	public final ExportingContextButton setSymbolSize(String symbolSize) {
		this.symbolSize = symbolSize;
		return this;
	}

	@JsOverlay
	public final String getSymbolStroke() {
		return symbolStroke;
	}

	@JsOverlay
	public final ExportingContextButton setSymbolStroke(String symbolStroke) {
		this.symbolStroke = symbolStroke;
		return this;
	}

	@JsOverlay
	public final double getSymbolStrokeWidth() {
		return symbolStrokeWidth;
	}

	@JsOverlay
	public final ExportingContextButton setSymbolStrokeWidth(double symbolStrokeWidth) {
		this.symbolStrokeWidth = symbolStrokeWidth;
		return this;
	}

	@JsOverlay
	public final double getSymbolX() {
		return symbolX;
	}

	@JsOverlay
	public final ExportingContextButton setSymbolX(double symbolX) {
		this.symbolX = symbolX;
		return this;
	}

	@JsOverlay
	public final double getSymbolY() {
		return symbolY;
	}

	@JsOverlay
	public final ExportingContextButton setSymbolY(double symbolY) {
		this.symbolY = symbolY;
		return this;
	}

	@JsOverlay
	public final String getText() {
		return text;
	}

	@JsOverlay
	public final ExportingContextButton setText(String text) {
		this.text = text;
		return this;
	}

	@JsOverlay
	public final Theme getTheme() {
		return theme;
	}

	@JsOverlay
	public final ExportingContextButton setTheme(Theme theme) {
		this.theme = theme;
		return this;
	}

	@JsOverlay
	public final String getVerticalAlign() {
		return verticalAlign;
	}

	@JsOverlay
	public final ExportingContextButton setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		return this;
	}

	@JsOverlay
	public final double getWidth() {
		return width;
	}

	@JsOverlay
	public final ExportingContextButton setWidth(double width) {
		this.width = width;
		return this;
	}

	@JsOverlay
	public final double getX() {
		return x;
	}

	@JsOverlay
	public final ExportingContextButton setX(double x) {
		this.x = x;
		return this;
	}

	@JsOverlay
	public final double getY() {
		return y;
	}

	@JsOverlay
	public final ExportingContextButton setY(double y) {
		this.y = y;
		return this;
	}
}
