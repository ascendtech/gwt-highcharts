package us.ascendtech.highcharts.client.chartoptions.shared;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AlignObject {

	@JsProperty
	private String alignValue;
	@JsProperty
	private boolean alignByTranslate;
	@JsProperty
	private String verticalAlign;
	@JsProperty
	private Double x;
	@JsProperty
	private Double y;

	@JsOverlay
	public final String getAlignValue() {
		return alignValue;
	}

	@JsOverlay
	public final void setAlignValue(String alignValue) {
		this.alignValue = alignValue;
	}

	@JsOverlay
	public final boolean isAlignByTranslate() {
		return alignByTranslate;
	}

	@JsOverlay
	public final void setAlignByTranslate(boolean alignByTranslate) {
		this.alignByTranslate = alignByTranslate;
	}

	@JsOverlay
	public final String getVerticalAlign() {
		return verticalAlign;
	}

	@JsOverlay
	public final void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
	}

	@JsOverlay
	public final Double getX() {
		return x;
	}

	@JsOverlay
	public final void setX(Double x) {
		this.x = x;
	}

	@JsOverlay
	public final Double getY() {
		return y;
	}

	@JsOverlay
	public final void setY(Double y) {
		this.y = y;
	}
}
