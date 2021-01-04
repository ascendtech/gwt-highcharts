package us.ascendtech.highcharts.client.chartoptions.shared;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.AfterChartFormatter;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.BeforeChartFormatter;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.OnPlayAsSoundClick;
import us.ascendtech.highcharts.client.chartoptions.shared.functions.OnViewDataTableClick;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ScreenReaderSection {

	@JsProperty
	private String afterChartFormat;
	@JsProperty
	private AfterChartFormatter afterChartFormatter;
	@JsProperty
	private String axisRangeDateFormat;
	@JsProperty
	private String beforeChartFormat;
	@JsProperty
	private BeforeChartFormatter beforeChartFormatter;
	@JsProperty
	private OnPlayAsSoundClick onPlayAsSoundClick;
	@JsProperty
	private OnViewDataTableClick onViewDataTableClick;

	@JsOverlay
	public final String getAfterChartFormat() {
		return afterChartFormat;
	}

	@JsOverlay
	public final ScreenReaderSection setAfterChartFormat(String afterChartFormat) {
		this.afterChartFormat = afterChartFormat;
		return this;
	}

	@JsOverlay
	public final AfterChartFormatter getAfterChartFormatter() {
		return afterChartFormatter;
	}

	@JsOverlay
	public final ScreenReaderSection setAfterChartFormatter(AfterChartFormatter afterChartFormatter) {
		this.afterChartFormatter = afterChartFormatter;
		return this;
	}

	@JsOverlay
	public final String getAxisRangeDateFormat() {
		return axisRangeDateFormat;
	}

	@JsOverlay
	public final ScreenReaderSection setAxisRangeDateFormat(String axisRangeDateFormat) {
		this.axisRangeDateFormat = axisRangeDateFormat;
		return this;
	}

	@JsOverlay
	public final String getBeforeChartFormat() {
		return beforeChartFormat;
	}

	@JsOverlay
	public final ScreenReaderSection setBeforeChartFormat(String beforeChartFormat) {
		this.beforeChartFormat = beforeChartFormat;
		return this;
	}

	@JsOverlay
	public final BeforeChartFormatter getBeforeChartFormatter() {
		return beforeChartFormatter;
	}

	@JsOverlay
	public final ScreenReaderSection setBeforeChartFormatter(BeforeChartFormatter beforeChartFormatter) {
		this.beforeChartFormatter = beforeChartFormatter;
		return this;
	}

	@JsOverlay
	public final OnPlayAsSoundClick getOnPlayAsSoundClick() {
		return onPlayAsSoundClick;
	}

	@JsOverlay
	public final ScreenReaderSection setOnPlayAsSoundClick(OnPlayAsSoundClick onPlayAsSoundClick) {
		this.onPlayAsSoundClick = onPlayAsSoundClick;
		return this;
	}

	@JsOverlay
	public final OnViewDataTableClick getOnViewDataTableClick() {
		return onViewDataTableClick;
	}

	@JsOverlay
	public final ScreenReaderSection setOnViewDataTableClick(OnViewDataTableClick onViewDataTableClick) {
		this.onViewDataTableClick = onViewDataTableClick;
		return this;
	}
}
