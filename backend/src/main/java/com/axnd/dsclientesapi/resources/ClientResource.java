package com.axnd.dsclientesapi.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.axnd.dsclientesapi.entities.Client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

    @GetMapping
    public ResponseEntity<List<Client>> findAll() {
        List<Client> list = new ArrayList<>();
        list.add(new Client(1L, "Nome A", "999999-99", 1.0, Instant.now(), 1));
        list.add(new Client(2L, "Nome B", "888888-88", 2.0, Instant.now(), 3));

        return ResponseEntity.ok().body(list);
    }

}
