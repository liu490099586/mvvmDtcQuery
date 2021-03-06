package com.xtool.mvpdtcquery.main;


import com.xtool.mvpdtcquery.bean.DtcCustom;

import java.util.List;

/**
 * Created by xtool on 2017/9/5.
 */

public interface MainView {
    /**
     * 显示list数据
     */
    void showListMessage(List<DtcCustom> dtcCustoms);

    String getDcode();

    void showProgressDialog();

    void dismissProgressDialog();
}
