package net.code.server.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import net.code.server.model.storeData;
import net.code.server.repositary.storeRepository;

@RestController
@CrossOrigin()
public class controle {
    @Autowired
    storeRepository repo;

    @PostMapping("/save")
    public storeData index(@RequestBody storeData data){
        storeData d=repo.save(new storeData(data.getName(),data.getQuantity(),data.getAmount()));
        return d;
    }
    @GetMapping("/get")
    public List<storeData> call(){
        List<storeData> data=repo.findAll();
        return data;
    }
    @DeleteMapping("/delete/{id}")
    public storeData delete(@PathVariable("id") Long id){
         storeData data=new storeData(id);
        repo.deleteById(id);
        return data;
    }
    @PutMapping("/update/{id}")
    public storeData update(@PathVariable("id") Long id,@RequestBody storeData d)
    {
        Optional<storeData> SData =repo.findById(id);
        if(SData.isPresent()){
            storeData change=SData.get();
            change.setName(d.getName());
            change.setQuantity(d.getQuantity());
            change.setAmount(d.getAmount());
            repo.save(change);
            return change;
        }else{
        return SData.get();
        }
    }
}


@Controller
@CrossOrigin()
class html{
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
