package us.ascendtech.highcharts.client.chartoptions.series;

import elemental2.dom.Event;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesPointEvents extends Event {

	public SeriesPointEvents(String type) {
		super(type);
	}

	@JsProperty
	public SeriesPoint point;

}