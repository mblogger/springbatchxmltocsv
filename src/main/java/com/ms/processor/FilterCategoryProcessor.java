package com.ms.processor;

import org.springframework.batch.item.ItemProcessor;

import com.ms.model.Category;

public class FilterCategoryProcessor implements ItemProcessor<Category, Category> {

	public Category process(Category category) throws Exception {
		// filter can be applied here
		// Example
		/*if(category.getName() == "Cell Phones") {
			return null;
		}*/
		return category;
	}
}
