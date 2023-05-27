package com.example.logowanieio;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuatationApi {
    private List<Quotation> quotations;

    public QuatationApi(){
        this.quotations=new ArrayList<>();
        quotations.add(new Quotation("Na ścianach Łęciny nie znajdziesz szczeciny!", "Bogusław Łęcina"));
        quotations.add(new Quotation("Zostaną po nas memy, nieczynne profile.", "Krzysztof Kościelski"));
        quotations.add(new Quotation("To mały krok dla człowieka, ale dla karła normalny", "Sebek Bąk"));
    }
    @GetMapping("/api")
    public List<Quotation> getQuotations(){
        return quotations;
    }
    @PostMapping ("/api")
    public boolean addQuotation(@RequestBody Quotation quatation){
        return quotations.add(quatation);
    }
    @DeleteMapping
    public void deleteQuation(@RequestParam int index){
        quotations.remove(index);
    }
}
