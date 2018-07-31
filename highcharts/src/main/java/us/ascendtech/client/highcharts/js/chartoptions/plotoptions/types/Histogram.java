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
import us.ascendtech.client.highcharts.js.chartoptions.shared.Shadow;
import us.ascendtech.client.highcharts.js.chartoptions.shared.functions.Animation;
import us.ascendtech.client.highcharts.js.chartoptions.shared.functions.PointDescriptionFormatter;
import us.ascendtech.client.highcharts.js.chartoptions.tooltip.Tooltip;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/plotOptions.histogram
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Histogram {

	@JsProperty
	private Boolean allowPointSelect;
	@JsProperty
	private Animation animation;
	@JsProperty
	private double animationLimit;
	@JsProperty
	private String binsNumber;
	@JsProperty
	private double binWidth;
	@JsProperty
	private String borderColor;
	@JsProperty
	private double borderRadius;
	@JsProperty
	private double borderWidth;
	@JsProperty
	private String className;
	@JsProperty
	private String color;
	@JsProperty
	private Boolean colorByPoint;
	@JsProperty
	private double colorIndex;
	@JsProperty
	private JsArray<String> colors;
	@JsProperty
	private Boolean crisp;
	@JsProperty
	private double cropThreshold;
	@JsProperty
	private String cursor;
	@JsProperty
	private SeriesDataLabels dataLabels;
	@JsProperty
	private double depth;
	@JsProperty
	private String description;
	@JsProperty
	private String edgeColor;
	@JsProperty
	private String edgeWidth;
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
	private Boolean grouping;
	@JsProperty
	private double groupPadding;
	@JsProperty
	private double groupZPadding;
	@JsProperty
	private JsArray<String> keys;
	@JsProperty
	private SeriesLabel label;
	@JsProperty
	private String linkedTo;
	@JsProperty
	private double maxPointWidth;
	@JsProperty
	private double minPointLength;
	@JsProperty
	private String negativeColor;
	@JsProperty
	private SeriesPoint point;
	@JsProperty
	private PointDescriptionFormatter pointDescriptionFormatter;
	@JsProperty
	private double pointPadding;
	@JsProperty
	private String pointPlacement;
	@JsProperty
	private double pointRange;
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
	private SeriesStates states;
	@JsProperty
	private Boolean stickyTracking;
	@JsProperty
	private double threshold;
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
	public final Histogram setAllowPointSelect(Boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
		return this;
	}

	@JsOverlay
	public final Animation getAnimation() {
		return animation;
	}

	@JsOverlay
	public final Histogram setAnimation(Animation animation) {
		this.animation = animation;
		return this;
	}

	@JsOverlay
	public final double getAnimationLimit() {
		return animationLimit;
	}

	@JsOverlay
	public final Histogram setAnimationLimit(double animationLimit) {
		this.animationLimit = animationLimit;
		return this;
	}

	@JsOverlay
	public final String getBinsNumber() {
		return binsNumber;
	}

	@JsOverlay
	public final Histogram setBinsNumber(String binsNumber) {
		this.binsNumber = binsNumber;
		return this;
	}

	@JsOverlay
	public final double getBinWidth() {
		return binWidth;
	}

	@JsOverlay
	public final Histogram setBinWidth(double binWidth) {
		this.binWidth = binWidth;
		return this;
	}

	@JsOverlay
	public final String getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final Histogram setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final double getBorderRadius() {
		return borderRadius;
	}

	@JsOverlay
	public final Histogram setBorderRadius(double borderRadius) {
		this.borderRadius = borderRadius;
		return this;
	}

	@JsOverlay
	public final double getBorderWidth() {
		return borderWidth;
	}

	@JsOverlay
	public final Histogram setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final Histogram setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final Histogram setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final Boolean getColorByPoint() {
		return colorByPoint;
	}

	@JsOverlay
	public final Histogram setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		return this;
	}

	@JsOverlay
	public final double getColorIndex() {
		return colorIndex;
	}

	@JsOverlay
	public final Histogram setColorIndex(double colorIndex) {
		this.colorIndex = colorIndex;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getColors() {
		return colors;
	}

	@JsOverlay
	public final Histogram setColors(JsArray<String> colors) {
		this.colors = colors;
		return this;
	}

	@JsOverlay
	public final Boolean getCrisp() {
		return crisp;
	}

	@JsOverlay
	public final Histogram setCrisp(Boolean crisp) {
		this.crisp = crisp;
		return this;
	}

	@JsOverlay
	public final double getCropThreshold() {
		return cropThreshold;
	}

	@JsOverlay
	public final Histogram setCropThreshold(double cropThreshold) {
		this.cropThreshold = cropThreshold;
		return this;
	}

	@JsOverlay
	public final String getCursor() {
		return cursor;
	}

	@JsOverlay
	public final Histogram setCursor(String cursor) {
		this.cursor = cursor;
		return this;
	}

	@JsOverlay
	public final SeriesDataLabels getDataLabels() {
		return dataLabels;
	}

	@JsOverlay
	public final Histogram setDataLabels(SeriesDataLabels dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	@JsOverlay
	public final double getDepth() {
		return depth;
	}

	@JsOverlay
	public final Histogram setDepth(double depth) {
		this.depth = depth;
		return this;
	}

	@JsOverlay
	public final String getDescription() {
		return description;
	}

	@JsOverlay
	public final Histogram setDescription(String description) {
		this.description = description;
		return this;
	}

	@JsOverlay
	public final String getEdgeColor() {
		return edgeColor;
	}

	@JsOverlay
	public final Histogram setEdgeColor(String edgeColor) {
		this.edgeColor = edgeColor;
		return this;
	}

	@JsOverlay
	public final String getEdgeWidth() {
		return edgeWidth;
	}

	@JsOverlay
	public final Histogram setEdgeWidth(String edgeWidth) {
		this.edgeWidth = edgeWidth;
		return this;
	}

	@JsOverlay
	public final Boolean getEnableMouseTracking() {
		return enableMouseTracking;
	}

	@JsOverlay
	public final Histogram setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
		return this;
	}

	@JsOverlay
	public final SeriesEvents getEvents() {
		return events;
	}

	@JsOverlay
	public final Histogram setEvents(SeriesEvents events) {
		this.events = events;
		return this;
	}

	@JsOverlay
	public final Boolean getExposeElementToA11y() {
		return exposeElementToA11y;
	}

	@JsOverlay
	public final Histogram setExposeElementToA11y(Boolean exposeElementToA11y) {
		this.exposeElementToA11y = exposeElementToA11y;
		return this;
	}

	@JsOverlay
	public final String getFindNearestPointBy() {
		return findNearestPointBy;
	}

	@JsOverlay
	public final Histogram setFindNearestPointBy(String findNearestPointBy) {
		this.findNearestPointBy = findNearestPointBy;
		return this;
	}

	@JsOverlay
	public final Boolean getGetExtremesFromAll() {
		return getExtremesFromAll;
	}

	@JsOverlay
	public final Histogram setGetExtremesFromAll(Boolean getExtremesFromAll) {
		this.getExtremesFromAll = getExtremesFromAll;
		return this;
	}

	@JsOverlay
	public final Boolean getGrouping() {
		return grouping;
	}

	@JsOverlay
	public final Histogram setGrouping(Boolean grouping) {
		this.grouping = grouping;
		return this;
	}

	@JsOverlay
	public final double getGroupPadding() {
		return groupPadding;
	}

	@JsOverlay
	public final Histogram setGroupPadding(double groupPadding) {
		this.groupPadding = groupPadding;
		return this;
	}

	@JsOverlay
	public final double getGroupZPadding() {
		return groupZPadding;
	}

	@JsOverlay
	public final Histogram setGroupZPadding(double groupZPadding) {
		this.groupZPadding = groupZPadding;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getKeys() {
		return keys;
	}

	@JsOverlay
	public final Histogram setKeys(JsArray<String> keys) {
		this.keys = keys;
		return this;
	}

	@JsOverlay
	public final SeriesLabel getLabel() {
		return label;
	}

	@JsOverlay
	public final Histogram setLabel(SeriesLabel label) {
		this.label = label;
		return this;
	}

	@JsOverlay
	public final String getLinkedTo() {
		return linkedTo;
	}

	@JsOverlay
	public final Histogram setLinkedTo(String linkedTo) {
		this.linkedTo = linkedTo;
		return this;
	}

	@JsOverlay
	public final double getMaxPointWidth() {
		return maxPointWidth;
	}

	@JsOverlay
	public final Histogram setMaxPointWidth(double maxPointWidth) {
		this.maxPointWidth = maxPointWidth;
		return this;
	}

	@JsOverlay
	public final double getMinPointLength() {
		return minPointLength;
	}

	@JsOverlay
	public final Histogram setMinPointLength(double minPointLength) {
		this.minPointLength = minPointLength;
		return this;
	}

	@JsOverlay
	public final String getNegativeColor() {
		return negativeColor;
	}

	@JsOverlay
	public final Histogram setNegativeColor(String negativeColor) {
		this.negativeColor = negativeColor;
		return this;
	}

	@JsOverlay
	public final SeriesPoint getPoint() {
		return point;
	}

	@JsOverlay
	public final Histogram setPoint(SeriesPoint point) {
		this.point = point;
		return this;
	}

	@JsOverlay
	public final PointDescriptionFormatter getPointDescriptionFormatter() {
		return pointDescriptionFormatter;
	}

	@JsOverlay
	public final Histogram setPointDescriptionFormatter(PointDescriptionFormatter pointDescriptionFormatter) {
		this.pointDescriptionFormatter = pointDescriptionFormatter;
		return this;
	}

	@JsOverlay
	public final double getPointPadding() {
		return pointPadding;
	}

	@JsOverlay
	public final Histogram setPointPadding(double pointPadding) {
		this.pointPadding = pointPadding;
		return this;
	}

	@JsOverlay
	public final String getPointPlacement() {
		return pointPlacement;
	}

	@JsOverlay
	public final Histogram setPointPlacement(String pointPlacement) {
		this.pointPlacement = pointPlacement;
		return this;
	}

	@JsOverlay
	public final double getPointRange() {
		return pointRange;
	}

	@JsOverlay
	public final Histogram setPointRange(double pointRange) {
		this.pointRange = pointRange;
		return this;
	}

	@JsOverlay
	public final double getPointStart() {
		return pointStart;
	}

	@JsOverlay
	public final Histogram setPointStart(double pointStart) {
		this.pointStart = pointStart;
		return this;
	}

	@JsOverlay
	public final Boolean getSelected() {
		return selected;
	}

	@JsOverlay
	public final Histogram setSelected(Boolean selected) {
		this.selected = selected;
		return this;
	}

	@JsOverlay
	public final Shadow getShadow() {
		return shadow;
	}

	@JsOverlay
	public final Histogram setShadow(Shadow shadow) {
		this.shadow = shadow;
		return this;
	}

	@JsOverlay
	public final Boolean getShowCheckbox() {
		return showCheckbox;
	}

	@JsOverlay
	public final Histogram setShowCheckbox(Boolean showCheckbox) {
		this.showCheckbox = showCheckbox;
		return this;
	}

	@JsOverlay
	public final Boolean getShowInLegend() {
		return showInLegend;
	}

	@JsOverlay
	public final Histogram setShowInLegend(Boolean showInLegend) {
		this.showInLegend = showInLegend;
		return this;
	}

	@JsOverlay
	public final Boolean getSkipKeyboardNavigation() {
		return skipKeyboardNavigation;
	}

	@JsOverlay
	public final Histogram setSkipKeyboardNavigation(Boolean skipKeyboardNavigation) {
		this.skipKeyboardNavigation = skipKeyboardNavigation;
		return this;
	}

	@JsOverlay
	public final Boolean getSoftThreshold() {
		return softThreshold;
	}

	@JsOverlay
	public final Histogram setSoftThreshold(Boolean softThreshold) {
		this.softThreshold = softThreshold;
		return this;
	}

	@JsOverlay
	public final SeriesStates getStates() {
		return states;
	}

	@JsOverlay
	public final Histogram setStates(SeriesStates states) {
		this.states = states;
		return this;
	}

	@JsOverlay
	public final Boolean getStickyTracking() {
		return stickyTracking;
	}

	@JsOverlay
	public final Histogram setStickyTracking(Boolean stickyTracking) {
		this.stickyTracking = stickyTracking;
		return this;
	}

	@JsOverlay
	public final double getThreshold() {
		return threshold;
	}

	@JsOverlay
	public final Histogram setThreshold(double threshold) {
		this.threshold = threshold;
		return this;
	}

	@JsOverlay
	public final Tooltip getTooltip() {
		return tooltip;
	}

	@JsOverlay
	public final Histogram setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
		return this;
	}

	@JsOverlay
	public final double getTurboThreshold() {
		return turboThreshold;
	}

	@JsOverlay
	public final Histogram setTurboThreshold(double turboThreshold) {
		this.turboThreshold = turboThreshold;
		return this;
	}

	@JsOverlay
	public final Boolean getVisible() {
		return visible;
	}

	@JsOverlay
	public final Histogram setVisible(Boolean visible) {
		this.visible = visible;
		return this;
	}

	@JsOverlay
	public final String getZoneAxis() {
		return zoneAxis;
	}

	@JsOverlay
	public final Histogram setZoneAxis(String zoneAxis) {
		this.zoneAxis = zoneAxis;
		return this;
	}

	@JsOverlay
	public final JsArray<SeriesZones> getZones() {
		return zones;
	}

	@JsOverlay
	public final Histogram setZones(JsArray<SeriesZones> zones) {
		this.zones = zones;
		return this;
	}
}
