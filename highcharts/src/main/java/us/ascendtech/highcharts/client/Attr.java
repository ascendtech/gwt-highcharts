package us.ascendtech.highcharts.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Attr {

	@JsProperty
	private String name;
	@JsProperty
	private String value;

	@JsOverlay
	public final String getName() {
		return name;
	}

	@JsOverlay
	public final Attr setName(String name) {
		this.name = name;
		return this;
	}

	@JsOverlay
	public final String getValue() {
		return value;
	}

	@JsOverlay
	public final Attr setValue(String value) {
		this.value = value;
		return this;
	}
}
