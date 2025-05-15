plugins {
    id("us.ascendtech.gwt.lib")
}

description = "GWT Highcharts Wrapper"

gwt {
    includeGwtUser = false
    libs.add("elemento-core")
}