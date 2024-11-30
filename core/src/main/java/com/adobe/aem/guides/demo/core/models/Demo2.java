package com.adobe.aem.guides.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Demo2 {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String des;

    public String getTitle() {
        return title;
    }
    public String getDes() {
        return des;
    }
    
    

}