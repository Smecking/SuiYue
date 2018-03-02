package com.ruheng.suiyue.book

import com.ruheng.suiyue.network.OkhttpUtil

/**
 * Created by lvruheng on 2018/3/1.
 */
class BookPresenter(view: BookContract.View) : BookContract.Presenter {
    var mView = view
    init {
        view.setPresenter(this)
    }

    override fun start() {
        loadData()
    }

    override fun loadData() {
        if(mView.isActive()){
            val okhttpClient = OkhttpUtil.getInstance(mView.getBookContext()!!)

        }

    }
}