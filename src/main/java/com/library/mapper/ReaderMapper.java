package com.library.mapper;

import com.library.domain.Reader;
import com.library.domain.dto.ReaderDto;
import org.springframework.stereotype.Service;

@Service
public class ReaderMapper {
    public ReaderDto mapToReaderDto(final Reader reader){
        return new ReaderDto(reader.getId(),
                reader.getName(),
                reader.getSurname(),
                reader.getAccountCreatedDate());
    }

    public Reader mapToReader(final ReaderDto readerDto){
        return new Reader(readerDto.getId(),
                readerDto.getName(),
                readerDto.getSurname(),
                readerDto.getAccountCreatedDate());
    }
}
