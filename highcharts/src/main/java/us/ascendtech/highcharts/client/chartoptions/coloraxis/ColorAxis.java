package us.ascendtech.highcharts.client.chartoptions.coloraxis;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.AxisLabels;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.TickPositioner;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/colorAxis
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ColorAxis {

	@JsProperty
	private Boolean alingTicks;
	@JsProperty
	private double ceiling;
	@JsProperty
	private String className;
	@JsProperty
	private String dataClassColor;
	@JsProperty
	private JsArray<ColorAxisDataClass> dataClasses;
	@JsProperty
	private String description;
	@JsProperty
	private Boolean endOnTick;
	@JsProperty
	private ColorAxisEvents events;
	@JsProperty
	private double floor;
	@JsProperty
	private String gridLineColor;
	@JsProperty
	private String gridLineDashStyle;
	@JsProperty
	private double gridLineWidth;
	@JsProperty
	private double gridZIndex;
	@JsProperty
	private String id;
	@JsProperty
	private AxisLabels labels;
	@JsProperty
	private String lineColor;
	@JsProperty
	private ColorAxisMarker marker;
	@JsProperty
	private double max;
	@JsProperty
	private String maxColor;
	@JsProperty
	private double maxPadding;
	@JsProperty
	private double min;
	@JsProperty
	private String minColor;
	@JsProperty
	private String minorGridLineColor;
	@JsProperty
	private String minorGridLineDashStyle;
	@JsProperty
	private double minorGridLineWidth;
	@JsProperty
	private String minorTickColor;
	@JsProperty
	private double minorTickInterval;
	@JsProperty
	private double minorTickLength;
	@JsProperty
	private String minorTickPosition;
	@JsProperty
	private Boolean minorTicks;
	@JsProperty
	private double minorTickWidth;
	@JsProperty
	private double minPadding;
	@JsProperty
	private double pane;
	@JsProperty
	private Boolean reversed;
	@JsProperty
	private Boolean reversedStacks;
	@JsProperty
	private Boolean showFirstLabel;
	@JsProperty
	private Boolean showInLegend;
	@JsProperty
	private Boolean showLastLabel;
	@JsProperty
	private double softMax;
	@JsProperty
	private double softMin;
	@JsProperty
	private double startOfWeek;
	@JsProperty
	private Boolean startOnTick;
	@JsProperty
	private JsArray<Object> stops;
	@JsProperty
	private double tickAmount;
	@JsProperty
	private String tickColor;
	@JsProperty
	private double tickInterval;
	@JsProperty
	private double tickLength;
	@JsProperty
	private String tickmarkPlacement;
	@JsProperty
	private double tickPixelInterval;
	@JsProperty
	private String tickPosition;
	@JsProperty
	private TickPositioner tickPositioner;
	@JsProperty
	private JsArray<Double> tickPositions;
	@JsProperty
	private double tickWidth;
	@JsProperty
	private String type;
	@JsProperty
	private Boolean uniqueNames;
	@JsProperty
	private JsArray<JsArray<Double>> units;
	@JsProperty
	private Boolean visible;

	@JsOverlay
	public final Boolean getAlingTicks() {
		return alingTicks;
	}

	@JsOverlay
	public final ColorAxis setAlingTicks(Boolean alingTicks) {
		this.alingTicks = alingTicks;
		return this;
	}

	@JsOverlay
	public final double getCeiling() {
		return ceiling;
	}

	@JsOverlay
	public final ColorAxis setCeiling(double ceiling) {
		this.ceiling = ceiling;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final ColorAxis setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final String getDataClassColor() {
		return dataClassColor;
	}

	@JsOverlay
	public final ColorAxis setDataClassColor(String dataClassColor) {
		this.dataClassColor = dataClassColor;
		return this;
	}

	@JsOverlay
	public final JsArray<ColorAxisDataClass> getDataClasses() {
		return dataClasses;
	}

	@JsOverlay
	public final ColorAxis setDataClasses(JsArray<ColorAxisDataClass> dataClasses) {
		this.dataClasses = dataClasses;
		return this;
	}

	@JsOverlay
	public final String getDescription() {
		return description;
	}

	@JsOverlay
	public final ColorAxis setDescription(String description) {
		this.description = description;
		return this;
	}

	@JsOverlay
	public final Boolean getEndOnTick() {
		return endOnTick;
	}

	@JsOverlay
	public final ColorAxis setEndOnTick(Boolean endOnTick) {
		this.endOnTick = endOnTick;
		return this;
	}

	@JsOverlay
	public final ColorAxisEvents getEvents() {
		return events;
	}

	@JsOverlay
	public final ColorAxis setEvents(ColorAxisEvents events) {
		this.events = events;
		return this;
	}

	@JsOverlay
	public final double getFloor() {
		return floor;
	}

	@JsOverlay
	public final ColorAxis setFloor(double floor) {
		this.floor = floor;
		return this;
	}

	@JsOverlay
	public final String getGridLineColor() {
		return gridLineColor;
	}

	@JsOverlay
	public final ColorAxis setGridLineColor(String gridLineColor) {
		this.gridLineColor = gridLineColor;
		return this;
	}

	@JsOverlay
	public final String getGridLineDashStyle() {
		return gridLineDashStyle;
	}

	@JsOverlay
	public final ColorAxis setGridLineDashStyle(String gridLineDashStyle) {
		this.gridLineDashStyle = gridLineDashStyle;
		return this;
	}

	@JsOverlay
	public final double getGridLineWidth() {
		return gridLineWidth;
	}

	@JsOverlay
	public final ColorAxis setGridLineWidth(double gridLineWidth) {
		this.gridLineWidth = gridLineWidth;
		return this;
	}

	@JsOverlay
	public final double getGridZIndex() {
		return gridZIndex;
	}

	@JsOverlay
	public final ColorAxis setGridZIndex(double gridZIndex) {
		this.gridZIndex = gridZIndex;
		return this;
	}

	@JsOverlay
	public final String getId() {
		return id;
	}

	@JsOverlay
	public final ColorAxis setId(String id) {
		this.id = id;
		return this;
	}

	@JsOverlay
	public final AxisLabels getLabels() {
		return labels;
	}

	@JsOverlay
	public final ColorAxis setLabels(AxisLabels labels) {
		this.labels = labels;
		return this;
	}

	@JsOverlay
	public final String getLineColor() {
		return lineColor;
	}

	@JsOverlay
	public final ColorAxis setLineColor(String lineColor) {
		this.lineColor = lineColor;
		return this;
	}

	@JsOverlay
	public final ColorAxisMarker getMarker() {
		return marker;
	}

	@JsOverlay
	public final ColorAxis setMarker(ColorAxisMarker marker) {
		this.marker = marker;
		return this;
	}

	@JsOverlay
	public final double getMax() {
		return max;
	}

	@JsOverlay
	public final ColorAxis setMax(double max) {
		this.max = max;
		return this;
	}

	@JsOverlay
	public final String getMaxColor() {
		return maxColor;
	}

	@JsOverlay
	public final ColorAxis setMaxColor(String maxColor) {
		this.maxColor = maxColor;
		return this;
	}

	@JsOverlay
	public final double getMaxPadding() {
		return maxPadding;
	}

	@JsOverlay
	public final ColorAxis setMaxPadding(double maxPadding) {
		this.maxPadding = maxPadding;
		return this;
	}

	@JsOverlay
	public final double getMin() {
		return min;
	}

	@JsOverlay
	public final ColorAxis setMin(double min) {
		this.min = min;
		return this;
	}

	@JsOverlay
	public final String getMinColor() {
		return minColor;
	}

	@JsOverlay
	public final ColorAxis setMinColor(String minColor) {
		this.minColor = minColor;
		return this;
	}

	@JsOverlay
	public final String getMinorGridLineColor() {
		return minorGridLineColor;
	}

	@JsOverlay
	public final ColorAxis setMinorGridLineColor(String minorGridLineColor) {
		this.minorGridLineColor = minorGridLineColor;
		return this;
	}

	@JsOverlay
	public final String getMinorGridLineDashStyle() {
		return minorGridLineDashStyle;
	}

	@JsOverlay
	public final ColorAxis setMinorGridLineDashStyle(String minorGridLineDashStyle) {
		this.minorGridLineDashStyle = minorGridLineDashStyle;
		return this;
	}

	@JsOverlay
	public final double getMinorGridLineWidth() {
		return minorGridLineWidth;
	}

	@JsOverlay
	public final ColorAxis setMinorGridLineWidth(double minorGridLineWidth) {
		this.minorGridLineWidth = minorGridLineWidth;
		return this;
	}

	@JsOverlay
	public final String getMinorTickColor() {
		return minorTickColor;
	}

	@JsOverlay
	public final ColorAxis setMinorTickColor(String minorTickColor) {
		this.minorTickColor = minorTickColor;
		return this;
	}

	@JsOverlay
	public final double getMinorTickInterval() {
		return minorTickInterval;
	}

	@JsOverlay
	public final ColorAxis setMinorTickInterval(double minorTickInterval) {
		this.minorTickInterval = minorTickInterval;
		return this;
	}

	@JsOverlay
	public final double getMinorTickLength() {
		return minorTickLength;
	}

	@JsOverlay
	public final ColorAxis setMinorTickLength(double minorTickLength) {
		this.minorTickLength = minorTickLength;
		return this;
	}

	@JsOverlay
	public final String getMinorTickPosition() {
		return minorTickPosition;
	}

	@JsOverlay
	public final ColorAxis setMinorTickPosition(String minorTickPosition) {
		this.minorTickPosition = minorTickPosition;
		return this;
	}

	@JsOverlay
	public final Boolean getMinorTicks() {
		return minorTicks;
	}

	@JsOverlay
	public final ColorAxis setMinorTicks(Boolean minorTicks) {
		this.minorTicks = minorTicks;
		return this;
	}

	@JsOverlay
	public final double getMinorTickWidth() {
		return minorTickWidth;
	}

	@JsOverlay
	public final ColorAxis setMinorTickWidth(double minorTickWidth) {
		this.minorTickWidth = minorTickWidth;
		return this;
	}

	@JsOverlay
	public final double getMinPadding() {
		return minPadding;
	}

	@JsOverlay
	public final ColorAxis setMinPadding(double minPadding) {
		this.minPadding = minPadding;
		return this;
	}

	@JsOverlay
	public final double getPane() {
		return pane;
	}

	@JsOverlay
	public final ColorAxis setPane(double pane) {
		this.pane = pane;
		return this;
	}

	@JsOverlay
	public final Boolean getReversed() {
		return reversed;
	}

	@JsOverlay
	public final ColorAxis setReversed(Boolean reversed) {
		this.reversed = reversed;
		return this;
	}

	@JsOverlay
	public final Boolean getReversedStacks() {
		return reversedStacks;
	}

	@JsOverlay
	public final ColorAxis setReversedStacks(Boolean reversedStacks) {
		this.reversedStacks = reversedStacks;
		return this;
	}

	@JsOverlay
	public final Boolean getShowFirstLabel() {
		return showFirstLabel;
	}

	@JsOverlay
	public final ColorAxis setShowFirstLabel(Boolean showFirstLabel) {
		this.showFirstLabel = showFirstLabel;
		return this;
	}

	@JsOverlay
	public final Boolean getShowInLegend() {
		return showInLegend;
	}

	@JsOverlay
	public final ColorAxis setShowInLegend(Boolean showInLegend) {
		this.showInLegend = showInLegend;
		return this;
	}

	@JsOverlay
	public final Boolean getShowLastLabel() {
		return showLastLabel;
	}

	@JsOverlay
	public final ColorAxis setShowLastLabel(Boolean showLastLabel) {
		this.showLastLabel = showLastLabel;
		return this;
	}

	@JsOverlay
	public final double getSoftMax() {
		return softMax;
	}

	@JsOverlay
	public final ColorAxis setSoftMax(double softMax) {
		this.softMax = softMax;
		return this;
	}

	@JsOverlay
	public final double getSoftMin() {
		return softMin;
	}

	@JsOverlay
	public final ColorAxis setSoftMin(double softMin) {
		this.softMin = softMin;
		return this;
	}

	@JsOverlay
	public final double getStartOfWeek() {
		return startOfWeek;
	}

	@JsOverlay
	public final ColorAxis setStartOfWeek(double startOfWeek) {
		this.startOfWeek = startOfWeek;
		return this;
	}

	@JsOverlay
	public final Boolean getStartOnTick() {
		return startOnTick;
	}

	@JsOverlay
	public final ColorAxis setStartOnTick(Boolean startOnTick) {
		this.startOnTick = startOnTick;
		return this;
	}

	@JsOverlay
	public final JsArray<Object> getStops() {
		return stops;
	}

	@JsOverlay
	public final ColorAxis setStops(JsArray<Object> stops) {
		this.stops = stops;
		return this;
	}

	@JsOverlay
	public final double getTickAmount() {
		return tickAmount;
	}

	@JsOverlay
	public final ColorAxis setTickAmount(double tickAmount) {
		this.tickAmount = tickAmount;
		return this;
	}

	@JsOverlay
	public final String getTickColor() {
		return tickColor;
	}

	@JsOverlay
	public final ColorAxis setTickColor(String tickColor) {
		this.tickColor = tickColor;
		return this;
	}

	@JsOverlay
	public final double getTickInterval() {
		return tickInterval;
	}

	@JsOverlay
	public final ColorAxis setTickInterval(double tickInterval) {
		this.tickInterval = tickInterval;
		return this;
	}

	@JsOverlay
	public final double getTickLength() {
		return tickLength;
	}

	@JsOverlay
	public final ColorAxis setTickLength(double tickLength) {
		this.tickLength = tickLength;
		return this;
	}

	@JsOverlay
	public final String getTickmarkPlacement() {
		return tickmarkPlacement;
	}

	@JsOverlay
	public final ColorAxis setTickmarkPlacement(String tickmarkPlacement) {
		this.tickmarkPlacement = tickmarkPlacement;
		return this;
	}

	@JsOverlay
	public final double getTickPixelInterval() {
		return tickPixelInterval;
	}

	@JsOverlay
	public final ColorAxis setTickPixelInterval(double tickPixelInterval) {
		this.tickPixelInterval = tickPixelInterval;
		return this;
	}

	@JsOverlay
	public final String getTickPosition() {
		return tickPosition;
	}

	@JsOverlay
	public final ColorAxis setTickPosition(String tickPosition) {
		this.tickPosition = tickPosition;
		return this;
	}

	@JsOverlay
	public final TickPositioner getTickPositioner() {
		return tickPositioner;
	}

	@JsOverlay
	public final ColorAxis setTickPositioner(TickPositioner tickPositioner) {
		this.tickPositioner = tickPositioner;
		return this;
	}

	@JsOverlay
	public final JsArray<Double> getTickPositions() {
		return tickPositions;
	}

	@JsOverlay
	public final ColorAxis setTickPositions(JsArray<Double> tickPositions) {
		this.tickPositions = tickPositions;
		return this;
	}

	@JsOverlay
	public final double getTickWidth() {
		return tickWidth;
	}

	@JsOverlay
	public final ColorAxis setTickWidth(double tickWidth) {
		this.tickWidth = tickWidth;
		return this;
	}

	@JsOverlay
	public final String getType() {
		return type;
	}

	@JsOverlay
	public final ColorAxis setType(String type) {
		this.type = type;
		return this;
	}

	@JsOverlay
	public final Boolean getUniqueNames() {
		return uniqueNames;
	}

	@JsOverlay
	public final ColorAxis setUniqueNames(Boolean uniqueNames) {
		this.uniqueNames = uniqueNames;
		return this;
	}

	@JsOverlay
	public final JsArray<JsArray<Double>> getUnits() {
		return units;
	}

	@JsOverlay
	public final ColorAxis setUnits(JsArray<JsArray<Double>> units) {
		this.units = units;
		return this;
	}

	@JsOverlay
	public final Boolean getVisible() {
		return visible;
	}

	@JsOverlay
	public final ColorAxis setVisible(Boolean visible) {
		this.visible = visible;
		return this;
	}
}
