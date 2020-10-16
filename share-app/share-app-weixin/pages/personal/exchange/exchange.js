// pages/index/index.js
const app = getApp()
const API = require('../../../utils/request')
Page({

  /**
   * 页面的初始数据
   */
  data: {
    tab: 0,
    myExchangeList: null,
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
   
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
    var that = this
    API.myExchange({
      userId: app.globalData.user.id
    }).then(res => { 
      that.setData({
        myExchangeList: res
      })
      console.log(res)
    })
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
   * 切换tab
   */
  changeTab(e) {
    this.setData({
      tab: e.currentTarget.dataset.tab
    })
  },
  /**
   * 前往兑换成功页
   */
  downloadUrl(e) {
    //取出绑定对象
    console.log(e)
    var share = e.currentTarget.dataset.item
    wx.navigateTo({
      url: '../../duihuanSuccess/duihuanSuccess?share=' + JSON.stringify(share),
    })
  }
})