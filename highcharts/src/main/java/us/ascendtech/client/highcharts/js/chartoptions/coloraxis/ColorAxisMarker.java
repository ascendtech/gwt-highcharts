package us.ascendtech.client.highcharts.js.chartoptions.coloraxis;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.client.highcharts.js.chartoptions.shared.functions.Animation;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ColorAxisMarker {

	@JsProperty
	private Animation animation;
	@JsProperty
	private String color;

	@JsOverlay
	public final Animation getAnimation() {
		return animation;
	}

	@JsOverlay
	public final ColorAxisMarker setAnimation(Animation animation) {
		this.animation = animation;
		return this;
	}

	@JsOverlay
	public final String getColor() {
		return color;
	}

	@JsOverlay
	public final ColorAxisMarker setColor(String color) {
		this.color = color;
		return this;
	}
}
