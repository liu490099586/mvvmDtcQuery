package com.xtool.mvvmdtcquery.main;

import com.xtool.mvvmdtcquery.bean.DtcCustom;

import java.util.List;

/**
 * Created by xtool on 2017/9/5.
 */

public interface MainView {
    /**
     * 显示list数据
     */
    public void showListMessage(List<DtcCustom> dtcCustoms);

    public String getDcode();
}
