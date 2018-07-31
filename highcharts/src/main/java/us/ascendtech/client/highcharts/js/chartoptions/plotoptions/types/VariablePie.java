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
import us.ascendtech.client.highcharts.js.chartoptions.series.states.SeriesStates;
import us.ascendtech.client.highcharts.js.chartoptions.shared.Shadow;
import us.ascendtech.client.highcharts.js.chartoptions.shared.functions.Animation;
import us.ascendtech.client.highcharts.js.chartoptions.shared.functions.PointDescriptionFormatter;
import us.ascendtech.client.highcharts.js.chartoptions.tooltip.Tooltip;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/plotOptions.variablepie
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class VariablePie {

	@JsProperty
	private Boolean allowPointSelect;
	@JsProperty
	private Animation animation;
	@JsProperty
	private String borderColor;
	@JsProperty
	private double borderWidth;
	@JsProperty
	private JsArray<String> center;
	@JsProperty
	private String className;
	@JsProperty
	private Boolean clip;
	@JsProperty
	private String color;
	@JsProperty
	private double colorIndex;
	@JsProperty
	private JsArray<String> colors;
	@JsProperty
	private String cursor;
	@JsProperty
	private SeriesDataLabels dataLabels;
	@JsProperty
	private double depth;
	@JsProperty
	private String description;
	@JsProperty
	private Boolean enableMouseTracking;
	@JsProperty
	private double endAngle;
	@JsProperty
	private SeriesEvents events;
	@JsProperty
	private Boolean exposeElementToA11y;
	@JsProperty
	private Boolean ignoreHiddenPoint;
	@JsProperty
	private String innerSize;
	@JsProperty
	private JsArray<String> keys;
	@JsProperty
	private SeriesLabel label;
	@JsProperty
	private String linecap;
	@JsProperty
	private String linkedTo;
	@JsProperty
	private String maxPointSize;
	@JsProperty
	private String minPointSize;
	@JsProperty
	private double minSize;
	@JsProperty
	private SeriesPoint point;
	@JsProperty
	private PointDescriptionFormatter pointDescriptionFormatter;
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
	private double slicedOffset;
	@JsProperty
	private double startAngle;
	@JsProperty
	private SeriesStates states;
	@JsProperty
	private Boolean stickyTracking;
	@JsProperty
	private Tooltip tooltip;
	@JsProperty
	private Boolean visible;
	@JsProperty
	private double zMax;
	@JsProperty
	private double zMin;

	@JsOverlay
	public final Boolean getAllowPointSelect() {
		return allowPointSelect;
	}

	@JsOverlay
	public final VariablePie setAllowPointSelect(Boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
		return this;
	}

	@JsOverlay
	public final Animation getAnimation() {
		return animation;
	}

	@JsOverlay
	public final VariablePie setAnimation(Animation animation) {
		this.animation = animation;
		return this;
	}

	@JsOverlay
	public final String getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final VariablePie setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final double getBorderWidth() {
		return borderWidth;
	}

	@JsOverlay
	public final VariablePie setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getCenter() {
		return center;
	}

	@JsOverlay
	public final VariablePie setCenter(JsArray<String> center) {
		this.center = center;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final VariablePie setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final Boolean getClip() {
		return clip;
	}

	@JsOverlay
	public final VariablePie setClip(Boolean clip) {
		this.clip = clip;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final VariablePie setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final double getColorIndex() {
		return colorIndex;
	}

	@JsOverlay
	public final VariablePie setColorIndex(double colorIndex) {
		this.colorIndex = colorIndex;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getColors() {
		return colors;
	}

	@JsOverlay
	public final VariablePie setColors(JsArray<String> colors) {
		this.colors = colors;
		return this;
	}

	@JsOverlay
	public final String getCursor() {
		return cursor;
	}

	@JsOverlay
	public final VariablePie setCursor(String cursor) {
		this.cursor = cursor;
		return this;
	}

	@JsOverlay
	public final SeriesDataLabels getDataLabels() {
		return dataLabels;
	}

	@JsOverlay
	public final VariablePie setDataLabels(SeriesDataLabels dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	@JsOverlay
	public final double getDepth() {
		return depth;
	}

	@JsOverlay
	public final VariablePie setDepth(double depth) {
		this.depth = depth;
		return this;
	}

	@JsOverlay
	public final String getDescription() {
		return description;
	}

	@JsOverlay
	public final VariablePie setDescription(String description) {
		this.description = description;
		return this;
	}

	@JsOverlay
	public final Boolean getEnableMouseTracking() {
		return enableMouseTracking;
	}

	@JsOverlay
	public final VariablePie setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
		return this;
	}

	@JsOverlay
	public final double getEndAngle() {
		return endAngle;
	}

	@JsOverlay
	public final VariablePie setEndAngle(double endAngle) {
		this.endAngle = endAngle;
		return this;
	}

	@JsOverlay
	public final SeriesEvents getEvents() {
		return events;
	}

	@JsOverlay
	public final VariablePie setEvents(SeriesEvents events) {
		this.events = events;
		return this;
	}

	@JsOverlay
	public final Boolean getExposeElementToA11y() {
		return exposeElementToA11y;
	}

	@JsOverlay
	public final VariablePie setExposeElementToA11y(Boolean exposeElementToA11y) {
		this.exposeElementToA11y = exposeElementToA11y;
		return this;
	}

	@JsOverlay
	public final Boolean getIgnoreHiddenPoint() {
		return ignoreHiddenPoint;
	}

	@JsOverlay
	public final VariablePie setIgnoreHiddenPoint(Boolean ignoreHiddenPoint) {
		this.ignoreHiddenPoint = ignoreHiddenPoint;
		return this;
	}

	@JsOverlay
	public final String getInnerSize() {
		return innerSize;
	}

	@JsOverlay
	public final VariablePie setInnerSize(String innerSize) {
		this.innerSize = innerSize;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getKeys() {
		return keys;
	}

	@JsOverlay
	public final VariablePie setKeys(JsArray<String> keys) {
		this.keys = keys;
		return this;
	}

	@JsOverlay
	public final SeriesLabel getLabel() {
		return label;
	}

	@JsOverlay
	public final VariablePie setLabel(SeriesLabel label) {
		this.label = label;
		return this;
	}

	@JsOverlay
	public final String getLinecap() {
		return linecap;
	}

	@JsOverlay
	public final VariablePie setLinecap(String linecap) {
		this.linecap = linecap;
		return this;
	}

	@JsOverlay
	public final String getLinkedTo() {
		return linkedTo;
	}

	@JsOverlay
	public final VariablePie setLinkedTo(String linkedTo) {
		this.linkedTo = linkedTo;
		return this;
	}

	@JsOverlay
	public final String getMaxPointSize() {
		return maxPointSize;
	}

	@JsOverlay
	public final VariablePie setMaxPointSize(String maxPointSize) {
		this.maxPointSize = maxPointSize;
		return this;
	}

	@JsOverlay
	public final String getMinPointSize() {
		return minPointSize;
	}

	@JsOverlay
	public final VariablePie setMinPointSize(String minPointSize) {
		this.minPointSize = minPointSize;
		return this;
	}

	@JsOverlay
	public final double getMinSize() {
		return minSize;
	}

	@JsOverlay
	public final VariablePie setMinSize(double minSize) {
		this.minSize = minSize;
		return this;
	}

	@JsOverlay
	public final SeriesPoint getPoint() {
		return point;
	}

	@JsOverlay
	public final VariablePie setPoint(SeriesPoint point) {
		this.point = point;
		return this;
	}

	@JsOverlay
	public final PointDescriptionFormatter getPointDescriptionFormatter() {
		return pointDescriptionFormatter;
	}

	@JsOverlay
	public final VariablePie setPointDescriptionFormatter(PointDescriptionFormatter pointDescriptionFormatter) {
		this.pointDescriptionFormatter = pointDescriptionFormatter;
		return this;
	}

	@JsOverlay
	public final Boolean getSelected() {
		return selected;
	}

	@JsOverlay
	public final VariablePie setSelected(Boolean selected) {
		this.selected = selected;
		return this;
	}

	@JsOverlay
	public final Shadow getShadow() {
		return shadow;
	}

	@JsOverlay
	public final VariablePie setShadow(Shadow shadow) {
		this.shadow = shadow;
		return this;
	}

	@JsOverlay
	public final Boolean getShowCheckbox() {
		return showCheckbox;
	}

	@JsOverlay
	public final VariablePie setShowCheckbox(Boolean showCheckbox) {
		this.showCheckbox = showCheckbox;
		return this;
	}

	@JsOverlay
	public final Boolean getShowInLegend() {
		return showInLegend;
	}

	@JsOverlay
	public final VariablePie setShowInLegend(Boolean showInLegend) {
		this.showInLegend = showInLegend;
		return this;
	}

	@JsOverlay
	public final Boolean getSkipKeyboardNavigation() {
		return skipKeyboardNavigation;
	}

	@JsOverlay
	public final VariablePie setSkipKeyboardNavigation(Boolean skipKeyboardNavigation) {
		this.skipKeyboardNavigation = skipKeyboardNavigation;
		return this;
	}

	@JsOverlay
	public final double getSlicedOffset() {
		return slicedOffset;
	}

	@JsOverlay
	public final VariablePie setSlicedOffset(double slicedOffset) {
		this.slicedOffset = slicedOffset;
		return this;
	}

	@JsOverlay
	public final double getStartAngle() {
		return startAngle;
	}

	@JsOverlay
	public final VariablePie setStartAngle(double startAngle) {
		this.startAngle = startAngle;
		return this;
	}

	@JsOverlay
	public final SeriesStates getStates() {
		return states;
	}

	@JsOverlay
	public final VariablePie setStates(SeriesStates states) {
		this.states = states;
		return this;
	}

	@JsOverlay
	public final Boolean getStickyTracking() {
		return stickyTracking;
	}

	@JsOverlay
	public final VariablePie setStickyTracking(Boolean stickyTracking) {
		this.stickyTracking = stickyTracking;
		return this;
	}

	@JsOverlay
	public final Tooltip getTooltip() {
		return tooltip;
	}

	@JsOverlay
	public final VariablePie setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
		return this;
	}

	@JsOverlay
	public final Boolean getVisible() {
		return visible;
	}

	@JsOverlay
	public final VariablePie setVisible(Boolean visible) {
		this.visible = visible;
		return this;
	}

	@JsOverlay
	public final double getzMax() {
		return zMax;
	}

	@JsOverlay
	public final VariablePie setzMax(double zMax) {
		this.zMax = zMax;
		return this;
	}

	@JsOverlay
	public final double getzMin() {
		return zMin;
	}

	@JsOverlay
	public final VariablePie setzMin(double zMin) {
		this.zMin = zMin;
		return this;
	}
}
