package us.ascendtech.client.highcharts.js.chartoptions.plotoptions.types;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.client.highcharts.js.chartoptions.plotoptions.Level;
import us.ascendtech.client.highcharts.js.chartoptions.plotoptions.LevelSize;
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
 * Docs: https://api.highcharts.com/highcharts/plotOptions.sunburst
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Sunburst {

	@JsProperty
	private Boolean allowDrillToNode;
	@JsProperty
	private Boolean allowPointSelect;
	@JsProperty
	private Animation animation;
	@JsProperty
	private String borderColor;
	@JsProperty
	private double borderRadius;
	@JsProperty
	private JsArray<String> center;
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
	private Boolean levelIsConstant;
	@JsProperty
	private JsArray<Level> levels;
	@JsProperty
	private LevelSize levelSize;
	@JsProperty
	private String linkedTo;
	@JsProperty
	private SeriesPoint point;
	@JsProperty
	private PointDescriptionFormatter pointDescriptionFormatter;
	@JsProperty
	private String rootId;
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

	@JsOverlay
	public final Boolean getAllowDrillToNode() {
		return allowDrillToNode;
	}

	@JsOverlay
	public final Sunburst setAllowDrillToNode(Boolean allowDrillToNode) {
		this.allowDrillToNode = allowDrillToNode;
		return this;
	}

	@JsOverlay
	public final Boolean getAllowPointSelect() {
		return allowPointSelect;
	}

	@JsOverlay
	public final Sunburst setAllowPointSelect(Boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
		return this;
	}

	@JsOverlay
	public final Animation getAnimation() {
		return animation;
	}

	@JsOverlay
	public final Sunburst setAnimation(Animation animation) {
		this.animation = animation;
		return this;
	}

	@JsOverlay
	public final String getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final Sunburst setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final double getBorderRadius() {
		return borderRadius;
	}

	@JsOverlay
	public final Sunburst setBorderRadius(double borderRadius) {
		this.borderRadius = borderRadius;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getCenter() {
		return center;
	}

	@JsOverlay
	public final Sunburst setCenter(JsArray<String> center) {
		this.center = center;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final Sunburst setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final Sunburst setColor(String color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final Boolean getColorByPoint() {
		return colorByPoint;
	}

	@JsOverlay
	public final Sunburst setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		return this;
	}

	@JsOverlay
	public final double getColorIndex() {
		return colorIndex;
	}

	@JsOverlay
	public final Sunburst setColorIndex(double colorIndex) {
		this.colorIndex = colorIndex;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getColors() {
		return colors;
	}

	@JsOverlay
	public final Sunburst setColors(JsArray<String> colors) {
		this.colors = colors;
		return this;
	}

	@JsOverlay
	public final String getCursor() {
		return cursor;
	}

	@JsOverlay
	public final Sunburst setCursor(String cursor) {
		this.cursor = cursor;
		return this;
	}

	@JsOverlay
	public final SeriesDataLabels getDataLabels() {
		return dataLabels;
	}

	@JsOverlay
	public final Sunburst setDataLabels(SeriesDataLabels dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	@JsOverlay
	public final String getDescription() {
		return description;
	}

	@JsOverlay
	public final Sunburst setDescription(String description) {
		this.description = description;
		return this;
	}

	@JsOverlay
	public final Boolean getEnableMouseTracking() {
		return enableMouseTracking;
	}

	@JsOverlay
	public final Sunburst setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
		return this;
	}

	@JsOverlay
	public final SeriesEvents getEvents() {
		return events;
	}

	@JsOverlay
	public final Sunburst setEvents(SeriesEvents events) {
		this.events = events;
		return this;
	}

	@JsOverlay
	public final Boolean getExposeElementToA11y() {
		return exposeElementToA11y;
	}

	@JsOverlay
	public final Sunburst setExposeElementToA11y(Boolean exposeElementToA11y) {
		this.exposeElementToA11y = exposeElementToA11y;
		return this;
	}

	@JsOverlay
	public final JsArray<String> getKeys() {
		return keys;
	}

	@JsOverlay
	public final Sunburst setKeys(JsArray<String> keys) {
		this.keys = keys;
		return this;
	}

	@JsOverlay
	public final SeriesLabel getLabel() {
		return label;
	}

	@JsOverlay
	public final Sunburst setLabel(SeriesLabel label) {
		this.label = label;
		return this;
	}

	@JsOverlay
	public final Boolean getLevelIsConstant() {
		return levelIsConstant;
	}

	@JsOverlay
	public final Sunburst setLevelIsConstant(Boolean levelIsConstant) {
		this.levelIsConstant = levelIsConstant;
		return this;
	}

	@JsOverlay
	public final JsArray<Level> getLevels() {
		return levels;
	}

	@JsOverlay
	public final Sunburst setLevels(JsArray<Level> levels) {
		this.levels = levels;
		return this;
	}

	@JsOverlay
	public final LevelSize getLevelSize() {
		return levelSize;
	}

	@JsOverlay
	public final Sunburst setLevelSize(LevelSize levelSize) {
		this.levelSize = levelSize;
		return this;
	}

	@JsOverlay
	public final String getLinkedTo() {
		return linkedTo;
	}

	@JsOverlay
	public final Sunburst setLinkedTo(String linkedTo) {
		this.linkedTo = linkedTo;
		return this;
	}

	@JsOverlay
	public final SeriesPoint getPoint() {
		return point;
	}

	@JsOverlay
	public final Sunburst setPoint(SeriesPoint point) {
		this.point = point;
		return this;
	}

	@JsOverlay
	public final PointDescriptionFormatter getPointDescriptionFormatter() {
		return pointDescriptionFormatter;
	}

	@JsOverlay
	public final Sunburst setPointDescriptionFormatter(PointDescriptionFormatter pointDescriptionFormatter) {
		this.pointDescriptionFormatter = pointDescriptionFormatter;
		return this;
	}

	@JsOverlay
	public final String getRootId() {
		return rootId;
	}

	@JsOverlay
	public final Sunburst setRootId(String rootId) {
		this.rootId = rootId;
		return this;
	}

	@JsOverlay
	public final Boolean getSelected() {
		return selected;
	}

	@JsOverlay
	public final Sunburst setSelected(Boolean selected) {
		this.selected = selected;
		return this;
	}

	@JsOverlay
	public final Shadow getShadow() {
		return shadow;
	}

	@JsOverlay
	public final Sunburst setShadow(Shadow shadow) {
		this.shadow = shadow;
		return this;
	}

	@JsOverlay
	public final Boolean getShowCheckbox() {
		return showCheckbox;
	}

	@JsOverlay
	public final Sunburst setShowCheckbox(Boolean showCheckbox) {
		this.showCheckbox = showCheckbox;
		return this;
	}

	@JsOverlay
	public final Boolean getShowInLegend() {
		return showInLegend;
	}

	@JsOverlay
	public final Sunburst setShowInLegend(Boolean showInLegend) {
		this.showInLegend = showInLegend;
		return this;
	}

	@JsOverlay
	public final Boolean getSkipKeyboardNavigation() {
		return skipKeyboardNavigation;
	}

	@JsOverlay
	public final Sunburst setSkipKeyboardNavigation(Boolean skipKeyboardNavigation) {
		this.skipKeyboardNavigation = skipKeyboardNavigation;
		return this;
	}

	@JsOverlay
	public final double getSlicedOffset() {
		return slicedOffset;
	}

	@JsOverlay
	public final Sunburst setSlicedOffset(double slicedOffset) {
		this.slicedOffset = slicedOffset;
		return this;
	}

	@JsOverlay
	public final double getStartAngle() {
		return startAngle;
	}

	@JsOverlay
	public final Sunburst setStartAngle(double startAngle) {
		this.startAngle = startAngle;
		return this;
	}

	@JsOverlay
	public final SeriesStates getStates() {
		return states;
	}

	@JsOverlay
	public final Sunburst setStates(SeriesStates states) {
		this.states = states;
		return this;
	}

	@JsOverlay
	public final Boolean getStickyTracking() {
		return stickyTracking;
	}

	@JsOverlay
	public final Sunburst setStickyTracking(Boolean stickyTracking) {
		this.stickyTracking = stickyTracking;
		return this;
	}

	@JsOverlay
	public final Tooltip getTooltip() {
		return tooltip;
	}

	@JsOverlay
	public final Sunburst setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
		return this;
	}

	@JsOverlay
	public final Boolean getVisible() {
		return visible;
	}

	@JsOverlay
	public final Sunburst setVisible(Boolean visible) {
		this.visible = visible;
		return this;
	}
}
