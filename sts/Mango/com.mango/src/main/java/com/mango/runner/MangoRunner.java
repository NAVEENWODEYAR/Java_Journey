package com.mango.runner;

import com.mango.modal.Mango;
import com.mango.service.MangoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MangoRunner implements CommandLineRunner {

    @Autowired
    MangoService mService;

        @Override
        public void run(String... args) throws Exception
        {
            mService.insertMango(new Mango(1,"Alphonso","Dhakkad"));
        }
}
