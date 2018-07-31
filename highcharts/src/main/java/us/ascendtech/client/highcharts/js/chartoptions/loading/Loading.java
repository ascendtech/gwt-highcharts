package us.ascendtech.client.highcharts.js.chartoptions.loading;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.client.highcharts.js.chartoptions.shared.Style;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/loading
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Loading {

	@JsProperty
	private double hideDuration;
	@JsProperty
	private Style labelStyle;
	@JsProperty
	private double showDuration;
	@JsProperty
	private Style style;

	@JsOverlay
	public final double getHideDuration() {
		return hideDuration;
	}

	@JsOverlay
	public final Loading setHideDuration(double hideDuration) {
		this.hideDuration = hideDuration;
		return this;
	}

	@JsOverlay
	public final Style getLabelStyle() {
		return labelStyle;
	}

	@JsOverlay
	public final Loading setLabelStyle(Style labelStyle) {
		this.labelStyle = labelStyle;
		return this;
	}

	@JsOverlay
	public final double getShowDuration() {
		return showDuration;
	}

	@JsOverlay
	public final Loading setShowDuration(double showDuration) {
		this.showDuration = showDuration;
		return this;
	}

	@JsOverlay
	public final Style getStyle() {
		return style;
	}

	@JsOverlay
	public final Loading setStyle(Style style) {
		this.style = style;
		return this;
	}
}
