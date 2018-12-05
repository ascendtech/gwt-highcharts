package us.ascendtech.highcharts.client.chartoptions.legend;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.Style;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class LegendTitle {

	@JsProperty
	private Style style;
	@JsProperty
	private String text;

	@JsOverlay
	public final Style getStyle() {
		return style;
	}

	@JsOverlay
	public final LegendTitle setStyle(Style style) {
		this.style = style;
		return this;
	}

	@JsOverlay
	public final String getText() {
		return text;
	}

	@JsOverlay
	public final LegendTitle setText(String text) {
		this.text = text;
		return this;
	}
}
