package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class KundeController {
    public final List<Kunde>alleKunder= new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreKunde(Kunde innKunde){
        alleKunder.add(innKunde);
    }

    @GetMapping("/hentAlle")
    public List<Kunde> hentAlle(){
       return alleKunder;
    }

}
