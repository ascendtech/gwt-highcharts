package us.ascendtech.client.highcharts.js.chartoptions.nodata;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.client.highcharts.js.chartoptions.shared.Position;
import us.ascendtech.client.highcharts.js.chartoptions.shared.Style;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/noData
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class NoData {

	@JsProperty
	private String attr; // Just String json of SVG attributes?
	@JsProperty
	private Position position;
	@JsProperty
	private Style style;
	@JsProperty
	private Boolean useHTML;

	@JsOverlay
	public final String getAttr() {
		return attr;
	}

	@JsOverlay
	public final NoData setAttr(String attr) {
		this.attr = attr;
		return this;
	}

	@JsOverlay
	public final Position getPosition() {
		return position;
	}

	@JsOverlay
	public final NoData setPosition(Position position) {
		this.position = position;
		return this;
	}

	@JsOverlay
	public final Style getStyle() {
		return style;
	}

	@JsOverlay
	public final NoData setStyle(Style style) {
		this.style = style;
		return this;
	}

	@JsOverlay
	public final Boolean getUseHTML() {
		return useHTML;
	}

	@JsOverlay
	public final NoData setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		return this;
	}
}
