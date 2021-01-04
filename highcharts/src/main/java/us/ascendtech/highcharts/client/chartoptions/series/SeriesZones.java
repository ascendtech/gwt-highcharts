package us.ascendtech.highcharts.client.chartoptions.series;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesZones {

	@JsProperty
	private String className;
	@JsProperty
	private String color;
	@JsProperty
	private String dashStyle;
	@JsProperty
	private String fillColor;
	@JsProperty
	private double from;
	@JsProperty
	private double to;
	@JsProperty
	private SeriesMarker marker;
	@JsProperty
	private String value;

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final SeriesZones setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final SeriesZones setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final String getDashStyle() {
		return dashStyle;
	}

	@JsOverlay
	public final SeriesZones setDashStyle(String dashStyle) {
		this.dashStyle = dashStyle;
		return this;
	}

	@JsOverlay
	public final String getFillColor() {
		return fillColor;
	}

	@JsOverlay
	public final SeriesZones setFillColor(String fillColor) {
		this.fillColor = fillColor;
		return this;
	}

	@JsOverlay
	public final double getFrom() {
		return from;
	}

	@JsOverlay
	public final SeriesZones setFrom(double from) {
		this.from = from;
		return this;
	}

	@JsOverlay
	public final double getTo() {
		return to;
	}

	@JsOverlay
	public final SeriesZones setTo(double to) {
		this.to = to;
		return this;
	}

	@JsOverlay
	public final SeriesMarker getMarker() {
		return marker;
	}

	@JsOverlay
	public final SeriesZones setMarker(SeriesMarker marker) {
		this.marker = marker;
		return this;
	}

	@JsOverlay
	public final String getValue() {
		return value;
	}

	@JsOverlay
	public final SeriesZones setValue(String value) {
		this.value = value;
		return this;
	}
}
