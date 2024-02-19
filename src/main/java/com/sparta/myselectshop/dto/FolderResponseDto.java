package com.sparta.myselectshop.dto;

import com.sparta.myselectshop.entity.Folder;
import lombok.Getter;

@Getter
public class FolderResponseDto extends ProductResponseDto {
    private Long id;
    private String name;

    public FolderResponseDto(Folder folder) {
        this.id = folder.getId();
        this.name = folder.getName();
    }
}