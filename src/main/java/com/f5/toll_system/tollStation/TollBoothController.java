package com.f5.toll_system.tollStation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tollBooths")
public class TollBoothController {

    @Autowired
    private TollBoothService tollBoothService;

    @PostMapping
    public TollStation createTollBooth(@RequestBody TollStation tollBooth) {
        return tollBoothService.createTollBooth(tollBooth);
    }
}