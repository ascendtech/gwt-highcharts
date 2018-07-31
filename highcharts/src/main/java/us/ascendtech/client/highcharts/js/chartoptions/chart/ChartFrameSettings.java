package us.ascendtech.client.highcharts.js.chartoptions.chart;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ChartFrameSettings {

	@JsProperty
	private String color;
	@JsProperty
	private double size;
	@JsProperty
	private Boolean visible;

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final ChartFrameSettings setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final double getSize() {
		return size;
	}

	@JsOverlay
	public final ChartFrameSettings setSize(double size) {
		this.size = size;
		return this;
	}

	@JsOverlay
	public final Boolean getVisible() {
		return visible;
	}

	@JsOverlay
	public final ChartFrameSettings setVisible(Boolean visible) {
		this.visible = visible;
		return this;
	}
}
