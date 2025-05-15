plugins {
    id("us.ascendtech.gwt.lib")
}

description = "GWT Highcharts Wrapper"

gwt {
    includeGwtUser = true
    libs.add("elemento-core")
}