package us.ascendtech.highcharts.client.chartoptions.legend;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class BubbleLegendRanges {

	@JsProperty
	private Object borderColor;
	@JsProperty
	private Object color;
	@JsProperty
	private Object connectorColor;
	@JsProperty
	private double value;

	@JsOverlay
	public final Object getBorderColor() {
		return borderColor;
	}

	@JsOverlay
	public final BubbleLegendRanges setBorderColor(Object borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	@JsOverlay
	public final Object getColor() {
		return color;
	}

	@JsOverlay
	public final BubbleLegendRanges setColor(Object color) {
		this.color = color;
		return this;
	}

	@JsOverlay
	public final Object getConnectorColor() {
		return connectorColor;
	}

	@JsOverlay
	public final BubbleLegendRanges setConnectorColor(Object connectorColor) {
		this.connectorColor = connectorColor;
		return this;
	}

	@JsOverlay
	public final double getValue() {
		return value;
	}

	@JsOverlay
	public final BubbleLegendRanges setValue(double value) {
		this.value = value;
		return this;
	}
}
