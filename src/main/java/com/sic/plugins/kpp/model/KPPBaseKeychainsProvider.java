package com.sic.plugins.kpp.model;

import hudson.Extension;

/**
* The {@link KPPKeychainsProvider} that stores and manages keychains.
*/
@Extension
public class KPPBaseKeychainsProvider extends KPPKeychainsProvider {
    
    public static KPPBaseKeychainsProvider getInstance() {
        return KPPKeychainsProvider.all().get(KPPBaseKeychainsProvider.class);
    }
    
}
