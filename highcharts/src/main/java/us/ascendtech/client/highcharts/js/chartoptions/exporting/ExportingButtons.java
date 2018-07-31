package us.ascendtech.client.highcharts.js.chartoptions.exporting;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ExportingButtons {

	@JsProperty
	private ExportingContextButton contextButton;

	@JsOverlay
	public final ExportingContextButton getContextButton() {
		return contextButton;
	}

	@JsOverlay
	public final ExportingButtons setContextButton(ExportingContextButton contextButton) {
		this.contextButton = contextButton;
		return this;
	}
}
