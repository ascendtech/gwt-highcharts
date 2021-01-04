package us.ascendtech.highcharts.client.chartoptions.plotoptions.types.functions;

import jsinterop.annotations.JsFunction;
import us.ascendtech.highcharts.client.chartoptions.shared.PointEvents;

@JsFunction
public interface Click {
	void click(PointEvents event);
}
