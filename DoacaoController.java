package com.projeto.alimenta.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doacoes")
@CrossOrigin(origins = "*")
public class DoacaoController {

    @GetMapping("/disponiveis")
    public ResponseEntity<String> listar() {
        return ResponseEntity.ok("Mural Distribuido: Conexao ativa com o middleware local.");
    }

    @PutMapping("/reservar/{id}")
    public synchronized ResponseEntity<String> reservar(@PathVariable Long id, @RequestParam Long ongId) {
        return ResponseEntity.ok("Reserva homologada com sucesso para a ONG: " + ongId);
    }
}