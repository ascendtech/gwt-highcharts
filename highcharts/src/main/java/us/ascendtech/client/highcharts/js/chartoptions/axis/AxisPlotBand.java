package us.ascendtech.client.highcharts.js.chartoptions.axis;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.client.highcharts.js.chartoptions.shared.AxisLabels;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AxisPlotBand {

	@JsProperty
	private String borderColor;
	@JsProperty
	private double borderWidth;
	@JsProperty
	private String className;
	@JsProperty
	private String color;
	@JsProperty
	private AxisPlotEvents events;
	@JsProperty
	private double from;
	@JsProperty
	private String id;
	@JsProperty
	private AxisLabels label;
	@JsProperty
	private double to;
	@JsProperty
	private double zIndex;

	@JsOverlay
	public final String getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final AxisPlotBand setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final double getBorderWidth() {
		return borderWidth;
	}

	@JsOverlay
	public final AxisPlotBand setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final AxisPlotBand setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final AxisPlotBand setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final AxisPlotEvents getEvents() {
		return events;
	}

	@JsOverlay
	public final AxisPlotBand setEvents(AxisPlotEvents events) {
		this.events = events;
		return this;
	}

	@JsOverlay
	public final double getFrom() {
		return from;
	}

	@JsOverlay
	public final AxisPlotBand setFrom(double from) {
		this.from = from;
		return this;
	}

	@JsOverlay
	public final String getId() {
		return id;
	}

	@JsOverlay
	public final AxisPlotBand setId(String id) {
		this.id = id;
		return this;
	}

	@JsOverlay
	public final AxisLabels getLabel() {
		return label;
	}

	@JsOverlay
	public final AxisPlotBand setLabel(AxisLabels label) {
		this.label = label;
		return this;
	}

	@JsOverlay
	public final double getTo() {
		return to;
	}

	@JsOverlay
	public final AxisPlotBand setTo(double to) {
		this.to = to;
		return this;
	}

	@JsOverlay
	public final double getzIndex() {
		return zIndex;
	}

	@JsOverlay
	public final AxisPlotBand setzIndex(double zIndex) {
		this.zIndex = zIndex;
		return this;
	}
}
