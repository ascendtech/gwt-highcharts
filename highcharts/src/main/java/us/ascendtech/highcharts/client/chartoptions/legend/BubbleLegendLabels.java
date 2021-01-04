package us.ascendtech.highcharts.client.chartoptions.legend;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.Formatter;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class BubbleLegendLabels {

	@JsProperty
	private String align;
	@JsProperty
	private boolean allowOverlap;
	@JsProperty
	private String className;
	@JsProperty
	private String format;
	@JsProperty
	private Formatter formatter;
	@JsProperty
	private String style;
	@JsProperty
	private double x;
	@JsProperty
	private double y;

	@JsOverlay
	public final String getAlign() {
		return align;
	}

	@JsOverlay
	public final BubbleLegendLabels setAlign(String align) {
		this.align = align;
		return this;
	}

	@JsOverlay
	public final boolean isAllowOverlap() {
		return allowOverlap;
	}

	@JsOverlay
	public final BubbleLegendLabels setAllowOverlap(boolean allowOverlap) {
		this.allowOverlap = allowOverlap;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final BubbleLegendLabels setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final String getFormat() {
		return format;
	}

	@JsOverlay
	public final BubbleLegendLabels setFormat(String format) {
		this.format = format;
		return this;
	}

	@JsOverlay
	public final Formatter getFormatter() {
		return formatter;
	}

	@JsOverlay
	public final BubbleLegendLabels setFormatter(Formatter formatter) {
		this.formatter = formatter;
		return this;
	}

	@JsOverlay
	public final String getStyle() {
		return style;
	}

	@JsOverlay
	public final BubbleLegendLabels setStyle(String style) {
		this.style = style;
		return this;
	}

	@JsOverlay
	public final double getX() {
		return x;
	}

	@JsOverlay
	public final BubbleLegendLabels setX(double x) {
		this.x = x;
		return this;
	}

	@JsOverlay
	public final double getY() {
		return y;
	}

	@JsOverlay
	public final BubbleLegendLabels setY(double y) {
		this.y = y;
		return this;
	}
}
