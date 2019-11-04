package com.bawei.lian.presenter;
/*
 *@auther:董青勇
 *@Date: 2019/11/4
 *@Time:19:15
 *@Description:${DESCRIPTION}
 **/

import com.bawei.lian.contates.Contates;
import com.bawei.lian.model.Modelmvp;

public class Presentermvp implements Contates.Ipresenter {
    private Contates.Iview iview;
    private Contates.Imodel imodel;

    @Override
    public void attch(Contates.Iview iview) {
          this.iview=iview;
          imodel=new Modelmvp();
    }

    @Override
    public void start(String url) {
       imodel.getInfo(url, new Contates.MyCallBack() {
           @Override
           public void onSccess(String json) {
               iview.onSccess(json);
           }

           @Override
           public void onFaild(String error) {
                  iview.onErrorSccess(error);
           }
       });
    }

    @Override
    public void deattch() {
        if (iview != null) {
            iview=null;
        }
        if (imodel != null) {
            imodel=null;
        }
    }
}
