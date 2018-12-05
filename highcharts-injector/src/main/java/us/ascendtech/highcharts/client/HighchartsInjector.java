package us.ascendtech.highcharts.client;

import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;
import elemental2.dom.DomGlobal;

public class HighchartsInjector {

	private static boolean highchartsLoaded = false;

	public static void injectAll() {
		injectHighchartsAndExportingAndAccessibility();
	}

	public static void injectHighcharts() {
		// Highcharts
		ScriptInjector.fromUrl("https://code.highcharts.com/highcharts.js").setCallback(new Callback<Void, Exception>() {
			@Override
			public void onFailure(Exception reason) {
				GWT.log("Failed to load required library, Please file a ticket");
			}

			@Override
			public void onSuccess(Void result) {
				highchartsLoaded = true;
				GWT.log("Succeeded to load highcharts");
			}
		}).setWindow(ScriptInjector.TOP_WINDOW).inject();

	}

	public static void injectHighchartsAndExporting() {
		// Highcharts
		ScriptInjector.fromUrl("https://code.highcharts.com/highcharts.js").setCallback(new Callback<Void, Exception>() {
			@Override
			public void onFailure(Exception reason) {
				GWT.log("Failed to load required library, Please file a ticket");
			}

			@Override
			public void onSuccess(Void result) {
				highchartsLoaded = true;
				GWT.log("Succeeded to load highcharts");
				ScriptInjector.fromUrl("https://code.highcharts.com/modules/exporting.js").setCallback(new Callback<Void, Exception>() {
					@Override
					public void onFailure(Exception reason) {
						GWT.log("Failed to load required library, Please file a ticket");
					}

					@Override
					public void onSuccess(Void result) {
						GWT.log("Succeeded to load highcharts exporting");
					}
				}).setWindow(ScriptInjector.TOP_WINDOW).inject();
			}
		}).setWindow(ScriptInjector.TOP_WINDOW).inject();

	}

	public static void injectHighchartsAndAccessibility() {
		// Highcharts
		ScriptInjector.fromUrl("https://code.highcharts.com/highcharts.js").setCallback(new Callback<Void, Exception>() {
			@Override
			public void onFailure(Exception reason) {
				GWT.log("Failed to load required library, Please file a ticket");
			}

			@Override
			public void onSuccess(Void result) {
				highchartsLoaded = true;
				GWT.log("Succeeded to load highcharts");
				ScriptInjector.fromUrl("https://code.highcharts.com/modules/accessibility.js").setCallback(new Callback<Void, Exception>() {
					@Override
					public void onFailure(Exception reason) {
						GWT.log("Failed to load required library, Please file a ticket");
					}

					@Override
					public void onSuccess(Void result) {
						GWT.log("Succeeded to load highcharts accessibility");
						highchartsLoaded = true;
					}
				}).setWindow(ScriptInjector.TOP_WINDOW).inject();
			}
		}).setWindow(ScriptInjector.TOP_WINDOW).inject();

	}

	public static void injectAccessibility() {
		ScriptInjector.fromUrl("https://code.highcharts.com/modules/accessibility.js").setCallback(new Callback<Void, Exception>() {
			@Override
			public void onFailure(Exception reason) {
				GWT.log("Failed to load required library, Please file a ticket");
			}

			@Override
			public void onSuccess(Void result) {
				GWT.log("Succeeded to load highcharts accessibility");
				highchartsLoaded = true;
			}
		}).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}

	public static boolean isHighchartsLoaded() {
		return highchartsLoaded;
	}

	private static void injectHighchartsAndExportingAndAccessibility() {
		// Highcharts
		ScriptInjector.fromUrl("https://code.highcharts.com/highcharts.js").setCallback(new Callback<Void, Exception>() {
			@Override
			public void onFailure(Exception reason) {
				GWT.log("Failed to load required library, Please file a ticket");
			}

			@Override
			public void onSuccess(Void result) {
				highchartsLoaded = true;
				DomGlobal.console.log("Succeeded to load highcharts");
				ScriptInjector.fromUrl("https://code.highcharts.com/modules/exporting.js").setCallback(new Callback<Void, Exception>() {
					@Override
					public void onFailure(Exception reason) {
						GWT.log("Failed to load required library, Please file a ticket");
					}

					@Override
					public void onSuccess(Void result) {
						DomGlobal.console.log("Succeeded to load highcharts exporting");

						ScriptInjector.fromUrl("https://code.highcharts.com/modules/accessibility.js").setCallback(new Callback<Void, Exception>() {
							@Override
							public void onFailure(Exception reason) {
								GWT.log("Failed to load required library, Please file a ticket");
							}

							@Override
							public void onSuccess(Void result) {
								DomGlobal.console.log("Succeeded to load highcharts accessibility");
								highchartsLoaded = true;
							}
						}).setWindow(ScriptInjector.TOP_WINDOW).inject();
					}
				}).setWindow(ScriptInjector.TOP_WINDOW).inject();
			}
		}).setWindow(ScriptInjector.TOP_WINDOW).inject();

	}

}
