package com.example.demo.services;

import java.util.List;
import com.example.demo.repositories.MangaRepository;
import com.example.demo.models.Manga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MangaService {
    @Autowired
    private MangaRepository mangaRepository;

    public void createManga(String name, String genre) {
        Manga manga = new Manga();
        manga.setName(name);
        manga.setGenre(genre);
        mangaRepository.save(manga);
    }

    public List<Manga> getAll() {
        return (List<Manga>) mangaRepository.findAll();
    }
}
