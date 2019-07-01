package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        final boolean isMacPlatform = platform.toUpperCase().indexOf("MAC") > -1;
        final boolean isIEBrowser = browser.toUpperCase().indexOf("IE") > -1;
        if (isMacPlatform && isIEBrowser) {
            return "IE on Mac?";
        }
        return "banner";
    }
}
