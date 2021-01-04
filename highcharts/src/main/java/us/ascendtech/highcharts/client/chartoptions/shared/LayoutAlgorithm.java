package us.ascendtech.highcharts.client.chartoptions.shared;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class LayoutAlgorithm {

	@JsProperty
	private double distance;
	@JsProperty
	private double gridSize;
	@JsProperty
	private Double iterations;
	@JsProperty
	private double kmeansThreshold;
	@JsProperty
	private String type;

	@JsOverlay
	public final double getDistance() {
		return distance;
	}

	@JsOverlay
	public final LayoutAlgorithm setDistance(double distance) {
		this.distance = distance;
		return this;
	}

	@JsOverlay
	public final double getGridSize() {
		return gridSize;
	}

	@JsOverlay
	public final LayoutAlgorithm setGridSize(double gridSize) {
		this.gridSize = gridSize;
		return this;
	}

	@JsOverlay
	public final Double getIterations() {
		return iterations;
	}

	@JsOverlay
	public final LayoutAlgorithm setIterations(Double iterations) {
		this.iterations = iterations;
		return this;
	}

	@JsOverlay
	public final double getKmeansThreshold() {
		return kmeansThreshold;
	}

	@JsOverlay
	public final LayoutAlgorithm setKmeansThreshold(double kmeansThreshold) {
		this.kmeansThreshold = kmeansThreshold;
		return this;
	}

	@JsOverlay
	public final String getType() {
		return type;
	}

	@JsOverlay
	public final LayoutAlgorithm setType(String type) {
		this.type = type;
		return this;
	}
}
