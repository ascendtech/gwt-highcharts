package us.ascendtech.client.highcharts.js.chartoptions.responsive;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.client.highcharts.js.ChartOptions;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Rule {

	@JsProperty
	private ChartOptions chartOptions;
	@JsProperty
	private Condition condition;

	@JsOverlay
	public final ChartOptions getChartOptions() {
		return chartOptions;
	}

	@JsOverlay
	public final Rule setChartOptions(ChartOptions chartOptions) {
		this.chartOptions = chartOptions;
		return this;
	}

	@JsOverlay
	public final Condition getCondition() {
		return condition;
	}

	@JsOverlay
	public final Rule setCondition(Condition condition) {
		this.condition = condition;
		return this;
	}
}
