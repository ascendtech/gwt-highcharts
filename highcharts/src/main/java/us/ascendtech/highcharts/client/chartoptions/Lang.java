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
public class Lang {

	@JsProperty
	private String thousandsSep;

	@JsOverlay
	public final String getThousandsSep() {
		return thousandsSep;
	}

	@JsOverlay
	public final Lang setThousandsSep(String thousandsSep) {
		this.thousandsSep = thousandsSep;
		return this;
	}
}
