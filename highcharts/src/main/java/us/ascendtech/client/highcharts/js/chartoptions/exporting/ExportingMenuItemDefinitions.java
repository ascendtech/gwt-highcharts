package us.ascendtech.client.highcharts.js.chartoptions.exporting;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.client.highcharts.js.chartoptions.shared.functions.OnClick;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ExportingMenuItemDefinitions {

	@JsProperty
	private OnClick onclick;
	@JsProperty
	private String text;
	@JsProperty
	private String textKey;

	@JsOverlay
	public final OnClick getOnclick() {
		return onclick;
	}

	@JsOverlay
	public final ExportingMenuItemDefinitions setOnclick(OnClick onclick) {
		this.onclick = onclick;
		return this;
	}

	@JsOverlay
	public final String getText() {
		return text;
	}

	@JsOverlay
	public final ExportingMenuItemDefinitions setText(String text) {
		this.text = text;
		return this;
	}

	@JsOverlay
	public final String getTextKey() {
		return textKey;
	}

	@JsOverlay
	public final ExportingMenuItemDefinitions setTextKey(String textKey) {
		this.textKey = textKey;
		return this;
	}
}
