package demoproject.infra;

import demoproject.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class EstimateHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Estimate>> {

    @Override
    public EntityModel<Estimate> process(EntityModel<Estimate> model) {
        return model;
    }
}
