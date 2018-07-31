package us.ascendtech.client.highcharts.js.chartoptions.axis;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AxisBreak {

	@JsProperty
	private double breakSize;
	@JsProperty
	private double from;
	@JsProperty
	private double repeat;
	@JsProperty
	private double to;

	@JsOverlay
	public final double getBreakSize() {
		return breakSize;
	}

	@JsOverlay
	public final AxisBreak setBreakSize(double breakSize) {
		this.breakSize = breakSize;
		return this;
	}

	@JsOverlay
	public final double getFrom() {
		return from;
	}

	@JsOverlay
	public final AxisBreak setFrom(double from) {
		this.from = from;
		return this;
	}

	@JsOverlay
	public final double getRepeat() {
		return repeat;
	}

	@JsOverlay
	public final AxisBreak setRepeat(double repeat) {
		this.repeat = repeat;
		return this;
	}

	@JsOverlay
	public final double getTo() {
		return to;
	}

	@JsOverlay
	public final AxisBreak setTo(double to) {
		this.to = to;
		return this;
	}
}
