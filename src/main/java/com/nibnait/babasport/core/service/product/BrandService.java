package com.nibnait.babasport.core.service.product;

import com.nibnait.babasport.core.bean.product.Brand;
import com.nibnait.common.page.Pagination;

/**
 * Created by nibnait on 2016/5/4.
 */
public interface BrandService {
    Pagination getBrandListWithPage(Brand brand);
    public void addBrand(Brand brand);

    //删除
    public void deleteBrandByIds(Integer[] ids);
    public void deleteBrandById(Integer id);

    //修改
    public void updateBrandById(Integer id);
}
