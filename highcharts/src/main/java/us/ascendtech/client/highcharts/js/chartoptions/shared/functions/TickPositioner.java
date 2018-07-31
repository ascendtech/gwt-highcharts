package us.ascendtech.client.highcharts.js.chartoptions.shared.functions;

import elemental2.core.JsArray;
import jsinterop.annotations.JsFunction;

@JsFunction
public interface TickPositioner {
	JsArray<Double> getPositions();
}