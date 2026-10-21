package com.example.apirestwithspring.entities;

import java.util.List;

public record PokemonListaDTO(
//        int count,
//        String next,
//        String previous,
        List<PokemonDTO> results
) {

}
