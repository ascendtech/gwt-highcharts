package us.ascendtech.client.highcharts.js.chartoptions.responsive;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Condition {

	@JsProperty
	private Callback callback;
	@JsProperty
	private double maxHeight;
	@JsProperty
	private double maxWidth;
	@JsProperty
	private double minHeight;
	@JsProperty
	private double minWidth;

	@JsFunction
	public interface Callback {
		boolean onCallback();
	}

	@JsOverlay
	public final Callback getCallback() {
		return callback;
	}

	@JsOverlay
	public final Condition setCallback(Callback callback) {
		this.callback = callback;
		return this;
	}

	@JsOverlay
	public final double getMaxHeight() {
		return maxHeight;
	}

	@JsOverlay
	public final Condition setMaxHeight(double maxHeight) {
		this.maxHeight = maxHeight;
		return this;
	}

	@JsOverlay
	public final double getMaxWidth() {
		return maxWidth;
	}

	@JsOverlay
	public final Condition setMaxWidth(double maxWidth) {
		this.maxWidth = maxWidth;
		return this;
	}

	@JsOverlay
	public final double getMinHeight() {
		return minHeight;
	}

	@JsOverlay
	public final Condition setMinHeight(double minHeight) {
		this.minHeight = minHeight;
		return this;
	}

	@JsOverlay
	public final double getMinWidth() {
		return minWidth;
	}

	@JsOverlay
	public final Condition setMinWidth(double minWidth) {
		this.minWidth = minWidth;
		return this;
	}
}
