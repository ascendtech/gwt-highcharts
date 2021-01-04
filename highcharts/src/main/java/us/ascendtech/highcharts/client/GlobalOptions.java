package us.ascendtech.highcharts.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.Lang;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class GlobalOptions {

	@JsProperty
	private Lang lang;

	@JsOverlay
	public final Lang getLang() {
		return lang;
	}

	@JsOverlay
	public final GlobalOptions setLang(Lang lang) {
		this.lang = lang;
		return this;
	}
}
