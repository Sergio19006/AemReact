package com.adobe.aem.guides.wkndevents.core.models;

import org.apache.sling.models.annotations.Model;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.cq.export.json.ExporterConstants;
import com.adobe.cq.export.json.ComponentExporter;

@Model(
        adaptables = SlingHttpServletRequest.class,
        adapters = {ComponentExporter.class},
        resourceType = Text.RESOURCE_TYPE
)
@Exporter(
        name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION
)
public class Text implements ComponentExporter {

    private static final String PREPEND_MSG = "Que pasaaa locoooooooo";
    static final String RESOURCE_TYPE = "wknd-events/components/content/text";

    @ValueMapValue
    @Optional
    private String text;

    public String getText() {
        if (text != null && text.length() > 0) {
            return PREPEND_MSG + " " + text;
        }
        return null;
    }

    @Override
    public String getExportedType() {
        return RESOURCE_TYPE;
    }
}