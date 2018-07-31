package us.ascendtech.client.highcharts.js.chartoptions.labels;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.client.highcharts.js.chartoptions.shared.Style;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/labels
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Labels {

	@JsProperty
	private JsArray<LabelItem> items;
	@JsProperty
	private Style style;

	@JsOverlay
	public final JsArray<LabelItem> getItems() {
		return items;
	}

	@JsOverlay
	public final Labels setItems(JsArray<LabelItem> items) {
		this.items = items;
		return this;
	}

	@JsOverlay
	public final Style getStyle() {
		return style;
	}

	@JsOverlay
	public final Labels setStyle(Style style) {
		this.style = style;
		return this;
	}
}
