package us.ascendtech.highcharts.client.chartoptions.plotoptions.types;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.plotoptions.PlotTargetOptions;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesDataLabels;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesEvents;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesLabel;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesPoint;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesZones;
import us.ascendtech.highcharts.client.chartoptions.series.states.SeriesStates;
import us.ascendtech.highcharts.client.chartoptions.shared.Shadow;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.Animation;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.PointDescriptionFormatter;
import us.ascendtech.highcharts.client.chartoptions.tooltip.Tooltip;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/plotOptions.bullet
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Bullet {

	@JsProperty
	private Boolean allowPointSelect;
	@JsProperty
	private Animation animation;
	@JsProperty
	private double animationLimit;
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
	private double edgeWidth;
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
	private double pointInterval;
	@JsProperty
	private String pointIntervalUnit;
	@JsProperty
	private double pointPadding;
	@JsProperty
	private String pointPlacement;
	@JsProperty
	private double pointRange;
	@JsProperty
	private double pointStart;
	@JsProperty
	private double pointWidth;
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
	private Boolean stickyTracking;
	@JsProperty
	private PlotTargetOptions targetOptions;
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
	public final Bullet setAllowPointSelect(Boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
		return this;
	}

	@JsOverlay
	public final Animation getAnimation() {
		return animation;
	}

	@JsOverlay
	public final Bullet setAnimation(Animation animation) {
		this.animation = animation;
		return this;
	}

	@JsOverlay
	public final double getAnimationLimit() {
		return animationLimit;
	}

	@JsOverlay
	public final Bullet setAnimationLimit(double animationLimit) {
		this.animationLimit = animationLimit;
		return this;
	}

	@JsOverlay
	public final String getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final Bullet setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final double getBorderRadius() {
		return borderRadius;
	}

	@JsOverlay
	public final Bullet setBorderRadius(double borderRadius) {
		this.borderRadius = borderRadius;
		return this;
	}

	@JsOverlay
	public final double getBorderWidth() {
		return borderWidth;
	}

	@JsOverlay
	public final Bullet setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final Bullet setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final Bullet setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final Boolean getColorByPoint() {
		return colorByPoint;
	}

	@JsOverlay
	public final Bullet setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		return this;
	}

	@JsOverlay
	public final double getColorIndex() {
		return colorIndex;
	}

	@JsOverlay
	public final Bullet setColorIndex(double colorIndex) {
		this.colorIndex = colorIndex;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getColors() {
		return colors;
	}

	@JsOverlay
	public final Bullet setColors(JsArray<String> colors) {
		this.colors = colors;
		return this;
	}

	@JsOverlay
	public final Boolean getCrisp() {
		return crisp;
	}

	@JsOverlay
	public final Bullet setCrisp(Boolean crisp) {
		this.crisp = crisp;
		return this;
	}

	@JsOverlay
	public final double getCropThreshold() {
		return cropThreshold;
	}

	@JsOverlay
	public final Bullet setCropThreshold(double cropThreshold) {
		this.cropThreshold = cropThreshold;
		return this;
	}

	@JsOverlay
	public final String getCursor() {
		return cursor;
	}

	@JsOverlay
	public final Bullet setCursor(String cursor) {
		this.cursor = cursor;
		return this;
	}

	@JsOverlay
	public final SeriesDataLabels getDataLabels() {
		return dataLabels;
	}

	@JsOverlay
	public final Bullet setDataLabels(SeriesDataLabels dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	@JsOverlay
	public final double getDepth() {
		return depth;
	}

	@JsOverlay
	public final Bullet setDepth(double depth) {
		this.depth = depth;
		return this;
	}

	@JsOverlay
	public final String getDescription() {
		return description;
	}

	@JsOverlay
	public final Bullet setDescription(String description) {
		this.description = description;
		return this;
	}

	@JsOverlay
	public final String getEdgeColor() {
		return edgeColor;
	}

	@JsOverlay
	public final Bullet setEdgeColor(String edgeColor) {
		this.edgeColor = edgeColor;
		return this;
	}

	@JsOverlay
	public final double getEdgeWidth() {
		return edgeWidth;
	}

	@JsOverlay
	public final Bullet setEdgeWidth(double edgeWidth) {
		this.edgeWidth = edgeWidth;
		return this;
	}

	@JsOverlay
	public final Boolean getEnableMouseTracking() {
		return enableMouseTracking;
	}

	@JsOverlay
	public final Bullet setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
		return this;
	}

	@JsOverlay
	public final SeriesEvents getEvents() {
		return events;
	}

	@JsOverlay
	public final Bullet setEvents(SeriesEvents events) {
		this.events = events;
		return this;
	}

	@JsOverlay
	public final Boolean getExposeElementToA11y() {
		return exposeElementToA11y;
	}

	@JsOverlay
	public final Bullet setExposeElementToA11y(Boolean exposeElementToA11y) {
		this.exposeElementToA11y = exposeElementToA11y;
		return this;
	}

	@JsOverlay
	public final String getFindNearestPointBy() {
		return findNearestPointBy;
	}

	@JsOverlay
	public final Bullet setFindNearestPointBy(String findNearestPointBy) {
		this.findNearestPointBy = findNearestPointBy;
		return this;
	}

	@JsOverlay
	public final Boolean getGetExtremesFromAll() {
		return getExtremesFromAll;
	}

	@JsOverlay
	public final Bullet setGetExtremesFromAll(Boolean getExtremesFromAll) {
		this.getExtremesFromAll = getExtremesFromAll;
		return this;
	}

	@JsOverlay
	public final Boolean getGrouping() {
		return grouping;
	}

	@JsOverlay
	public final Bullet setGrouping(Boolean grouping) {
		this.grouping = grouping;
		return this;
	}

	@JsOverlay
	public final double getGroupPadding() {
		return groupPadding;
	}

	@JsOverlay
	public final Bullet setGroupPadding(double groupPadding) {
		this.groupPadding = groupPadding;
		return this;
	}

	@JsOverlay
	public final double getGroupZPadding() {
		return groupZPadding;
	}

	@JsOverlay
	public final Bullet setGroupZPadding(double groupZPadding) {
		this.groupZPadding = groupZPadding;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getKeys() {
		return keys;
	}

	@JsOverlay
	public final Bullet setKeys(JsArray<String> keys) {
		this.keys = keys;
		return this;
	}

	@JsOverlay
	public final SeriesLabel getLabel() {
		return label;
	}

	@JsOverlay
	public final Bullet setLabel(SeriesLabel label) {
		this.label = label;
		return this;
	}

	@JsOverlay
	public final String getLinkedTo() {
		return linkedTo;
	}

	@JsOverlay
	public final Bullet setLinkedTo(String linkedTo) {
		this.linkedTo = linkedTo;
		return this;
	}

	@JsOverlay
	public final double getMaxPointWidth() {
		return maxPointWidth;
	}

	@JsOverlay
	public final Bullet setMaxPointWidth(double maxPointWidth) {
		this.maxPointWidth = maxPointWidth;
		return this;
	}

	@JsOverlay
	public final double getMinPointLength() {
		return minPointLength;
	}

	@JsOverlay
	public final Bullet setMinPointLength(double minPointLength) {
		this.minPointLength = minPointLength;
		return this;
	}

	@JsOverlay
	public final String getNegativeColor() {
		return negativeColor;
	}

	@JsOverlay
	public final Bullet setNegativeColor(String negativeColor) {
		this.negativeColor = negativeColor;
		return this;
	}

	@JsOverlay
	public final SeriesPoint getPoint() {
		return point;
	}

	@JsOverlay
	public final Bullet setPoint(SeriesPoint point) {
		this.point = point;
		return this;
	}

	@JsOverlay
	public final PointDescriptionFormatter getPointDescriptionFormatter() {
		return pointDescriptionFormatter;
	}

	@JsOverlay
	public final Bullet setPointDescriptionFormatter(PointDescriptionFormatter pointDescriptionFormatter) {
		this.pointDescriptionFormatter = pointDescriptionFormatter;
		return this;
	}

	@JsOverlay
	public final double getPointInterval() {
		return pointInterval;
	}

	@JsOverlay
	public final Bullet setPointInterval(double pointInterval) {
		this.pointInterval = pointInterval;
		return this;
	}

	@JsOverlay
	public final String getPointIntervalUnit() {
		return pointIntervalUnit;
	}

	@JsOverlay
	public final Bullet setPointIntervalUnit(String pointIntervalUnit) {
		this.pointIntervalUnit = pointIntervalUnit;
		return this;
	}

	@JsOverlay
	public final double getPointPadding() {
		return pointPadding;
	}

	@JsOverlay
	public final Bullet setPointPadding(double pointPadding) {
		this.pointPadding = pointPadding;
		return this;
	}

	@JsOverlay
	public final String getPointPlacement() {
		return pointPlacement;
	}

	@JsOverlay
	public final Bullet setPointPlacement(String pointPlacement) {
		this.pointPlacement = pointPlacement;
		return this;
	}

	@JsOverlay
	public final double getPointRange() {
		return pointRange;
	}

	@JsOverlay
	public final Bullet setPointRange(double pointRange) {
		this.pointRange = pointRange;
		return this;
	}

	@JsOverlay
	public final double getPointStart() {
		return pointStart;
	}

	@JsOverlay
	public final Bullet setPointStart(double pointStart) {
		this.pointStart = pointStart;
		return this;
	}

	@JsOverlay
	public final double getPointWidth() {
		return pointWidth;
	}

	@JsOverlay
	public final Bullet setPointWidth(double pointWidth) {
		this.pointWidth = pointWidth;
		return this;
	}

	@JsOverlay
	public final Boolean getSelected() {
		return selected;
	}

	@JsOverlay
	public final Bullet setSelected(Boolean selected) {
		this.selected = selected;
		return this;
	}

	@JsOverlay
	public final Shadow getShadow() {
		return shadow;
	}

	@JsOverlay
	public final Bullet setShadow(Shadow shadow) {
		this.shadow = shadow;
		return this;
	}

	@JsOverlay
	public final Boolean getShowCheckbox() {
		return showCheckbox;
	}

	@JsOverlay
	public final Bullet setShowCheckbox(Boolean showCheckbox) {
		this.showCheckbox = showCheckbox;
		return this;
	}

	@JsOverlay
	public final Boolean getShowInLegend() {
		return showInLegend;
	}

	@JsOverlay
	public final Bullet setShowInLegend(Boolean showInLegend) {
		this.showInLegend = showInLegend;
		return this;
	}

	@JsOverlay
	public final Boolean getSkipKeyboardNavigation() {
		return skipKeyboardNavigation;
	}

	@JsOverlay
	public final Bullet setSkipKeyboardNavigation(Boolean skipKeyboardNavigation) {
		this.skipKeyboardNavigation = skipKeyboardNavigation;
		return this;
	}

	@JsOverlay
	public final Boolean getSoftThreshold() {
		return softThreshold;
	}

	@JsOverlay
	public final Bullet setSoftThreshold(Boolean softThreshold) {
		this.softThreshold = softThreshold;
		return this;
	}

	@JsOverlay
	public final String getStacking() {
		return stacking;
	}

	@JsOverlay
	public final Bullet setStacking(String stacking) {
		this.stacking = stacking;
		return this;
	}

	@JsOverlay
	public final SeriesStates getStates() {
		return states;
	}

	@JsOverlay
	public final Bullet setStates(SeriesStates states) {
		this.states = states;
		return this;
	}

	@JsOverlay
	public final Boolean getStickyTracking() {
		return stickyTracking;
	}

	@JsOverlay
	public final Bullet setStickyTracking(Boolean stickyTracking) {
		this.stickyTracking = stickyTracking;
		return this;
	}

	@JsOverlay
	public final PlotTargetOptions getTargetOptions() {
		return targetOptions;
	}

	@JsOverlay
	public final Bullet setTargetOptions(PlotTargetOptions targetOptions) {
		this.targetOptions = targetOptions;
		return this;
	}

	@JsOverlay
	public final double getThreshold() {
		return threshold;
	}

	@JsOverlay
	public final Bullet setThreshold(double threshold) {
		this.threshold = threshold;
		return this;
	}

	@JsOverlay
	public final Tooltip getTooltip() {
		return tooltip;
	}

	@JsOverlay
	public final Bullet setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
		return this;
	}

	@JsOverlay
	public final double getTurboThreshold() {
		return turboThreshold;
	}

	@JsOverlay
	public final Bullet setTurboThreshold(double turboThreshold) {
		this.turboThreshold = turboThreshold;
		return this;
	}

	@JsOverlay
	public final Boolean getVisible() {
		return visible;
	}

	@JsOverlay
	public final Bullet setVisible(Boolean visible) {
		this.visible = visible;
		return this;
	}

	@JsOverlay
	public final String getZoneAxis() {
		return zoneAxis;
	}

	@JsOverlay
	public final Bullet setZoneAxis(String zoneAxis) {
		this.zoneAxis = zoneAxis;
		return this;
	}

	@JsOverlay
	public final JsArray<SeriesZones> getZones() {
		return zones;
	}

	@JsOverlay
	public final Bullet setZones(JsArray<SeriesZones> zones) {
		this.zones = zones;
		return this;
	}
}
