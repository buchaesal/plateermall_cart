package com.plateer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.plateer.domain.Wishlist;

@Mapper
public interface WishlistMapper {
	void saveWish(Wishlist wish);

	List<String> findGoodsCodes(String userId);

	void removeGoodsWish(String goodsCode);
}
