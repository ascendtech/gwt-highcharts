package us.ascendtech.highcharts.client.chartoptions.chart;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ChartScrollablePlotArea {

	@JsProperty
	private double minWidth;
	@JsProperty
	private double scrollPositionX;

	@JsOverlay
	public final double getMinWidth() {
		return minWidth;
	}

	@JsOverlay
	public final ChartScrollablePlotArea setMinWidth(double minWidth) {
		this.minWidth = minWidth;
		return this;
	}

	@JsOverlay
	public final double getScrollPositionX() {
		return scrollPositionX;
	}

	@JsOverlay
	public final ChartScrollablePlotArea setScrollPositionX(double scrollPositionX) {
		this.scrollPositionX = scrollPositionX;
		return this;
	}
}
