package com.mango.controller;

import com.mango.modal.Mango;
import com.mango.service.MangoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MangoController
{
    // injecting the service object..,
    @Autowired
    MangoService mService;

    // Rest API Generation.,
    // post for inserting the data.,
    @PostMapping("/insertMangoData")
    public List<Mango> insertMangoData(@RequestBody List<Mango> mg)
    {
        List<Mango> m1 = mService.getMangoData(mg);
                    return m1;
    }
}
