package us.ascendtech.highcharts.client.chartoptions.plotoptions.types;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesDataLabels;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesEvents;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesLabel;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesPoint;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.Animation;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.PointDescriptionFormatter;
import us.ascendtech.highcharts.client.chartoptions.tooltip.Tooltip;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/plotOptions.solidgauge
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SolidGauge {

	@JsProperty
	private Boolean allowPointSelect;
	@JsProperty
	private Animation animation;
	@JsProperty
	private String className;
	@JsProperty
	private String color;
	@JsProperty
	private Boolean colorByPoint;
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
	private JsArray<String> keys;
	@JsProperty
	private SeriesLabel label;
	@JsProperty
	private String linecap;
	@JsProperty
	private double lineWidth;
	@JsProperty
	private String linkedTo;
	@JsProperty
	private double overshoot;
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
	private Boolean rounded;
	@JsProperty
	private Boolean selected;
	@JsProperty
	private Boolean showCheckbox;
	@JsProperty
	private Boolean showInLegend;
	@JsProperty
	private Boolean skipKeyboardNavigation;
	@JsProperty
	private Boolean stickyTracking;
	@JsProperty
	private double threshold;
	@JsProperty
	private Tooltip tooltip;
	@JsProperty
	private Boolean visible;

	@JsOverlay
	public final Boolean getAllowPointSelect() {
		return allowPointSelect;
	}

	@JsOverlay
	public final SolidGauge setAllowPointSelect(Boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
		return this;
	}

	@JsOverlay
	public final Animation getAnimation() {
		return animation;
	}

	@JsOverlay
	public final SolidGauge setAnimation(Animation animation) {
		this.animation = animation;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final SolidGauge setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final SolidGauge setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final Boolean getColorByPoint() {
		return colorByPoint;
	}

	@JsOverlay
	public final SolidGauge setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		return this;
	}

	@JsOverlay
	public final double getColorIndex() {
		return colorIndex;
	}

	@JsOverlay
	public final SolidGauge setColorIndex(double colorIndex) {
		this.colorIndex = colorIndex;
		return this;
	}

	@JsOverlay
	public final String getCursor() {
		return cursor;
	}

	@JsOverlay
	public final SolidGauge setCursor(String cursor) {
		this.cursor = cursor;
		return this;
	}

	@JsOverlay
	public final SeriesDataLabels getDataLabels() {
		return dataLabels;
	}

	@JsOverlay
	public final SolidGauge setDataLabels(SeriesDataLabels dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	@JsOverlay
	public final String getDescription() {
		return description;
	}

	@JsOverlay
	public final SolidGauge setDescription(String description) {
		this.description = description;
		return this;
	}

	@JsOverlay
	public final Boolean getEnableMouseTracking() {
		return enableMouseTracking;
	}

	@JsOverlay
	public final SolidGauge setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
		return this;
	}

	@JsOverlay
	public final SeriesEvents getEvents() {
		return events;
	}

	@JsOverlay
	public final SolidGauge setEvents(SeriesEvents events) {
		this.events = events;
		return this;
	}

	@JsOverlay
	public final Boolean getExposeElementToA11y() {
		return exposeElementToA11y;
	}

	@JsOverlay
	public final SolidGauge setExposeElementToA11y(Boolean exposeElementToA11y) {
		this.exposeElementToA11y = exposeElementToA11y;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getKeys() {
		return keys;
	}

	@JsOverlay
	public final SolidGauge setKeys(JsArray<String> keys) {
		this.keys = keys;
		return this;
	}

	@JsOverlay
	public final SeriesLabel getLabel() {
		return label;
	}

	@JsOverlay
	public final SolidGauge setLabel(SeriesLabel label) {
		this.label = label;
		return this;
	}

	@JsOverlay
	public final String getLinecap() {
		return linecap;
	}

	@JsOverlay
	public final SolidGauge setLinecap(String linecap) {
		this.linecap = linecap;
		return this;
	}

	@JsOverlay
	public final double getLineWidth() {
		return lineWidth;
	}

	@JsOverlay
	public final SolidGauge setLineWidth(double lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	@JsOverlay
	public final String getLinkedTo() {
		return linkedTo;
	}

	@JsOverlay
	public final SolidGauge setLinkedTo(String linkedTo) {
		this.linkedTo = linkedTo;
		return this;
	}

	@JsOverlay
	public final double getOvershoot() {
		return overshoot;
	}

	@JsOverlay
	public final SolidGauge setOvershoot(double overshoot) {
		this.overshoot = overshoot;
		return this;
	}

	@JsOverlay
	public final SeriesPoint getPoint() {
		return point;
	}

	@JsOverlay
	public final SolidGauge setPoint(SeriesPoint point) {
		this.point = point;
		return this;
	}

	@JsOverlay
	public final PointDescriptionFormatter getPointDescriptionFormatter() {
		return pointDescriptionFormatter;
	}

	@JsOverlay
	public final SolidGauge setPointDescriptionFormatter(PointDescriptionFormatter pointDescriptionFormatter) {
		this.pointDescriptionFormatter = pointDescriptionFormatter;
		return this;
	}

	@JsOverlay
	public final double getPointInterval() {
		return pointInterval;
	}

	@JsOverlay
	public final SolidGauge setPointInterval(double pointInterval) {
		this.pointInterval = pointInterval;
		return this;
	}

	@JsOverlay
	public final String getPointIntervalUnit() {
		return pointIntervalUnit;
	}

	@JsOverlay
	public final SolidGauge setPointIntervalUnit(String pointIntervalUnit) {
		this.pointIntervalUnit = pointIntervalUnit;
		return this;
	}

	@JsOverlay
	public final double getPointStart() {
		return pointStart;
	}

	@JsOverlay
	public final SolidGauge setPointStart(double pointStart) {
		this.pointStart = pointStart;
		return this;
	}

	@JsOverlay
	public final Boolean getRounded() {
		return rounded;
	}

	@JsOverlay
	public final SolidGauge setRounded(Boolean rounded) {
		this.rounded = rounded;
		return this;
	}

	@JsOverlay
	public final Boolean getSelected() {
		return selected;
	}

	@JsOverlay
	public final SolidGauge setSelected(Boolean selected) {
		this.selected = selected;
		return this;
	}

	@JsOverlay
	public final Boolean getShowCheckbox() {
		return showCheckbox;
	}

	@JsOverlay
	public final SolidGauge setShowCheckbox(Boolean showCheckbox) {
		this.showCheckbox = showCheckbox;
		return this;
	}

	@JsOverlay
	public final Boolean getShowInLegend() {
		return showInLegend;
	}

	@JsOverlay
	public final SolidGauge setShowInLegend(Boolean showInLegend) {
		this.showInLegend = showInLegend;
		return this;
	}

	@JsOverlay
	public final Boolean getSkipKeyboardNavigation() {
		return skipKeyboardNavigation;
	}

	@JsOverlay
	public final SolidGauge setSkipKeyboardNavigation(Boolean skipKeyboardNavigation) {
		this.skipKeyboardNavigation = skipKeyboardNavigation;
		return this;
	}

	@JsOverlay
	public final Boolean getStickyTracking() {
		return stickyTracking;
	}

	@JsOverlay
	public final SolidGauge setStickyTracking(Boolean stickyTracking) {
		this.stickyTracking = stickyTracking;
		return this;
	}

	@JsOverlay
	public final double getThreshold() {
		return threshold;
	}

	@JsOverlay
	public final SolidGauge setThreshold(double threshold) {
		this.threshold = threshold;
		return this;
	}

	@JsOverlay
	public final Tooltip getTooltip() {
		return tooltip;
	}

	@JsOverlay
	public final SolidGauge setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
		return this;
	}

	@JsOverlay
	public final Boolean getVisible() {
		return visible;
	}

	@JsOverlay
	public final SolidGauge setVisible(Boolean visible) {
		this.visible = visible;
		return this;
	}
}
