package us.ascendtech.highcharts.client.chartoptions.plotoptions.types.functions;

import jsinterop.annotations.JsFunction;
import us.ascendtech.highcharts.client.chartoptions.shared.PointEvents;

@JsFunction
public interface Select {
	void select(PointEvents event);
}
