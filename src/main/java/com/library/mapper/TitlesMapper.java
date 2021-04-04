package com.library.mapper;

import com.library.domain.Titles;
import com.library.domain.dto.TitlesDto;

public class TitlesMapper {
    public TitlesDto mapToTitlesDto(final Titles titles){
        return new TitlesDto(titles.getId(),
                titles.getTitle(),
                titles.getAuthor(),
                titles.getYearOfPublish(),
                titles.getListOfBooks());
    }

    public Titles mapToTitles(final TitlesDto titlesDto){
        return new Titles(titlesDto.getId(),
                titlesDto.getTitle(),
                titlesDto.getAuthor(),
                titlesDto.getYearOfPublish(),
                titlesDto.getListOfBooks());
    }
}
