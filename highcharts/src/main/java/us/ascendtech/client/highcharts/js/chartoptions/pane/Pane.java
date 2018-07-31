package us.ascendtech.client.highcharts.js.chartoptions.pane;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.client.highcharts.js.chartoptions.shared.Background;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/pane
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Pane {

	@JsProperty
	private JsArray<Background> background;
	@JsProperty
	private JsArray<Object> center;
	@JsProperty
	private double endAngle;
	@JsProperty
	private String size;
	@JsProperty
	private double startAngle;

	@JsOverlay
	public final JsArray<Background> getBackground() {
		return background;
	}

	@JsOverlay
	public final Pane setBackground(JsArray<Background> background) {
		this.background = background;
		return this;
	}

	@JsOverlay
	public final JsArray<Object> getCenter() {
		return center;
	}

	@JsOverlay
	public final Pane setCenter(JsArray<Object> center) {
		this.center = center;
		return this;
	}

	@JsOverlay
	public final double getEndAngle() {
		return endAngle;
	}

	@JsOverlay
	public final Pane setEndAngle(double endAngle) {
		this.endAngle = endAngle;
		return this;
	}

	@JsOverlay
	public final String getSize() {
		return size;
	}

	@JsOverlay
	public final Pane setSize(String size) {
		this.size = size;
		return this;
	}

	@JsOverlay
	public final double getStartAngle() {
		return startAngle;
	}

	@JsOverlay
	public final Pane setStartAngle(double startAngle) {
		this.startAngle = startAngle;
		return this;
	}
}
