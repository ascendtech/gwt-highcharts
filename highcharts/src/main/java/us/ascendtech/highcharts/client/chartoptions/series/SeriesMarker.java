package us.ascendtech.highcharts.client.chartoptions.series;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.series.states.SeriesStates;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesMarker {

	@JsProperty
	private Boolean enabled;
	@JsProperty
	private double enabledThreshold;
	@JsProperty
	private String fillColor;
	@JsProperty
	private double height;
	@JsProperty
	private String lineColor;
	@JsProperty
	private double lineWidth;
	@JsProperty
	private double radius;
	@JsProperty
	private SeriesStates states;
	@JsProperty
	private String symbol;
	@JsProperty
	private double width;

	@JsOverlay
	public final Boolean getEnabled() {
		return enabled;
	}

	@JsOverlay
	public final SeriesMarker setEnabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final double getEnabledThreshold() {
		return enabledThreshold;
	}

	@JsOverlay
	public final SeriesMarker setEnabledThreshold(double enabledThreshold) {
		this.enabledThreshold = enabledThreshold;
		return this;
	}

	@JsOverlay
	public final String getFillColor() {
		return fillColor;
	}

	@JsOverlay
	public final SeriesMarker setFillColor(String fillColor) {
		this.fillColor = fillColor;
		return this;
	}

	@JsOverlay
	public final double getHeight() {
		return height;
	}

	@JsOverlay
	public final SeriesMarker setHeight(double height) {
		this.height = height;
		return this;
	}

	@JsOverlay
	public final String getLineColor() {
		return lineColor;
	}

	@JsOverlay
	public final SeriesMarker setLineColor(String lineColor) {
		this.lineColor = lineColor;
		return this;
	}

	@JsOverlay
	public final double getLineWidth() {
		return lineWidth;
	}

	@JsOverlay
	public final SeriesMarker setLineWidth(double lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	@JsOverlay
	public final double getRadius() {
		return radius;
	}

	@JsOverlay
	public final SeriesMarker setRadius(double radius) {
		this.radius = radius;
		return this;
	}

	@JsOverlay
	public final SeriesStates getStates() {
		return states;
	}

	@JsOverlay
	public final SeriesMarker setStates(SeriesStates states) {
		this.states = states;
		return this;
	}

	@JsOverlay
	public final String getSymbol() {
		return symbol;
	}

	@JsOverlay
	public final SeriesMarker setSymbol(String symbol) {
		this.symbol = symbol;
		return this;
	}

	@JsOverlay
	public final double getWidth() {
		return width;
	}

	@JsOverlay
	public final SeriesMarker setWidth(double width) {
		this.width = width;
		return this;
	}
}
