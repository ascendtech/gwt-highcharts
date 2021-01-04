package us.ascendtech.highcharts.client.chartoptions.accessibility;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import us.ascendtech.highcharts.client.chartoptions.accessibility.functions.AnnouncementFormatter;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AnnounceNewData {

	@JsProperty
	private AnnouncementFormatter announcementFormatter;
	@JsProperty
	private boolean enabled;
	@JsProperty
	private boolean interruptUser;
	@JsProperty
	private Double minAnnounceInterval;

	@JsOverlay
	public final AnnouncementFormatter getAnnouncementFormatter() {
		return announcementFormatter;
	}

	@JsOverlay
	public final AnnounceNewData setAnnouncementFormatter(AnnouncementFormatter announcementFormatter) {
		this.announcementFormatter = announcementFormatter;
		return this;
	}

	@JsOverlay
	public final boolean isEnabled() {
		return enabled;
	}

	@JsOverlay
	public final AnnounceNewData setEnabled(boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@JsOverlay
	public final boolean isInterruptUser() {
		return interruptUser;
	}

	@JsOverlay
	public final AnnounceNewData setInterruptUser(boolean interruptUser) {
		this.interruptUser = interruptUser;
		return this;
	}

	@JsOverlay
	public final Double getMinAnnounceInterval() {
		return minAnnounceInterval;
	}

	@JsOverlay
	public final AnnounceNewData setMinAnnounceInterval(Double minAnnounceInterval) {
		this.minAnnounceInterval = minAnnounceInterval;
		return this;
	}
}
