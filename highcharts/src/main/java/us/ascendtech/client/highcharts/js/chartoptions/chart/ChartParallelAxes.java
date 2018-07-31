package us.ascendtech.client.highcharts.js.chartoptions.chart;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.client.highcharts.js.chartoptions.Title;
import us.ascendtech.client.highcharts.js.chartoptions.shared.AxisLabels;
import us.ascendtech.client.highcharts.js.chartoptions.shared.Crosshair;
import us.ascendtech.client.highcharts.js.chartoptions.shared.DateTimeLabelFormats;
import us.ascendtech.client.highcharts.js.chartoptions.shared.functions.TickPositioner;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ChartParallelAxes {

	@JsProperty
	private Boolean alignTicks;
	@JsProperty
	private Boolean allowDecmials;
	@JsProperty
	private JsArray<String> categories;
	@JsProperty
	private double ceiling;
	@JsProperty
	private String className;
	@JsProperty
	private Crosshair crosshair;
	@JsProperty
	private DateTimeLabelFormats dateTimeLabelFormats;
	@JsProperty
	private String description;
	@JsProperty
	private Boolean endOnTick;
	@JsProperty
	private ChartParallelAxesEvents events;
	@JsProperty
	private double floor;
	@JsProperty
	private double gridZIndex;
	@JsProperty
	private AxisLabels labels;
	@JsProperty
	private String lineColor;
	@JsProperty
	private double lineWidth;
	@JsProperty
	private String linkedTo;
	@JsProperty
	private double max;
	@JsProperty
	private double maxPadding;
	@JsProperty
	private double min;
	@JsProperty
	private String minorTickColor;
	@JsProperty
	private String minorTickInterval;
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
	private double minRange;
	@JsProperty
	private String minTickInterval;
	@JsProperty
	private double offset;
	@JsProperty
	private Boolean opposite;
	@JsProperty
	private double pane;
	@JsProperty
	private Boolean reversed;
	@JsProperty
	private Boolean reversedStacks;
	@JsProperty
	private Boolean showEmpty;
	@JsProperty
	private Boolean showFirstLabel;
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
	private Title title;
	@JsProperty
	private String tooltipValueFormat;
	@JsProperty
	private String type;
	@JsProperty
	private Boolean uniqueNames;
	@JsProperty
	private JsArray<Object> units;
	@JsProperty
	private Boolean visible;

	@JsOverlay
	public final Boolean getAlignTicks() {
		return alignTicks;
	}

	@JsOverlay
	public final ChartParallelAxes setAlignTicks(Boolean alignTicks) {
		this.alignTicks = alignTicks;
		return this;
	}

	@JsOverlay
	public final Boolean getAllowDecmials() {
		return allowDecmials;
	}

	@JsOverlay
	public final ChartParallelAxes setAllowDecmials(Boolean allowDecmials) {
		this.allowDecmials = allowDecmials;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getCategories() {
		return categories;
	}

	@JsOverlay
	public final ChartParallelAxes setCategories(JsArray<String> categories) {
		this.categories = categories;
		return this;
	}

	@JsOverlay
	public final double getCeiling() {
		return ceiling;
	}

	@JsOverlay
	public final ChartParallelAxes setCeiling(double ceiling) {
		this.ceiling = ceiling;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final ChartParallelAxes setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final Crosshair getCrosshair() {
		return crosshair;
	}

	@JsOverlay
	public final ChartParallelAxes setCrosshair(Crosshair crosshair) {
		this.crosshair = crosshair;
		return this;
	}

	@JsOverlay
	public final DateTimeLabelFormats getDateTimeLabelFormats() {
		return dateTimeLabelFormats;
	}

	@JsOverlay
	public final ChartParallelAxes setDateTimeLabelFormats(DateTimeLabelFormats dateTimeLabelFormats) {
		this.dateTimeLabelFormats = dateTimeLabelFormats;
		return this;
	}

	@JsOverlay
	public final String getDescription() {
		return description;
	}

	@JsOverlay
	public final ChartParallelAxes setDescription(String description) {
		this.description = description;
		return this;
	}

	@JsOverlay
	public final Boolean getEndOnTick() {
		return endOnTick;
	}

	@JsOverlay
	public final ChartParallelAxes setEndOnTick(Boolean endOnTick) {
		this.endOnTick = endOnTick;
		return this;
	}

	@JsOverlay
	public final ChartParallelAxesEvents getEvents() {
		return events;
	}

	@JsOverlay
	public final ChartParallelAxes setEvents(ChartParallelAxesEvents events) {
		this.events = events;
		return this;
	}

	@JsOverlay
	public final double getFloor() {
		return floor;
	}

	@JsOverlay
	public final ChartParallelAxes setFloor(double floor) {
		this.floor = floor;
		return this;
	}

	@JsOverlay
	public final double getGridZIndex() {
		return gridZIndex;
	}

	@JsOverlay
	public final ChartParallelAxes setGridZIndex(double gridZIndex) {
		this.gridZIndex = gridZIndex;
		return this;
	}

	@JsOverlay
	public final AxisLabels getLabels() {
		return labels;
	}

	@JsOverlay
	public final ChartParallelAxes setLabels(AxisLabels labels) {
		this.labels = labels;
		return this;
	}

	@JsOverlay
	public final String getLineColor() {
		return lineColor;
	}

	@JsOverlay
	public final ChartParallelAxes setLineColor(String lineColor) {
		this.lineColor = lineColor;
		return this;
	}

	@JsOverlay
	public final double getLineWidth() {
		return lineWidth;
	}

	@JsOverlay
	public final ChartParallelAxes setLineWidth(double lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	@JsOverlay
	public final String getLinkedTo() {
		return linkedTo;
	}

	@JsOverlay
	public final ChartParallelAxes setLinkedTo(String linkedTo) {
		this.linkedTo = linkedTo;
		return this;
	}

	@JsOverlay
	public final double getMax() {
		return max;
	}

	@JsOverlay
	public final ChartParallelAxes setMax(double max) {
		this.max = max;
		return this;
	}

	@JsOverlay
	public final double getMaxPadding() {
		return maxPadding;
	}

	@JsOverlay
	public final ChartParallelAxes setMaxPadding(double maxPadding) {
		this.maxPadding = maxPadding;
		return this;
	}

	@JsOverlay
	public final double getMin() {
		return min;
	}

	@JsOverlay
	public final ChartParallelAxes setMin(double min) {
		this.min = min;
		return this;
	}

	@JsOverlay
	public final String getMinorTickColor() {
		return minorTickColor;
	}

	@JsOverlay
	public final ChartParallelAxes setMinorTickColor(String minorTickColor) {
		this.minorTickColor = minorTickColor;
		return this;
	}

	@JsOverlay
	public final String getMinorTickInterval() {
		return minorTickInterval;
	}

	@JsOverlay
	public final ChartParallelAxes setMinorTickInterval(String minorTickInterval) {
		this.minorTickInterval = minorTickInterval;
		return this;
	}

	@JsOverlay
	public final double getMinorTickLength() {
		return minorTickLength;
	}

	@JsOverlay
	public final ChartParallelAxes setMinorTickLength(double minorTickLength) {
		this.minorTickLength = minorTickLength;
		return this;
	}

	@JsOverlay
	public final String getMinorTickPosition() {
		return minorTickPosition;
	}

	@JsOverlay
	public final ChartParallelAxes setMinorTickPosition(String minorTickPosition) {
		this.minorTickPosition = minorTickPosition;
		return this;
	}

	@JsOverlay
	public final Boolean getMinorTicks() {
		return minorTicks;
	}

	@JsOverlay
	public final ChartParallelAxes setMinorTicks(Boolean minorTicks) {
		this.minorTicks = minorTicks;
		return this;
	}

	@JsOverlay
	public final double getMinorTickWidth() {
		return minorTickWidth;
	}

	@JsOverlay
	public final ChartParallelAxes setMinorTickWidth(double minorTickWidth) {
		this.minorTickWidth = minorTickWidth;
		return this;
	}

	@JsOverlay
	public final double getMinPadding() {
		return minPadding;
	}

	@JsOverlay
	public final ChartParallelAxes setMinPadding(double minPadding) {
		this.minPadding = minPadding;
		return this;
	}

	@JsOverlay
	public final double getMinRange() {
		return minRange;
	}

	@JsOverlay
	public final ChartParallelAxes setMinRange(double minRange) {
		this.minRange = minRange;
		return this;
	}

	@JsOverlay
	public final String getMinTickInterval() {
		return minTickInterval;
	}

	@JsOverlay
	public final ChartParallelAxes setMinTickInterval(String minTickInterval) {
		this.minTickInterval = minTickInterval;
		return this;
	}

	@JsOverlay
	public final double getOffset() {
		return offset;
	}

	@JsOverlay
	public final ChartParallelAxes setOffset(double offset) {
		this.offset = offset;
		return this;
	}

	@JsOverlay
	public final Boolean getOpposite() {
		return opposite;
	}

	@JsOverlay
	public final ChartParallelAxes setOpposite(Boolean opposite) {
		this.opposite = opposite;
		return this;
	}

	@JsOverlay
	public final double getPane() {
		return pane;
	}

	@JsOverlay
	public final ChartParallelAxes setPane(double pane) {
		this.pane = pane;
		return this;
	}

	@JsOverlay
	public final Boolean getReversed() {
		return reversed;
	}

	@JsOverlay
	public final ChartParallelAxes setReversed(Boolean reversed) {
		this.reversed = reversed;
		return this;
	}

	@JsOverlay
	public final Boolean getReversedStacks() {
		return reversedStacks;
	}

	@JsOverlay
	public final ChartParallelAxes setReversedStacks(Boolean reversedStacks) {
		this.reversedStacks = reversedStacks;
		return this;
	}

	@JsOverlay
	public final Boolean getShowEmpty() {
		return showEmpty;
	}

	@JsOverlay
	public final ChartParallelAxes setShowEmpty(Boolean showEmpty) {
		this.showEmpty = showEmpty;
		return this;
	}

	@JsOverlay
	public final Boolean getShowFirstLabel() {
		return showFirstLabel;
	}

	@JsOverlay
	public final ChartParallelAxes setShowFirstLabel(Boolean showFirstLabel) {
		this.showFirstLabel = showFirstLabel;
		return this;
	}

	@JsOverlay
	public final Boolean getShowLastLabel() {
		return showLastLabel;
	}

	@JsOverlay
	public final ChartParallelAxes setShowLastLabel(Boolean showLastLabel) {
		this.showLastLabel = showLastLabel;
		return this;
	}

	@JsOverlay
	public final double getSoftMax() {
		return softMax;
	}

	@JsOverlay
	public final ChartParallelAxes setSoftMax(double softMax) {
		this.softMax = softMax;
		return this;
	}

	@JsOverlay
	public final double getSoftMin() {
		return softMin;
	}

	@JsOverlay
	public final ChartParallelAxes setSoftMin(double softMin) {
		this.softMin = softMin;
		return this;
	}

	@JsOverlay
	public final double getStartOfWeek() {
		return startOfWeek;
	}

	@JsOverlay
	public final ChartParallelAxes setStartOfWeek(double startOfWeek) {
		this.startOfWeek = startOfWeek;
		return this;
	}

	@JsOverlay
	public final Boolean getStartOnTick() {
		return startOnTick;
	}

	@JsOverlay
	public final ChartParallelAxes setStartOnTick(Boolean startOnTick) {
		this.startOnTick = startOnTick;
		return this;
	}

	@JsOverlay
	public final double getTickAmount() {
		return tickAmount;
	}

	@JsOverlay
	public final ChartParallelAxes setTickAmount(double tickAmount) {
		this.tickAmount = tickAmount;
		return this;
	}

	@JsOverlay
	public final String getTickColor() {
		return tickColor;
	}

	@JsOverlay
	public final ChartParallelAxes setTickColor(String tickColor) {
		this.tickColor = tickColor;
		return this;
	}

	@JsOverlay
	public final double getTickInterval() {
		return tickInterval;
	}

	@JsOverlay
	public final ChartParallelAxes setTickInterval(double tickInterval) {
		this.tickInterval = tickInterval;
		return this;
	}

	@JsOverlay
	public final double getTickLength() {
		return tickLength;
	}

	@JsOverlay
	public final ChartParallelAxes setTickLength(double tickLength) {
		this.tickLength = tickLength;
		return this;
	}

	@JsOverlay
	public final String getTickmarkPlacement() {
		return tickmarkPlacement;
	}

	@JsOverlay
	public final ChartParallelAxes setTickmarkPlacement(String tickmarkPlacement) {
		this.tickmarkPlacement = tickmarkPlacement;
		return this;
	}

	@JsOverlay
	public final double getTickPixelInterval() {
		return tickPixelInterval;
	}

	@JsOverlay
	public final ChartParallelAxes setTickPixelInterval(double tickPixelInterval) {
		this.tickPixelInterval = tickPixelInterval;
		return this;
	}

	@JsOverlay
	public final String getTickPosition() {
		return tickPosition;
	}

	@JsOverlay
	public final ChartParallelAxes setTickPosition(String tickPosition) {
		this.tickPosition = tickPosition;
		return this;
	}

	@JsOverlay
	public final TickPositioner getTickPositioner() {
		return tickPositioner;
	}

	@JsOverlay
	public final ChartParallelAxes setTickPositioner(TickPositioner tickPositioner) {
		this.tickPositioner = tickPositioner;
		return this;
	}

	@JsOverlay
	public final JsArray<Double> getTickPositions() {
		return tickPositions;
	}

	@JsOverlay
	public final ChartParallelAxes setTickPositions(JsArray<Double> tickPositions) {
		this.tickPositions = tickPositions;
		return this;
	}

	@JsOverlay
	public final double getTickWidth() {
		return tickWidth;
	}

	@JsOverlay
	public final ChartParallelAxes setTickWidth(double tickWidth) {
		this.tickWidth = tickWidth;
		return this;
	}

	@JsOverlay
	public final Title getTitle() {
		return title;
	}

	@JsOverlay
	public final ChartParallelAxes setTitle(Title title) {
		this.title = title;
		return this;
	}

	@JsOverlay
	public final String getTooltipValueFormat() {
		return tooltipValueFormat;
	}

	@JsOverlay
	public final ChartParallelAxes setTooltipValueFormat(String tooltipValueFormat) {
		this.tooltipValueFormat = tooltipValueFormat;
		return this;
	}

	@JsOverlay
	public final String getType() {
		return type;
	}

	@JsOverlay
	public final ChartParallelAxes setType(String type) {
		this.type = type;
		return this;
	}

	@JsOverlay
	public final Boolean getUniqueNames() {
		return uniqueNames;
	}

	@JsOverlay
	public final ChartParallelAxes setUniqueNames(Boolean uniqueNames) {
		this.uniqueNames = uniqueNames;
		return this;
	}

	@JsOverlay
	public final JsArray<Object> getUnits() {
		return units;
	}

	@JsOverlay
	public final ChartParallelAxes setUnits(JsArray<Object> units) {
		this.units = units;
		return this;
	}

	@JsOverlay
	public final Boolean getVisible() {
		return visible;
	}

	@JsOverlay
	public final ChartParallelAxes setVisible(Boolean visible) {
		this.visible = visible;
		return this;
	}
}
