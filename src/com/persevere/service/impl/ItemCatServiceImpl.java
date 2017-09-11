package com.persevere.service.impl;

import com.persevere.commons.EasyUITreeNote;
import com.persevere.dao.TbItemCatMapper;
import com.persevere.pojo.TbItemCat;
import com.persevere.pojo.TbItemCatExample;
import com.persevere.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ${Someone} on 2017/8/23.
 */
@Service("itemCatService")
public class ItemCatServiceImpl implements ItemCatService {

	@Autowired
	private TbItemCatMapper itemCatMapper;

	/**
	 * 根据父id查询商品列表
	 * @param parentId
	 * @return
	 */
	public List<EasyUITreeNote> getItemCatList(Long parentId) {

		//创建查询条件
		TbItemCatExample tbItemCatExample = new TbItemCatExample();
		TbItemCatExample.Criteria criteria = tbItemCatExample.createCriteria();
		//设置查询条件
		criteria.andParentIdEqualTo(parentId);
		//查询
		List<TbItemCat> list = itemCatMapper.selectByExample(tbItemCatExample);

		List<EasyUITreeNote> easyUITreeNotes = new ArrayList<>();
		for (TbItemCat tbItemCat : list) {
			EasyUITreeNote easyUITreeNote = new EasyUITreeNote();
			//设置id
			easyUITreeNote.setId(tbItemCat.getId());
			//设置节点名称
			easyUITreeNote.setText(tbItemCat.getName());
			//设置节点状态
			easyUITreeNote.setState(tbItemCat.getIsParent() ? "closed" : "open");
			//添加到列表
			easyUITreeNotes.add(easyUITreeNote);
		}
		return easyUITreeNotes;
	}
}
