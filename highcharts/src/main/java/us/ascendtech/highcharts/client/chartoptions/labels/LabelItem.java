package us.ascendtech.highcharts.client.chartoptions.labels;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class LabelItem {

	@JsProperty
	private String html;
	@JsProperty
	private String style; //CSSObject style{}

	@JsOverlay
	public final String getHtml() {
		return html;
	}

	@JsOverlay
	public final LabelItem setHtml(String html) {
		this.html = html;
		return this;
	}

	@JsOverlay
	public final String getStyle() {
		return style;
	}

	@JsOverlay
	public final LabelItem setStyle(String style) {
		this.style = style;
		return this;
	}
}
