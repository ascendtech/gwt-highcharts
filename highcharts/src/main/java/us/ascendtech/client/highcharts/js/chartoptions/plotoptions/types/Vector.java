package us.ascendtech.client.highcharts.js.chartoptions.plotoptions.types;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.client.highcharts.js.chartoptions.series.SeriesDataLabels;
import us.ascendtech.client.highcharts.js.chartoptions.series.SeriesEvents;
import us.ascendtech.client.highcharts.js.chartoptions.series.SeriesLabel;
import us.ascendtech.client.highcharts.js.chartoptions.series.SeriesPoint;
import us.ascendtech.client.highcharts.js.chartoptions.series.SeriesZones;
import us.ascendtech.client.highcharts.js.chartoptions.series.states.SeriesStates;
import us.ascendtech.client.highcharts.js.chartoptions.shared.functions.Animation;
import us.ascendtech.client.highcharts.js.chartoptions.shared.functions.PointDescriptionFormatter;
import us.ascendtech.client.highcharts.js.chartoptions.tooltip.Tooltip;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/plotOptions.vector
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Vector {

	@JsProperty
	private Boolean allowPointSelect;
	@JsProperty
	private Animation animation;
	@JsProperty
	private double animationLimit;
	@JsProperty
	private String className;
	@JsProperty
	private String color;
	@JsProperty
	private double colorIndex;
	@JsProperty
	private String cursor;
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
	private String findNearestPointBy;
	@JsProperty
	private Boolean getExtremesFromAll;
	@JsProperty
	private JsArray<String> keys;
	@JsProperty
	private SeriesLabel label;
	@JsProperty
	private double lineWidth;
	@JsProperty
	private String linkedTo;
	@JsProperty
	private String negativeColor;
	@JsProperty
	private SeriesPoint point;
	@JsProperty
	private PointDescriptionFormatter pointDescriptionFormatter;
	@JsProperty
	private double pointInterval;
	@JsProperty
	private String pointIntervalUnit;
	@JsProperty
	private double pointStart;
	@JsProperty
	private String rotationOrigin;
	@JsProperty
	private Boolean selected;
	@JsProperty
	private Boolean showCheckbox;
	@JsProperty
	private Boolean showInLegend;
	@JsProperty
	private Boolean skipKeyboardNavigation;
	@JsProperty
	private Boolean softThreshold;
	@JsProperty
	private SeriesStates states;
	@JsProperty
	private Boolean stickyTracking;
	@JsProperty
	private Tooltip tooltip;
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
	public final Vector setAllowPointSelect(Boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
		return this;
	}

	@JsOverlay
	public final Animation getAnimation() {
		return animation;
	}

	@JsOverlay
	public final Vector setAnimation(Animation animation) {
		this.animation = animation;
		return this;
	}

	@JsOverlay
	public final double getAnimationLimit() {
		return animationLimit;
	}

	@JsOverlay
	public final Vector setAnimationLimit(double animationLimit) {
		this.animationLimit = animationLimit;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final Vector setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final Vector setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final double getColorIndex() {
		return colorIndex;
	}

	@JsOverlay
	public final Vector setColorIndex(double colorIndex) {
		this.colorIndex = colorIndex;
		return this;
	}

	@JsOverlay
	public final String getCursor() {
		return cursor;
	}

	@JsOverlay
	public final Vector setCursor(String cursor) {
		this.cursor = cursor;
		return this;
	}

	@JsOverlay
	public final SeriesDataLabels getDataLabels() {
		return dataLabels;
	}

	@JsOverlay
	public final Vector setDataLabels(SeriesDataLabels dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	@JsOverlay
	public final String getDescription() {
		return description;
	}

	@JsOverlay
	public final Vector setDescription(String description) {
		this.description = description;
		return this;
	}

	@JsOverlay
	public final Boolean getEnableMouseTracking() {
		return enableMouseTracking;
	}

	@JsOverlay
	public final Vector setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
		return this;
	}

	@JsOverlay
	public final SeriesEvents getEvents() {
		return events;
	}

	@JsOverlay
	public final Vector setEvents(SeriesEvents events) {
		this.events = events;
		return this;
	}

	@JsOverlay
	public final Boolean getExposeElementToA11y() {
		return exposeElementToA11y;
	}

	@JsOverlay
	public final Vector setExposeElementToA11y(Boolean exposeElementToA11y) {
		this.exposeElementToA11y = exposeElementToA11y;
		return this;
	}

	@JsOverlay
	public final String getFindNearestPointBy() {
		return findNearestPointBy;
	}

	@JsOverlay
	public final Vector setFindNearestPointBy(String findNearestPointBy) {
		this.findNearestPointBy = findNearestPointBy;
		return this;
	}

	@JsOverlay
	public final Boolean getGetExtremesFromAll() {
		return getExtremesFromAll;
	}

	@JsOverlay
	public final Vector setGetExtremesFromAll(Boolean getExtremesFromAll) {
		this.getExtremesFromAll = getExtremesFromAll;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getKeys() {
		return keys;
	}

	@JsOverlay
	public final Vector setKeys(JsArray<String> keys) {
		this.keys = keys;
		return this;
	}

	@JsOverlay
	public final SeriesLabel getLabel() {
		return label;
	}

	@JsOverlay
	public final Vector setLabel(SeriesLabel label) {
		this.label = label;
		return this;
	}

	@JsOverlay
	public final double getLineWidth() {
		return lineWidth;
	}

	@JsOverlay
	public final Vector setLineWidth(double lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	@JsOverlay
	public final String getLinkedTo() {
		return linkedTo;
	}

	@JsOverlay
	public final Vector setLinkedTo(String linkedTo) {
		this.linkedTo = linkedTo;
		return this;
	}

	@JsOverlay
	public final String getNegativeColor() {
		return negativeColor;
	}

	@JsOverlay
	public final Vector setNegativeColor(String negativeColor) {
		this.negativeColor = negativeColor;
		return this;
	}

	@JsOverlay
	public final SeriesPoint getPoint() {
		return point;
	}

	@JsOverlay
	public final Vector setPoint(SeriesPoint point) {
		this.point = point;
		return this;
	}

	@JsOverlay
	public final PointDescriptionFormatter getPointDescriptionFormatter() {
		return pointDescriptionFormatter;
	}

	@JsOverlay
	public final Vector setPointDescriptionFormatter(PointDescriptionFormatter pointDescriptionFormatter) {
		this.pointDescriptionFormatter = pointDescriptionFormatter;
		return this;
	}

	@JsOverlay
	public final double getPointInterval() {
		return pointInterval;
	}

	@JsOverlay
	public final Vector setPointInterval(double pointInterval) {
		this.pointInterval = pointInterval;
		return this;
	}

	@JsOverlay
	public final String getPointIntervalUnit() {
		return pointIntervalUnit;
	}

	@JsOverlay
	public final Vector setPointIntervalUnit(String pointIntervalUnit) {
		this.pointIntervalUnit = pointIntervalUnit;
		return this;
	}

	@JsOverlay
	public final double getPointStart() {
		return pointStart;
	}

	@JsOverlay
	public final Vector setPointStart(double pointStart) {
		this.pointStart = pointStart;
		return this;
	}

	@JsOverlay
	public final String getRotationOrigin() {
		return rotationOrigin;
	}

	@JsOverlay
	public final Vector setRotationOrigin(String rotationOrigin) {
		this.rotationOrigin = rotationOrigin;
		return this;
	}

	@JsOverlay
	public final Boolean getSelected() {
		return selected;
	}

	@JsOverlay
	public final Vector setSelected(Boolean selected) {
		this.selected = selected;
		return this;
	}

	@JsOverlay
	public final Boolean getShowCheckbox() {
		return showCheckbox;
	}

	@JsOverlay
	public final Vector setShowCheckbox(Boolean showCheckbox) {
		this.showCheckbox = showCheckbox;
		return this;
	}

	@JsOverlay
	public final Boolean getShowInLegend() {
		return showInLegend;
	}

	@JsOverlay
	public final Vector setShowInLegend(Boolean showInLegend) {
		this.showInLegend = showInLegend;
		return this;
	}

	@JsOverlay
	public final Boolean getSkipKeyboardNavigation() {
		return skipKeyboardNavigation;
	}

	@JsOverlay
	public final Vector setSkipKeyboardNavigation(Boolean skipKeyboardNavigation) {
		this.skipKeyboardNavigation = skipKeyboardNavigation;
		return this;
	}

	@JsOverlay
	public final Boolean getSoftThreshold() {
		return softThreshold;
	}

	@JsOverlay
	public final Vector setSoftThreshold(Boolean softThreshold) {
		this.softThreshold = softThreshold;
		return this;
	}

	@JsOverlay
	public final SeriesStates getStates() {
		return states;
	}

	@JsOverlay
	public final Vector setStates(SeriesStates states) {
		this.states = states;
		return this;
	}

	@JsOverlay
	public final Boolean getStickyTracking() {
		return stickyTracking;
	}

	@JsOverlay
	public final Vector setStickyTracking(Boolean stickyTracking) {
		this.stickyTracking = stickyTracking;
		return this;
	}

	@JsOverlay
	public final Tooltip getTooltip() {
		return tooltip;
	}

	@JsOverlay
	public final Vector setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
		return this;
	}

	@JsOverlay
	public final double getTurboThreshold() {
		return turboThreshold;
	}

	@JsOverlay
	public final Vector setTurboThreshold(double turboThreshold) {
		this.turboThreshold = turboThreshold;
		return this;
	}

	@JsOverlay
	public final Boolean getVisible() {
		return visible;
	}

	@JsOverlay
	public final Vector setVisible(Boolean visible) {
		this.visible = visible;
		return this;
	}

	@JsOverlay
	public final String getZoneAxis() {
		return zoneAxis;
	}

	@JsOverlay
	public final Vector setZoneAxis(String zoneAxis) {
		this.zoneAxis = zoneAxis;
		return this;
	}

	@JsOverlay
	public final JsArray<SeriesZones> getZones() {
		return zones;
	}

	@JsOverlay
	public final Vector setZones(JsArray<SeriesZones> zones) {
		this.zones = zones;
		return this;
	}
}
