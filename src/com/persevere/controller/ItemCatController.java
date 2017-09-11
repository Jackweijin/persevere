package com.persevere.controller;

import com.persevere.commons.EasyUITreeNote;
import com.persevere.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ${Someone} on 2017/8/23.
 */
@Controller
@RequestMapping("/item/cat")
public class ItemCatController {

	@Autowired
	private ItemCatService itemCatService;

	@RequestMapping("/list")
	@ResponseBody
	public List<EasyUITreeNote> getItemCatList(@RequestParam(name = "id", defaultValue = "0") Long parentId) {

		List<EasyUITreeNote> itemCatList = itemCatService.getItemCatList(parentId);

		return itemCatList;
	}


}
