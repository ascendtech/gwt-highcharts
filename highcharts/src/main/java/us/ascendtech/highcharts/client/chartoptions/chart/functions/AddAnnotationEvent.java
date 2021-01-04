package us.ascendtech.highcharts.client.chartoptions.chart.functions;

import elemental2.dom.Event;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.annotations.Annotations;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AddAnnotationEvent extends Event {

	public AddAnnotationEvent(String type) {
		super(type);
	}

	@JsProperty
	public Annotations options;

}
