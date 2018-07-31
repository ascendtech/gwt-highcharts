package us.ascendtech.client.highcharts.js.chartoptions.series;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesDataLabelsFilter {

	@JsProperty
	private String operator;
	@JsProperty
	private String property;
	@JsProperty
	private Object value;

	@JsOverlay
	public final String getOperator() {
		return operator;
	}

	@JsOverlay
	public final SeriesDataLabelsFilter setOperator(String operator) {
		this.operator = operator;
		return this;
	}

	@JsOverlay
	public final String getProperty() {
		return property;
	}

	@JsOverlay
	public final SeriesDataLabelsFilter setProperty(String property) {
		this.property = property;
		return this;
	}

	@JsOverlay
	public final Object getValue() {
		return value;
	}

	@JsOverlay
	public final SeriesDataLabelsFilter setValue(Object value) {
		this.value = value;
		return this;
	}
}
