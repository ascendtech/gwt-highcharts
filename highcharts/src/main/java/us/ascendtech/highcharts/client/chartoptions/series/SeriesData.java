package us.ascendtech.highcharts.client.chartoptions.series;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesData {

	@JsProperty
	private String borderColor;
	@JsProperty
	private String borderWidth;
	@JsProperty
	private String className;
	@JsProperty
	private String color;
	@JsProperty
	private double colorIndex;
	@JsProperty
	private String colorValue;
	@JsProperty
	private SeriesDataLabels dataLabels;
	@JsProperty
	private String description;
	@JsProperty
	private String drilldown;
	@JsProperty
	private SeriesDataEvents events;
	@JsProperty
	private String id;
	@JsProperty
	private double labelrank;
	@JsProperty
	private SeriesMarker marker;
	@JsProperty
	private String name;
	@JsProperty
	private String parent;
	@JsProperty
	private double pointPadding;
	@JsProperty
	private Boolean selected;
	@JsProperty
	private Boolean sliced;
	@JsProperty
	private double value;
	@JsProperty
	private double weight;
	@JsProperty
	private double x;
	@JsProperty
	private double y;

	@JsOverlay
	public final String getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final SeriesData setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final String getBorderWidth() {
		return borderWidth;
	}

	@JsOverlay
	public final SeriesData setBorderWidth(String borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final SeriesData setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final SeriesData setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final double getColorIndex() {
		return colorIndex;
	}

	@JsOverlay
	public final SeriesData setColorIndex(double colorIndex) {
		this.colorIndex = colorIndex;
		return this;
	}

	@JsOverlay
	public final String getColorValue() {
		return colorValue;
	}

	@JsOverlay
	public final SeriesData setColorValue(String colorValue) {
		this.colorValue = colorValue;
		return this;
	}

	@JsOverlay
	public final SeriesDataLabels getDataLabels() {
		return dataLabels;
	}

	@JsOverlay
	public final SeriesData setDataLabels(SeriesDataLabels dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	@JsOverlay
	public final String getDescription() {
		return description;
	}

	@JsOverlay
	public final SeriesData setDescription(String description) {
		this.description = description;
		return this;
	}

	@JsOverlay
	public final String getDrilldown() {
		return drilldown;
	}

	@JsOverlay
	public final SeriesData setDrilldown(String drilldown) {
		this.drilldown = drilldown;
		return this;
	}

	@JsOverlay
	public final SeriesDataEvents getEvents() {
		return events;
	}

	@JsOverlay
	public final SeriesData setEvents(SeriesDataEvents events) {
		this.events = events;
		return this;
	}

	@JsOverlay
	public final String getId() {
		return id;
	}

	@JsOverlay
	public final SeriesData setId(String id) {
		this.id = id;
		return this;
	}

	@JsOverlay
	public final double getLabelrank() {
		return labelrank;
	}

	@JsOverlay
	public final SeriesData setLabelrank(double labelrank) {
		this.labelrank = labelrank;
		return this;
	}

	@JsOverlay
	public final SeriesMarker getMarker() {
		return marker;
	}

	@JsOverlay
	public final SeriesData setMarker(SeriesMarker marker) {
		this.marker = marker;
		return this;
	}

	@JsOverlay
	public final String getName() {
		return name;
	}

	@JsOverlay
	public final SeriesData setName(String name) {
		this.name = name;
		return this;
	}

	@JsOverlay
	public final String getParent() {
		return parent;
	}

	@JsOverlay
	public final SeriesData setParent(String parent) {
		this.parent = parent;
		return this;
	}

	@JsOverlay
	public final double getPointPadding() {
		return pointPadding;
	}

	@JsOverlay
	public final SeriesData setPointPadding(double pointPadding) {
		this.pointPadding = pointPadding;
		return this;
	}

	@JsOverlay
	public final Boolean getSelected() {
		return selected;
	}

	@JsOverlay
	public final SeriesData setSelected(Boolean selected) {
		this.selected = selected;
		return this;
	}

	@JsOverlay
	public final Boolean getSliced() {
		return sliced;
	}

	@JsOverlay
	public final SeriesData setSliced(Boolean sliced) {
		this.sliced = sliced;
		return this;
	}

	@JsOverlay
	public final double getValue() {
		return value;
	}

	@JsOverlay
	public final SeriesData setValue(double value) {
		this.value = value;
		return this;
	}

	@JsOverlay
	public final double getWeight() {
		return weight;
	}

	@JsOverlay
	public final SeriesData setWeight(double weight) {
		this.weight = weight;
		return this;
	}

	@JsOverlay
	public final double getX() {
		return x;
	}

	@JsOverlay
	public final SeriesData setX(double x) {
		this.x = x;
		return this;
	}

	@JsOverlay
	public final double getY() {
		return y;
	}

	@JsOverlay
	public final SeriesData setY(double y) {
		this.y = y;
		return this;
	}
}
