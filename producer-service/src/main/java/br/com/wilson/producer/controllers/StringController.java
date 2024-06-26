package br.com.wilson.producer.controllers;

import br.com.wilson.producer.services.StringService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/produces")
public class StringController {

    private final StringService stringService;

    @GetMapping
    public ResponseEntity<String> produceString(@RequestParam("message") String message){
        stringService.produceString(message);
        return ResponseEntity.ok().body("Sending message");
    }
}
