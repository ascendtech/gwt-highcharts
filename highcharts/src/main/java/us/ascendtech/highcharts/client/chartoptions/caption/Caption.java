package us.ascendtech.highcharts.client.chartoptions.caption;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.Style;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/annotations
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Caption {

	private String align;
	private boolean floating;
	private Number margin;
	private Style style;
	private String text;
	private boolean useHtml;
	private String vertialAlign;
	private Number x;
	private Number y;

	@JsOverlay
	public final String getAlign() {
		return align;
	}

	@JsOverlay
	public final Caption setAlign(String align) {
		this.align = align;
		return this;
	}

	@JsOverlay
	public final boolean isFloating() {
		return floating;
	}

	@JsOverlay
	public final Caption setFloating(boolean floating) {
		this.floating = floating;
		return this;
	}

	@JsOverlay
	public final Number getMargin() {
		return margin;
	}

	@JsOverlay
	public final Caption setMargin(Number margin) {
		this.margin = margin;
		return this;
	}

	@JsOverlay
	public final Style getStyle() {
		return style;
	}

	@JsOverlay
	public final void setStyle(Style style) {
		this.style = style;
	}

	@JsOverlay
	public final String getText() {
		return text;
	}

	@JsOverlay
	public final Caption setText(String text) {
		this.text = text;
		return this;
	}

	@JsOverlay
	public final boolean isUseHtml() {
		return useHtml;
	}

	@JsOverlay
	public final Caption setUseHtml(boolean useHtml) {
		this.useHtml = useHtml;
		return this;
	}

	@JsOverlay
	public final String getVertialAlign() {
		return vertialAlign;
	}

	@JsOverlay
	public final Caption setVertialAlign(String vertialAlign) {
		this.vertialAlign = vertialAlign;
		return this;
	}

	@JsOverlay
	public final Number getX() {
		return x;
	}

	@JsOverlay
	public final Caption setX(Number x) {
		this.x = x;
		return this;
	}

	@JsOverlay
	public final Number getY() {
		return y;
	}

	@JsOverlay
	public final Caption setY(Number y) {
		this.y = y;
		return this;
	}
}
