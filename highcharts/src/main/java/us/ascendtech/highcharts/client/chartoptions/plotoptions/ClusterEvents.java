package us.ascendtech.highcharts.client.chartoptions.plotoptions;

import elemental2.dom.Event;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ClusterEvents extends Event {

	public ClusterEvents(String type) {
		super(type);
	}

	@JsProperty
	public Cluster cluster;

}