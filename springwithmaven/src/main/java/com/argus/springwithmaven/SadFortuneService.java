/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.springwithmaven;

import org.springframework.stereotype.Component;

/**
 *
 * @author parth
 */
@Component
public class SadFortuneService implements FortuneService{

    @Override
    public String getFortuneService() {
        return "Today is sad day!!!";
    }
    
}
