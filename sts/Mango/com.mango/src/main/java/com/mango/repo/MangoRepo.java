package com.mango.repo;

import com.mango.modal.Mango;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MangoRepo extends MongoRepository<Mango,String>
{
    // MongoRepository has the built in methods for the crud operations.,
}
