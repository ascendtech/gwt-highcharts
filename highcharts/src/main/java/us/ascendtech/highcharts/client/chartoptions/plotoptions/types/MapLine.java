package us.ascendtech.highcharts.client.chartoptions.plotoptions.types;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.accessibility.Accessibility;
import us.ascendtech.highcharts.client.chartoptions.plotoptions.Animation;
import us.ascendtech.highcharts.client.chartoptions.plotoptions.types.dragdrop.DragDrop;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesDataLabels;
import us.ascendtech.highcharts.client.chartoptions.series.SeriesEvents;
import us.ascendtech.highcharts.client.chartoptions.series.states.SeriesStates;
import us.ascendtech.highcharts.client.chartoptions.shared.Point;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.PointDescriptionFormatter;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/plotOptions.tilemap
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class MapLine {

	@JsProperty
	private Accessibility accessibility;
	@JsProperty
	private boolean allAreas;
	@JsProperty
	private Boolean allowPointSelect;
	@JsProperty
	private Animation animation;
	@JsProperty
	private Double animationLimit;
	@JsProperty
	private Double boostBlending;
	@JsProperty
	private double boostThreshold;
	@JsProperty
	private Object borderColor;
	@JsProperty
	private double borderWidth;
	@JsProperty
	private String className;
	@JsProperty
	private boolean clip;
	@JsProperty
	private Object color;
	@JsProperty
	private double colorIndex;
	@JsProperty
	private String colorKey;
	@JsProperty
	private String cursor;
	@JsProperty
	private Object custom;
	@JsProperty
	private String dashStyle;
	@JsProperty
	private SeriesDataLabels dataLabels;
	@JsProperty
	private String description;
	@JsProperty
	private DragDrop dragDrop;
	@JsProperty
	private Boolean enableMouseTracking;
	@JsProperty
	private SeriesEvents events;
	@JsProperty
	private String findNearestPointBy;
	@JsProperty
	private Boolean includeInDataExport;
	@JsProperty
	private Object joinBy;
	@JsProperty
	private JsArray<String> keys;
	@JsProperty
	private Object negativeColor;
	@JsProperty
	private Object nullColor;
	@JsProperty
	private Boolean nullInteraction;
	@JsProperty
	private double opacity;
	@JsProperty
	private Point point;
	@JsProperty
	private PointDescriptionFormatter pointDescriptionFormatter;
	@JsProperty
	private Boolean selected;
	@JsProperty
	private Boolean showCheckbox;
	@JsProperty
	private Boolean showInLegend;
	@JsProperty
	private Boolean skipKeyboardNavigation;
	@JsProperty
	private SeriesStates states;
	@JsProperty
	private Boolean visible;
	@JsProperty
	private Double zIndex;

	@JsOverlay
	public final Accessibility getAccessibility() {
		return accessibility;
	}

	@JsOverlay
	public final MapLine setAccessibility(Accessibility accessibility) {
		this.accessibility = accessibility;
		return this;
	}

	@JsOverlay
	public final boolean isAllAreas() {
		return allAreas;
	}

	@JsOverlay
	public final MapLine setAllAreas(boolean allAreas) {
		this.allAreas = allAreas;
		return this;
	}

	@JsOverlay
	public final Boolean getAllowPointSelect() {
		return allowPointSelect;
	}

	@JsOverlay
	public final MapLine setAllowPointSelect(Boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
		return this;
	}

	@JsOverlay
	public final Animation getAnimation() {
		return animation;
	}

	@JsOverlay
	public final MapLine setAnimation(Animation animation) {
		this.animation = animation;
		return this;
	}

	@JsOverlay
	public final Double getAnimationLimit() {
		return animationLimit;
	}

	@JsOverlay
	public final MapLine setAnimationLimit(Double animationLimit) {
		this.animationLimit = animationLimit;
		return this;
	}

	@JsOverlay
	public final Double getBoostBlending() {
		return boostBlending;
	}

	@JsOverlay
	public final MapLine setBoostBlending(Double boostBlending) {
		this.boostBlending = boostBlending;
		return this;
	}

	@JsOverlay
	public final double getBoostThreshold() {
		return boostThreshold;
	}

	@JsOverlay
	public final MapLine setBoostThreshold(double boostThreshold) {
		this.boostThreshold = boostThreshold;
		return this;
	}

	@JsOverlay
	public final Object getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final MapLine setBorderColor(Object borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final double getBorderWidth() {
		return borderWidth;
	}

	@JsOverlay
	public final MapLine setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final MapLine setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final boolean isClip() {
		return clip;
	}

	@JsOverlay
	public final MapLine setClip(boolean clip) {
		this.clip = clip;
		return this;
	}

	@JsOverlay
	public final Object getColor() {
		return color;
	}

	@JsOverlay
	public final MapLine setColor(Object color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final double getColorIndex() {
		return colorIndex;
	}

	@JsOverlay
	public final MapLine setColorIndex(double colorIndex) {
		this.colorIndex = colorIndex;
		return this;
	}

	@JsOverlay
	public final String getColorKey() {
		return colorKey;
	}

	@JsOverlay
	public final MapLine setColorKey(String colorKey) {
		this.colorKey = colorKey;
		return this;
	}

	@JsOverlay
	public final String getCursor() {
		return cursor;
	}

	@JsOverlay
	public final MapLine setCursor(String cursor) {
		this.cursor = cursor;
		return this;
	}

	@JsOverlay
	public final Object getCustom() {
		return custom;
	}

	@JsOverlay
	public final MapLine setCustom(Object custom) {
		this.custom = custom;
		return this;
	}

	@JsOverlay
	public final String getDashStyle() {
		return dashStyle;
	}

	@JsOverlay
	public final MapLine setDashStyle(String dashStyle) {
		this.dashStyle = dashStyle;
		return this;
	}

	@JsOverlay
	public final SeriesDataLabels getDataLabels() {
		return dataLabels;
	}

	@JsOverlay
	public final MapLine setDataLabels(SeriesDataLabels dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	@JsOverlay
	public final String getDescription() {
		return description;
	}

	@JsOverlay
	public final MapLine setDescription(String description) {
		this.description = description;
		return this;
	}

	@JsOverlay
	public final DragDrop getDragDrop() {
		return dragDrop;
	}

	@JsOverlay
	public final MapLine setDragDrop(DragDrop dragDrop) {
		this.dragDrop = dragDrop;
		return this;
	}

	@JsOverlay
	public final Boolean getEnableMouseTracking() {
		return enableMouseTracking;
	}

	@JsOverlay
	public final MapLine setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
		return this;
	}

	@JsOverlay
	public final SeriesEvents getEvents() {
		return events;
	}

	@JsOverlay
	public final MapLine setEvents(SeriesEvents events) {
		this.events = events;
		return this;
	}

	@JsOverlay
	public final String getFindNearestPointBy() {
		return findNearestPointBy;
	}

	@JsOverlay
	public final MapLine setFindNearestPointBy(String findNearestPointBy) {
		this.findNearestPointBy = findNearestPointBy;
		return this;
	}

	@JsOverlay
	public final Boolean getIncludeInDataExport() {
		return includeInDataExport;
	}

	@JsOverlay
	public final MapLine setIncludeInDataExport(Boolean includeInDataExport) {
		this.includeInDataExport = includeInDataExport;
		return this;
	}

	@JsOverlay
	public final Object getJoinBy() {
		return joinBy;
	}

	@JsOverlay
	public final MapLine setJoinBy(Object joinBy) {
		this.joinBy = joinBy;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getKeys() {
		return keys;
	}

	@JsOverlay
	public final MapLine setKeys(JsArray<String> keys) {
		this.keys = keys;
		return this;
	}

	@JsOverlay
	public final Object getNegativeColor() {
		return negativeColor;
	}

	@JsOverlay
	public final MapLine setNegativeColor(Object negativeColor) {
		this.negativeColor = negativeColor;
		return this;
	}

	@JsOverlay
	public final Object getNullColor() {
		return nullColor;
	}

	@JsOverlay
	public final MapLine setNullColor(Object nullColor) {
		this.nullColor = nullColor;
		return this;
	}

	@JsOverlay
	public final Boolean getNullInteraction() {
		return nullInteraction;
	}

	@JsOverlay
	public final MapLine setNullInteraction(Boolean nullInteraction) {
		this.nullInteraction = nullInteraction;
		return this;
	}

	@JsOverlay
	public final double getOpacity() {
		return opacity;
	}

	@JsOverlay
	public final MapLine setOpacity(double opacity) {
		this.opacity = opacity;
		return this;
	}

	@JsOverlay
	public final Point getPoint() {
		return point;
	}

	@JsOverlay
	public final MapLine setPoint(Point point) {
		this.point = point;
		return this;
	}

	@JsOverlay
	public final PointDescriptionFormatter getPointDescriptionFormatter() {
		return pointDescriptionFormatter;
	}

	@JsOverlay
	public final MapLine setPointDescriptionFormatter(PointDescriptionFormatter pointDescriptionFormatter) {
		this.pointDescriptionFormatter = pointDescriptionFormatter;
		return this;
	}

	@JsOverlay
	public final Boolean getSelected() {
		return selected;
	}

	@JsOverlay
	public final MapLine setSelected(Boolean selected) {
		this.selected = selected;
		return this;
	}

	@JsOverlay
	public final Boolean getShowCheckbox() {
		return showCheckbox;
	}

	@JsOverlay
	public final MapLine setShowCheckbox(Boolean showCheckbox) {
		this.showCheckbox = showCheckbox;
		return this;
	}

	@JsOverlay
	public final Boolean getShowInLegend() {
		return showInLegend;
	}

	@JsOverlay
	public final MapLine setShowInLegend(Boolean showInLegend) {
		this.showInLegend = showInLegend;
		return this;
	}

	@JsOverlay
	public final Boolean getSkipKeyboardNavigation() {
		return skipKeyboardNavigation;
	}

	@JsOverlay
	public final MapLine setSkipKeyboardNavigation(Boolean skipKeyboardNavigation) {
		this.skipKeyboardNavigation = skipKeyboardNavigation;
		return this;
	}

	@JsOverlay
	public final SeriesStates getStates() {
		return states;
	}

	@JsOverlay
	public final MapLine setStates(SeriesStates states) {
		this.states = states;
		return this;
	}

	@JsOverlay
	public final Boolean getVisible() {
		return visible;
	}

	@JsOverlay
	public final MapLine setVisible(Boolean visible) {
		this.visible = visible;
		return this;
	}

	@JsOverlay
	public final Double getzIndex() {
		return zIndex;
	}

	@JsOverlay
	public final MapLine setzIndex(Double zIndex) {
		this.zIndex = zIndex;
		return this;
	}
}
