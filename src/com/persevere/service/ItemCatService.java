package com.persevere.service;


import com.persevere.commons.EasyUITreeNote;

import java.util.List;

/**
 * Created by ${Someone} on 2017/8/23.
 */
public interface ItemCatService {

	List<EasyUITreeNote> getItemCatList(Long parentId);

}
