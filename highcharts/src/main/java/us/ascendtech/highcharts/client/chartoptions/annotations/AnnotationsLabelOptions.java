package us.ascendtech.highcharts.client.chartoptions.annotations;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.Style;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.Formatter;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AnnotationsLabelOptions {

	@JsProperty
	private String align;
	@JsProperty
	private Boolean allowOverlap;
	@JsProperty
	private String backgroundColor;
	@JsProperty
	private String borderColor;
	@JsProperty
	private Integer borderRadius;
	@JsProperty
	private Integer borderWidth;
	@JsProperty
	private String className;
	@JsProperty
	private Boolean crop;
	@JsProperty
	private double distance;
	@JsProperty
	private String format;
	@JsProperty
	private Formatter formatter;
	@JsProperty
	private String overflow;
	@JsProperty
	private double padding;
	@JsProperty
	private AnnotationsLabelOptionsPoint point;
	@JsProperty
	private Boolean shadow;
	@JsProperty
	private String shape;
	@JsProperty
	private Style style;
	@JsProperty
	private String text;
	@JsProperty
	private Boolean useHTML;
	@JsProperty
	private String verticalAlign;
	@JsProperty
	private double x;
	@JsProperty
	private double y;

	@JsOverlay
	public final String getAlign() {
		return align;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setAlign(String align) {
		this.align = align;
		return this;
	}

	@JsOverlay
	public final Boolean getAllowOverlap() {
		return allowOverlap;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setAllowOverlap(Boolean allowOverlap) {
		this.allowOverlap = allowOverlap;
		return this;
	}

	@JsOverlay
	public final String getBackgroundColor() {
		return backgroundColor;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	@JsOverlay
	public final String getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final Integer getBorderRadius() {
		return borderRadius;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setBorderRadius(Integer borderRadius) {
		this.borderRadius = borderRadius;
		return this;
	}

	@JsOverlay
	public final Integer getBorderWidth() {
		return borderWidth;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setBorderWidth(Integer borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final Boolean getCrop() {
		return crop;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setCrop(Boolean crop) {
		this.crop = crop;
		return this;
	}

	@JsOverlay
	public final double getDistance() {
		return distance;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setDistance(double distance) {
		this.distance = distance;
		return this;
	}

	@JsOverlay
	public final String getFormat() {
		return format;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setFormat(String format) {
		this.format = format;
		return this;
	}

	@JsOverlay
	public final Formatter getFormatter() {
		return formatter;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setFormatter(Formatter formatter) {
		this.formatter = formatter;
		return this;
	}

	@JsOverlay
	public final String getOverflow() {
		return overflow;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setOverflow(String overflow) {
		this.overflow = overflow;
		return this;
	}

	@JsOverlay
	public final double getPadding() {
		return padding;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setPadding(double padding) {
		this.padding = padding;
		return this;
	}

	@JsOverlay
	public final AnnotationsLabelOptionsPoint getPoint() {
		return point;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setPoint(AnnotationsLabelOptionsPoint point) {
		this.point = point;
		return this;
	}

	@JsOverlay
	public final Boolean getShadow() {
		return shadow;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setShadow(Boolean shadow) {
		this.shadow = shadow;
		return this;
	}

	@JsOverlay
	public final String getShape() {
		return shape;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setShape(String shape) {
		this.shape = shape;
		return this;
	}

	@JsOverlay
	public final Style getStyle() {
		return style;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setStyle(Style style) {
		this.style = style;
		return this;
	}

	@JsOverlay
	public final String getText() {
		return text;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setText(String text) {
		this.text = text;
		return this;
	}

	@JsOverlay
	public final Boolean getUseHTML() {
		return useHTML;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		return this;
	}

	@JsOverlay
	public final String getVerticalAlign() {
		return verticalAlign;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		return this;
	}

	@JsOverlay
	public final double getX() {
		return x;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setX(double x) {
		this.x = x;
		return this;
	}

	@JsOverlay
	public final double getY() {
		return y;
	}

	@JsOverlay
	public final AnnotationsLabelOptions setY(double y) {
		this.y = y;
		return this;
	}
}
