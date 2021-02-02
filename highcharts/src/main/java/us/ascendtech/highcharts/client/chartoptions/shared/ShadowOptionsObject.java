package us.ascendtech.highcharts.client.chartoptions.shared;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ShadowOptionsObject {

	@JsProperty
	private String color;
	@JsProperty
	private Double offsetX;
	@JsProperty
	private Double offsetY;
	@JsProperty
	private Double opacity;
	@JsProperty
	private Double width;

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final void setColor(String color) {
		this.color = color;
	}

	@JsOverlay
	public final Double getOffsetX() {
		return offsetX;
	}

	@JsOverlay
	public final void setOffsetX(Double offsetX) {
		this.offsetX = offsetX;
	}

	@JsOverlay
	public final Double getOffsetY() {
		return offsetY;
	}

	@JsOverlay
	public final void setOffsetY(Double offsetY) {
		this.offsetY = offsetY;
	}

	@JsOverlay
	public final Double getOpacity() {
		return opacity;
	}

	@JsOverlay
	public final void setOpacity(Double opacity) {
		this.opacity = opacity;
	}

	@JsOverlay
	public final Double getWidth() {
		return width;
	}

	@JsOverlay
	public final void setWidth(Double width) {
		this.width = width;
	}
}
