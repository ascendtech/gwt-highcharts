package us.ascendtech.highcharts.client.chartoptions.plotoptions.types;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesDataLabels;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesEvents;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesLabel;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesMarker;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesPoint;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesZones;
import us.ascendtech.highcharts.client.chartoptions.series.states.SeriesStates;
import us.ascendtech.highcharts.client.chartoptions.shared.Shadow;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.Animation;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.PointDescriptionFormatter;
import us.ascendtech.highcharts.client.chartoptions.tooltip.Tooltip;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/plotOptions.area
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Area {

	@JsProperty
	private Boolean allowPointSelect;
	@JsProperty
	private Animation animation;
	@JsProperty
	private double animationLimit;
	@JsProperty
	private double boostThreshold;
	@JsProperty
	private String className;
	@JsProperty
	private String color;
	@JsProperty
	private double colorIndex;
	@JsProperty
	private Boolean connectEnds;
	@JsProperty
	private Boolean connectNulls;
	@JsProperty
	private double cropThreshold;
	@JsProperty
	private String cursor;
	@JsProperty
	private String dashStyle;
	@JsProperty
	private SeriesDataLabels dataLabels;
	@JsProperty
	private String description;
	@JsProperty
	private Boolean enableMouseTracking;
	@JsProperty
	private SeriesEvents events;
	@JsProperty
	private Boolean exposeElementToA11y;
	@JsProperty
	private String fillColor;
	@JsProperty
	private double fillOpacity;
	@JsProperty
	private String findNearestPointBy;
	@JsProperty
	private Boolean getExtremesFromAll;
	@JsProperty
	private JsArray<String> keys;
	@JsProperty
	private SeriesLabel label;
	@JsProperty
	private String linecap;
	@JsProperty
	private String lineColor;
	@JsProperty
	private double lineWidth;
	@JsProperty
	private String linkedTo;
	@JsProperty
	private SeriesMarker marker;
	@JsProperty
	private String negativeColor;
	@JsProperty
	private String negativeFillColor;
	@JsProperty
	private SeriesPoint point;
	@JsProperty
	private PointDescriptionFormatter pointDescriptionFormatter;
	@JsProperty
	private double pointInterval;
	@JsProperty
	private String pointIntervalUnit;
	@JsProperty
	private String pointPlacement;
	@JsProperty
	private double pointStart;
	@JsProperty
	private Boolean selected;
	@JsProperty
	private Shadow shadow;
	@JsProperty
	private Boolean showCheckbox;
	@JsProperty
	private Boolean showInLegend;
	@JsProperty
	private Boolean skipKeyboardNavigation;
	@JsProperty
	private Boolean softThreshold;
	@JsProperty
	private String stacking;
	@JsProperty
	private SeriesStates states;
	@JsProperty
	private String step;
	@JsProperty
	private Boolean stickyTracking;
	@JsProperty
	private double threshold;
	@JsProperty
	private Tooltip tooltip;
	@JsProperty
	private Boolean trackByArea;
	@JsProperty
	private double turboThreshold;
	@JsProperty
	private Boolean visible;
	@JsProperty
	private String zoneAxis;
	@JsProperty
	private JsArray<SeriesZones> zones;

	@JsOverlay
	public final Boolean getAllowPointSelect() {
		return allowPointSelect;
	}

	@JsOverlay
	public final Area setAllowPointSelect(Boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
		return this;
	}

	@JsOverlay
	public final Animation getAnimation() {
		return animation;
	}

	@JsOverlay
	public final Area setAnimation(Animation animation) {
		this.animation = animation;
		return this;
	}

	@JsOverlay
	public final double getAnimationLimit() {
		return animationLimit;
	}

	@JsOverlay
	public final Area setAnimationLimit(double animationLimit) {
		this.animationLimit = animationLimit;
		return this;
	}

	@JsOverlay
	public final double getBoostThreshold() {
		return boostThreshold;
	}

	@JsOverlay
	public final Area setBoostThreshold(double boostThreshold) {
		this.boostThreshold = boostThreshold;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final Area setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final Area setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final double getColorIndex() {
		return colorIndex;
	}

	@JsOverlay
	public final Area setColorIndex(double colorIndex) {
		this.colorIndex = colorIndex;
		return this;
	}

	@JsOverlay
	public final Boolean getConnectEnds() {
		return connectEnds;
	}

	@JsOverlay
	public final Area setConnectEnds(Boolean connectEnds) {
		this.connectEnds = connectEnds;
		return this;
	}

	@JsOverlay
	public final Boolean getConnectNulls() {
		return connectNulls;
	}

	@JsOverlay
	public final Area setConnectNulls(Boolean connectNulls) {
		this.connectNulls = connectNulls;
		return this;
	}

	@JsOverlay
	public final double getCropThreshold() {
		return cropThreshold;
	}

	@JsOverlay
	public final Area setCropThreshold(double cropThreshold) {
		this.cropThreshold = cropThreshold;
		return this;
	}

	@JsOverlay
	public final String getCursor() {
		return cursor;
	}

	@JsOverlay
	public final Area setCursor(String cursor) {
		this.cursor = cursor;
		return this;
	}

	@JsOverlay
	public final String getDashStyle() {
		return dashStyle;
	}

	@JsOverlay
	public final Area setDashStyle(String dashStyle) {
		this.dashStyle = dashStyle;
		return this;
	}

	@JsOverlay
	public final SeriesDataLabels getDataLabels() {
		return dataLabels;
	}

	@JsOverlay
	public final Area setDataLabels(SeriesDataLabels dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	@JsOverlay
	public final String getDescription() {
		return description;
	}

	@JsOverlay
	public final Area setDescription(String description) {
		this.description = description;
		return this;
	}

	@JsOverlay
	public final Boolean getEnableMouseTracking() {
		return enableMouseTracking;
	}

	@JsOverlay
	public final Area setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
		return this;
	}

	@JsOverlay
	public final SeriesEvents getEvents() {
		return events;
	}

	@JsOverlay
	public final Area setEvents(SeriesEvents events) {
		this.events = events;
		return this;
	}

	@JsOverlay
	public final Boolean getExposeElementToA11y() {
		return exposeElementToA11y;
	}

	@JsOverlay
	public final Area setExposeElementToA11y(Boolean exposeElementToA11y) {
		this.exposeElementToA11y = exposeElementToA11y;
		return this;
	}

	@JsOverlay
	public final String getFillColor() {
		return fillColor;
	}

	@JsOverlay
	public final Area setFillColor(String fillColor) {
		this.fillColor = fillColor;
		return this;
	}

	@JsOverlay
	public final double getFillOpacity() {
		return fillOpacity;
	}

	@JsOverlay
	public final Area setFillOpacity(double fillOpacity) {
		this.fillOpacity = fillOpacity;
		return this;
	}

	@JsOverlay
	public final String getFindNearestPointBy() {
		return findNearestPointBy;
	}

	@JsOverlay
	public final Area setFindNearestPointBy(String findNearestPointBy) {
		this.findNearestPointBy = findNearestPointBy;
		return this;
	}

	@JsOverlay
	public final Boolean getGetExtremesFromAll() {
		return getExtremesFromAll;
	}

	@JsOverlay
	public final Area setGetExtremesFromAll(Boolean getExtremesFromAll) {
		this.getExtremesFromAll = getExtremesFromAll;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getKeys() {
		return keys;
	}

	@JsOverlay
	public final Area setKeys(JsArray<String> keys) {
		this.keys = keys;
		return this;
	}

	@JsOverlay
	public final SeriesLabel getLabel() {
		return label;
	}

	@JsOverlay
	public final Area setLabel(SeriesLabel label) {
		this.label = label;
		return this;
	}

	@JsOverlay
	public final String getLinecap() {
		return linecap;
	}

	@JsOverlay
	public final Area setLinecap(String linecap) {
		this.linecap = linecap;
		return this;
	}

	@JsOverlay
	public final String getLineColor() {
		return lineColor;
	}

	@JsOverlay
	public final Area setLineColor(String lineColor) {
		this.lineColor = lineColor;
		return this;
	}

	@JsOverlay
	public final double getLineWidth() {
		return lineWidth;
	}

	@JsOverlay
	public final Area setLineWidth(double lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	@JsOverlay
	public final String getLinkedTo() {
		return linkedTo;
	}

	@JsOverlay
	public final Area setLinkedTo(String linkedTo) {
		this.linkedTo = linkedTo;
		return this;
	}

	@JsOverlay
	public final SeriesMarker getMarker() {
		return marker;
	}

	@JsOverlay
	public final Area setMarker(SeriesMarker marker) {
		this.marker = marker;
		return this;
	}

	@JsOverlay
	public final String getNegativeColor() {
		return negativeColor;
	}

	@JsOverlay
	public final Area setNegativeColor(String negativeColor) {
		this.negativeColor = negativeColor;
		return this;
	}

	@JsOverlay
	public final String getNegativeFillColor() {
		return negativeFillColor;
	}

	@JsOverlay
	public final Area setNegativeFillColor(String negativeFillColor) {
		this.negativeFillColor = negativeFillColor;
		return this;
	}

	@JsOverlay
	public final SeriesPoint getPoint() {
		return point;
	}

	@JsOverlay
	public final Area setPoint(SeriesPoint point) {
		this.point = point;
		return this;
	}

	@JsOverlay
	public final PointDescriptionFormatter getPointDescriptionFormatter() {
		return pointDescriptionFormatter;
	}

	@JsOverlay
	public final Area setPointDescriptionFormatter(PointDescriptionFormatter pointDescriptionFormatter) {
		this.pointDescriptionFormatter = pointDescriptionFormatter;
		return this;
	}

	@JsOverlay
	public final double getPointInterval() {
		return pointInterval;
	}

	@JsOverlay
	public final Area setPointInterval(double pointInterval) {
		this.pointInterval = pointInterval;
		return this;
	}

	@JsOverlay
	public final String getPointIntervalUnit() {
		return pointIntervalUnit;
	}

	@JsOverlay
	public final Area setPointIntervalUnit(String pointIntervalUnit) {
		this.pointIntervalUnit = pointIntervalUnit;
		return this;
	}

	@JsOverlay
	public final String getPointPlacement() {
		return pointPlacement;
	}

	@JsOverlay
	public final Area setPointPlacement(String pointPlacement) {
		this.pointPlacement = pointPlacement;
		return this;
	}

	@JsOverlay
	public final double getPointStart() {
		return pointStart;
	}

	@JsOverlay
	public final Area setPointStart(double pointStart) {
		this.pointStart = pointStart;
		return this;
	}

	@JsOverlay
	public final Boolean getSelected() {
		return selected;
	}

	@JsOverlay
	public final Area setSelected(Boolean selected) {
		this.selected = selected;
		return this;
	}

	@JsOverlay
	public final Shadow getShadow() {
		return shadow;
	}

	@JsOverlay
	public final Area setShadow(Shadow shadow) {
		this.shadow = shadow;
		return this;
	}

	@JsOverlay
	public final Boolean getShowCheckbox() {
		return showCheckbox;
	}

	@JsOverlay
	public final Area setShowCheckbox(Boolean showCheckbox) {
		this.showCheckbox = showCheckbox;
		return this;
	}

	@JsOverlay
	public final Boolean getShowInLegend() {
		return showInLegend;
	}

	@JsOverlay
	public final Area setShowInLegend(Boolean showInLegend) {
		this.showInLegend = showInLegend;
		return this;
	}

	@JsOverlay
	public final Boolean getSkipKeyboardNavigation() {
		return skipKeyboardNavigation;
	}

	@JsOverlay
	public final Area setSkipKeyboardNavigation(Boolean skipKeyboardNavigation) {
		this.skipKeyboardNavigation = skipKeyboardNavigation;
		return this;
	}

	@JsOverlay
	public final Boolean getSoftThreshold() {
		return softThreshold;
	}

	@JsOverlay
	public final Area setSoftThreshold(Boolean softThreshold) {
		this.softThreshold = softThreshold;
		return this;
	}

	@JsOverlay
	public final String getStacking() {
		return stacking;
	}

	@JsOverlay
	public final Area setStacking(String stacking) {
		this.stacking = stacking;
		return this;
	}

	@JsOverlay
	public final SeriesStates getStates() {
		return states;
	}

	@JsOverlay
	public final Area setStates(SeriesStates states) {
		this.states = states;
		return this;
	}

	@JsOverlay
	public final String getStep() {
		return step;
	}

	@JsOverlay
	public final Area setStep(String step) {
		this.step = step;
		return this;
	}

	@JsOverlay
	public final Boolean getStickyTracking() {
		return stickyTracking;
	}

	@JsOverlay
	public final Area setStickyTracking(Boolean stickyTracking) {
		this.stickyTracking = stickyTracking;
		return this;
	}

	@JsOverlay
	public final double getThreshold() {
		return threshold;
	}

	@JsOverlay
	public final Area setThreshold(double threshold) {
		this.threshold = threshold;
		return this;
	}

	@JsOverlay
	public final Tooltip getTooltip() {
		return tooltip;
	}

	@JsOverlay
	public final Area setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
		return this;
	}

	@JsOverlay
	public final Boolean getTrackByArea() {
		return trackByArea;
	}

	@JsOverlay
	public final Area setTrackByArea(Boolean trackByArea) {
		this.trackByArea = trackByArea;
		return this;
	}

	@JsOverlay
	public final double getTurboThreshold() {
		return turboThreshold;
	}

	@JsOverlay
	public final Area setTurboThreshold(double turboThreshold) {
		this.turboThreshold = turboThreshold;
		return this;
	}

	@JsOverlay
	public final Boolean getVisible() {
		return visible;
	}

	@JsOverlay
	public final Area setVisible(Boolean visible) {
		this.visible = visible;
		return this;
	}

	@JsOverlay
	public final String getZoneAxis() {
		return zoneAxis;
	}

	@JsOverlay
	public final Area setZoneAxis(String zoneAxis) {
		this.zoneAxis = zoneAxis;
		return this;
	}

	@JsOverlay
	public final JsArray<SeriesZones> getZones() {
		return zones;
	}

	@JsOverlay
	public final Area setZones(JsArray<SeriesZones> zones) {
		this.zones = zones;
		return this;
	}
}
