package us.ascendtech.client.highcharts.js.chartoptions.axis;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.client.highcharts.js.chartoptions.shared.AxisLabels;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AxisPlotLine {

	@JsProperty
	private String classname;
	@JsProperty
	private String color;
	@JsProperty
	private String dashStyle;
	@JsProperty
	private AxisPlotEvents events;
	@JsProperty
	private String id;
	@JsProperty
	private AxisLabels label;
	@JsProperty
	private double value;
	@JsProperty
	private double width;
	@JsProperty
	private double zIndex;

	@JsOverlay
	public final String getClassname() {
		return classname;
	}

	@JsOverlay
	public final AxisPlotLine setClassname(String classname) {
		this.classname = classname;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final AxisPlotLine setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final String getDashStyle() {
		return dashStyle;
	}

	@JsOverlay
	public final AxisPlotLine setDashStyle(String dashStyle) {
		this.dashStyle = dashStyle;
		return this;
	}

	@JsOverlay
	public final AxisPlotEvents getEvents() {
		return events;
	}

	@JsOverlay
	public final AxisPlotLine setEvents(AxisPlotEvents events) {
		this.events = events;
		return this;
	}

	@JsOverlay
	public final String getId() {
		return id;
	}

	@JsOverlay
	public final AxisPlotLine setId(String id) {
		this.id = id;
		return this;
	}

	@JsOverlay
	public final AxisLabels getLabel() {
		return label;
	}

	@JsOverlay
	public final AxisPlotLine setLabel(AxisLabels label) {
		this.label = label;
		return this;
	}

	@JsOverlay
	public final double getValue() {
		return value;
	}

	@JsOverlay
	public final AxisPlotLine setValue(double value) {
		this.value = value;
		return this;
	}

	@JsOverlay
	public final double getWidth() {
		return width;
	}

	@JsOverlay
	public final AxisPlotLine setWidth(double width) {
		this.width = width;
		return this;
	}

	@JsOverlay
	public final double getzIndex() {
		return zIndex;
	}

	@JsOverlay
	public final AxisPlotLine setzIndex(double zIndex) {
		this.zIndex = zIndex;
		return this;
	}
}
