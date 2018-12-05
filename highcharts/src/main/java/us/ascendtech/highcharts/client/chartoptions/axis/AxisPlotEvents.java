package us.ascendtech.highcharts.client.chartoptions.axis;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.axis.functions.Click;
import us.ascendtech.highcharts.client.chartoptions.axis.functions.MouseMove;
import us.ascendtech.highcharts.client.chartoptions.axis.functions.MouseOut;
import us.ascendtech.highcharts.client.chartoptions.axis.functions.MouseOver;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AxisPlotEvents {

	@JsProperty
	private Click click;

	@JsProperty
	private MouseMove mouseMove;

	@JsProperty
	private MouseOut mouseOut;

	@JsProperty
	private MouseOver mouseOver;

	@JsOverlay
	public final Click getClick() {
		return click;
	}

	@JsOverlay
	public final void setClick(Click click) {
		this.click = click;
	}

	@JsOverlay
	public final MouseMove getMouseMove() {
		return mouseMove;
	}

	@JsOverlay
	public final void setMouseMove(MouseMove mouseMove) {
		this.mouseMove = mouseMove;
	}

	@JsOverlay
	public final MouseOut getMouseOut() {
		return mouseOut;
	}

	@JsOverlay
	public final void setMouseOut(MouseOut mouseOut) {
		this.mouseOut = mouseOut;
	}

	@JsOverlay
	public final MouseOver getMouseOver() {
		return mouseOver;
	}

	@JsOverlay
	public final void setMouseOver(MouseOver mouseOver) {
		this.mouseOver = mouseOver;
	}
}
