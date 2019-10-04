package com.home.liveeventbusdemo.model

class MainModel {

    interface OnGetMainDataListener {
        fun onSuccess(mainData: MainBean)
    }

    fun getMainData(onGetMainDataListener: OnGetMainDataListener) {
        val mainData = MainBean(getResultList())
        onGetMainDataListener.onSuccess(mainData)
    }

    private fun getResultList(): ArrayList<MainBean.Result> {
        val resultList = ArrayList<MainBean.Result>()
        resultList.add(
            MainBean.Result(
                "https://img2.ali213.net/picfile/News/2018/10/13/584_90892ed7f4d330c97195c7d4badf610c.jpg",
                "寶兒. 20",
                "台北市",
                "女人需要的不是寬容，是縱容；女人需要的不是了解，是寵愛。我喜歡你，我要和你在一起。我會向全世界大聲地說，大膽地說，理直氣壯地說。",
                "2人約會",
                "33"
            )
        )
        resultList.add(
            MainBean.Result(
                "https://images.chinatimes.com/newsphoto/2016-10-14/900/20161014003105.jpg",
                "sherry. 26",
                "台北市",
                "什麼叫做專一，專門一個一個來的。",
                "2人約會",
                "74"
            )
        )
        resultList.add(
            MainBean.Result(
                "https://file.toments.com//n46983/0.jpg",
                "詩妹. 29",
                "台北市",
                "欲擒故縱是情感必殺技，意猶未盡才是最高境界。",
                "2人約會",
                "70"
            )
        )
        resultList.add(
            MainBean.Result(
                "https://buzzwav.com/wp-content/uploads/2017/04/17596175_420919778256535_2435989834066558976_cover-696x502.jpg",
                "芸. 27",
                "台北市",
                "太多女人在失去之前，都不明白什麼男人才是真正的好男人。",
                "2人約會",
                "66"
            )
        )
        resultList.add(
            MainBean.Result(
                "https://img1.how01.com/imgs/41/89/1/46cd0000d9b96fdfd31a.jpg",
                "bo yu. 20",
                "台北市",
                "好男人都是備胎，因為太多女人，在失去之前，都不明白什麼男人才是真正的好男人。",
                "2人約會",
                "60"
            )
        )
        resultList.add(
            MainBean.Result(
                "https://n.sinaimg.cn/sinacn10116/289/w1080h809/20190307/be6b-htwhfzt1753174.jpg",
                "貓仔. 23",
                "新北市",
                "讓你哭到撕心裂肺那個人，是你最愛的那個人；讓你笑到沒心沒肺那個人，是最愛你的那個人。",
                "2人約會",
                "59"
            )
        )
        resultList.add(
            MainBean.Result(
                "https://img2.ali213.net/picfile/News/2018/10/13/584_90892ed7f4d330c97195c7d4badf610c.jpg",
                "寶兒. 20",
                "台北市",
                "女人需要的不是寬容，是縱容；女人需要的不是了解，是寵愛。我喜歡你，我要和你在一起。我會向全世界大聲地說，大膽地說，理直氣壯地說。",
                "2人約會",
                "33"
            )
        )
        resultList.add(
            MainBean.Result(
                "https://images.chinatimes.com/newsphoto/2016-10-14/900/20161014003105.jpg",
                "sherry. 26",
                "台北市",
                "什麼叫做專一，專門一個一個來的。",
                "2人約會",
                "74"
            )
        )
        resultList.add(
            MainBean.Result(
                "https://file.toments.com//n46983/0.jpg",
                "詩妹. 29",
                "台北市",
                "欲擒故縱是情感必殺技，意猶未盡才是最高境界。",
                "2人約會",
                "70"
            )
        )
        resultList.add(
            MainBean.Result(
                "https://buzzwav.com/wp-content/uploads/2017/04/17596175_420919778256535_2435989834066558976_cover-696x502.jpg",
                "芸. 27",
                "台北市",
                "太多女人在失去之前，都不明白什麼男人才是真正的好男人。",
                "2人約會",
                "66"
            )
        )
        resultList.add(
            MainBean.Result(
                "https://img1.how01.com/imgs/41/89/1/46cd0000d9b96fdfd31a.jpg",
                "bo yu. 20",
                "台北市",
                "好男人都是備胎，因為太多女人，在失去之前，都不明白什麼男人才是真正的好男人。",
                "2人約會",
                "60"
            )
        )
        resultList.add(
            MainBean.Result(
                "https://n.sinaimg.cn/sinacn10116/289/w1080h809/20190307/be6b-htwhfzt1753174.jpg",
                "貓仔. 23",
                "新北市",
                "讓你哭到撕心裂肺那個人，是你最愛的那個人；讓你笑到沒心沒肺那個人，是最愛你的那個人。",
                "2人約會",
                "59"
            )
        )
        return resultList
    }
}