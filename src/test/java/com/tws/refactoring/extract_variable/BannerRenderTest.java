package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yeli on 2019/7/1.
 */
public class BannerRenderTest {
    @Test
    public void should_render_ie_on_mac_when_platform_is_mac_and_browser_is_ie() {
        BannerRender bannerRender = new BannerRender();
        assertEquals("IE on Mac?", bannerRender.renderBanner("Mac", "IE"));
    }

    @Test
    public void should_render_banner_when_platform_is_not_mac() {
        BannerRender bannerRender = new BannerRender();
        assertEquals("banner", bannerRender.renderBanner("Windows", "IE"));
    }

    @Test
    public void should_render_banner_when_browser_is_not_mac() {
        BannerRender bannerRender = new BannerRender();
        assertEquals("banner", bannerRender.renderBanner("Mac", "Chrome"));
    }
}