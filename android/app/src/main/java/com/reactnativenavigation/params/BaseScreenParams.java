package com.reactnativenavigation.params;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import java.util.List;

public class BaseScreenParams {
    public double timestamp;
    public String screenId;
    public String title;
    public String subtitle;
    public Drawable tabIcon;
    public Drawable tabSelectedIcon;
    public NavigationParams navigationParams;
    public List<TitleBarButtonParams> rightButtons;
    public TitleBarLeftButtonParams leftButton;
    public FabParams fabParams;

    public boolean overrideBackPressInJs;
    public StyleParams styleParams;
    public String fragmentCreatorClassName;
    public Bundle fragmentCreatorPassProps;
    public boolean animateScreenTransitions;
    public String animationType;

    public boolean isFragmentScreen() {
        return fragmentCreatorClassName != null;
    }

    public String getScreenInstanceId() {
        return navigationParams.screenInstanceId;
    }

    public String getNavigatorId() {
        return navigationParams.navigatorId;
    }

    public String getNavigatorEventId() {
        return navigationParams.navigatorEventId;
    }

    public boolean hasCollapsingTopBar() {
        return styleParams.collapsingTopBarParams != null;
    }

    public FabParams getFab() {
        return fabParams;
    }

    public void setFab(FabParams params) {
        fabParams = params;
    }
}
