package com.library.controller;

import com.library.domain.dto.TitlesDto;
import com.library.mapper.TitlesMapper;
import com.library.service.TitlesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library/title")
@RequiredArgsConstructor
public class TitleController {

    private final TitlesService service;
    private final TitlesMapper mapper;

    @PostMapping(value = "createTitle", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createTitle(@RequestBody TitlesDto titlesDto){
        service.saveTitle(mapper.mapToTitles(titlesDto));
    }
}
