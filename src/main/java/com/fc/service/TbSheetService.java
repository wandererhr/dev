package com.fc.service;

import com.fc.entity.TbSheet;

import java.util.List;

public interface TbSheetService {
    //查询所有歌单
    List<TbSheet> findAll();

    List<TbSheet> findSongsBySheet(String sheetName);

    int insertSheet(TbSheet tbSheet);
}
