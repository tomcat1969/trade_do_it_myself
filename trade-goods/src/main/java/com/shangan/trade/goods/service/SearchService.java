package com.shangan.trade.goods.service;

import com.shangan.trade.goods.db.model.Goods;

import java.util.List;

public interface SearchService {
    void addGoodsToES(Goods goods);

    List<Goods> searchGoodsList(String Keyword, int from, int size);
}
