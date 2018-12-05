package us.ascendtech.highcharts.client.chartoptions.chart;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/chart
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Chart {

	@JsProperty
	private Boolean alignTicks;
	@JsProperty
	private Boolean animation;
	@JsProperty
	private String backgroundColor;
	@JsProperty
	private String borderColor;
	@JsProperty
	private double borderRadius;
	@JsProperty
	private double borderWidth;
	@JsProperty
	private String className;
	@JsProperty
	private double colorCount;
	@JsProperty
	private String defaultSeriesType;
	@JsProperty
	private String description;
	@JsProperty
	private ChartEvents events;
	@JsProperty
	private double height;
	@JsProperty
	private Boolean ignoreHiddenSeries;
	@JsProperty
	private Boolean inverted;
	@JsProperty
	private JsArray<Double> margin;
	@JsProperty
	private double marginBottom;
	@JsProperty
	private double marginLeft;
	@JsProperty
	private double marginRight;
	@JsProperty
	private double marginTop;
	@JsProperty
	private ChartOptions3d options3d;
	@JsProperty
	private String pankey;
	@JsProperty
	private Boolean panning;
	@JsProperty
	private ChartParallelAxes parallelAxes;
	@JsProperty
	private Boolean parallelCoordinates;
	@JsProperty
	private String pinchType;
	@JsProperty
	private String plotBackgroundColor;
	@JsProperty
	private String plotBackgroundImage;
	@JsProperty
	private String plotBorderColor;
	@JsProperty
	private double plotBorderWidth;
	@JsProperty
	private Boolean plotShadow;
	@JsProperty
	private Boolean polar;
	@JsProperty
	private Boolean reflow;
	@JsProperty
	private String renderTo;
	@JsProperty
	private ChartResetZoomButton resetZoomButton;
	@JsProperty
	private ChartScrollablePlotArea scrollablePlotArea;
	@JsProperty
	private String selectionMarkerFill;
	@JsProperty
	private Boolean shadow;
	@JsProperty
	private Boolean showAxes;
	@JsProperty
	private JsArray<Double> spacing;
	@JsProperty
	private double spacingBottom;
	@JsProperty
	private double spacingLeft;
	@JsProperty
	private double spacingRight;
	@JsProperty
	private double spacingTop;
	@JsProperty
	private String style;
	@JsProperty
	private String type;
	@JsProperty
	private String typeDescription;
	@JsProperty
	private double width;
	@JsProperty
	private String zoomType;

	@JsOverlay
	public final Boolean getAlignTicks() {
		return alignTicks;
	}

	@JsOverlay
	public final Chart setAlignTicks(Boolean alignTicks) {
		this.alignTicks = alignTicks;
		return this;
	}

	@JsOverlay
	public final Boolean getAnimation() {
		return animation;
	}

	@JsOverlay
	public final Chart setAnimation(Boolean animation) {
		this.animation = animation;
		return this;
	}

	@JsOverlay
	public final String getBackgroundColor() {
		return backgroundColor;
	}

	@JsOverlay
	public final Chart setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	@JsOverlay
	public final String getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final Chart setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final double getBorderRadius() {
		return borderRadius;
	}

	@JsOverlay
	public final Chart setBorderRadius(double borderRadius) {
		this.borderRadius = borderRadius;
		return this;
	}

	@JsOverlay
	public final double getBorderWidth() {
		return borderWidth;
	}

	@JsOverlay
	public final Chart setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final Chart setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final double getColorCount() {
		return colorCount;
	}

	@JsOverlay
	public final Chart setColorCount(double colorCount) {
		this.colorCount = colorCount;
		return this;
	}

	@JsOverlay
	public final String getDefaultSeriesType() {
		return defaultSeriesType;
	}

	@JsOverlay
	public final Chart setDefaultSeriesType(String defaultSeriesType) {
		this.defaultSeriesType = defaultSeriesType;
		return this;
	}

	@JsOverlay
	public final String getDescription() {
		return description;
	}

	@JsOverlay
	public final Chart setDescription(String description) {
		this.description = description;
		return this;
	}

	@JsOverlay
	public final ChartEvents getEvents() {
		return events;
	}

	@JsOverlay
	public final Chart setEvents(ChartEvents events) {
		this.events = events;
		return this;
	}

	@JsOverlay
	public final double getHeight() {
		return height;
	}

	@JsOverlay
	public final Chart setHeight(double height) {
		this.height = height;
		return this;
	}

	@JsOverlay
	public final Boolean getIgnoreHiddenSeries() {
		return ignoreHiddenSeries;
	}

	@JsOverlay
	public final Chart setIgnoreHiddenSeries(Boolean ignoreHiddenSeries) {
		this.ignoreHiddenSeries = ignoreHiddenSeries;
		return this;
	}

	@JsOverlay
	public final Boolean getInverted() {
		return inverted;
	}

	@JsOverlay
	public final Chart setInverted(Boolean inverted) {
		this.inverted = inverted;
		return this;
	}

	@JsOverlay
	public final JsArray<Double> getMargin() {
		return margin;
	}

	@JsOverlay
	public final Chart setMargin(JsArray<Double> margin) {
		this.margin = margin;
		return this;
	}

	@JsOverlay
	public final double getMarginBottom() {
		return marginBottom;
	}

	@JsOverlay
	public final Chart setMarginBottom(double marginBottom) {
		this.marginBottom = marginBottom;
		return this;
	}

	@JsOverlay
	public final double getMarginLeft() {
		return marginLeft;
	}

	@JsOverlay
	public final Chart setMarginLeft(double marginLeft) {
		this.marginLeft = marginLeft;
		return this;
	}

	@JsOverlay
	public final double getMarginRight() {
		return marginRight;
	}

	@JsOverlay
	public final Chart setMarginRight(double marginRight) {
		this.marginRight = marginRight;
		return this;
	}

	@JsOverlay
	public final double getMarginTop() {
		return marginTop;
	}

	@JsOverlay
	public final Chart setMarginTop(double marginTop) {
		this.marginTop = marginTop;
		return this;
	}

	@JsOverlay
	public final ChartOptions3d getOptions3d() {
		return options3d;
	}

	@JsOverlay
	public final Chart setOptions3d(ChartOptions3d options3d) {
		this.options3d = options3d;
		return this;
	}

	@JsOverlay
	public final String getPankey() {
		return pankey;
	}

	@JsOverlay
	public final Chart setPankey(String pankey) {
		this.pankey = pankey;
		return this;
	}

	@JsOverlay
	public final Boolean getPanning() {
		return panning;
	}

	@JsOverlay
	public final Chart setPanning(Boolean panning) {
		this.panning = panning;
		return this;
	}

	@JsOverlay
	public final ChartParallelAxes getParallelAxes() {
		return parallelAxes;
	}

	@JsOverlay
	public final Chart setParallelAxes(ChartParallelAxes parallelAxes) {
		this.parallelAxes = parallelAxes;
		return this;
	}

	@JsOverlay
	public final Boolean getParallelCoordinates() {
		return parallelCoordinates;
	}

	@JsOverlay
	public final Chart setParallelCoordinates(Boolean parallelCoordinates) {
		this.parallelCoordinates = parallelCoordinates;
		return this;
	}

	@JsOverlay
	public final String getPinchType() {
		return pinchType;
	}

	@JsOverlay
	public final Chart setPinchType(String pinchType) {
		this.pinchType = pinchType;
		return this;
	}

	@JsOverlay
	public final String getPlotBackgroundColor() {
		return plotBackgroundColor;
	}

	@JsOverlay
	public final Chart setPlotBackgroundColor(String plotBackgroundColor) {
		this.plotBackgroundColor = plotBackgroundColor;
		return this;
	}

	@JsOverlay
	public final String getPlotBackgroundImage() {
		return plotBackgroundImage;
	}

	@JsOverlay
	public final Chart setPlotBackgroundImage(String plotBackgroundImage) {
		this.plotBackgroundImage = plotBackgroundImage;
		return this;
	}

	@JsOverlay
	public final String getPlotBorderColor() {
		return plotBorderColor;
	}

	@JsOverlay
	public final Chart setPlotBorderColor(String plotBorderColor) {
		this.plotBorderColor = plotBorderColor;
		return this;
	}

	@JsOverlay
	public final double getPlotBorderWidth() {
		return plotBorderWidth;
	}

	@JsOverlay
	public final Chart setPlotBorderWidth(double plotBorderWidth) {
		this.plotBorderWidth = plotBorderWidth;
		return this;
	}

	@JsOverlay
	public final Boolean getPlotShadow() {
		return plotShadow;
	}

	@JsOverlay
	public final Chart setPlotShadow(Boolean plotShadow) {
		this.plotShadow = plotShadow;
		return this;
	}

	@JsOverlay
	public final Boolean getPolar() {
		return polar;
	}

	@JsOverlay
	public final Chart setPolar(Boolean polar) {
		this.polar = polar;
		return this;
	}

	@JsOverlay
	public final Boolean getReflow() {
		return reflow;
	}

	@JsOverlay
	public final Chart setReflow(Boolean reflow) {
		this.reflow = reflow;
		return this;
	}

	@JsOverlay
	public final String getRenderTo() {
		return renderTo;
	}

	@JsOverlay
	public final Chart setRenderTo(String renderTo) {
		this.renderTo = renderTo;
		return this;
	}

	@JsOverlay
	public final ChartResetZoomButton getResetZoomButton() {
		return resetZoomButton;
	}

	@JsOverlay
	public final Chart setResetZoomButton(ChartResetZoomButton resetZoomButton) {
		this.resetZoomButton = resetZoomButton;
		return this;
	}

	@JsOverlay
	public final ChartScrollablePlotArea getScrollablePlotArea() {
		return scrollablePlotArea;
	}

	@JsOverlay
	public final Chart setScrollablePlotArea(ChartScrollablePlotArea scrollablePlotArea) {
		this.scrollablePlotArea = scrollablePlotArea;
		return this;
	}

	@JsOverlay
	public final String getSelectionMarkerFill() {
		return selectionMarkerFill;
	}

	@JsOverlay
	public final Chart setSelectionMarkerFill(String selectionMarkerFill) {
		this.selectionMarkerFill = selectionMarkerFill;
		return this;
	}

	@JsOverlay
	public final Boolean getShadow() {
		return shadow;
	}

	@JsOverlay
	public final Chart setShadow(Boolean shadow) {
		this.shadow = shadow;
		return this;
	}

	@JsOverlay
	public final Boolean getShowAxes() {
		return showAxes;
	}

	@JsOverlay
	public final Chart setShowAxes(Boolean showAxes) {
		this.showAxes = showAxes;
		return this;
	}

	@JsOverlay
	public final JsArray<Double> getSpacing() {
		return spacing;
	}

	@JsOverlay
	public final Chart setSpacing(JsArray<Double> spacing) {
		this.spacing = spacing;
		return this;
	}

	@JsOverlay
	public final double getSpacingBottom() {
		return spacingBottom;
	}

	@JsOverlay
	public final Chart setSpacingBottom(double spacingBottom) {
		this.spacingBottom = spacingBottom;
		return this;
	}

	@JsOverlay
	public final double getSpacingLeft() {
		return spacingLeft;
	}

	@JsOverlay
	public final Chart setSpacingLeft(double spacingLeft) {
		this.spacingLeft = spacingLeft;
		return this;
	}

	@JsOverlay
	public final double getSpacingRight() {
		return spacingRight;
	}

	@JsOverlay
	public final Chart setSpacingRight(double spacingRight) {
		this.spacingRight = spacingRight;
		return this;
	}

	@JsOverlay
	public final double getSpacingTop() {
		return spacingTop;
	}

	@JsOverlay
	public final Chart setSpacingTop(double spacingTop) {
		this.spacingTop = spacingTop;
		return this;
	}

	@JsOverlay
	public final String getStyle() {
		return style;
	}

	@JsOverlay
	public final Chart setStyle(String style) {
		this.style = style;
		return this;
	}

	@JsOverlay
	public final String getType() {
		return type;
	}

	@JsOverlay
	public final Chart setType(String type) {
		this.type = type;
		return this;
	}

	@JsOverlay
	public final String getTypeDescription() {
		return typeDescription;
	}

	@JsOverlay
	public final Chart setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
		return this;
	}

	@JsOverlay
	public final double getWidth() {
		return width;
	}

	@JsOverlay
	public final Chart setWidth(double width) {
		this.width = width;
		return this;
	}

	@JsOverlay
	public final String getZoomType() {
		return zoomType;
	}

	@JsOverlay
	public final Chart setZoomType(String zoomType) {
		this.zoomType = zoomType;
		return this;
	}
}
