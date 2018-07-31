package us.ascendtech.client.highcharts.js.chartoptions;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/subtitle
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Subtitle {

	@JsProperty
	private String align;
	@JsProperty
	private Boolean floating;
	@JsProperty
	private String style; // CSSObject
	@JsProperty
	private String text;
	@JsProperty
	private Boolean useHTML;
	@JsProperty
	private String verticalAlign;
	@JsProperty
	private double widthAdjust;
	@JsProperty
	private double x;
	@JsProperty
	private double y;

	@JsOverlay
	public final String getAlign() {
		return align;
	}

	@JsOverlay
	public final Subtitle setAlign(String align) {
		this.align = align;
		return this;
	}

	@JsOverlay
	public final Boolean getFloating() {
		return floating;
	}

	@JsOverlay
	public final Subtitle setFloating(Boolean floating) {
		this.floating = floating;
		return this;
	}

	@JsOverlay
	public final String getStyle() {
		return style;
	}

	@JsOverlay
	public final Subtitle setStyle(String style) {
		this.style = style;
		return this;
	}

	@JsOverlay
	public final String getText() {
		return text;
	}

	@JsOverlay
	public final Subtitle setText(String text) {
		this.text = text;
		return this;
	}

	@JsOverlay
	public final Boolean getUseHTML() {
		return useHTML;
	}

	@JsOverlay
	public final Subtitle setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		return this;
	}

	@JsOverlay
	public final String getVerticalAlign() {
		return verticalAlign;
	}

	@JsOverlay
	public final Subtitle setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		return this;
	}

	@JsOverlay
	public final double getWidthAdjust() {
		return widthAdjust;
	}

	@JsOverlay
	public final Subtitle setWidthAdjust(double widthAdjust) {
		this.widthAdjust = widthAdjust;
		return this;
	}

	@JsOverlay
	public final double getX() {
		return x;
	}

	@JsOverlay
	public final Subtitle setX(double x) {
		this.x = x;
		return this;
	}

	@JsOverlay
	public final double getY() {
		return y;
	}

	@JsOverlay
	public final Subtitle setY(double y) {
		this.y = y;
		return this;
	}
}
