package us.ascendtech.client.highcharts.js.chartoptions.chart;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ChartFrame {

	@JsProperty
	private ChartFrameSettings back;
	@JsProperty
	private ChartFrameSettings bottom;
	@JsProperty
	private ChartFrameSettings front;
	@JsProperty
	private ChartFrameSettings left;
	@JsProperty
	private ChartFrameSettings right;
	@JsProperty
	private ChartFrameSettings side;
	@JsProperty
	private double size;
	@JsProperty
	private ChartFrameSettings top;
	@JsProperty
	private String visible;

	@JsOverlay
	public final ChartFrameSettings getBack() {
		return back;
	}

	@JsOverlay
	public final ChartFrame setBack(ChartFrameSettings back) {
		this.back = back;
		return this;
	}

	@JsOverlay
	public final ChartFrameSettings getBottom() {
		return bottom;
	}

	@JsOverlay
	public final ChartFrame setBottom(ChartFrameSettings bottom) {
		this.bottom = bottom;
		return this;
	}

	@JsOverlay
	public final ChartFrameSettings getFront() {
		return front;
	}

	@JsOverlay
	public final ChartFrame setFront(ChartFrameSettings front) {
		this.front = front;
		return this;
	}

	@JsOverlay
	public final ChartFrameSettings getLeft() {
		return left;
	}

	@JsOverlay
	public final ChartFrame setLeft(ChartFrameSettings left) {
		this.left = left;
		return this;
	}

	@JsOverlay
	public final ChartFrameSettings getRight() {
		return right;
	}

	@JsOverlay
	public final ChartFrame setRight(ChartFrameSettings right) {
		this.right = right;
		return this;
	}

	@JsOverlay
	public final ChartFrameSettings getSide() {
		return side;
	}

	@JsOverlay
	public final ChartFrame setSide(ChartFrameSettings side) {
		this.side = side;
		return this;
	}

	@JsOverlay
	public final double getSize() {
		return size;
	}

	@JsOverlay
	public final ChartFrame setSize(double size) {
		this.size = size;
		return this;
	}

	@JsOverlay
	public final ChartFrameSettings getTop() {
		return top;
	}

	@JsOverlay
	public final ChartFrame setTop(ChartFrameSettings top) {
		this.top = top;
		return this;
	}

	@JsOverlay
	public final String getVisible() {
		return visible;
	}

	@JsOverlay
	public final ChartFrame setVisible(String visible) {
		this.visible = visible;
		return this;
	}
}
