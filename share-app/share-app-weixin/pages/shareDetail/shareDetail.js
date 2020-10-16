// pages/duihuanSuccess/duihuanSuccess.js
const app = getApp();
const API = require('../../utils/request.js')

Page({

  /**
   * 页面的初始数据
   */
  data: {
    share: null,
    userId: null,
    shareId: null
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.setData({
      share: JSON.parse(options.share)
    })
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  },

   /**
   * 兑换
   */
  duihuan(e){
    //取出绑定对象
    var share = e.currentTarget.dataset.item
    console.log(share)
    API.exchange({
      userId: app.globalData.user.id,
      shareId: share.id,
    }).then( res =>{
      const request = JSON.parse(res)
      console.log(request)
    })
    //再去请求分享列表
    var that = this
    if (app.globalData.token != null) {
      API.getShares().then(res => {
        console.log(res)
        that.setData({
          shareList: res
        })
        app.globalData.shareList = res
      })
      that.setData({
        user: app.globalData.user,
      })
    }
    //积分更新
    API.findById().then(res =>{
      console.log(res)
      app.globalData.user = res
    })

    //Tab跳转到主页
    wx.switchTab({
      url: '../index/index'
    })
  },
})