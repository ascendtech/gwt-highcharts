package us.ascendtech.highcharts.client.chartoptions.series;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.shared.Position;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SeriesOnPoint {
	@JsProperty
	private SeriesConnectorOptions connectorOptions;
	@JsProperty
	private String id;
	@JsProperty
	private Position position;

	@JsOverlay
	public final SeriesConnectorOptions getConnectorOptions() {
		return connectorOptions;
	}

	@JsOverlay
	public final SeriesOnPoint setConnectorOptions(SeriesConnectorOptions connectorOptions) {
		this.connectorOptions = connectorOptions;
		return this;
	}

	@JsOverlay
	public final String getId() {
		return id;
	}

	@JsOverlay
	public final SeriesOnPoint setId(String id) {
		this.id = id;
		return this;
	}

	@JsOverlay
	public final Position getPosition() {
		return position;
	}

	@JsOverlay
	public final SeriesOnPoint setPosition(Position position) {
		this.position = position;
		return this;
	}
}
