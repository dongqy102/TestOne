package com.bawei.lian.contates;
/*
 *@auther:董青勇
 *@Date: 2019/11/4
 *@Time:19:07
 *@Description:${DESCRIPTION}
 **/

public interface Contates {
    interface MyCallBack{
        void onSccess(String json);
        void onFaild(String error);
    }
    interface  Imodel{
        void getInfo(String url,MyCallBack myCallBack);
        void postInfo(String url,MyCallBack myCallBack);
    }
    interface  Iview{
        void  onSccess(String json);
        void  onErrorSccess(String error);
    }
    interface Ipresenter{
        void attch(Iview iview);
         void start(String url);
         void deattch();
    }


}
