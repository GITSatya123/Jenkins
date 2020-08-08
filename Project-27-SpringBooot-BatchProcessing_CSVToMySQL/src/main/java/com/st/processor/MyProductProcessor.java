package com.st.processor;

import org.springframework.batch.item.ItemProcessor;

import com.st.model.Product;

public class MyProductProcessor implements ItemProcessor<Product,Product>{

	@Override
	public Product process(Product item) throws Exception {
		var cost=item.getProdCost();
		var discount=cost*15/100.0;
		var gst=cost*12/100.0;
		item.setProdDisc(discount);
		item.setProdGst(gst);
		return item;
	}

}
