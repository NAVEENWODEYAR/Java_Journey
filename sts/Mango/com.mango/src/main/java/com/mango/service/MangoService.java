package com.mango.service;

import com.mango.modal.Mango;
import com.mango.repo.MangoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MangoService
{
    // injecting the object.,
    @Autowired
    MangoRepo mRepo;

    // CRUD operations..,
    // 1. insert the query., db.collection.insertMany
    public List<Mango> insertMangoData(List<Mango> mg)
    {
        List<Mango> m1 = mRepo.saveAll(mg);
                    return m1;
    }

    // 2. insert single record.., db.collection.insertOne
    public Mango insertMango(Mango mg)
    {
        return mRepo.save(mg);
    }

    // 3. select query..,
    public List<Mango> getMangoData(List<Mango> mg)
    {
        return mRepo.findAll();
    }

    // 4. select single record..,
    public Mango getMango(Integer id)
    {
       return mRepo.findById(String.valueOf(id)).get();
    }

    // 5. update the data.,
    public Mango updateMagoData(Integer m_Id, Mango mg)
    {
        Mango m1 = mRepo.findById(String.valueOf(m_Id)).get();
                m1.setM_Name(mg.getM_Name());
                m1.setM_Type(mg.getM_Type());

                return mRepo.save(m1);
    }

    // 6. delete the data.,
    public String deleteMangoData(Integer m_Id)
    {
      mRepo.deleteById(String.valueOf(m_Id));
        return "";
    }
}
