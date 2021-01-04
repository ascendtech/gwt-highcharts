package us.ascendtech.highcharts.client.chartoptions.series;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.series.states.SeriesStates;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.Animation;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.PointDescriptionFormatter;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/series
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Series {

	@JsProperty
	private Boolean allowPointSelect;
	@JsProperty
	private Animation animation;
	@JsProperty
	private double animationLimit;
	@JsProperty
	private double boostThreshold;
	@JsProperty
	private Object borderColor;
	@JsProperty
	private double borderRadius;
	@JsProperty
	private double borderWidth;
	@JsProperty
	private String className;
	@JsProperty
	private Object color;
	@JsProperty
	private Boolean colorByPoint;
	@JsProperty
	private double colorIndex;
	@JsProperty
	private String colorKey;
	@JsProperty
	private JsArray<Object> colors;
	@JsProperty
	private Boolean crisp;
	@JsProperty
	private double cropThreshold;
	@JsProperty
	private String cursor;
	@JsProperty
	private JsArray<Object> data;
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
	private String id;
	@JsProperty
	private double index;
	@JsProperty
	private JsArray<String> keys;
	@JsProperty
	private SeriesLabel label;
	@JsProperty
	private double legendIndex;
	@JsProperty
	private double lineWidth;
	@JsProperty
	private String linkedTo;
	@JsProperty
	private SeriesMarker marker;
	@JsProperty
	private Object minSize;
	@JsProperty
	private Object maxSize;
	@JsProperty
	private double maxPointWidth;
	@JsProperty
	private double minPointLength;
	@JsProperty
	private String name;
	@JsProperty
	private Object negativeColor;
	@JsProperty
	private Object nullColor;
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
	private Boolean shadow;
	@JsProperty
	private Boolean showCheckbox;
	@JsProperty
	private Boolean showInLegend;
	@JsProperty
	private Boolean skipKeyboardNavigation;
	@JsProperty
	private Boolean softThreshold;
	@JsProperty
	private String stack;
	@JsProperty
	private String stacking;
	@JsProperty
	private SeriesStates states;
	@JsProperty
	private Boolean stickyTracking;
	@JsProperty
	private double threshold;
	@JsProperty
	private SeriesTooltip tooltip;
	@JsProperty
	private double turboThreshold;
	@JsProperty
	private String type;
	@JsProperty
	private Boolean visible;
	@JsProperty
	private double xAxis;
	@JsProperty
	private double yAxis;
	@JsProperty
	private double zIndex;
	@JsProperty
	private String zoneAxis;
	@JsProperty
	private JsArray<SeriesZones> zones;

	public native void addPoint(JsArray<Object> pointOptions, boolean redraw, boolean shift, boolean animation, boolean withEvent);

	@JsOverlay
	public final Boolean getAllowPointSelect() {
		return allowPointSelect;
	}

	@JsOverlay
	public final Series setAllowPointSelect(Boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
		return this;
	}

	@JsOverlay
	public final Animation getAnimation() {
		return animation;
	}

	@JsOverlay
	public final Series setAnimation(Animation animation) {
		this.animation = animation;
		return this;
	}

	@JsOverlay
	public final double getAnimationLimit() {
		return animationLimit;
	}

	@JsOverlay
	public final Series setAnimationLimit(double animationLimit) {
		this.animationLimit = animationLimit;
		return this;
	}

	@JsOverlay
	public final double getBoostThreshold() {
		return boostThreshold;
	}

	@JsOverlay
	public final Series setBoostThreshold(double boostThreshold) {
		this.boostThreshold = boostThreshold;
		return this;
	}

	@JsOverlay
	public final Object getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final Series setBorderColor(Object borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final double getBorderRadius() {
		return borderRadius;
	}

	@JsOverlay
	public final Series setBorderRadius(double borderRadius) {
		this.borderRadius = borderRadius;
		return this;
	}

	@JsOverlay
	public final double getBorderWidth() {
		return borderWidth;
	}

	@JsOverlay
	public final Series setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final Series setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final Object getColor() {
		return color;
	}

	@JsOverlay
	public final Series setColor(Object color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final Boolean getColorByPoint() {
		return colorByPoint;
	}

	@JsOverlay
	public final Series setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		return this;
	}

	@JsOverlay
	public final double getColorIndex() {
		return colorIndex;
	}

	@JsOverlay
	public final Series setColorIndex(double colorIndex) {
		this.colorIndex = colorIndex;
		return this;
	}

	@JsOverlay
	public final String getColorKey() {
		return colorKey;
	}

	@JsOverlay
	public final Series setColorKey(String colorKey) {
		this.colorKey = colorKey;
		return this;
	}

	@JsOverlay
	public final JsArray<Object> getColors() {
		return colors;
	}

	@JsOverlay
	public final Series setColors(JsArray<Object> colors) {
		this.colors = colors;
		return this;
	}

	@JsOverlay
	public final Boolean getCrisp() {
		return crisp;
	}

	@JsOverlay
	public final Series setCrisp(Boolean crisp) {
		this.crisp = crisp;
		return this;
	}

	@JsOverlay
	public final double getCropThreshold() {
		return cropThreshold;
	}

	@JsOverlay
	public final Series setCropThreshold(double cropThreshold) {
		this.cropThreshold = cropThreshold;
		return this;
	}

	@JsOverlay
	public final String getCursor() {
		return cursor;
	}

	@JsOverlay
	public final Series setCursor(String cursor) {
		this.cursor = cursor;
		return this;
	}

	@JsOverlay
	public final JsArray<Object> getData() {
		return data;
	}

	@JsOverlay
	public final Series setData(JsArray<Object> data) {
		this.data = data;
		return this;
	}

	@JsOverlay
	public final SeriesDataLabels getDataLabels() {
		return dataLabels;
	}

	@JsOverlay
	public final Series setDataLabels(SeriesDataLabels dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	@JsOverlay
	public final double getDepth() {
		return depth;
	}

	@JsOverlay
	public final Series setDepth(double depth) {
		this.depth = depth;
		return this;
	}

	@JsOverlay
	public final String getDescription() {
		return description;
	}

	@JsOverlay
	public final Series setDescription(String description) {
		this.description = description;
		return this;
	}

	@JsOverlay
	public final String getEdgeColor() {
		return edgeColor;
	}

	@JsOverlay
	public final Series setEdgeColor(String edgeColor) {
		this.edgeColor = edgeColor;
		return this;
	}

	@JsOverlay
	public final double getEdgeWidth() {
		return edgeWidth;
	}

	@JsOverlay
	public final Series setEdgeWidth(double edgeWidth) {
		this.edgeWidth = edgeWidth;
		return this;
	}

	@JsOverlay
	public final Boolean getEnableMouseTracking() {
		return enableMouseTracking;
	}

	@JsOverlay
	public final Series setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
		return this;
	}

	@JsOverlay
	public final SeriesEvents getEvents() {
		return events;
	}

	@JsOverlay
	public final Series setEvents(SeriesEvents events) {
		this.events = events;
		return this;
	}

	@JsOverlay
	public final Boolean getExposeElementToA11y() {
		return exposeElementToA11y;
	}

	@JsOverlay
	public final Series setExposeElementToA11y(Boolean exposeElementToA11y) {
		this.exposeElementToA11y = exposeElementToA11y;
		return this;
	}

	@JsOverlay
	public final String getFindNearestPointBy() {
		return findNearestPointBy;
	}

	@JsOverlay
	public final Series setFindNearestPointBy(String findNearestPointBy) {
		this.findNearestPointBy = findNearestPointBy;
		return this;
	}

	@JsOverlay
	public final Boolean getGetExtremesFromAll() {
		return getExtremesFromAll;
	}

	@JsOverlay
	public final Series setGetExtremesFromAll(Boolean getExtremesFromAll) {
		this.getExtremesFromAll = getExtremesFromAll;
		return this;
	}

	@JsOverlay
	public final Boolean getGrouping() {
		return grouping;
	}

	@JsOverlay
	public final Series setGrouping(Boolean grouping) {
		this.grouping = grouping;
		return this;
	}

	@JsOverlay
	public final double getGroupPadding() {
		return groupPadding;
	}

	@JsOverlay
	public final Series setGroupPadding(double groupPadding) {
		this.groupPadding = groupPadding;
		return this;
	}

	@JsOverlay
	public final double getGroupZPadding() {
		return groupZPadding;
	}

	@JsOverlay
	public final Series setGroupZPadding(double groupZPadding) {
		this.groupZPadding = groupZPadding;
		return this;
	}

	@JsOverlay
	public final String getId() {
		return id;
	}

	@JsOverlay
	public final Series setId(String id) {
		this.id = id;
		return this;
	}

	@JsOverlay
	public final double getIndex() {
		return index;
	}

	@JsOverlay
	public final Series setIndex(double index) {
		this.index = index;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getKeys() {
		return keys;
	}

	@JsOverlay
	public final Series setKeys(JsArray<String> keys) {
		this.keys = keys;
		return this;
	}

	@JsOverlay
	public final SeriesLabel getLabel() {
		return label;
	}

	@JsOverlay
	public final Series setLabel(SeriesLabel label) {
		this.label = label;
		return this;
	}

	@JsOverlay
	public final double getLegendIndex() {
		return legendIndex;
	}

	@JsOverlay
	public final Series setLegendIndex(double legendIndex) {
		this.legendIndex = legendIndex;
		return this;
	}

	@JsOverlay
	public final double getLineWidth() {
		return lineWidth;
	}

	@JsOverlay
	public final Series setLineWidth(double lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	@JsOverlay
	public final String getLinkedTo() {
		return linkedTo;
	}

	@JsOverlay
	public final Series setLinkedTo(String linkedTo) {
		this.linkedTo = linkedTo;
		return this;
	}

	@JsOverlay
	public final SeriesMarker getMarker() {
		return marker;
	}

	@JsOverlay
	public final Series setMarker(SeriesMarker marker) {
		this.marker = marker;
		return this;
	}

	@JsOverlay
	public final Object getMinSize() {
		return minSize;
	}

	@JsOverlay
	public final Series setMinSize(Object minSize) {
		this.minSize = minSize;
		return this;
	}

	@JsOverlay
	public final Object getMaxSize() {
		return maxSize;
	}

	@JsOverlay
	public final Series setMaxSize(Object maxSize) {
		this.maxSize = maxSize;
		return this;
	}

	@JsOverlay
	public final double getMaxPointWidth() {
		return maxPointWidth;
	}

	@JsOverlay
	public final Series setMaxPointWidth(double maxPointWidth) {
		this.maxPointWidth = maxPointWidth;
		return this;
	}

	@JsOverlay
	public final double getMinPointLength() {
		return minPointLength;
	}

	@JsOverlay
	public final Series setMinPointLength(double minPointLength) {
		this.minPointLength = minPointLength;
		return this;
	}

	@JsOverlay
	public final String getName() {
		return name;
	}

	@JsOverlay
	public final Series setName(String name) {
		this.name = name;
		return this;
	}

	@JsOverlay
	public final Object getNegativeColor() {
		return negativeColor;
	}

	@JsOverlay
	public final Series setNegativeColor(Object negativeColor) {
		this.negativeColor = negativeColor;
		return this;
	}

	@JsOverlay
	public final Object getNullColor() {
		return nullColor;
	}

	@JsOverlay
	public final Series setNullColor(Object nullColor) {
		this.nullColor = nullColor;
		return this;
	}

	@JsOverlay
	public final SeriesPoint getPoint() {
		return point;
	}

	@JsOverlay
	public final Series setPoint(SeriesPoint point) {
		this.point = point;
		return this;
	}

	@JsOverlay
	public final PointDescriptionFormatter getPointDescriptionFormatter() {
		return pointDescriptionFormatter;
	}

	@JsOverlay
	public final Series setPointDescriptionFormatter(PointDescriptionFormatter pointDescriptionFormatter) {
		this.pointDescriptionFormatter = pointDescriptionFormatter;
		return this;
	}

	@JsOverlay
	public final double getPointInterval() {
		return pointInterval;
	}

	@JsOverlay
	public final Series setPointInterval(double pointInterval) {
		this.pointInterval = pointInterval;
		return this;
	}

	@JsOverlay
	public final String getPointIntervalUnit() {
		return pointIntervalUnit;
	}

	@JsOverlay
	public final Series setPointIntervalUnit(String pointIntervalUnit) {
		this.pointIntervalUnit = pointIntervalUnit;
		return this;
	}

	@JsOverlay
	public final double getPointPadding() {
		return pointPadding;
	}

	@JsOverlay
	public final Series setPointPadding(double pointPadding) {
		this.pointPadding = pointPadding;
		return this;
	}

	@JsOverlay
	public final String getPointPlacement() {
		return pointPlacement;
	}

	@JsOverlay
	public final Series setPointPlacement(String pointPlacement) {
		this.pointPlacement = pointPlacement;
		return this;
	}

	@JsOverlay
	public final double getPointRange() {
		return pointRange;
	}

	@JsOverlay
	public final Series setPointRange(double pointRange) {
		this.pointRange = pointRange;
		return this;
	}

	@JsOverlay
	public final double getPointStart() {
		return pointStart;
	}

	@JsOverlay
	public final Series setPointStart(double pointStart) {
		this.pointStart = pointStart;
		return this;
	}

	@JsOverlay
	public final double getPointWidth() {
		return pointWidth;
	}

	@JsOverlay
	public final Series setPointWidth(double pointWidth) {
		this.pointWidth = pointWidth;
		return this;
	}

	@JsOverlay
	public final Boolean getSelected() {
		return selected;
	}

	@JsOverlay
	public final Series setSelected(Boolean selected) {
		this.selected = selected;
		return this;
	}

	@JsOverlay
	public final Boolean getShadow() {
		return shadow;
	}

	@JsOverlay
	public final Series setShadow(Boolean shadow) {
		this.shadow = shadow;
		return this;
	}

	@JsOverlay
	public final Boolean getShowCheckbox() {
		return showCheckbox;
	}

	@JsOverlay
	public final Series setShowCheckbox(Boolean showCheckbox) {
		this.showCheckbox = showCheckbox;
		return this;
	}

	@JsOverlay
	public final Boolean getShowInLegend() {
		return showInLegend;
	}

	@JsOverlay
	public final Series setShowInLegend(Boolean showInLegend) {
		this.showInLegend = showInLegend;
		return this;
	}

	@JsOverlay
	public final Boolean getSkipKeyboardNavigation() {
		return skipKeyboardNavigation;
	}

	@JsOverlay
	public final Series setSkipKeyboardNavigation(Boolean skipKeyboardNavigation) {
		this.skipKeyboardNavigation = skipKeyboardNavigation;
		return this;
	}

	@JsOverlay
	public final Boolean getSoftThreshold() {
		return softThreshold;
	}

	@JsOverlay
	public final Series setSoftThreshold(Boolean softThreshold) {
		this.softThreshold = softThreshold;
		return this;
	}

	@JsOverlay
	public final String getStack() {
		return stack;
	}

	@JsOverlay
	public final Series setStack(String stack) {
		this.stack = stack;
		return this;
	}

	@JsOverlay
	public final String getStacking() {
		return stacking;
	}

	@JsOverlay
	public final Series setStacking(String stacking) {
		this.stacking = stacking;
		return this;
	}

	@JsOverlay
	public final SeriesStates getStates() {
		return states;
	}

	@JsOverlay
	public final Series setStates(SeriesStates states) {
		this.states = states;
		return this;
	}

	@JsOverlay
	public final Boolean getStickyTracking() {
		return stickyTracking;
	}

	@JsOverlay
	public final Series setStickyTracking(Boolean stickyTracking) {
		this.stickyTracking = stickyTracking;
		return this;
	}

	@JsOverlay
	public final double getThreshold() {
		return threshold;
	}

	@JsOverlay
	public final Series setThreshold(double threshold) {
		this.threshold = threshold;
		return this;
	}

	@JsOverlay
	public final SeriesTooltip getTooltip() {
		return tooltip;
	}

	@JsOverlay
	public final Series setTooltip(SeriesTooltip tooltip) {
		this.tooltip = tooltip;
		return this;
	}

	@JsOverlay
	public final double getTurboThreshold() {
		return turboThreshold;
	}

	@JsOverlay
	public final Series setTurboThreshold(double turboThreshold) {
		this.turboThreshold = turboThreshold;
		return this;
	}

	@JsOverlay
	public final String getType() {
		return type;
	}

	@JsOverlay
	public final Series setType(String type) {
		this.type = type;
		return this;
	}

	@JsOverlay
	public final Boolean getVisible() {
		return visible;
	}

	@JsOverlay
	public final Series setVisible(Boolean visible) {
		this.visible = visible;
		return this;
	}

	@JsOverlay
	public final double getxAxis() {
		return xAxis;
	}

	@JsOverlay
	public final Series setxAxis(double xAxis) {
		this.xAxis = xAxis;
		return this;
	}

	@JsOverlay
	public final double getyAxis() {
		return yAxis;
	}

	@JsOverlay
	public final Series setyAxis(double yAxis) {
		this.yAxis = yAxis;
		return this;
	}

	@JsOverlay
	public final double getzIndex() {
		return zIndex;
	}

	@JsOverlay
	public final Series setzIndex(double zIndex) {
		this.zIndex = zIndex;
		return this;
	}

	@JsOverlay
	public final String getZoneAxis() {
		return zoneAxis;
	}

	@JsOverlay
	public final Series setZoneAxis(String zoneAxis) {
		this.zoneAxis = zoneAxis;
		return this;
	}

	@JsOverlay
	public final JsArray<SeriesZones> getZones() {
		return zones;
	}

	@JsOverlay
	public final Series setZones(JsArray<SeriesZones> zones) {
		this.zones = zones;
		return this;
	}
}
