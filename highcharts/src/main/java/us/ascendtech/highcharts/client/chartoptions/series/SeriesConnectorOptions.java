package us.ascendtech.highcharts.client.chartoptions.series;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesConnectorOptions {
	@JsProperty
	private String dashStyle;
	@JsProperty
	private String stroke;
	@JsProperty
	private double width;

	@JsOverlay
	public final String getDashStyle() {
		return dashStyle;
	}

	@JsOverlay
	public final SeriesConnectorOptions setDashStyle(String dashStyle) {
		this.dashStyle = dashStyle;
		return this;
	}

	@JsOverlay
	public final String getStroke() {
		return stroke;
	}

	@JsOverlay
	public final SeriesConnectorOptions setStroke(String stroke) {
		this.stroke = stroke;
		return this;
	}

	@JsOverlay
	public final double getWidth() {
		return width;
	}

	@JsOverlay
	public final SeriesConnectorOptions setWidth(double width) {
		this.width = width;
		return this;
	}
}
