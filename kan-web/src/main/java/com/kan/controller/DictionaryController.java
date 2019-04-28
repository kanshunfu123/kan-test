package com.kan.controller;

import com.kan.common.common.JSONResult;
import com.kan.dictionary.DictionaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by MOMO on 2018/12/5.
 */
@RestController
@Slf4j
@RequestMapping("/platform")
public class DictionaryController extends BaseController {
    @Autowired
    private DictionaryService dictionaryService;

    @PostMapping("/treeList/v1")
    public JSONResult treeList() {
        JSONResult jsonResult = dictionaryService.dictionaryTreeList();
        return jsonResult;
    }


}
