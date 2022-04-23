package com.fc.controller;

import com.fc.entity.TbSheet;
import com.fc.service.TbSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("sheet")
public class TbSheetController {
    @Autowired
    private TbSheetService tbSheetService;

    //查询所有歌单
    @RequestMapping("findAll")
    public List<TbSheet> findAll() {
        return tbSheetService.findAll();
    }

    @RequestMapping("findSongsBySheet")
    public List<TbSheet> findSongsBySheet(String sheetName) {
        return tbSheetService.findSongsBySheet(sheetName);
    }

    @RequestMapping("insertSheet")
    public Map<String, Object> insertSheet(TbSheet tbSheet) {
        int affectedRows = tbSheetService.insertSheet(tbSheet);

        Map<String, Object> map = new HashMap<>();

        if (affectedRows > 0) {
            map.put("message", "成功");
        } else {
            map.put("message", "失败");
        }
        return map;
    }

}
