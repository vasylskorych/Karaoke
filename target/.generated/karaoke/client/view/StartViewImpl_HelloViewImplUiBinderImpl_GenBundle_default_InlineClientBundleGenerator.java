package karaoke.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class StartViewImpl_HelloViewImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements karaoke.client.view.StartViewImpl_HelloViewImplUiBinderImpl_GenBundle {
  private static StartViewImpl_HelloViewImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new StartViewImpl_HelloViewImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new karaoke.client.view.StartViewImpl_HelloViewImplUiBinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return (".GO0-RYTDEI{font-weight:" + ("bold")  + ";}");
      }
      public java.lang.String important(){
        return "GO0-RYTDEI";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static karaoke.client.view.StartViewImpl_HelloViewImplUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public karaoke.client.view.StartViewImpl_HelloViewImplUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static karaoke.client.view.StartViewImpl_HelloViewImplUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@karaoke.client.view.StartViewImpl_HelloViewImplUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
