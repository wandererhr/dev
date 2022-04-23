package com.fc.service.impl;

import com.fc.dao.TbSheetMapper;
import com.fc.entity.TbSheet;
import com.fc.service.TbSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbSheetServiceImpl implements TbSheetService {
    @Autowired
    private TbSheetMapper tbSheetMapper;

    //查询所有歌单
    @Override
    public List<TbSheet> findAll() {
        return tbSheetMapper.selectByExample(null);
    }

    @Override
    public List<TbSheet> findSongsBySheet(String sheetName) {
        return tbSheetMapper.findSongsBySheet(sheetName);
    }

    @Override
    public int insertSheet(TbSheet tbSheet) {
        return tbSheetMapper.insertSelective(tbSheet);
    }
}
