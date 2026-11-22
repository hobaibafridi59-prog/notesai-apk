package com.zyvo.notesai;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        WebView w = new WebView(this);
        WebSettings s = w.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        s.setDatabaseEnabled(true);
        s.setCacheMode(WebSettings.LOAD_DEFAULT);
        s.setRenderPriority(WebSettings.RenderPriority.HIGH);
        s.setLoadsImagesAutomatically(true);
        s.setUseWideViewPort(true);
        s.setLoadWithOverviewMode(true);
        s.setSupportZoom(false);
        s.setBuiltInZoomControls(false);
        s.setDisplayZoomControls(false);
        w.setLayerType(View.LAYER_TYPE_HARDWARE, null);
        w.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        w.setOverScrollMode(View.OVER_SCROLL_NEVER);
        w.setWebViewClient(new WebViewClient());
        setContentView(w);
        w.loadUrl("https://expressed-charging-entrepreneur-discipline.trycloudflare.com");
    }
}
