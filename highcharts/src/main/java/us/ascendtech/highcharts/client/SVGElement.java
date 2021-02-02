package us.ascendtech.highcharts.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;
import us.ascendtech.highcharts.client.chartoptions.shared.AlignObject;
import us.ascendtech.highcharts.client.chartoptions.shared.AnimationOptionsObject;
import us.ascendtech.highcharts.client.chartoptions.shared.BBoxObject;
import us.ascendtech.highcharts.client.chartoptions.shared.RectangleObject;
import us.ascendtech.highcharts.client.chartoptions.shared.ShadowOptionsObject;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.Callback;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.Complete;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SVGElement {

	@JsProperty
	private SVGElement element;
	@JsProperty
	private SVGRenderer renderer;

	@JsOverlay
	public final SVGElement getElement() {
		return element;
	}

	@JsOverlay
	public final void setElement(SVGElement element) {
		this.element = element;
	}

	@JsOverlay
	public final SVGRenderer getRenderer() {
		return renderer;
	}

	@JsOverlay
	public final void setRenderer(SVGRenderer renderer) {
		this.renderer = renderer;
	}

	public native SVGElement add(SVGElement parent);

	public native SVGElement addClass(String className, boolean replace);

	public native SVGElement align(AlignObject alignOptions, boolean alignByTranslate, String box);

	public native SVGElement animate(JsPropertyMap<Object> params, boolean options, Complete complete);

	public native SVGElement animate(JsPropertyMap<Object> params, AnimationOptionsObject options, Complete complete);

	public native SVGElement attr(String key);

	public native SVGElement attr(JsPropertyMap<Object> key);

	public native SVGElement attr(String hash, String val, Complete complete, boolean continueAnimation);

	public native SVGElement clip(SVGElement clipRect);

	public native RectangleObject crisp(RectangleObject rect, Double strokeWidth);

	public native SVGElement css(JsPropertyMap<Object> styles);

	public native void destroy();

	public native void fadeIn(boolean animation);

	public native void fadeOut(Double duration);

	public native BBoxObject getBBox(boolean reload, Double number);

	public native String getStyle(String prop);

	public native void hasClass(String className);

	public native void hide(boolean hideByTranslation);

	public native void init(SVGRenderer renderer, String nodeName);

	public native SVGElement invert(boolean inverted);

	public native SVGElement on(String eventType, Callback handler);

	public native SVGElement removeClass(String className);

	public native SVGElement setRadialReference(String coordinates);

	public native SVGElement shadow(ShadowOptionsObject shadowOptions, SVGElement group, boolean cutoff);

	public native SVGElement show(boolean inherit);

	public native Double strokeWidth();

	public native SVGElement toFront();

	public native void translate(Double x, Double y);
}
