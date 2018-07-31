package us.ascendtech.client.highcharts.js.chartoptions.chart;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ChartOptions3d {

	@JsProperty
	private double alpha;
	@JsProperty
	private String axisLabelPosition;
	@JsProperty
	private double beta;
	@JsProperty
	private double depth;
	@JsProperty
	private Boolean enabled;
	@JsProperty
	private Boolean fitToPlot;
	@JsProperty
	private ChartFrame frame;
	@JsProperty
	private double viewDistance;

	@JsOverlay
	public final double getAlpha() {
		return alpha;
	}

	@JsOverlay
	public final ChartOptions3d setAlpha(double alpha) {
		this.alpha = alpha;
		return this;
	}

	@JsOverlay
	public final String getAxisLabelPosition() {
		return axisLabelPosition;
	}

	@JsOverlay
	public final ChartOptions3d setAxisLabelPosition(String axisLabelPosition) {
		this.axisLabelPosition = axisLabelPosition;
		return this;
	}

	@JsOverlay
	public final double getBeta() {
		return beta;
	}

	@JsOverlay
	public final ChartOptions3d setBeta(double beta) {
		this.beta = beta;
		return this;
	}

	@JsOverlay
	public final double getDepth() {
		return depth;
	}

	@JsOverlay
	public final ChartOptions3d setDepth(double depth) {
		this.depth = depth;
		return this;
	}

	@JsOverlay
	public final Boolean getEnabled() {
		return enabled;
	}

	@JsOverlay
	public final ChartOptions3d setEnabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final Boolean getFitToPlot() {
		return fitToPlot;
	}

	@JsOverlay
	public final ChartOptions3d setFitToPlot(Boolean fitToPlot) {
		this.fitToPlot = fitToPlot;
		return this;
	}

	@JsOverlay
	public final ChartFrame getFrame() {
		return frame;
	}

	@JsOverlay
	public final ChartOptions3d setFrame(ChartFrame frame) {
		this.frame = frame;
		return this;
	}

	@JsOverlay
	public final double getViewDistance() {
		return viewDistance;
	}

	@JsOverlay
	public final ChartOptions3d setViewDistance(double viewDistance) {
		this.viewDistance = viewDistance;
		return this;
	}
}
