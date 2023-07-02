package com.mango.controller;

import com.mango.modal.Mango;
import com.mango.service.MangoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MangoController
{
    // injecting the service object..,
    @Autowired
    MangoService mService;

    // Rest API Generation.,
    // 1.post for inserting the data.,
    @PostMapping("/insertMangoData")
    public List<Mango> insertMangoData(@RequestBody List<Mango> mg)
    {
        List<Mango> m1 = mService.insertMangoData(mg);
                    return m1;
    }

    // 2. insertOne
    @PostMapping("/insertData")
    public Mango insertMango(Mango mg)
    {
        return mService.insertMango(mg);
    }

    // 3. get for receiving the data.,
    @GetMapping("/getMangoData")
    public  List<Mango>getMangoData(List<Mango> mg)
    {
        return mService.getMangoData(mg);
    }

    // 4. select the single record
    @GetMapping("/getMangoData/{}")
     public Mango getData(@PathVariable Integer m_Id)
    {
        return mService.getMango(m_Id);
    }

}
