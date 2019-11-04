package com.bawei.lian.model;
/*
 *@auther:董青勇
 *@Date: 2019/11/4
 *@Time:19:13
 *@Description:${DESCRIPTION}
 **/

import com.bawei.lian.contates.Contates;
import com.bawei.lian.net.NetUtils;

public class Modelmvp implements Contates.Imodel {
    @Override
    public void getInfo(String url, final Contates.MyCallBack myCallBack) {
        NetUtils.getInstance().doGet(url, new NetUtils.MyCallBack() {
            @Override
            public void onDoGetSccess(String json) {
                  myCallBack.onSccess(json);
            }

            @Override
            public void onErrorSccess(String error) {
                    myCallBack.onFaild(error);
            }
        });
    }

    @Override
    public void postInfo(String url, Contates.MyCallBack myCallBack) {

    }
}
