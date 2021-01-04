package us.ascendtech.highcharts.client.chartoptions.plotoptions.types.functions;

import jsinterop.annotations.JsFunction;
import us.ascendtech.highcharts.client.chartoptions.plotoptions.ClusterEvents;

@JsFunction
public interface DrillToCluster {
	void drillToCluster(ClusterEvents event);
}
