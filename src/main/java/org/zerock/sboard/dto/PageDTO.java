package org.zerock.sboard.dto;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import lombok.Data;

@Data
public class PageDTO {
    
    private int page;
    private int size;

    public PageDTO(){
        this.page = 1;
        this.size = 10;
    }

    public Pageable makePageable(Sort sort){
        return PageRequest.of(this.page -1 , this.size, sort);
    }

}