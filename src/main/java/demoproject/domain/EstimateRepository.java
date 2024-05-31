package demoproject.domain;

import demoproject.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel="estimates", path="estimates")
public interface EstimateRepository extends PagingAndSortingRepository<Estimate, >{
}