package us.ascendtech.client.highcharts.js.chartoptions.responsive;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/responsive
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Responsive {

	@JsProperty
	private JsArray<Rule> rules;

	@JsOverlay
	public final JsArray<Rule> getRules() {
		return rules;
	}

	@JsOverlay
	public final Responsive setRules(JsArray<Rule> rules) {
		this.rules = rules;
		return this;
	}
}
