package us.ascendtech.highcharts.client.chartoptions.plotoptions.types;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.drilldown.DrillUpButton;
import us.ascendtech.highcharts.client.chartoptions.plotoptions.Level;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesDataLabels;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesEvents;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesLabel;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesPoint;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesZones;
import us.ascendtech.highcharts.client.chartoptions.series.states.SeriesStates;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.Animation;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.PointDescriptionFormatter;
import us.ascendtech.highcharts.client.chartoptions.tooltip.Tooltip;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/plotOptions.treemap
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class TreeMap {

	@JsProperty
	private Boolean allowDrillToNode;
	@JsProperty
	private Boolean allowPointSelect;
	@JsProperty
	private Boolean alternateStartingDirection;
	@JsProperty
	private Animation animation;
	@JsProperty
	private double animationLimit;
	@JsProperty
	private double boostThreshold;
	@JsProperty
	private String borderColor;
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
	private DrillUpButton drillUpButton;
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
	private Boolean ignoreHiddenPoint;
	@JsProperty
	private Boolean interactByLeaf;
	@JsProperty
	private JsArray<String> keys;
	@JsProperty
	private SeriesLabel label;
	@JsProperty
	private String layoutAlgorithm;
	@JsProperty
	private String layoutStartingDirection;
	@JsProperty
	private Boolean levelIsConstant;
	@JsProperty
	private JsArray<Level> levels;
	@JsProperty
	private String linecap;
	@JsProperty
	private double lineWidth;
	@JsProperty
	private String linkedTo;
	@JsProperty
	private String negativeColor;
	@JsProperty
	private double opacity;
	@JsProperty
	private SeriesPoint point;
	@JsProperty
	private PointDescriptionFormatter pointDescriptionFormatter;
	@JsProperty
	private double pointInterval;
	@JsProperty
	private double pointIntervalUnit;
	@JsProperty
	private double pointStart;
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
	private double sortIndex;
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
	private double turboThreshold;
	@JsProperty
	private Boolean visible;
	@JsProperty
	private String zoneAxis;
	@JsProperty
	private JsArray<SeriesZones> zones;

	@JsOverlay
	public final Boolean getAllowDrillToNode() {
		return allowDrillToNode;
	}

	@JsOverlay
	public final TreeMap setAllowDrillToNode(Boolean allowDrillToNode) {
		this.allowDrillToNode = allowDrillToNode;
		return this;
	}

	@JsOverlay
	public final Boolean getAllowPointSelect() {
		return allowPointSelect;
	}

	@JsOverlay
	public final TreeMap setAllowPointSelect(Boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
		return this;
	}

	@JsOverlay
	public final Boolean getAlternateStartingDirection() {
		return alternateStartingDirection;
	}

	@JsOverlay
	public final TreeMap setAlternateStartingDirection(Boolean alternateStartingDirection) {
		this.alternateStartingDirection = alternateStartingDirection;
		return this;
	}

	@JsOverlay
	public final Animation getAnimation() {
		return animation;
	}

	@JsOverlay
	public final TreeMap setAnimation(Animation animation) {
		this.animation = animation;
		return this;
	}

	@JsOverlay
	public final double getAnimationLimit() {
		return animationLimit;
	}

	@JsOverlay
	public final TreeMap setAnimationLimit(double animationLimit) {
		this.animationLimit = animationLimit;
		return this;
	}

	@JsOverlay
	public final double getBoostThreshold() {
		return boostThreshold;
	}

	@JsOverlay
	public final TreeMap setBoostThreshold(double boostThreshold) {
		this.boostThreshold = boostThreshold;
		return this;
	}

	@JsOverlay
	public final String getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final TreeMap setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final TreeMap setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final TreeMap setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final Boolean getColorByPoint() {
		return colorByPoint;
	}

	@JsOverlay
	public final TreeMap setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		return this;
	}

	@JsOverlay
	public final double getColorIndex() {
		return colorIndex;
	}

	@JsOverlay
	public final TreeMap setColorIndex(double colorIndex) {
		this.colorIndex = colorIndex;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getColors() {
		return colors;
	}

	@JsOverlay
	public final TreeMap setColors(JsArray<String> colors) {
		this.colors = colors;
		return this;
	}

	@JsOverlay
	public final Boolean getConnectEnds() {
		return connectEnds;
	}

	@JsOverlay
	public final TreeMap setConnectEnds(Boolean connectEnds) {
		this.connectEnds = connectEnds;
		return this;
	}

	@JsOverlay
	public final Boolean getConnectNulls() {
		return connectNulls;
	}

	@JsOverlay
	public final TreeMap setConnectNulls(Boolean connectNulls) {
		this.connectNulls = connectNulls;
		return this;
	}

	@JsOverlay
	public final double getCropThreshold() {
		return cropThreshold;
	}

	@JsOverlay
	public final TreeMap setCropThreshold(double cropThreshold) {
		this.cropThreshold = cropThreshold;
		return this;
	}

	@JsOverlay
	public final String getCursor() {
		return cursor;
	}

	@JsOverlay
	public final TreeMap setCursor(String cursor) {
		this.cursor = cursor;
		return this;
	}

	@JsOverlay
	public final String getDashStyle() {
		return dashStyle;
	}

	@JsOverlay
	public final TreeMap setDashStyle(String dashStyle) {
		this.dashStyle = dashStyle;
		return this;
	}

	@JsOverlay
	public final SeriesDataLabels getDataLabels() {
		return dataLabels;
	}

	@JsOverlay
	public final TreeMap setDataLabels(SeriesDataLabels dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	@JsOverlay
	public final String getDescription() {
		return description;
	}

	@JsOverlay
	public final TreeMap setDescription(String description) {
		this.description = description;
		return this;
	}

	@JsOverlay
	public final DrillUpButton getDrillUpButton() {
		return drillUpButton;
	}

	@JsOverlay
	public final TreeMap setDrillUpButton(DrillUpButton drillUpButton) {
		this.drillUpButton = drillUpButton;
		return this;
	}

	@JsOverlay
	public final Boolean getEnableMouseTracking() {
		return enableMouseTracking;
	}

	@JsOverlay
	public final TreeMap setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
		return this;
	}

	@JsOverlay
	public final SeriesEvents getEvents() {
		return events;
	}

	@JsOverlay
	public final TreeMap setEvents(SeriesEvents events) {
		this.events = events;
		return this;
	}

	@JsOverlay
	public final Boolean getExposeElementToA11y() {
		return exposeElementToA11y;
	}

	@JsOverlay
	public final TreeMap setExposeElementToA11y(Boolean exposeElementToA11y) {
		this.exposeElementToA11y = exposeElementToA11y;
		return this;
	}

	@JsOverlay
	public final String getFindNearestPointBy() {
		return findNearestPointBy;
	}

	@JsOverlay
	public final TreeMap setFindNearestPointBy(String findNearestPointBy) {
		this.findNearestPointBy = findNearestPointBy;
		return this;
	}

	@JsOverlay
	public final Boolean getGetExtremesFromAll() {
		return getExtremesFromAll;
	}

	@JsOverlay
	public final TreeMap setGetExtremesFromAll(Boolean getExtremesFromAll) {
		this.getExtremesFromAll = getExtremesFromAll;
		return this;
	}

	@JsOverlay
	public final Boolean getIgnoreHiddenPoint() {
		return ignoreHiddenPoint;
	}

	@JsOverlay
	public final TreeMap setIgnoreHiddenPoint(Boolean ignoreHiddenPoint) {
		this.ignoreHiddenPoint = ignoreHiddenPoint;
		return this;
	}

	@JsOverlay
	public final Boolean getInteractByLeaf() {
		return interactByLeaf;
	}

	@JsOverlay
	public final TreeMap setInteractByLeaf(Boolean interactByLeaf) {
		this.interactByLeaf = interactByLeaf;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getKeys() {
		return keys;
	}

	@JsOverlay
	public final TreeMap setKeys(JsArray<String> keys) {
		this.keys = keys;
		return this;
	}

	@JsOverlay
	public final SeriesLabel getLabel() {
		return label;
	}

	@JsOverlay
	public final TreeMap setLabel(SeriesLabel label) {
		this.label = label;
		return this;
	}

	@JsOverlay
	public final String getLayoutAlgorithm() {
		return layoutAlgorithm;
	}

	@JsOverlay
	public final TreeMap setLayoutAlgorithm(String layoutAlgorithm) {
		this.layoutAlgorithm = layoutAlgorithm;
		return this;
	}

	@JsOverlay
	public final String getLayoutStartingDirection() {
		return layoutStartingDirection;
	}

	@JsOverlay
	public final TreeMap setLayoutStartingDirection(String layoutStartingDirection) {
		this.layoutStartingDirection = layoutStartingDirection;
		return this;
	}

	@JsOverlay
	public final Boolean getLevelIsConstant() {
		return levelIsConstant;
	}

	@JsOverlay
	public final TreeMap setLevelIsConstant(Boolean levelIsConstant) {
		this.levelIsConstant = levelIsConstant;
		return this;
	}

	@JsOverlay
	public final JsArray<Level> getLevels() {
		return levels;
	}

	@JsOverlay
	public final TreeMap setLevels(JsArray<Level> levels) {
		this.levels = levels;
		return this;
	}

	@JsOverlay
	public final String getLinecap() {
		return linecap;
	}

	@JsOverlay
	public final TreeMap setLinecap(String linecap) {
		this.linecap = linecap;
		return this;
	}

	@JsOverlay
	public final double getLineWidth() {
		return lineWidth;
	}

	@JsOverlay
	public final TreeMap setLineWidth(double lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	@JsOverlay
	public final String getLinkedTo() {
		return linkedTo;
	}

	@JsOverlay
	public final TreeMap setLinkedTo(String linkedTo) {
		this.linkedTo = linkedTo;
		return this;
	}

	@JsOverlay
	public final String getNegativeColor() {
		return negativeColor;
	}

	@JsOverlay
	public final TreeMap setNegativeColor(String negativeColor) {
		this.negativeColor = negativeColor;
		return this;
	}

	@JsOverlay
	public final double getOpacity() {
		return opacity;
	}

	@JsOverlay
	public final TreeMap setOpacity(double opacity) {
		this.opacity = opacity;
		return this;
	}

	@JsOverlay
	public final SeriesPoint getPoint() {
		return point;
	}

	@JsOverlay
	public final TreeMap setPoint(SeriesPoint point) {
		this.point = point;
		return this;
	}

	@JsOverlay
	public final PointDescriptionFormatter getPointDescriptionFormatter() {
		return pointDescriptionFormatter;
	}

	@JsOverlay
	public final TreeMap setPointDescriptionFormatter(PointDescriptionFormatter pointDescriptionFormatter) {
		this.pointDescriptionFormatter = pointDescriptionFormatter;
		return this;
	}

	@JsOverlay
	public final double getPointInterval() {
		return pointInterval;
	}

	@JsOverlay
	public final TreeMap setPointInterval(double pointInterval) {
		this.pointInterval = pointInterval;
		return this;
	}

	@JsOverlay
	public final double getPointIntervalUnit() {
		return pointIntervalUnit;
	}

	@JsOverlay
	public final TreeMap setPointIntervalUnit(double pointIntervalUnit) {
		this.pointIntervalUnit = pointIntervalUnit;
		return this;
	}

	@JsOverlay
	public final double getPointStart() {
		return pointStart;
	}

	@JsOverlay
	public final TreeMap setPointStart(double pointStart) {
		this.pointStart = pointStart;
		return this;
	}

	@JsOverlay
	public final Boolean getSelected() {
		return selected;
	}

	@JsOverlay
	public final TreeMap setSelected(Boolean selected) {
		this.selected = selected;
		return this;
	}

	@JsOverlay
	public final Boolean getShowCheckbox() {
		return showCheckbox;
	}

	@JsOverlay
	public final TreeMap setShowCheckbox(Boolean showCheckbox) {
		this.showCheckbox = showCheckbox;
		return this;
	}

	@JsOverlay
	public final Boolean getShowInLegend() {
		return showInLegend;
	}

	@JsOverlay
	public final TreeMap setShowInLegend(Boolean showInLegend) {
		this.showInLegend = showInLegend;
		return this;
	}

	@JsOverlay
	public final Boolean getSkipKeyboardNavigation() {
		return skipKeyboardNavigation;
	}

	@JsOverlay
	public final TreeMap setSkipKeyboardNavigation(Boolean skipKeyboardNavigation) {
		this.skipKeyboardNavigation = skipKeyboardNavigation;
		return this;
	}

	@JsOverlay
	public final Boolean getSoftThreshold() {
		return softThreshold;
	}

	@JsOverlay
	public final TreeMap setSoftThreshold(Boolean softThreshold) {
		this.softThreshold = softThreshold;
		return this;
	}

	@JsOverlay
	public final double getSortIndex() {
		return sortIndex;
	}

	@JsOverlay
	public final TreeMap setSortIndex(double sortIndex) {
		this.sortIndex = sortIndex;
		return this;
	}

	@JsOverlay
	public final SeriesStates getStates() {
		return states;
	}

	@JsOverlay
	public final TreeMap setStates(SeriesStates states) {
		this.states = states;
		return this;
	}

	@JsOverlay
	public final String getStep() {
		return step;
	}

	@JsOverlay
	public final TreeMap setStep(String step) {
		this.step = step;
		return this;
	}

	@JsOverlay
	public final Boolean getStickyTracking() {
		return stickyTracking;
	}

	@JsOverlay
	public final TreeMap setStickyTracking(Boolean stickyTracking) {
		this.stickyTracking = stickyTracking;
		return this;
	}

	@JsOverlay
	public final double getThreshold() {
		return threshold;
	}

	@JsOverlay
	public final TreeMap setThreshold(double threshold) {
		this.threshold = threshold;
		return this;
	}

	@JsOverlay
	public final Tooltip getTooltip() {
		return tooltip;
	}

	@JsOverlay
	public final TreeMap setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
		return this;
	}

	@JsOverlay
	public final double getTurboThreshold() {
		return turboThreshold;
	}

	@JsOverlay
	public final TreeMap setTurboThreshold(double turboThreshold) {
		this.turboThreshold = turboThreshold;
		return this;
	}

	@JsOverlay
	public final Boolean getVisible() {
		return visible;
	}

	@JsOverlay
	public final TreeMap setVisible(Boolean visible) {
		this.visible = visible;
		return this;
	}

	@JsOverlay
	public final String getZoneAxis() {
		return zoneAxis;
	}

	@JsOverlay
	public final TreeMap setZoneAxis(String zoneAxis) {
		this.zoneAxis = zoneAxis;
		return this;
	}

	@JsOverlay
	public final JsArray<SeriesZones> getZones() {
		return zones;
	}

	@JsOverlay
	public final TreeMap setZones(JsArray<SeriesZones> zones) {
		this.zones = zones;
		return this;
	}
}
