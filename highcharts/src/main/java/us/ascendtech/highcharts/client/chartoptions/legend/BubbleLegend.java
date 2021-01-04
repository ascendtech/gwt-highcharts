package us.ascendtech.highcharts.client.chartoptions.legend;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class BubbleLegend {

	@JsProperty
	private Object borderColor;
	@JsProperty
	private double borderWidth;
	@JsProperty
	private String className;
	@JsProperty
	private Object color;
	@JsProperty
	private String connectorClassName;
	@JsProperty
	private Object connectorColor;
	@JsProperty
	private double connectorDistance;
	@JsProperty
	private double connectorWidth;
	@JsProperty
	private boolean enabled;
	@JsProperty
	private BubbleLegendLabels labels;
	@JsProperty
	private double legendIndex;
	@JsProperty
	private double maxSize;
	@JsProperty
	private double minSize;
	@JsProperty
	private JsArray<BubbleLegendRanges> ranges;
	@JsProperty
	private String sizeBy;
	@JsProperty
	private boolean sizeByAbsoluteValue;
	@JsProperty
	private double zIndex;
	@JsProperty
	private double zThreshold;

	@JsOverlay
	public final Object getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final BubbleLegend setBorderColor(Object borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final double getBorderWidth() {
		return borderWidth;
	}

	@JsOverlay
	public final BubbleLegend setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	@JsOverlay
	public final String getClassName() {
		return className;
	}

	@JsOverlay
	public final BubbleLegend setClassName(String className) {
		this.className = className;
		return this;
	}

	@JsOverlay
	public final Object getColor() {
		return color;
	}

	@JsOverlay
	public final BubbleLegend setColor(Object color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final String getConnectorClassName() {
		return connectorClassName;
	}

	@JsOverlay
	public final BubbleLegend setConnectorClassName(String connectorClassName) {
		this.connectorClassName = connectorClassName;
		return this;
	}

	@JsOverlay
	public final Object getConnectorColor() {
		return connectorColor;
	}

	@JsOverlay
	public final BubbleLegend setConnectorColor(Object connectorColor) {
		this.connectorColor = connectorColor;
		return this;
	}

	@JsOverlay
	public final double getConnectorDistance() {
		return connectorDistance;
	}

	@JsOverlay
	public final BubbleLegend setConnectorDistance(double connectorDistance) {
		this.connectorDistance = connectorDistance;
		return this;
	}

	@JsOverlay
	public final double getConnectorWidth() {
		return connectorWidth;
	}

	@JsOverlay
	public final BubbleLegend setConnectorWidth(double connectorWidth) {
		this.connectorWidth = connectorWidth;
		return this;
	}

	@JsOverlay
	public final boolean isEnabled() {
		return enabled;
	}

	@JsOverlay
	public final BubbleLegend setEnabled(boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final BubbleLegendLabels getLabels() {
		return labels;
	}

	@JsOverlay
	public final BubbleLegend setLabels(BubbleLegendLabels labels) {
		this.labels = labels;
		return this;
	}

	@JsOverlay
	public final double getLegendIndex() {
		return legendIndex;
	}

	@JsOverlay
	public final BubbleLegend setLegendIndex(double legendIndex) {
		this.legendIndex = legendIndex;
		return this;
	}

	@JsOverlay
	public final double getMaxSize() {
		return maxSize;
	}

	@JsOverlay
	public final BubbleLegend setMaxSize(double maxSize) {
		this.maxSize = maxSize;
		return this;
	}

	@JsOverlay
	public final double getMinSize() {
		return minSize;
	}

	@JsOverlay
	public final BubbleLegend setMinSize(double minSize) {
		this.minSize = minSize;
		return this;
	}

	@JsOverlay
	public final JsArray<BubbleLegendRanges> getRanges() {
		return ranges;
	}

	@JsOverlay
	public final BubbleLegend setRanges(JsArray<BubbleLegendRanges> ranges) {
		this.ranges = ranges;
		return this;
	}

	@JsOverlay
	public final String getSizeBy() {
		return sizeBy;
	}

	@JsOverlay
	public final BubbleLegend setSizeBy(String sizeBy) {
		this.sizeBy = sizeBy;
		return this;
	}

	@JsOverlay
	public final boolean isSizeByAbsoluteValue() {
		return sizeByAbsoluteValue;
	}

	@JsOverlay
	public final BubbleLegend setSizeByAbsoluteValue(boolean sizeByAbsoluteValue) {
		this.sizeByAbsoluteValue = sizeByAbsoluteValue;
		return this;
	}

	@JsOverlay
	public final double getzIndex() {
		return zIndex;
	}

	@JsOverlay
	public final BubbleLegend setzIndex(double zIndex) {
		this.zIndex = zIndex;
		return this;
	}

	@JsOverlay
	public final double getzThreshold() {
		return zThreshold;
	}

	@JsOverlay
	public final BubbleLegend setzThreshold(double zThreshold) {
		this.zThreshold = zThreshold;
		return this;
	}
}
