package com.nibnait.babasport.core.service.product;

import com.nibnait.babasport.core.bean.product.Brand;
import com.nibnait.babasport.core.dao.product.BrandDao;
import com.nibnait.common.page.Pagination;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**]
 * 品牌事物层
 * Created by nibnait on 2016/5/4.
 */
@Service
@Transactional
public class BrandServiceImpl implements BrandService {

    @Resource
    private BrandDao brandDao;

    @Transactional(readOnly = true)
    public Pagination getBrandListWithPage(Brand brand){
        //1：起始页
        //2:pageSize
        //3:totalRows
        Pagination pagination = new Pagination(brand.getPageNo(),brand.getPageSize(),brandDao.getBrandCount(brand));

        pagination.setList(brandDao.getBrandListWithPage(brand));

        return pagination;
    }


    public void addBrand(Brand brand) {
        brandDao.addBrand(brand);
    }


    public void deleteBrandByIds(Integer[] ids) {
        brandDao.deleteBrandByIds(ids);
    }
    public void deleteBrandById(Integer id) {
        brandDao.deleteBrandById(id);
    }

    public void updateBrandById(Integer id) {
        brandDao.updateBrandById(id);
    }


}
