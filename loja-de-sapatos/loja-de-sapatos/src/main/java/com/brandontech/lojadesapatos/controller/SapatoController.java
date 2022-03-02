package com.brandontech.lojadesapatos.controller;

import com.brandontech.lojadesapatos.model.SapatoDAO;
import com.brandontech.lojadesapatos.repository.SapatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/lojadesapatos/sapatos")
public class SapatoController {


    @Autowired
    private SapatoRepository sapatoRepository;

    @GetMapping(path = "/{id}")
   public ResponseEntity consultarSapato(@PathVariable(name = "id") Long id){


        return sapatoRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/cadastrarsapato")
    public void salvar(@RequestBody SapatoDAO sapato){

        sapatoRepository.save(sapato);

    }

    public void update(SapatoDAO sapatoTroca){
        Optional<SapatoDAO> sapato = sapatoRepository.findById(sapatoTroca.getId());

    }

//    @GetMapping(path = "/page")
//    public ModelAndView home(){
//
//        ModelAndView modelAndView = new ModelAndView();
//
//        return modelAndView;
//    }

}
