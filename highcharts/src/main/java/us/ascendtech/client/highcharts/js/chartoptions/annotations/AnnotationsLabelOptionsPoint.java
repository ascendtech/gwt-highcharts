package us.ascendtech.client.highcharts.js.chartoptions.annotations;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AnnotationsLabelOptionsPoint {

	@JsProperty
	private double x;
	@JsProperty
	private double xAxis;
	@JsProperty
	private double y;
	@JsProperty
	private double yAxis;

	@JsOverlay
	public final double getX() {
		return x;
	}

	@JsOverlay
	public final AnnotationsLabelOptionsPoint setX(double x) {
		this.x = x;
		return this;
	}

	@JsOverlay
	public final double getxAxis() {
		return xAxis;
	}

	@JsOverlay
	public final AnnotationsLabelOptionsPoint setxAxis(double xAxis) {
		this.xAxis = xAxis;
		return this;
	}

	@JsOverlay
	public final double getY() {
		return y;
	}

	@JsOverlay
	public final AnnotationsLabelOptionsPoint setY(double y) {
		this.y = y;
		return this;
	}

	@JsOverlay
	public final double getyAxis() {
		return yAxis;
	}

	@JsOverlay
	public final AnnotationsLabelOptionsPoint setyAxis(double yAxis) {
		this.yAxis = yAxis;
		return this;
	}
}
