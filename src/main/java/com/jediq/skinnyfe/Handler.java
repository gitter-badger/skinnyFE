package com.jediq.skinnyfe;

import com.jediq.skinnyfe.config.Config;

public class Handler {

    protected final HandlebarsCompiler handlebarsCompiler;
    protected final TemplateResolver templateResolver;
    protected final ResourceInteractor resourceInteractor;
    protected final TemplatePopulater templatePopulater;

    public Handler(Config config) {
        handlebarsCompiler = new HandlebarsCompiler();
        templatePopulater = new TemplatePopulater();
        templateResolver = new TemplateResolver(config);
        resourceInteractor = new ResourceInteractor(config);
    }

}
