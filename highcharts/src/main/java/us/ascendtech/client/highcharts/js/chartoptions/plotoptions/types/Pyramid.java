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
 * Docs: https://api.highcharts.com/highcharts/plotOptions.pyramid
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Pyramid {

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
	private String endAngle;
	@JsProperty
	private SeriesEvents events;
	@JsProperty
	private Boolean exposeElementToA11y;
	@JsProperty
	private String height;
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
	private double minSize;
	@JsProperty
	private String neckHeight;
	@JsProperty
	private String neckWidth;
	@JsProperty
	private SeriesPoint point;
	@JsProperty
	private PointDescriptionFormatter pointDescriptionFormatter;
	@JsProperty
	private Boolean reversed;
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
	private String width;

	@JsOverlay
	public final Boolean getAllowPointSelect() {
		return allowPointSelect;
	}

	@JsOverlay
	public final Pyramid setAllowPointSelect(Boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
		return this;
	}

	@JsOverlay
	public final Animation getAnimation() {
		return animation;
	}

	@JsOverlay
	public final Pyramid setAnimation(Animation animation) {
		this.animation = animation;
		return this;
	}

	@JsOverlay
	public final String getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final Pyramid setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final double getBorderWidth() {
		return borderWidth;
	}

	@JsOverlay
	public final Pyramid setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getCenter() {
		return center;
	}

	@JsOverlay
	public final Pyramid setCenter(JsArray<String> center) {
		this.center = center;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final Pyramid setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final Boolean getClip() {
		return clip;
	}

	@JsOverlay
	public final Pyramid setClip(Boolean clip) {
		this.clip = clip;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final Pyramid setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final double getColorIndex() {
		return colorIndex;
	}

	@JsOverlay
	public final Pyramid setColorIndex(double colorIndex) {
		this.colorIndex = colorIndex;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getColors() {
		return colors;
	}

	@JsOverlay
	public final Pyramid setColors(JsArray<String> colors) {
		this.colors = colors;
		return this;
	}

	@JsOverlay
	public final String getCursor() {
		return cursor;
	}

	@JsOverlay
	public final Pyramid setCursor(String cursor) {
		this.cursor = cursor;
		return this;
	}

	@JsOverlay
	public final SeriesDataLabels getDataLabels() {
		return dataLabels;
	}

	@JsOverlay
	public final Pyramid setDataLabels(SeriesDataLabels dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	@JsOverlay
	public final double getDepth() {
		return depth;
	}

	@JsOverlay
	public final Pyramid setDepth(double depth) {
		this.depth = depth;
		return this;
	}

	@JsOverlay
	public final String getDescription() {
		return description;
	}

	@JsOverlay
	public final Pyramid setDescription(String description) {
		this.description = description;
		return this;
	}

	@JsOverlay
	public final Boolean getEnableMouseTracking() {
		return enableMouseTracking;
	}

	@JsOverlay
	public final Pyramid setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
		return this;
	}

	@JsOverlay
	public final String getEndAngle() {
		return endAngle;
	}

	@JsOverlay
	public final Pyramid setEndAngle(String endAngle) {
		this.endAngle = endAngle;
		return this;
	}

	@JsOverlay
	public final SeriesEvents getEvents() {
		return events;
	}

	@JsOverlay
	public final Pyramid setEvents(SeriesEvents events) {
		this.events = events;
		return this;
	}

	@JsOverlay
	public final Boolean getExposeElementToA11y() {
		return exposeElementToA11y;
	}

	@JsOverlay
	public final Pyramid setExposeElementToA11y(Boolean exposeElementToA11y) {
		this.exposeElementToA11y = exposeElementToA11y;
		return this;
	}

	@JsOverlay
	public final String getHeight() {
		return height;
	}

	@JsOverlay
	public final Pyramid setHeight(String height) {
		this.height = height;
		return this;
	}

	@JsOverlay
	public final Boolean getIgnoreHiddenPoint() {
		return ignoreHiddenPoint;
	}

	@JsOverlay
	public final Pyramid setIgnoreHiddenPoint(Boolean ignoreHiddenPoint) {
		this.ignoreHiddenPoint = ignoreHiddenPoint;
		return this;
	}

	@JsOverlay
	public final String getInnerSize() {
		return innerSize;
	}

	@JsOverlay
	public final Pyramid setInnerSize(String innerSize) {
		this.innerSize = innerSize;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getKeys() {
		return keys;
	}

	@JsOverlay
	public final Pyramid setKeys(JsArray<String> keys) {
		this.keys = keys;
		return this;
	}

	@JsOverlay
	public final SeriesLabel getLabel() {
		return label;
	}

	@JsOverlay
	public final Pyramid setLabel(SeriesLabel label) {
		this.label = label;
		return this;
	}

	@JsOverlay
	public final String getLinecap() {
		return linecap;
	}

	@JsOverlay
	public final Pyramid setLinecap(String linecap) {
		this.linecap = linecap;
		return this;
	}

	@JsOverlay
	public final String getLinkedTo() {
		return linkedTo;
	}

	@JsOverlay
	public final Pyramid setLinkedTo(String linkedTo) {
		this.linkedTo = linkedTo;
		return this;
	}

	@JsOverlay
	public final double getMinSize() {
		return minSize;
	}

	@JsOverlay
	public final Pyramid setMinSize(double minSize) {
		this.minSize = minSize;
		return this;
	}

	@JsOverlay
	public final String getNeckHeight() {
		return neckHeight;
	}

	@JsOverlay
	public final Pyramid setNeckHeight(String neckHeight) {
		this.neckHeight = neckHeight;
		return this;
	}

	@JsOverlay
	public final String getNeckWidth() {
		return neckWidth;
	}

	@JsOverlay
	public final Pyramid setNeckWidth(String neckWidth) {
		this.neckWidth = neckWidth;
		return this;
	}

	@JsOverlay
	public final SeriesPoint getPoint() {
		return point;
	}

	@JsOverlay
	public final Pyramid setPoint(SeriesPoint point) {
		this.point = point;
		return this;
	}

	@JsOverlay
	public final PointDescriptionFormatter getPointDescriptionFormatter() {
		return pointDescriptionFormatter;
	}

	@JsOverlay
	public final Pyramid setPointDescriptionFormatter(PointDescriptionFormatter pointDescriptionFormatter) {
		this.pointDescriptionFormatter = pointDescriptionFormatter;
		return this;
	}

	@JsOverlay
	public final Boolean getReversed() {
		return reversed;
	}

	@JsOverlay
	public final Pyramid setReversed(Boolean reversed) {
		this.reversed = reversed;
		return this;
	}

	@JsOverlay
	public final Boolean getSelected() {
		return selected;
	}

	@JsOverlay
	public final Pyramid setSelected(Boolean selected) {
		this.selected = selected;
		return this;
	}

	@JsOverlay
	public final Shadow getShadow() {
		return shadow;
	}

	@JsOverlay
	public final Pyramid setShadow(Shadow shadow) {
		this.shadow = shadow;
		return this;
	}

	@JsOverlay
	public final Boolean getShowCheckbox() {
		return showCheckbox;
	}

	@JsOverlay
	public final Pyramid setShowCheckbox(Boolean showCheckbox) {
		this.showCheckbox = showCheckbox;
		return this;
	}

	@JsOverlay
	public final Boolean getShowInLegend() {
		return showInLegend;
	}

	@JsOverlay
	public final Pyramid setShowInLegend(Boolean showInLegend) {
		this.showInLegend = showInLegend;
		return this;
	}

	@JsOverlay
	public final Boolean getSkipKeyboardNavigation() {
		return skipKeyboardNavigation;
	}

	@JsOverlay
	public final Pyramid setSkipKeyboardNavigation(Boolean skipKeyboardNavigation) {
		this.skipKeyboardNavigation = skipKeyboardNavigation;
		return this;
	}

	@JsOverlay
	public final double getSlicedOffset() {
		return slicedOffset;
	}

	@JsOverlay
	public final Pyramid setSlicedOffset(double slicedOffset) {
		this.slicedOffset = slicedOffset;
		return this;
	}

	@JsOverlay
	public final double getStartAngle() {
		return startAngle;
	}

	@JsOverlay
	public final Pyramid setStartAngle(double startAngle) {
		this.startAngle = startAngle;
		return this;
	}

	@JsOverlay
	public final SeriesStates getStates() {
		return states;
	}

	@JsOverlay
	public final Pyramid setStates(SeriesStates states) {
		this.states = states;
		return this;
	}

	@JsOverlay
	public final Boolean getStickyTracking() {
		return stickyTracking;
	}

	@JsOverlay
	public final Pyramid setStickyTracking(Boolean stickyTracking) {
		this.stickyTracking = stickyTracking;
		return this;
	}

	@JsOverlay
	public final Tooltip getTooltip() {
		return tooltip;
	}

	@JsOverlay
	public final Pyramid setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
		return this;
	}

	@JsOverlay
	public final Boolean getVisible() {
		return visible;
	}

	@JsOverlay
	public final Pyramid setVisible(Boolean visible) {
		this.visible = visible;
		return this;
	}

	@JsOverlay
	public final String getWidth() {
		return width;
	}

	@JsOverlay
	public final Pyramid setWidth(String width) {
		this.width = width;
		return this;
	}
}
