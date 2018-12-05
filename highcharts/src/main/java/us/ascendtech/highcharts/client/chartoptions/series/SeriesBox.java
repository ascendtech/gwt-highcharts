package us.ascendtech.highcharts.client.chartoptions.series;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesBox {

	@JsProperty
	private double left;
	@JsProperty
	private double right;
	@JsProperty
	private double top;
	@JsProperty
	private double bottom;

	@JsOverlay
	public final double getLeft() {
		return left;
	}

	@JsOverlay
	public final SeriesBox setLeft(double left) {
		this.left = left;
		return this;
	}

	@JsOverlay
	public final double getRight() {
		return right;
	}

	@JsOverlay
	public final SeriesBox setRight(double right) {
		this.right = right;
		return this;
	}

	@JsOverlay
	public final double getTop() {
		return top;
	}

	@JsOverlay
	public final SeriesBox setTop(double top) {
		this.top = top;
		return this;
	}

	@JsOverlay
	public final double getBottom() {
		return bottom;
	}

	@JsOverlay
	public final SeriesBox setBottom(double bottom) {
		this.bottom = bottom;
		return this;
	}
}
