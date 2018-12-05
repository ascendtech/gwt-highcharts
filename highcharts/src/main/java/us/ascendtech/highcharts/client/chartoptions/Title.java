package us.ascendtech.highcharts.client.chartoptions;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/title
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Title {

	@JsProperty
	private String align;
	@JsProperty
	private Boolean floating;
	@JsProperty
	private double margin;
	@JsProperty
	private String style; //CSSObject
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
	public final Title setAlign(String align) {
		this.align = align;
		return this;
	}

	@JsOverlay
	public final Boolean getFloating() {
		return floating;
	}

	@JsOverlay
	public final Title setFloating(Boolean floating) {
		this.floating = floating;
		return this;
	}

	@JsOverlay
	public final double getMargin() {
		return margin;
	}

	@JsOverlay
	public final Title setMargin(double margin) {
		this.margin = margin;
		return this;
	}

	@JsOverlay
	public final String getStyle() {
		return style;
	}

	@JsOverlay
	public final Title setStyle(String style) {
		this.style = style;
		return this;
	}

	@JsOverlay
	public final String getText() {
		return text;
	}

	@JsOverlay
	public final Title setText(String text) {
		this.text = text;
		return this;
	}

	@JsOverlay
	public final Boolean getUseHTML() {
		return useHTML;
	}

	@JsOverlay
	public final Title setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		return this;
	}

	@JsOverlay
	public final String getVerticalAlign() {
		return verticalAlign;
	}

	@JsOverlay
	public final Title setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		return this;
	}

	@JsOverlay
	public final double getWidthAdjust() {
		return widthAdjust;
	}

	@JsOverlay
	public final Title setWidthAdjust(double widthAdjust) {
		this.widthAdjust = widthAdjust;
		return this;
	}

	@JsOverlay
	public final double getX() {
		return x;
	}

	@JsOverlay
	public final Title setX(double x) {
		this.x = x;
		return this;
	}

	@JsOverlay
	public final double getY() {
		return y;
	}

	@JsOverlay
	public final Title setY(double y) {
		this.y = y;
		return this;
	}
}
