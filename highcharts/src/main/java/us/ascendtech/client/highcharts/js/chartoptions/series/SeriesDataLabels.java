package us.ascendtech.client.highcharts.js.chartoptions.series;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.client.highcharts.js.chartoptions.shared.Style;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesDataLabels {

	@JsProperty
	private String align;
	@JsProperty
	private Boolean allowOverlap;
	@JsProperty
	private String backgroundColor;
	@JsProperty
	private String borderColor;
	@JsProperty
	private double borderRadius;
	@JsProperty
	private double borderWidth;
	@JsProperty
	private String className;
	@JsProperty
	private String color;
	@JsProperty
	private Boolean crop;
	@JsProperty
	private Boolean defer;
	@JsProperty
	private Boolean enabled;
	@JsProperty
	private SeriesDataLabelsFilter filter;
	@JsProperty
	private String format;
	@JsProperty
	private FormatterFunction formatter;
	@JsProperty
	private Boolean inside;
	@JsProperty
	private String overflow;
	@JsProperty
	private double padding;
	@JsProperty
	private double rotation;
	@JsProperty
	private Boolean shadow;
	@JsProperty
	private String shape;
	@JsProperty
	private Style style;
	@JsProperty
	private Boolean useHTML;
	@JsProperty
	private String verticalAlign;
	@JsProperty
	private double x;
	@JsProperty
	private double y;
	@JsProperty
	private double zIndex;

	@JsFunction
	public interface FormatterFunction {
		SeriesDataLabelsFormatter getFormatter();
	}

	@JsOverlay
	public final String getAlign() {
		return align;
	}

	@JsOverlay
	public final SeriesDataLabels setAlign(String align) {
		this.align = align;
		return this;
	}

	@JsOverlay
	public final Boolean getAllowOverlap() {
		return allowOverlap;
	}

	@JsOverlay
	public final SeriesDataLabels setAllowOverlap(Boolean allowOverlap) {
		this.allowOverlap = allowOverlap;
		return this;
	}

	@JsOverlay
	public final String getBackgroundColor() {
		return backgroundColor;
	}

	@JsOverlay
	public final SeriesDataLabels setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	@JsOverlay
	public final String getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final SeriesDataLabels setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final double getBorderRadius() {
		return borderRadius;
	}

	@JsOverlay
	public final SeriesDataLabels setBorderRadius(double borderRadius) {
		this.borderRadius = borderRadius;
		return this;
	}

	@JsOverlay
	public final double getBorderWidth() {
		return borderWidth;
	}

	@JsOverlay
	public final SeriesDataLabels setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final SeriesDataLabels setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final SeriesDataLabels setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final Boolean getCrop() {
		return crop;
	}

	@JsOverlay
	public final SeriesDataLabels setCrop(Boolean crop) {
		this.crop = crop;
		return this;
	}

	@JsOverlay
	public final Boolean getDefer() {
		return defer;
	}

	@JsOverlay
	public final SeriesDataLabels setDefer(Boolean defer) {
		this.defer = defer;
		return this;
	}

	@JsOverlay
	public final Boolean getEnabled() {
		return enabled;
	}

	@JsOverlay
	public final SeriesDataLabels setEnabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final SeriesDataLabelsFilter getFilter() {
		return filter;
	}

	@JsOverlay
	public final SeriesDataLabels setFilter(SeriesDataLabelsFilter filter) {
		this.filter = filter;
		return this;
	}

	@JsOverlay
	public final String getFormat() {
		return format;
	}

	@JsOverlay
	public final SeriesDataLabels setFormat(String format) {
		this.format = format;
		return this;
	}

	@JsOverlay
	public final FormatterFunction getFormatter() {
		return formatter;
	}

	@JsOverlay
	public final SeriesDataLabels setFormatter(FormatterFunction formatter) {
		this.formatter = formatter;
		return this;
	}

	@JsOverlay
	public final Boolean getInside() {
		return inside;
	}

	@JsOverlay
	public final SeriesDataLabels setInside(Boolean inside) {
		this.inside = inside;
		return this;
	}

	@JsOverlay
	public final String getOverflow() {
		return overflow;
	}

	@JsOverlay
	public final SeriesDataLabels setOverflow(String overflow) {
		this.overflow = overflow;
		return this;
	}

	@JsOverlay
	public final double getPadding() {
		return padding;
	}

	@JsOverlay
	public final SeriesDataLabels setPadding(double padding) {
		this.padding = padding;
		return this;
	}

	@JsOverlay
	public final double getRotation() {
		return rotation;
	}

	@JsOverlay
	public final SeriesDataLabels setRotation(double rotation) {
		this.rotation = rotation;
		return this;
	}

	@JsOverlay
	public final Boolean getShadow() {
		return shadow;
	}

	@JsOverlay
	public final SeriesDataLabels setShadow(Boolean shadow) {
		this.shadow = shadow;
		return this;
	}

	@JsOverlay
	public final String getShape() {
		return shape;
	}

	@JsOverlay
	public final SeriesDataLabels setShape(String shape) {
		this.shape = shape;
		return this;
	}

	@JsOverlay
	public final Style getStyle() {
		return style;
	}

	@JsOverlay
	public final SeriesDataLabels setStyle(Style style) {
		this.style = style;
		return this;
	}

	@JsOverlay
	public final Boolean getUseHTML() {
		return useHTML;
	}

	@JsOverlay
	public final SeriesDataLabels setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		return this;
	}

	@JsOverlay
	public final String getVerticalAlign() {
		return verticalAlign;
	}

	@JsOverlay
	public final SeriesDataLabels setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		return this;
	}

	@JsOverlay
	public final double getX() {
		return x;
	}

	@JsOverlay
	public final SeriesDataLabels setX(double x) {
		this.x = x;
		return this;
	}

	@JsOverlay
	public final double getY() {
		return y;
	}

	@JsOverlay
	public final SeriesDataLabels setY(double y) {
		this.y = y;
		return this;
	}

	@JsOverlay
	public final double getzIndex() {
		return zIndex;
	}

	@JsOverlay
	public final SeriesDataLabels setzIndex(double zIndex) {
		this.zIndex = zIndex;
		return this;
	}
}
