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
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortuneService() {
        return "Have a nice Day!!!!";//To change body of generated methods, choose Tools | Templates.
    }
    
}
