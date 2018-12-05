package us.ascendtech.highcharts.client.chartoptions.drilldown;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.series.Series;
import us.ascendtech.highcharts.client.chartoptions.shared.Style;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.Animation;

/**
 * @author Payam Meyer
 * Docs: https://api.highcharts.com/highcharts/drilldown
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Drilldown {

	@JsProperty
	private Style activeAxisLabelStyle;
	@JsProperty
	private Style activeDataLabelStyle;
	@JsProperty
	private Boolean allowPointDrillDown;
	@JsProperty
	private Animation animation;
	@JsProperty
	private DrillUpButton drillUpButton;
	@JsProperty
	private JsArray<Series> series;

	@JsOverlay
	public final Style getActiveAxisLabelStyle() {
		return activeAxisLabelStyle;
	}

	@JsOverlay
	public final Drilldown setActiveAxisLabelStyle(Style activeAxisLabelStyle) {
		this.activeAxisLabelStyle = activeAxisLabelStyle;
		return this;
	}

	@JsOverlay
	public final Style getActiveDataLabelStyle() {
		return activeDataLabelStyle;
	}

	@JsOverlay
	public final Drilldown setActiveDataLabelStyle(Style activeDataLabelStyle) {
		this.activeDataLabelStyle = activeDataLabelStyle;
		return this;
	}

	@JsOverlay
	public final Boolean getAllowPointDrillDown() {
		return allowPointDrillDown;
	}

	@JsOverlay
	public final Drilldown setAllowPointDrillDown(Boolean allowPointDrillDown) {
		this.allowPointDrillDown = allowPointDrillDown;
		return this;
	}

	@JsOverlay
	public final Animation getAnimation() {
		return animation;
	}

	@JsOverlay
	public final Drilldown setAnimation(Animation animation) {
		this.animation = animation;
		return this;
	}

	@JsOverlay
	public final DrillUpButton getDrillUpButton() {
		return drillUpButton;
	}

	@JsOverlay
	public final Drilldown setDrillUpButton(DrillUpButton drillUpButton) {
		this.drillUpButton = drillUpButton;
		return this;
	}

	@JsOverlay
	public final JsArray<Series> getSeries() {
		return series;
	}

	@JsOverlay
	public final Drilldown setSeries(JsArray<Series> series) {
		this.series = series;
		return this;
	}
}
