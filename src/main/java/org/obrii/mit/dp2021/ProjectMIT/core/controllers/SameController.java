
package org.obrii.mit.dp2021.ProjectMIT.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SameController {
    @GetMapping("/hello")
    public String seyHello(){
        return "Hello";
    }
    
}
