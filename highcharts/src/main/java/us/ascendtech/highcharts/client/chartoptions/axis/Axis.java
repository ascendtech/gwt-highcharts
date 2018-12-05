package us.ascendtech.highcharts.client.chartoptions.axis;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.AxisLabels;
import us.ascendtech.highcharts.client.chartoptions.shared.Crosshair;
import us.ascendtech.highcharts.client.chartoptions.shared.DateTimeLabelFormats;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.TickPositioner;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Axis {

	@JsProperty
	private Boolean alignTicks;
	@JsProperty
	private Boolean allowDecimals;
	@JsProperty
	private String alternateGridColor;
	@JsProperty
	private double angle;
	@JsProperty
	private JsArray<AxisBreak> breaks;
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
	private AxisEvents events;
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
	private double lineWidth;
	@JsProperty
	private double linkedTo;
	@JsProperty
	private double max;
	@JsProperty
	private String maxColor;
	@JsProperty
	private double maxPadding;
	@JsProperty
	private double maxZoom;
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
	private double minRange;
	@JsProperty
	private double minTickInterval;
	@JsProperty
	private double offset;
	@JsProperty
	private Boolean opposite;
	@JsProperty
	private double pane;
	@JsProperty
	private JsArray<AxisPlotBand> plotBands;
	@JsProperty
	private JsArray<AxisPlotLine> plotLines;
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
	private AxisTitle title;
	@JsProperty
	private String tooltipValueFormat;
	@JsProperty
	private String type;
	@JsProperty
	private Boolean uniqueNames;
	@JsProperty
	private JsArray<JsArray<Double>> units;
	@JsProperty
	private Boolean visible;

	@JsOverlay
	public final Boolean getAlignTicks() {
		return alignTicks;
	}

	@JsOverlay
	public final Axis setAlignTicks(Boolean alignTicks) {
		this.alignTicks = alignTicks;
		return this;
	}

	@JsOverlay
	public final Boolean getAllowDecimals() {
		return allowDecimals;
	}

	@JsOverlay
	public final Axis setAllowDecimals(Boolean allowDecimals) {
		this.allowDecimals = allowDecimals;
		return this;
	}

	@JsOverlay
	public final String getAlternateGridColor() {
		return alternateGridColor;
	}

	@JsOverlay
	public final Axis setAlternateGridColor(String alternateGridColor) {
		this.alternateGridColor = alternateGridColor;
		return this;
	}

	@JsOverlay
	public final double getAngle() {
		return angle;
	}

	@JsOverlay
	public final Axis setAngle(double angle) {
		this.angle = angle;
		return this;
	}

	@JsOverlay
	public final JsArray<AxisBreak> getBreaks() {
		return breaks;
	}

	@JsOverlay
	public final Axis setBreaks(JsArray<AxisBreak> breaks) {
		this.breaks = breaks;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getCategories() {
		return categories;
	}

	@JsOverlay
	public final Axis setCategories(JsArray<String> categories) {
		this.categories = categories;
		return this;
	}

	@JsOverlay
	public final double getCeiling() {
		return ceiling;
	}

	@JsOverlay
	public final Axis setCeiling(double ceiling) {
		this.ceiling = ceiling;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final Axis setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final Crosshair getCrosshair() {
		return crosshair;
	}

	@JsOverlay
	public final Axis setCrosshair(Crosshair crosshair) {
		this.crosshair = crosshair;
		return this;
	}

	@JsOverlay
	public final DateTimeLabelFormats getDateTimeLabelFormats() {
		return dateTimeLabelFormats;
	}

	@JsOverlay
	public final Axis setDateTimeLabelFormats(DateTimeLabelFormats dateTimeLabelFormats) {
		this.dateTimeLabelFormats = dateTimeLabelFormats;
		return this;
	}

	@JsOverlay
	public final String getDescription() {
		return description;
	}

	@JsOverlay
	public final Axis setDescription(String description) {
		this.description = description;
		return this;
	}

	@JsOverlay
	public final Boolean getEndOnTick() {
		return endOnTick;
	}

	@JsOverlay
	public final Axis setEndOnTick(Boolean endOnTick) {
		this.endOnTick = endOnTick;
		return this;
	}

	@JsOverlay
	public final AxisEvents getEvents() {
		return events;
	}

	@JsOverlay
	public final Axis setEvents(AxisEvents events) {
		this.events = events;
		return this;
	}

	@JsOverlay
	public final double getFloor() {
		return floor;
	}

	@JsOverlay
	public final Axis setFloor(double floor) {
		this.floor = floor;
		return this;
	}

	@JsOverlay
	public final String getGridLineColor() {
		return gridLineColor;
	}

	@JsOverlay
	public final Axis setGridLineColor(String gridLineColor) {
		this.gridLineColor = gridLineColor;
		return this;
	}

	@JsOverlay
	public final String getGridLineDashStyle() {
		return gridLineDashStyle;
	}

	@JsOverlay
	public final Axis setGridLineDashStyle(String gridLineDashStyle) {
		this.gridLineDashStyle = gridLineDashStyle;
		return this;
	}

	@JsOverlay
	public final double getGridLineWidth() {
		return gridLineWidth;
	}

	@JsOverlay
	public final Axis setGridLineWidth(double gridLineWidth) {
		this.gridLineWidth = gridLineWidth;
		return this;
	}

	@JsOverlay
	public final double getGridZIndex() {
		return gridZIndex;
	}

	@JsOverlay
	public final Axis setGridZIndex(double gridZIndex) {
		this.gridZIndex = gridZIndex;
		return this;
	}

	@JsOverlay
	public final String getId() {
		return id;
	}

	@JsOverlay
	public final Axis setId(String id) {
		this.id = id;
		return this;
	}

	@JsOverlay
	public final AxisLabels getLabels() {
		return labels;
	}

	@JsOverlay
	public final Axis setLabels(AxisLabels labels) {
		this.labels = labels;
		return this;
	}

	@JsOverlay
	public final String getLineColor() {
		return lineColor;
	}

	@JsOverlay
	public final Axis setLineColor(String lineColor) {
		this.lineColor = lineColor;
		return this;
	}

	@JsOverlay
	public final double getLineWidth() {
		return lineWidth;
	}

	@JsOverlay
	public final Axis setLineWidth(double lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	@JsOverlay
	public final double getLinkedTo() {
		return linkedTo;
	}

	@JsOverlay
	public final Axis setLinkedTo(double linkedTo) {
		this.linkedTo = linkedTo;
		return this;
	}

	@JsOverlay
	public final double getMax() {
		return max;
	}

	@JsOverlay
	public final Axis setMax(double max) {
		this.max = max;
		return this;
	}

	@JsOverlay
	public final String getMaxColor() {
		return maxColor;
	}

	@JsOverlay
	public final Axis setMaxColor(String maxColor) {
		this.maxColor = maxColor;
		return this;
	}

	@JsOverlay
	public final double getMaxPadding() {
		return maxPadding;
	}

	@JsOverlay
	public final Axis setMaxPadding(double maxPadding) {
		this.maxPadding = maxPadding;
		return this;
	}

	@JsOverlay
	public final double getMaxZoom() {
		return maxZoom;
	}

	@JsOverlay
	public final Axis setMaxZoom(double maxZoom) {
		this.maxZoom = maxZoom;
		return this;
	}

	@JsOverlay
	public final double getMin() {
		return min;
	}

	@JsOverlay
	public final Axis setMin(double min) {
		this.min = min;
		return this;
	}

	@JsOverlay
	public final String getMinColor() {
		return minColor;
	}

	@JsOverlay
	public final Axis setMinColor(String minColor) {
		this.minColor = minColor;
		return this;
	}

	@JsOverlay
	public final String getMinorGridLineColor() {
		return minorGridLineColor;
	}

	@JsOverlay
	public final Axis setMinorGridLineColor(String minorGridLineColor) {
		this.minorGridLineColor = minorGridLineColor;
		return this;
	}

	@JsOverlay
	public final String getMinorGridLineDashStyle() {
		return minorGridLineDashStyle;
	}

	@JsOverlay
	public final Axis setMinorGridLineDashStyle(String minorGridLineDashStyle) {
		this.minorGridLineDashStyle = minorGridLineDashStyle;
		return this;
	}

	@JsOverlay
	public final double getMinorGridLineWidth() {
		return minorGridLineWidth;
	}

	@JsOverlay
	public final Axis setMinorGridLineWidth(double minorGridLineWidth) {
		this.minorGridLineWidth = minorGridLineWidth;
		return this;
	}

	@JsOverlay
	public final String getMinorTickColor() {
		return minorTickColor;
	}

	@JsOverlay
	public final Axis setMinorTickColor(String minorTickColor) {
		this.minorTickColor = minorTickColor;
		return this;
	}

	@JsOverlay
	public final double getMinorTickInterval() {
		return minorTickInterval;
	}

	@JsOverlay
	public final Axis setMinorTickInterval(double minorTickInterval) {
		this.minorTickInterval = minorTickInterval;
		return this;
	}

	@JsOverlay
	public final double getMinorTickLength() {
		return minorTickLength;
	}

	@JsOverlay
	public final Axis setMinorTickLength(double minorTickLength) {
		this.minorTickLength = minorTickLength;
		return this;
	}

	@JsOverlay
	public final String getMinorTickPosition() {
		return minorTickPosition;
	}

	@JsOverlay
	public final Axis setMinorTickPosition(String minorTickPosition) {
		this.minorTickPosition = minorTickPosition;
		return this;
	}

	@JsOverlay
	public final Boolean getMinorTicks() {
		return minorTicks;
	}

	@JsOverlay
	public final Axis setMinorTicks(Boolean minorTicks) {
		this.minorTicks = minorTicks;
		return this;
	}

	@JsOverlay
	public final double getMinorTickWidth() {
		return minorTickWidth;
	}

	@JsOverlay
	public final Axis setMinorTickWidth(double minorTickWidth) {
		this.minorTickWidth = minorTickWidth;
		return this;
	}

	@JsOverlay
	public final double getMinPadding() {
		return minPadding;
	}

	@JsOverlay
	public final Axis setMinPadding(double minPadding) {
		this.minPadding = minPadding;
		return this;
	}

	@JsOverlay
	public final double getMinRange() {
		return minRange;
	}

	@JsOverlay
	public final Axis setMinRange(double minRange) {
		this.minRange = minRange;
		return this;
	}

	@JsOverlay
	public final double getMinTickInterval() {
		return minTickInterval;
	}

	@JsOverlay
	public final Axis setMinTickInterval(double minTickInterval) {
		this.minTickInterval = minTickInterval;
		return this;
	}

	@JsOverlay
	public final double getOffset() {
		return offset;
	}

	@JsOverlay
	public final Axis setOffset(double offset) {
		this.offset = offset;
		return this;
	}

	@JsOverlay
	public final Boolean getOpposite() {
		return opposite;
	}

	@JsOverlay
	public final Axis setOpposite(Boolean opposite) {
		this.opposite = opposite;
		return this;
	}

	@JsOverlay
	public final double getPane() {
		return pane;
	}

	@JsOverlay
	public final Axis setPane(double pane) {
		this.pane = pane;
		return this;
	}

	@JsOverlay
	public final JsArray<AxisPlotBand> getPlotBands() {
		return plotBands;
	}

	@JsOverlay
	public final Axis setPlotBands(JsArray<AxisPlotBand> plotBands) {
		this.plotBands = plotBands;
		return this;
	}

	@JsOverlay
	public final JsArray<AxisPlotLine> getPlotLines() {
		return plotLines;
	}

	@JsOverlay
	public final Axis setPlotLines(JsArray<AxisPlotLine> plotLines) {
		this.plotLines = plotLines;
		return this;
	}

	@JsOverlay
	public final Boolean getReversed() {
		return reversed;
	}

	@JsOverlay
	public final Axis setReversed(Boolean reversed) {
		this.reversed = reversed;
		return this;
	}

	@JsOverlay
	public final Boolean getReversedStacks() {
		return reversedStacks;
	}

	@JsOverlay
	public final Axis setReversedStacks(Boolean reversedStacks) {
		this.reversedStacks = reversedStacks;
		return this;
	}

	@JsOverlay
	public final Boolean getShowEmpty() {
		return showEmpty;
	}

	@JsOverlay
	public final Axis setShowEmpty(Boolean showEmpty) {
		this.showEmpty = showEmpty;
		return this;
	}

	@JsOverlay
	public final Boolean getShowFirstLabel() {
		return showFirstLabel;
	}

	@JsOverlay
	public final Axis setShowFirstLabel(Boolean showFirstLabel) {
		this.showFirstLabel = showFirstLabel;
		return this;
	}

	@JsOverlay
	public final Boolean getShowLastLabel() {
		return showLastLabel;
	}

	@JsOverlay
	public final Axis setShowLastLabel(Boolean showLastLabel) {
		this.showLastLabel = showLastLabel;
		return this;
	}

	@JsOverlay
	public final double getSoftMax() {
		return softMax;
	}

	@JsOverlay
	public final Axis setSoftMax(double softMax) {
		this.softMax = softMax;
		return this;
	}

	@JsOverlay
	public final double getSoftMin() {
		return softMin;
	}

	@JsOverlay
	public final Axis setSoftMin(double softMin) {
		this.softMin = softMin;
		return this;
	}

	@JsOverlay
	public final double getStartOfWeek() {
		return startOfWeek;
	}

	@JsOverlay
	public final Axis setStartOfWeek(double startOfWeek) {
		this.startOfWeek = startOfWeek;
		return this;
	}

	@JsOverlay
	public final Boolean getStartOnTick() {
		return startOnTick;
	}

	@JsOverlay
	public final Axis setStartOnTick(Boolean startOnTick) {
		this.startOnTick = startOnTick;
		return this;
	}

	@JsOverlay
	public final double getTickAmount() {
		return tickAmount;
	}

	@JsOverlay
	public final Axis setTickAmount(double tickAmount) {
		this.tickAmount = tickAmount;
		return this;
	}

	@JsOverlay
	public final String getTickColor() {
		return tickColor;
	}

	@JsOverlay
	public final Axis setTickColor(String tickColor) {
		this.tickColor = tickColor;
		return this;
	}

	@JsOverlay
	public final double getTickInterval() {
		return tickInterval;
	}

	@JsOverlay
	public final Axis setTickInterval(double tickInterval) {
		this.tickInterval = tickInterval;
		return this;
	}

	@JsOverlay
	public final double getTickLength() {
		return tickLength;
	}

	@JsOverlay
	public final Axis setTickLength(double tickLength) {
		this.tickLength = tickLength;
		return this;
	}

	@JsOverlay
	public final String getTickmarkPlacement() {
		return tickmarkPlacement;
	}

	@JsOverlay
	public final Axis setTickmarkPlacement(String tickmarkPlacement) {
		this.tickmarkPlacement = tickmarkPlacement;
		return this;
	}

	@JsOverlay
	public final double getTickPixelInterval() {
		return tickPixelInterval;
	}

	@JsOverlay
	public final Axis setTickPixelInterval(double tickPixelInterval) {
		this.tickPixelInterval = tickPixelInterval;
		return this;
	}

	@JsOverlay
	public final String getTickPosition() {
		return tickPosition;
	}

	@JsOverlay
	public final Axis setTickPosition(String tickPosition) {
		this.tickPosition = tickPosition;
		return this;
	}

	@JsOverlay
	public final TickPositioner getTickPositioner() {
		return tickPositioner;
	}

	@JsOverlay
	public final Axis setTickPositioner(TickPositioner tickPositioner) {
		this.tickPositioner = tickPositioner;
		return this;
	}

	@JsOverlay
	public final JsArray<Double> getTickPositions() {
		return tickPositions;
	}

	@JsOverlay
	public final Axis setTickPositions(JsArray<Double> tickPositions) {
		this.tickPositions = tickPositions;
		return this;
	}

	@JsOverlay
	public final double getTickWidth() {
		return tickWidth;
	}

	@JsOverlay
	public final Axis setTickWidth(double tickWidth) {
		this.tickWidth = tickWidth;
		return this;
	}

	@JsOverlay
	public final AxisTitle getTitle() {
		return title;
	}

	@JsOverlay
	public final Axis setTitle(AxisTitle title) {
		this.title = title;
		return this;
	}

	@JsOverlay
	public final String getTooltipValueFormat() {
		return tooltipValueFormat;
	}

	@JsOverlay
	public final Axis setTooltipValueFormat(String tooltipValueFormat) {
		this.tooltipValueFormat = tooltipValueFormat;
		return this;
	}

	@JsOverlay
	public final String getType() {
		return type;
	}

	@JsOverlay
	public final Axis setType(String type) {
		this.type = type;
		return this;
	}

	@JsOverlay
	public final Boolean getUniqueNames() {
		return uniqueNames;
	}

	@JsOverlay
	public final Axis setUniqueNames(Boolean uniqueNames) {
		this.uniqueNames = uniqueNames;
		return this;
	}

	@JsOverlay
	public final JsArray<JsArray<Double>> getUnits() {
		return units;
	}

	@JsOverlay
	public final Axis setUnits(JsArray<JsArray<Double>> units) {
		this.units = units;
		return this;
	}

	@JsOverlay
	public final Boolean getVisible() {
		return visible;
	}

	@JsOverlay
	public final Axis setVisible(Boolean visible) {
		this.visible = visible;
		return this;
	}
}
