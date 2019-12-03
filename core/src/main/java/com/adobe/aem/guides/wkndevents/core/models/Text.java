package com.adobe.aem.guides.wkndevents.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class)
public class ModelA {

    private String name;

    public String getName() {
        return name;
    }
}
