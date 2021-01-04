package us.ascendtech.highcharts.client.chartoptions.shared;

import elemental2.dom.Event;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class PointEvents extends Event {

	public PointEvents(String type) {
		super(type);
	}

	@JsProperty
	public Point point;

}