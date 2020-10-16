// pages/personal/personal.js

const app = getApp();
const API = require('../../utils/request.js')

Page({

  /**
   * 页面的初始数据
   */
  data: {
    userInfo: null
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
    //积分更新
    API.findById().then(res => {
      console.log(res)
      app.globalData.user = res
    })
    this.setData({
      userInfo: app.globalData.user
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
   * 登录
   */
  weixinLogin() {
    API.login({
      openId: app.globalData.wxId,
      wxNickname: app.globalData.userInfo.nickName,
      avatarUrl: app.globalData.userInfo.avatarUrl
    }).then(res => {
      const request = JSON.parse(res)
      console.log(request)
      app.globalData.user = request.user
      app.globalData.token = request.token.token
      app.globalData.isUserSignin = request.isUserSignin
      console.log(app.globalData.isUserSignin)
      this.setData({
        userInfo: app.globalData.user
      })
    })
  },
  /**
   * 前往详情页
   */
  goDetail() {
    wx.navigateTo({
      url: '../personal/exchange/exchange',
    })
  },
  total() {
    wx.navigateTo({
      url: '../personal/total/total',
    })
  },
  myContribution() {
    wx.navigateTo({
      url: '../personal/myContribution/myContribution',
    })
  },
  //签到
  qiandao() {
    if (app.globalData.isUserSignin == 1) {
      wx.showModal({
        title: '签到失败',
        content: '今天已经签到过了哦！！！',
        success: function (res) {
          if (res.confirm) {
            console.log('用户点击确定')
          } else if (res.cancel) {
            console.log('用户点击取消')
          }
        }
      })
    } else {
      API.signin({
        userId: app.globalData.user.id
      }).then(res => {
        const request = res
        console.log(request)
        app.globalData.isUserSignin = 1
      })
      wx.showLoading({
        title: "正在加载中...",
        duration: 8000
      })
      wx.showToast({
        title: '成功',
        icon: 'success', //当icon：'none'时，没有图标 只有文字
        duration: 2000
      })

    }

  }
})